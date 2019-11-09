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
@Table(name = "BaiDang")
public class BaiDang implements Serializable {

	private static final long serialVersionUID = -1000119078147252957L;
	 
    @Id
    @Column(name = "IdBaiDang", length = 20, nullable = false)
    private int idBaiDang;
 

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdNguoiDang", nullable = false, //
            foreignKey = @ForeignKey(name = "IdNguoiDang"))
    private TaiKhoan nguoidang;
    
 
    @Column(name = "Ten",length =225, nullable = false)
    private String tenbaidang;
    
    @Column(name = "NoiDung",length =225, nullable = false)
    private String noidung;
    
    @Column(name = "NgayTao",length =225, nullable = false)
    private Date ngaytao;
    
    @Column(name = "File",length =225, nullable = false)
    private String file;

	public int getIdBaiDang() {
		return idBaiDang;
	}

	public void setIdBaiDang(int idBaiDang) {
		this.idBaiDang = idBaiDang;
	}

	public TaiKhoan getNguoidang() {
		return nguoidang;
	}

	public void setNguoidang(TaiKhoan nguoidang) {
		this.nguoidang = nguoidang;
	}

	public String getTenbaidang() {
		return tenbaidang;
	}

	public void setTenbaidang(String tenbaidang) {
		this.tenbaidang = tenbaidang;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public Date getNgaytao() {
		return ngaytao;
	}

	public void setNgaytao(Date ngaytao) {
		this.ngaytao = ngaytao;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}
    
}
