/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class JogadorSql {
   private int id;
   private String nome;
   private String email;
   private String celular;
   private String usarname;
   private String senha;

    public JogadorSql() {
    }

    public JogadorSql(String nome, String email, String celular, String usarname, String senha) {
        this.nome = nome;
        this.email = email;
        this.celular = celular;
        this.usarname = usarname;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getUsarname() {
        return usarname;
    }

    public void setUsarname(String usarname) {
        this.usarname = usarname;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
