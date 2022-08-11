package com.dibimbing.dibimbing.model;

import lombok.Data;

import java.util.Date;

@Data
public class Karyawan {
    private Long id;
    private String nama;
    private String jk;
    private String dob;
    private String status;
    private String alamat;
}
