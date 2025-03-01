package com.example.ph54264_02032025.service;

import com.example.ph54264_02032025.entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private List<SanPham> list = new ArrayList<>();

    public void addSanPham(SanPham sanPham){
        if (sanPham == null){
            throw new IllegalArgumentException("SanPham is null or empty");
        }
        list.add(sanPham);
    }

    public List<SanPham> getSanPham(){
        return new ArrayList<>(list);
    }

    public boolean removeSanPham(String ma){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getMa().equals(ma)){
                list.remove(i);
            }
            return true;
        }
        return false;
    }

    public boolean isMaExits(String ma){
        if (ma == null){
            throw new IllegalArgumentException("ma is null or empty");
        }
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getMa().equals(ma)){
                return true;
            }
        }
        return false;
    }
}
