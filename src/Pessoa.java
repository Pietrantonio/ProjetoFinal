/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo
 */
public class Pessoa {
     private int codigo;
     private String nome;
     private String email;
     private int idade;

    public Pessoa(int codigo, String nome, String email, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "codigo=" + codigo + "," + "nome=" + nome + ", " + "email=" + email + ", idade=" + idade + '}';
    }
     
     
}
