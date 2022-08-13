package com.dibimbing.dibimbing.repository;

import com.dibimbing.dibimbing.model.Barang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BarangRepository extends PagingAndSortingRepository<Barang, Long> {
    //JPQL bukan native
    @Query("select c from Barang c")// nama class
    public Page<Barang> getAllData(Pageable pageable);
    //JPQL bukan native
    @Query("select c from Barang c WHERE c.id = :idbarang")
    public Barang getbyID(@Param("idbarang") Long idbebas);

    //JPQL
    public Barang findOneById(Long id);

    //native query
    @Query(value = "select c from Barang c WHERE c.id = :idbarang", nativeQuery = true)
    public Object getbyIDNativeQuery(@Param("idbarang") Long idbebas);

    }
