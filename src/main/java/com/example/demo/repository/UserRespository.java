package com.example.demo.repository;

import com.example.demo.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRespository {

    public List<Usuario> findAll(){

        System.out.println("List - Listando usuarios do Sistema");

        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("gleyson", "password"));
        usuarios.add(new Usuario("frank", "masterpass"));

        return usuarios;
    }

}
