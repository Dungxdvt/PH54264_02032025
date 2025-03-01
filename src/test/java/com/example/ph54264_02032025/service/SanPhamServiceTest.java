package com.example.ph54264_02032025.service;

import com.example.ph54264_02032025.entity.SanPham;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {

    SanPhamService sanPhamService;

    @BeforeEach
    void setUp() {
        sanPhamService = new SanPhamService();
    }

    @Test
    void addSanPhamValid() {
        SanPham sanPham = new SanPham("SP01", "Bat", 2004, 30000, 100, "Bat");
        sanPhamService.addSanPham(sanPham);
        assertEquals(1, sanPhamService.getSanPham().size());
    }


    @Test
    void removeSanPham() {
        SanPham sanPham = new SanPham("SP01", "Bat", 2004, 30000, 100, "Bat");
        sanPhamService.addSanPham(sanPham);
        assertTrue(sanPhamService.removeSanPham("SP01"));
    }

    @Test
    void isMaExits() {
        SanPham sanPham = new SanPham("SP01", "Bat", 2004, 30000, 100, "Bat");
        sanPhamService.addSanPham(sanPham);
        assertTrue(sanPhamService.isMaExits("SP01"));
    }
}