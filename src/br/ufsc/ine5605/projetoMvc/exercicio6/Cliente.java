package br.ufsc.ine5605.projetoMvc.exercicio6;

import java.util.ArrayList;

public class Cliente extends Pessoa {

    public Cliente(String nome, int codigo) {
        super(nome, codigo);
    }

    public void setNome(String nome) {
        super.setNome(nome);
    }

    public void setCodigo(int codigo) {
        super.setCodigo(codigo);
    }

    public String getNome(){
        return super.getNome();
    }
    public int getCodigo(){
     return super.getCodigo();
    }

}
