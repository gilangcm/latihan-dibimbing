package com.dibimbing.dibimbing.service;

import com.dibimbing.dibimbing.model.Karyawan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Map;

public interface KaryawanService {
    public Map insert(Karyawan karyawan);
    public Map update(Karyawan karyawan);
    public Map delete(Long karyawan);
    public Map getbyIDKaryawan(Long idKaryawan);

    public Map getAll(int size, int page);

}