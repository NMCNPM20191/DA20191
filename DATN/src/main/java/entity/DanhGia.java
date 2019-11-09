package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "DanhGia")
public class DanhGia implements Serializable {

	private static final long serialVersionUID = -1000119078147252957L;
	 
    public int getIdDanhGia() {
		return idDanhGia;
	}

	public void setIdDanhGia(int idDanhGia) {
		this.idDanhGia = idDanhGia;
	}

	public NhiemVu getNhiemvu() {
		return nhiemvu;
	}

	public void setNhiemvu(NhiemVu nhiemvu) {
		this.nhiemvu = nhiemvu;
	}

	public String getTieuchi1() {
		return tieuchi1;
	}

	public void setTieuchi1(String tieuchi1) {
		this.tieuchi1 = tieuchi1;
	}

	public String getTieuchi2() {
		return tieuchi2;
	}

	public void setTieuchi2(String tieuchi2) {
		this.tieuchi2 = tieuchi2;
	}

	public String getTieuchi3() {
		return tieuchi3;
	}

	public void setTieuchi3(String tieuchi3) {
		this.tieuchi3 = tieuchi3;
	}

	public String getTrungbinh() {
		return trungbinh;
	}

	public void setTrungbinh(String trungbinh) {
		this.trungbinh = trungbinh;
	}

	@Id
    @Column(name = "IdDanhGia", length = 20, nullable = false)
    private int idDanhGia;
 

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdNhiemVu", nullable = false, //
            foreignKey = @ForeignKey(name = "IdNhiemVu"))
    private NhiemVu nhiemvu;
    
    @Column(name = "NoiDung",length =225, nullable = false)
    private String noidung;
    
    @Column(name = "TieuChi1",length =225, nullable = false)
    private String tieuchi1;
    
    @Column(name = "TieuChi2",length =225, nullable = false)
    private String tieuchi2;
    
    @Column(name = "TieuChi3",length =225, nullable = false)
    private String tieuchi3;
    
    @Column(name = "TrungBinh",length =225, nullable = false)
    private String trungbinh;
    
    @Column(name = "File",length =225, nullable = false)
    private String file;

	

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}
    
}
