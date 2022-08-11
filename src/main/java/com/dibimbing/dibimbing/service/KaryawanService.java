package com.dibimbing.dibimbing.service;

import com.dibimbing.dibimbing.model.Karyawan;

import java.util.List;

public interface KaryawanService {
    public Karyawan save(Karyawan obj);
    public Karyawan update(Karyawan obj);
    public List<Karyawan> deleted(Long id);
    public List<Karyawan> dataKyw(int row,int page);
    public Karyawan findById(long obj);
}
