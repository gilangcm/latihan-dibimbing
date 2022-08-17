package com.dibimbing.dibimbing.dao;

import lombok.Data;

import java.util.Date;

@Data
public class KaryawanTrainingRequest {

    public Long id;
    public Long karyawan_id;
    public Long training_id;
    public Date training_date;

}
