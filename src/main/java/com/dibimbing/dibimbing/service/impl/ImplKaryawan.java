package com.dibimbing.dibimbing.service.impl;

import com.dibimbing.dibimbing.model.Karyawan;
import com.dibimbing.dibimbing.service.KaryawanService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ImplKaryawan implements KaryawanService {

    static List<Karyawan> listKyw = new ArrayList<>();

    @Override
    public Karyawan save(Karyawan obj) {
        long num = (long) (Math.random()*50 + 1);
        obj.setId(num);
        listKyw.add(obj);
        System.out.println(obj.getId());
//        obj.setId(1L);
//        listKyw.add(obj);
        return obj;
    }

    @Override
    public Karyawan update(Karyawan obj) {
        for(Karyawan data : listKyw){
            if(obj.getId() == data.getId()){
                Karyawan update = new Karyawan();
                update.setNama(obj.getNama());
                update.setId(obj.getId());
                update.setDob(obj.getDob());
                update.setJk(obj.getJk());
                update.setStatus(obj.getStatus());
                update.setAlamat(obj.getAlamat());
                listKyw.remove(data);
                listKyw.add(update);
                return update;
            }
        }

        return null;
    }

    @Override
    public List<Karyawan> deleted(Long id) {
        for(Karyawan data : listKyw){
            if(id == data.getId()){
                Karyawan update = new Karyawan();
                update.setNama(data.getNama());
                update.setId(data.getId());
                update.setDob(data.getDob());
                update.setJk(data.getJk());
                update.setStatus(data.getStatus());
                update.setAlamat(data.getAlamat());
                listKyw.remove(data);

                return listKyw;
            }
        }
        return null;
    }

    @Override
    public List<Karyawan> dataKyw(int row, int page) { return listKyw; }

    @Override
    public Karyawan findById(long obj) {
        for(Karyawan data : listKyw) {
            if (obj == data.getId()) {
                return data;
            }
        }
        return null;
    }
}
