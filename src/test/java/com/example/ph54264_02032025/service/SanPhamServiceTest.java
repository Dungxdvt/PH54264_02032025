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
    void updateSanPhamValid() {
        SanPham sanPham = new SanPham("SP01", "Bat", 2024, 400000, 350, "Bat");
        sanPhamService.addSanPham(sanPham);
        sanPham.setTen("Thia");
        sanPham.setGia(300000);
        sanPhamService.updateSanPham(sanPham);
        assertEquals("Thia", sanPhamService.getSanPhamList().get(0).getTen());
    }
    @Test
    void updateSanPhamInValid() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sanPhamService.updateSanPham(null));
        assertEquals("San pham is null or empty", exception.getMessage());
    }

    @Test
    void updateSanPhamMaExit() {
        Exception exception2 = assertThrows(IllegalArgumentException.class,
                () -> sanPhamService.updateSanPham(new SanPham("SP99", "Non-existent", 2024, 300000, 345555, "Bat")));
        assertEquals("San pham doesn't exist", exception2.getMessage());
    }

    @Test
    void updateSanPhamMaNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> sanPhamService.updateSanPham(new SanPham(null, "Bat", 2024, 300000, 345555, "Bat")));

        assertEquals("San pham is null or empty", exception.getMessage());
    }



    @Test
    void maExits() {
        SanPham sanPham = new SanPham("SP01", "Bat", 2024, 400000, 350, "Bat");
        sanPhamService.addSanPham(sanPham);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sanPhamService.maExits("SP01"));
        assertEquals("San pham exits", exception.getMessage());
    }
}