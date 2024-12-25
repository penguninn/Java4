package com.poly.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
public class YeuThich {
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
    @Column(name = "NgayYeuThich")
    private Instant ngayYeuThich;

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

    public Instant getNgayYeuThich() {
        return ngayYeuThich;
    }

    public void setNgayYeuThich(Instant ngayYeuThich) {
        this.ngayYeuThich = ngayYeuThich;
    }

}