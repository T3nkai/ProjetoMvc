package br.ufsc.ine5605.projetoMvc.exercicio6;

import br.ufsc.ine5605.projetoMvc.exercicio6.Interfaces.ITipoChamado;

public class TipoChamado implements ITipoChamado {

    private int codigo;
    private String descricao;
    private String nome;


    public TipoChamado(int codigo, String descricao, String nome){
        this.descricao = descricao;
        this.codigo = codigo;
        this.nome = nome;
    }


    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public int getCodigo() {
        return this.codigo;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
