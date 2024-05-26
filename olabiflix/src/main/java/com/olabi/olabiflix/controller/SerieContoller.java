package com.olabi.olabiflix.controller;

import com.olabi.olabiflix.model.entity.Serie;
import com.olabi.olabiflix.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieContoller {

    // http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello(){
        return "Salve, mundão!";
    }

    @GetMapping(path = "/serie")
    public List<Serie> getSerie(){

        return serieRepository.findAll();
    }

    @PostMapping(path = "/serie")
    public Serie postSerie(@RequestBody Serie serie){
        return serieRepository.save(serie);
    }

    @Autowired
    private SerieRepository serieRepository;
}
