package com.daffaalam.rukunislamiman;

public class data {

    private String judul;
    private Integer gambar;

    public data(String judul, Integer gambar) {
        this.judul = judul;
        this.gambar = gambar;
    }

    String getJudul() {
        return judul;
    }

    public void setJudul() {
        this.judul = judul;
    }

    Integer getGambar() {
        return gambar;
    }

    public void setGambar() {
        this.gambar = gambar;
    }
}
