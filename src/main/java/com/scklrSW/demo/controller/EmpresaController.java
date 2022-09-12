package com.scklrSW.demo.controller;

import com.scklrSW.demo.model.Empress;
import com.scklrSW.demo.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @GetMapping("/empresa")
    private List<Empress> verEmpress() {
        return empresaService.verEmpresa();
    }

    @PostMapping("/empresa")
    private void crearEmpresa(@RequestBody Empress empresa){
        empresaService.crearYActualizarEmpresa(empresa);
    }

    @DeleteMapping ("/empresa/{id}")
    private void eliminarEmpresa(@PathVariable("id")long id){
        empresaService.eliminarEmpresa(id);

    }



}
