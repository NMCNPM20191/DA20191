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
@Table(name = "Comment")
public class Comment implements Serializable {

	private static final long serialVersionUID = -1000119078147252957L;
	 
    @Id
    @Column(name = "IdComment", length = 20, nullable = false)
    private int idComment;
 

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdNguoiComment", nullable = false, //
            foreignKey = @ForeignKey(name = "IdNguoiComment"))
    private TaiKhoan nguoicomment;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdBaiDang", nullable = false, //
            foreignKey = @ForeignKey(name = "IdBaiDang"))
    private BaiDang baidang;
    
    @Column(name = "NoiDung",length =225, nullable = false)
    private String noidung;
    
    @Column(name = "ThoiGian",length =225, nullable = false)
    private Date thoigian;
    
    @Column(name = "File",length =225, nullable = false)
    private String file;

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}


	public int getIdComment() {
		return idComment;
	}

	public void setIdComment(int idComment) {
		this.idComment = idComment;
	}

	public TaiKhoan getNguoicomment() {
		return nguoicomment;
	}

	public void setNguoicomment(TaiKhoan nguoicomment) {
		this.nguoicomment = nguoicomment;
	}

	public BaiDang getBaidang() {
		return baidang;
	}

	public void setBaidang(BaiDang baidang) {
		this.baidang = baidang;
	}

	public Date getThoigian() {
		return thoigian;
	}

	public void setThoigian(Date thoigian) {
		this.thoigian = thoigian;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}
    
}
