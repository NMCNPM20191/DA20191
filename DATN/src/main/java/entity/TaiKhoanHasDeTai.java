package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "TaiKhoan_has_DeTai")
public class TaiKhoanHasDeTai implements Serializable {

	private static final long serialVersionUID = -1000119078147252957L;
	 
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "taikhoan_IdTaiKhoan", foreignKey = @ForeignKey(name = "fk_taikhoan_has_detai_taikhoan"), nullable = false)
    private TaiKhoan taikhoan;
    
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "detai_IdDeTai", foreignKey = @ForeignKey(name = "fk_taikhoan_has_detai_detai"), nullable = false)
    private Detai detai;

	public TaiKhoan getTaikhoan() {
		return taikhoan;
	}

	public void setTaikhoan(TaiKhoan taikhoan) {
		this.taikhoan = taikhoan;
	}

	public Detai getDetai() {
		return detai;
	}

	public void setDetai(Detai detai) {
		this.detai = detai;
	}
 
    
}
