package br.ufsc.ine5605.projetoMvc.exercicio6;

public class Tecnico extends Pessoa {
    public Tecnico(String nome, int codigo) {
        super(nome, codigo);
    }

    public void setNome(String nome){
        super.setNome(nome);
    }
    public void setCodigo(int codigo){
        super.setCodigo(codigo);
    }

    public String getNome(){
        return super.getNome();
    }

    public int getCodigo(){
        return super.getCodigo();
    }
}
