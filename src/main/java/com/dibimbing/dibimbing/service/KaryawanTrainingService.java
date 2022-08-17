package com.dibimbing.dibimbing.service;
import com.dibimbing.dibimbing.dao.KaryawanTrainingRequest;
import com.dibimbing.dibimbing.model.KaryawanTraining;

import java.util.Map;

public interface KaryawanTrainingService {

    public Map insert(KaryawanTraining request);

    public Map delete(Long kry);

    Map getAll(int size, int page);

}
