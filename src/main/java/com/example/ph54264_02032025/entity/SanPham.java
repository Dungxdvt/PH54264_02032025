package com.example.ph54264_02032025.entity;

public class SanPham {
    private String ma;
    private String ten;
    private int namBaoHanh;
    private float gia;
    private int soLuong;
    private String danhMuc;

    public SanPham(String ma, String ten, int namBaoHanh, float gia, int soLuong, String danhMuc) {
        this.ma = ma;
        setTen(ten);
        this.namBaoHanh = namBaoHanh;
        setGia(gia);
        this.soLuong = soLuong;
        this.danhMuc = danhMuc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        if (ten == null || ten.trim().isEmpty()) {
            throw new IllegalArgumentException("ten invalid");
        }
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamBaoHanh() {
        return namBaoHanh;
    }

    public void setNamBaoHanh(int namBaoHanh) {
        this.namBaoHanh = namBaoHanh;
    }

    public float getGia() {
        if (gia < 0 || gia > 100000000) {
            throw new IllegalArgumentException("gia invalid");
        }
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }
}
