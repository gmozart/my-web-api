package com.example.demo.controller;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UserRespository userRespository;

    @GetMapping("/usuarios/All")
    public List<Usuario> findAll(){
        return  userRespository.findAll();
    }
    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return userRespository.findByUsername(username);
    }
    @GetMapping("/{id}")
    public Usuario getId(@PathVariable Integer id){
        return userRespository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){
        userRespository.deleteById(id);
    }

    @PostMapping()
    public  void postUser(@RequestBody Usuario usuario){
        userRespository.save(usuario);

    }

    @PutMapping()
    public  void puttUser(@RequestBody Usuario usuario){
        userRespository.save(usuario);

    }

}
