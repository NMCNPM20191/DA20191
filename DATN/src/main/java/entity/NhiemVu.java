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
@Table(name = "NhiemVu")
public class NhiemVu implements Serializable {

	private static final long serialVersionUID = -1000119078147252957L;
	 
    @Id
    @Column(name = "IdNhiemVu", length = 20, nullable = false)
    private int idnhiemvu;
 

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdDeTai", nullable = false, //
            foreignKey = @ForeignKey(name = "IdDeTai"))
    private DeTai detai;
    
 
    @Column(name = "TenNhiemVu",length =225, nullable = false)
    private String tennhiemvu;
    
    @Column(name = "NoiDung",length =225, nullable = false)
    private String noidung;
    
    @Column(name = "TrangThai",length =225, nullable = false)
    private String trangthai;
    
	@Column(name = "NgayTao",length =225, nullable = false)
    private Date ngaytao;
    
    @Column(name = "File",length =225, nullable = false)
    private String file;
    
    public int getIdnhiemvu() {
		return idnhiemvu;
	}

	public void setIdnhiemvu(int idnhiemvu) {
		this.idnhiemvu = idnhiemvu;
	}

	public DeTai getDetai() {
		return detai;
	}

	public void setDetai(DeTai detai) {
		this.detai = detai;
	}

	public String getTennhiemvu() {
		return tennhiemvu;
	}

	public void setTennhiemvu(String tennhiemvu) {
		this.tennhiemvu = tennhiemvu;
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

	public String getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}

    
}
