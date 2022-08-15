package com.dibimbing.dibimbing.model;

import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "barang")
@Where(clause = "deleted_date is null")
public class Barang implements Serializable {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nama", nullable = true, length = 45)
    private String nama;

    @Column(name = "stok", nullable = false, length = 11)
    private int stok;

    @Column(name = "satuan",  length = 45)
    private String satuan;

    @Column(name = "harga",  length = 11)
    private Double harga;

    @Column(name = "created_date",  length = 15)
    private Date created_date;
}
