package com.poly.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;

@Entity
public class NguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "TenNguoiDung", nullable = false, length = 100)
    private String tenNguoiDung;

    @Nationalized
    @Column(name = "Email", nullable = false, length = 100)
    private String email;

    @Nationalized
    @Column(name = "MatKhau", nullable = false)
    private String matKhau;

    @Column(name = "VaiTro", columnDefinition = "tinyint not null")
    private Short vaiTro;

    @ColumnDefault("getdate()")
    @Column(name = "NgayDangKy")
    private Instant ngayDangKy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Short getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(Short vaiTro) {
        this.vaiTro = vaiTro;
    }

    public Instant getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(Instant ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

}