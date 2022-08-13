package com.dibimbing.dibimbing.service.impl;

import com.dibimbing.dibimbing.model.Barang;
import com.dibimbing.dibimbing.service.BarangServiceStatic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ImplStaticBarang implements BarangServiceStatic {
    static List<Barang> listBrg = new ArrayList<>();


    @Override
    public Barang save(Barang obj) {
        long num = (long) (Math.random()*50 + 1);
        obj.setId(num);
        listBrg.add(obj);
        System.out.println(obj.getId());
//        obj.setId(1L);
//        listBrg.add(obj);
        return obj;
    }

    @Override
    public Barang update(Barang obj) {
        for(Barang data : listBrg){
            if(obj.getId() == data.getId()){
                Barang update = new Barang();
                update.setNama(obj.getNama());
                update.setId(obj.getId());
                update.setStok(obj.getStok());
                update.setSatuan(obj.getSatuan());
                update.setHarga(obj.getHarga());
                listBrg.remove(data);
                listBrg.add(update);
                return update;
            }
        }
        return null;
    }

    @Override
    public List<Barang> deleted(Long id) {
        for(Barang data : listBrg){
            if(id == data.getId()){
                Barang update = new Barang();
                update.setNama(data.getNama());
                update.setId(data.getId());
                update.setStok(data.getStok());
                update.setSatuan(data.getSatuan());
                update.setHarga(data.getHarga());
                listBrg.remove(data);

                return listBrg;
            }
        }
        return null;
    }

    @Override
    public List<Barang> dataBrg(int row, int page) { return listBrg; }

    @Override
    public Barang findById(long obj) {
        for(Barang data : listBrg) {
            if (obj == data.getId()) {
                return data;
            }
        }
        return null;
    }
}
