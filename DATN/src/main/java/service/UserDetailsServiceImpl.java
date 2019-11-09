package service;
 
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import dao.TaiKhoanDAO;
import entity.TaiKhoan;
 
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
 
    @Autowired
    private TaiKhoanDAO taiKhoanDAO;
 
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TaiKhoan taiKhoan = taiKhoanDAO.findTaiKhoan(username);
        System.out.println("TaiKhoan= " + taiKhoan);
 
        if (taiKhoan == null) {
            throw new UsernameNotFoundException("User " //
                    + username + " was not found in the database");
        }
 
        // EMPLOYEE,MANAGER,..
        String role = taiKhoan.getRole();
 
        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
 
        // ROLE_EMPLOYEE, ROLE_MANAGER
        GrantedAuthority authority = new SimpleGrantedAuthority(role);
 
        grantList.add(authority);
 
        boolean enabled = taiKhoan.isActive();
        boolean TaiKhoanNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean TaiKhoanNonLocked = true;
 
        UserDetails userDetails = (UserDetails) new User(taiKhoan.getEmail(), //
                taiKhoan.getEncrytedPassword(), enabled, TaiKhoanNonExpired, //
                credentialsNonExpired, TaiKhoanNonLocked, grantList);
 
        return userDetails;
    }
 
}