package org.kodigo.example.mvc.examplemvc.controller;


import org.kodigo.example.mvc.examplemvc.model.Tecnico;
import org.kodigo.example.mvc.examplemvc.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TecnicoController {

    @Autowired
    private TecnicoRepository tecnicoRepository;

    @GetMapping("/tecnicos")
    public List<Tecnico> findAll() {
        return tecnicoRepository.findAll();
    }
}
