package com.example.ph54264_02032025.service;

import com.example.ph54264_02032025.entity.SinhVien;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private StudentService studentService;

    @BeforeEach
    void setUp() {
        studentService = new StudentService();
    }

    @Test
    void addSinhVienValid() {
        SinhVien sinhVien = new SinhVien(1, "Dung", 18, 9.0);
        studentService.addSinhVien(sinhVien);
        assertEquals(1, studentService.getAllSinhVien().size());
    }

    @Test
    void addSinhVienNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> studentService.addSinhVien(null));
        assertEquals("sv is null", exception.getMessage());
    }

    @Test
    void addSinhVienInValidName() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> studentService.addSinhVien(new SinhVien(2, "", 18, 9.0)));
        assertEquals("Name cannot be null or empty", exception.getMessage());
    }

    @Test
    void addSinhVienInValidAge() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> studentService.addSinhVien(new SinhVien(2, "Dung", -10, 9.0)));
        assertEquals("Age cannot be negative", exception.getMessage());
    }

    @Test
    void addSinhVienValidAge() {
      SinhVien sinhVien = new SinhVien(2, "Dung", 1, 9.0);
        studentService.addSinhVien(sinhVien);
        assertEquals(1, studentService.getAllSinhVien().size());
    }

    @Test
    void addSinhVienInValidMark() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> studentService.addSinhVien(new SinhVien(2, "Dung", 19, 11.0)));
        assertEquals("Mark cannot be negative", exception.getMessage());
    }

    @Test
    void addSinhVienValidMark() {
        SinhVien sinhVien = new SinhVien(2, "Dung", 19, 10.0);
        studentService.addSinhVien(sinhVien);
        assertEquals(1, studentService.getAllSinhVien().size());
    }


    @Test
    void getSinhVienById() {
    }

    @Test
    void updateSinhVien() {
        SinhVien sv = new SinhVien(1, "Dung", 18, 9.0);
        studentService.addSinhVien(sv);

        sv.setName("Nam");
        sv.setAge(29);
        sv.setMark(8.0);
        studentService.updateSinhVien(sv);

        assertEquals("Nam", studentService.getSinhVienById(1).getName());
        assertEquals(29, studentService.getSinhVienById(1).getAge());
        assertEquals(8.0, studentService.getSinhVienById(1).getMark());
    }

    @Test
    void updateSinhVienNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> studentService.updateSinhVien(null));
        assertEquals("sv is null", exception.getMessage());
    }

    @Test
    void updateSinhVienInValidId() {
        SinhVien sv = new SinhVien(2, "Dung", 18, 9.0);
        studentService.addSinhVien(sv);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> studentService.updateSinhVien( new SinhVien(3, "Nam", 22, 8.0)));
        assertEquals("SV id 3 not exits", exception.getMessage());
    }

    @Test
    void deleteSinhVienById() {
    }

    @Test
    void getAllSinhVien() {
    }
}