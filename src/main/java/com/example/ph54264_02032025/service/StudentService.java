package com.example.ph54264_02032025.service;

import com.example.ph54264_02032025.entity.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<SinhVien> SinhVienList = new ArrayList<>();

    public void addSinhVien(SinhVien sv){
        if (sv == null){
            throw new IllegalArgumentException("sv is null");
        }
        SinhVienList.add(sv);
    }

    public SinhVien getSinhVienById(int id){

        for (SinhVien sv : SinhVienList){
            if (sv.getId() == id){
                return sv;
            }
        }
        return null;
    }

    public void updateSinhVien(SinhVien sv){
        if (sv == null){
            throw new IllegalArgumentException("sv is null");
        }

        for (int i =0; i<SinhVienList.size(); i++){
            if (SinhVienList.get(i).getId() == sv.getId()){
                SinhVienList.set(i,sv);
                return;
            }else {
                throw new IllegalArgumentException("SV id " + sv.getId() + " not exits");
            }
        }
    }

    public boolean deleteSinhVienById(int id){
        for (int i =0; i<SinhVienList.size(); i++){
            if (SinhVienList.get(i).getId() == id){
                SinhVienList.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<SinhVien> getAllSinhVien(){
        return new ArrayList<>(SinhVienList);
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        System.out.println(sv + "sinh vien");
    }
}
