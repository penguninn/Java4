package com.poly.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
public class ChiaSe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDNguoiDung")
    private NguoiDung iDNguoiDung;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDTieuPham")
    private TieuPham iDTieuPham;

    @ColumnDefault("getdate()")
    @Column(name = "NgayChiaSe")
    private Instant ngayChiaSe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NguoiDung getIDNguoiDung() {
        return iDNguoiDung;
    }

    public void setIDNguoiDung(NguoiDung iDNguoiDung) {
        this.iDNguoiDung = iDNguoiDung;
    }

    public TieuPham getIDTieuPham() {
        return iDTieuPham;
    }

    public void setIDTieuPham(TieuPham iDTieuPham) {
        this.iDTieuPham = iDTieuPham;
    }

    public Instant getNgayChiaSe() {
        return ngayChiaSe;
    }

    public void setNgayChiaSe(Instant ngayChiaSe) {
        this.ngayChiaSe = ngayChiaSe;
    }

}