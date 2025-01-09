package com.materi_java.java.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "barang")
public class Barang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nama_barang")
    private String nama_barang;


    @Column(name = "stok_barang")
    private Long stok_barang;

    @Column(name = "deskripsi_barang")
    private String deskripsi_barang;

    @Column(name = "jenis_barang")
    private String jenis_barang;

    @Column(name = "tanggal_kadaluarsa")
    private Date tanggal_kadaluarsa;

    @Column(name = "harga_barang")
    private Float harga_barang;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNama_barang() {
        return nama_barang;
    }
    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public Long getStok_barang() {
        return stok_barang;
    }
    public void setStok_barang(Long stok_barang) {
        this.stok_barang = stok_barang;
    }

    public String getDeskripsi_barang() {
        return deskripsi_barang;
    }
    public void setDeskripsi_barang(String Deskrpsi_barang){
        this.deskripsi_barang = deskripsi_barang;
    }

    public String getJenis_barang() {
        return jenis_barang;
    }

    public void setJenis_barang(String jenis_barang) {
        this.jenis_barang = jenis_barang;
    }

    public Date getTanggal_kadaluarsa() {
        return tanggal_kadaluarsa;
    }
    public void setTanggal_kadaluarsa(Date tanggal_kadaluarsa) {
        this.tanggal_kadaluarsa = tanggal_kadaluarsa;
    }

    public Float getHarga_barang() {
        return harga_barang;
    }
    public void setHarga_barang(Float harga_barang) {
        this.harga_barang = harga_barang;
    }

}
