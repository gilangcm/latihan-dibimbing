package com.dibimbing.dibimbing.service;
import com.dibimbing.dibimbing.dao.KaryawanTrainingRequest;
import com.dibimbing.dibimbing.model.KaryawanTraining;

import java.util.Map;

public interface KaryawanTrainingService {

    public Map insert(KaryawanTraining request);

    public Map delete(Long kry);

    public Map update(KaryawanTraining karyawan, Long idKaryawanTraining);
    public Map getAll(int size, int page);
    public Map getbyIDKaryawan(Long id);

}
