package com.scklrSW.demo.service;

import com.scklrSW.demo.model.Empress;
import com.scklrSW.demo.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    public List<Empress> verEmpresa(){
        List<Empress> empresa1 = new ArrayList<Empress>();
        empresa1.addAll(empresaRepository.findAll());
        return empresa1;
    }

    public void eliminarEmpresa(Long id){
        empresaRepository.deleteById(id);
    }


    public void crearYActualizarEmpresa(Empress empresa){
        empresaRepository.save(empresa);
    }


}
