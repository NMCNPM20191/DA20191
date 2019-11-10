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
@Table(name = "SinhVien")
public class SinhVien implements Serializable {
 
    private static final long serialVersionUID = -2054386655979281969L;
 
    @Id
    @Column(name = "IdSinhVien", length = 11, nullable = false)
    private String idSinhVien;
    
    //joinColumn, join cac cot co ten tuong ung voi name lam khoa ngoai thong qua 
    //thong qua ten khoa ngoai (foreignKeyName)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdGiangVien", nullable = false, //
            foreignKey = @ForeignKey(name = "IdGiangVien"))
    private GiangVien giangvien;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdTaiKhoan", nullable = false, //
            foreignKey = @ForeignKey(name = "IdTaikhoanSV"))
    private TaiKhoan taikhoan;
  
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdDeTaiSV", nullable = false, //
            foreignKey = @ForeignKey(name = "IdDeTaiSV"))
    private DeTai detai;
    
    @Column(name = "Mssv", length = 11, nullable = false)
    private int mssv;
    
    @Column(name = "Ten", length = 45, nullable = false)
    private String ten;
  
    
    @Column(name = "Namsinh", length = 20, nullable = false)
    private Date namsinh;
    
    
    @Column(name = "SoDienThoai", length = 45, nullable = false)
    private String sodienthoai;

	public String getTen() {
		return ten;
	}

	public String getIdSinhVien() {
		return idSinhVien;
	}

	public void setIdSinhVien(String idSinhVien) {
		this.idSinhVien = idSinhVien;
	}

	public GiangVien getGiangvien() {
		return giangvien;
	}

	public void setGiangvien(GiangVien giangvien) {
		this.giangvien = giangvien;
	}

	public TaiKhoan getTaikhoan() {
		return taikhoan;
	}

	public void setTaikhoan(TaiKhoan taikhoan) {
		this.taikhoan = taikhoan;
	}

	public DeTai getDetai() {
		return detai;
	}

	public void setDetai(DeTai detai) {
		this.detai = detai;
	}

	public int getMssv() {
		return mssv;
	}

	public void setMssv(int mssv) {
		this.mssv = mssv;
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