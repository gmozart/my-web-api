package com.example.demo.controller;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    UserRespository userRespository;

    @GetMapping(value = "/usuarios")
    public List<Usuario> findAll(){
        return  userRespository.findAll();
    }

}
