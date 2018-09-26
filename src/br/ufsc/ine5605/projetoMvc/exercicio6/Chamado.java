package br.ufsc.ine5605.projetoMvc.exercicio6;

import br.ufsc.ine5605.projetoMvc.exercicio6.Interfaces.IChamado;

import java.util.Date;

public class Chamado implements IChamado {
    private Date data;
    private String descricao;
    private Cliente cliente;
    private int prioridade;
    private Tecnico tecnico;
    private TipoChamado tipoChamado;
    private String titulo;

    public Chamado (String descricao, Cliente cliente, int prioridade, Tecnico tecnico, TipoChamado tipoChamado, String titulo, Date data){
        this.descricao = descricao;
        this.cliente = cliente;
        this.prioridade = prioridade;
        this.tecnico = tecnico;
        this.tipoChamado = tipoChamado;
        this.titulo = titulo;
        this.data = data;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public void setPrioridade(int prioridade){
        this.prioridade = prioridade;
    }
    public void setTecnico(Tecnico tecnico){
        this.tecnico = tecnico;
    }
    public void setTipoChamado(TipoChamado tipoChamado){
        this.tipoChamado = tipoChamado;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    @Override
    public Cliente getCliente() {
        return this.cliente;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public int getPrioridade() {
        return this.prioridade;
    }

    @Override
    public Tecnico getTecnico() {
        return this.tecnico;
    }

    @Override
    public TipoChamado getTipo() {
        return this.tipoChamado;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }
}
