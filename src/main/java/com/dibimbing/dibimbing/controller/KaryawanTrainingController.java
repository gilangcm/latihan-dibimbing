package com.dibimbing.dibimbing.controller;

import com.dibimbing.dibimbing.model.KaryawanTraining;
import com.dibimbing.dibimbing.repository.KaryawanTrainingRepository;
import com.dibimbing.dibimbing.service.KaryawanTrainingService;
import com.dibimbing.dibimbing.utils.TemplateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("/v1/karyawan-training")
public class KaryawanTrainingController {

    @Autowired
    public KaryawanTrainingRepository karyawanTrainingRepository;

    @Autowired
    public KaryawanTrainingService karyawanTrainingService;

    @Autowired
    public TemplateResponse templateResponse;

    @PutMapping("/update/{idKaryawanTraining}")
    public ResponseEntity<Map>update(@PathVariable(value = "idKaryawanTraining") Long idKaryawanTraining,
                                     @RequestBody KaryawanTraining karyawanTraining ){
        Map rek = karyawanTrainingService.update(karyawanTraining,idKaryawanTraining);
        return new ResponseEntity<Map>(rek, HttpStatus.OK);
    }


}
