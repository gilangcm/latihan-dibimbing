package com.dibimbing.dibimbing.service;
import com.dibimbing.dibimbing.model.Karyawan;
import com.dibimbing.dibimbing.model.Rekening;

import java.util.Map;

public interface RekeningService {

    public Map insert(Rekening rekening, Long karyawan_id);
    public Map update(Rekening rekening, Long karyawan_id);
    public Map delete(Long rekening);
}
