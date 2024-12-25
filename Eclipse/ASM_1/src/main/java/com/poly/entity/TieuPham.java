package com.poly.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;

@Entity
public class TieuPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "TieuDe", nullable = false)
    private String tieuDe;

    @Nationalized
    @Lob
    @Column(name = "MoTa")
    private String moTa;

    @Nationalized
    @Column(name = "LinkVideo")
    private String linkVideo;

    @Nationalized
    @Column(name = "Poster")
    private String poster;
    @ColumnDefault("0")
    @Column(name = "LuotXem")
    private Integer luotXem;

    @ColumnDefault("getdate()")
    @Column(name = "NgayTao")
    private Instant ngayTao;

    @Column(name = "trangthai")
    private boolean trangThai;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getLinkVideo() {
        return linkVideo;
    }

    public void setLinkVideo(String linkVideo) {
        this.linkVideo = linkVideo;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Integer getLuotXem() {
        return luotXem;
    }

    public void setLuotXem(Integer luotXem) {
        this.luotXem = luotXem;
    }

    public Instant getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Instant ngayTao) {
        this.ngayTao = ngayTao;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "TieuPham{" +
                "id=" + id +
                ", tieuDe='" + tieuDe + '\'' +
                ", moTa='" + moTa + '\'' +
                ", linkVideo='" + linkVideo + '\'' +
                ", poster='" + poster + '\'' +
                ", luotXem=" + luotXem +
                ", ngayTao=" + ngayTao +
                ", trangThai=" + trangThai +
                '}';
    }
}