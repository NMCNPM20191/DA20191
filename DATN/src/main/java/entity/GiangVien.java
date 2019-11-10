package entity;
 
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
@Entity
@Table(name = "GiangVien")
public class GiangVien implements Serializable {
 
    private static final long serialVersionUID = -2054386655979281969L;
 
    @Id
    @Column(name = "IdGiangVien", length = 11, nullable = false)
    private String idGiangVien;
    
    @Column(name = "Ten", length = 45, nullable = false)
    private String ten;
    
    @Column(name = "SoDienThoai", length = 45, nullable = false)
    private String sodienthoai;
    
    @Column(name = "Namsinh", length = 20, nullable = false)
    private Date namsinh;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdTaiKhoan", nullable = false, //
            foreignKey = @ForeignKey(name = "IdTaiKhoanGV"))
    private TaiKhoan taikhoan;
 

	public String getIdGiangVien() {
		return idGiangVien;
	}

	public void setIdGiangVien(String idGiangVien) {
		this.idGiangVien = idGiangVien;
	}


	public TaiKhoan getTaikhoan() {
		return taikhoan;
	}

	public void setTaikhoan(TaiKhoan taikhoan) {
		this.taikhoan = taikhoan;
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

	public String getSodienthoai() {
		return sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

 
}