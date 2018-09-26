package br.ufsc.ine5605.projetoMvc.exercicio6;

import br.ufsc.ine5605.projetoMvc.exercicio6.Interfaces.IPessoa;

public class Pessoa implements IPessoa {
    private String nome;
    private int codigo;

    public Pessoa (String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return this.nome;
    }
    public int getCodigo(){
        return this.codigo;
    }
}
