package com.example.demo.repository;

import com.example.demo.handler.BusinessException;
import com.example.demo.handler.CampoObrigatorioException;
import com.example.demo.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRespository {

    public void save(Usuario usuario){
        if(usuario.getLogin() == null)
            throw new CampoObrigatorioException("Login");
        if(usuario.getPassword() == null)
            throw new CampoObrigatorioException("Password");
        if(usuario.getId() == null)
            System.out.println("SAVE - Recebendo o usuário na camada de respositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de respositório");

        System.out.println(usuario);
    }


    public List<Usuario> findAll(){
        System.out.println("List - Listando usuarios do Sistema");
        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("gleyson", "password"));
        usuarios.add(new Usuario("frank", "masterpass"));

        return usuarios;
    }

    public Usuario deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuario "));
        return new Usuario(id);
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuario "));
        return new Usuario("gleyson", "password");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar o nome do usuario "));
        return new Usuario("gleyson", "password");
    }



}
