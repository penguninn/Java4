package com.poly.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
public class ChiaSeEmail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDChiaSe")
    private ChiaSe iDChiaSe;

    @Nationalized
    @Column(name = "EmailNhan")
    private String emailNhan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ChiaSe getIDChiaSe() {
        return iDChiaSe;
    }

    public void setIDChiaSe(ChiaSe iDChiaSe) {
        this.iDChiaSe = iDChiaSe;
    }

    public String getEmailNhan() {
        return emailNhan;
    }

    public void setEmailNhan(String emailNhan) {
        this.emailNhan = emailNhan;
    }

}