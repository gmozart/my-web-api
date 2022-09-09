package com.example.demo.model;

import lombok.Data;

@Data
public class Usuario {

    private Integer id;
    private String login;
    private String password;

    public Usuario(){}

    public Usuario(String login, String paswword){
        this.login = login;
        this.password = paswword;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
