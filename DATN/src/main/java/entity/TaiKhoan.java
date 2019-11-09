package entity;
 
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "TaiKhoan")
public class TaiKhoan implements Serializable {
 
    private static final long serialVersionUID = -2054386655979281969L;
 
    public static final String ROLE_GIANGVIEN = "GIANGVIEN";
    public static final String ROLE_SINHVIEN = "SINHVIEN";
    public static final String ROLE_GIAOVU = "GIAOVU";
    
 
    @Id
    @Column(name = "IdTaiKhoan", length = 20, nullable = false)
    private String idTaiKhoan;
    
    @Column(name = "Ten", length = 45, nullable = false)
    private String ten;
    
    @Column(name = "Namsinh", length = 20, nullable = false)
    private Date namsinh;
    
    @Column(name = "Email", length = 45, nullable = false)
    private String email;
 
    @Column(name = "Encrypted_Password", length = 128, nullable = false)
    private String encrytedPassword;
    
    @Column(name = "SoDienThoai", length = 45, nullable = false)
    private String sodienthoai;
 
    @Column(name = "Active", length = 1, nullable = false)
    private boolean active;
 
    @Column(name = "Role", length = 20, nullable = false)
    private String role;
 
    @Column(name = "AnhDaiDien", length = 45, nullable = false)
    private String anhdaidien;
    
    public String getIdTaiKhoan() {
		return idTaiKhoan;
	}

	public void setIdTaiKhoan(String idTaiKhoan) {
		this.idTaiKhoan = idTaiKhoan;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Date getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(Date namsinh) {
		this.namsinh = namsinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSodienthoai() {
		return sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

	public String getAnhdaidien() {
		return anhdaidien;
	}

	public void setAnhdaidien(String anhdaidien) {
		this.anhdaidien = anhdaidien;
	}

	public String getEncrytedPassword() {
        return encrytedPassword;
    }
 
    public void setEncrytedPassword(String encrytedPassword) {
        this.encrytedPassword = encrytedPassword;
    }
 
    public boolean isActive() {
        return active;
    }
 
    public void setActive(boolean active) {
        this.active = active;
    }
 
    public String getRole() {
        return role;
    }
 
    public void Role(String role) {
        this.role = role;
    }
 
    @Override
    public String toString() {
        return "[" + this.email + "," + this.encrytedPassword + "," + this.role + "]";
    }
 
}