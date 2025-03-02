package com.example.ph54264_02032025.service;

import com.example.ph54264_02032025.entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    List<SanPham> sanPhamList = new ArrayList<>();

    public void addSanPham(SanPham sanPham) {
        sanPhamList.add(sanPham);
    }

    public void updateSanPham(SanPham sanPham) {
        if (sanPham == null || sanPham.getMa() == null || sanPham.getMa().isEmpty()) {
            throw new IllegalArgumentException("San pham is null or empty");
        }

        for (int i = 0; i < sanPhamList.size(); i++) {
            if (sanPhamList.get(i).getMa().equals(sanPham.getMa())) {
                sanPhamList.set(i, sanPham);
                return;
            }
        }

        throw new IllegalArgumentException("San pham doesn't exist");
    }


    public boolean maExits(String ma) {
        if (ma.trim().isEmpty()) {
            throw new IllegalArgumentException("ma is empty");
        }
        for (int i = 0; i < sanPhamList.size(); i++) {
            if (sanPhamList.get(i).getMa().equals(ma)) {
                throw new IllegalArgumentException("San pham exits");
            }
        }
        return false;
    }

    public List<SanPham> getSanPhamList() {
        return new ArrayList<>(sanPhamList);
    }

}
