package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DeTai")
public class DeTai implements Serializable {

	private static final long serialVersionUID = -1000119078147252957L;
	 
    @Id
    @Column(name = "IdDeTai", length = 20, nullable = false)
    private int idDeTai;
 
    @Column(name = "TenDeTai", length = 45, nullable = false)
    private String tendetai;
 
    @Column(name = "MoTa",length =225, nullable = false)
    private String mota;
    
    @Column(name = "NgayTao",length =225, nullable = false)
    private Date ngaytao;
    
    @Column(name = "File",length =225, nullable = false)
    private String file;
    
    @Column(name = "TrangThai",length =225, nullable = false)
    private String trangthai;
    
    public int getIdDeTai() {
		return idDeTai;
	}

	public void setIdDeTai(int idDeTai) {
		this.idDeTai = idDeTai;
	}

	public String getTendetai() {
		return tendetai;
	}

	public void setTendetai(String tendetai) {
		this.tendetai = tendetai;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
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

	public String getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
}
