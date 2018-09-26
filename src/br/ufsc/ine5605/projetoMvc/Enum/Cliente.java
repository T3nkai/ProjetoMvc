package br.ufsc.ine5605.projetoMvc.Enum;

public class Cliente {
    private int cpf;
    private String nome;
    private String tipoCli;
    private TipoCliente tipoCliente;

    //contantes

    /*opção 1*/
//    public static final String ESPECIAL = "ESPECIAL";
//    public static final String COMUM = "COMUM";
//    public static final String DEVEDOR= "DEVEDOR";


//    /**
//     *tipos de cliente
//     * 0 - Especial;
//     * 1 - Comum
//     * 2 - DEVEDor
//     */
//    /*opcao 2*/
//    public static final String[] TIPO = {"ESPECIAL", "COMUM", "DEVEDOR"};
//

//    public static enum TipoCliente {ESPECIAL, COMUM, DEVEDOR};


    public Cliente(int cpf, String nome, TipoCliente tipoClietne ){
        this.cpf = cpf;
        this.nome = nome;
        this.tipoCliente = tipoClietne;
    }

    public TipoCliente getTipoCliente(){
        return tipoCliente;
    }



    public Cliente(int cpf, String nome, String tipoClietne ){
        this.cpf = cpf;
        this.nome = nome;
        this.tipoCli = tipoClietne;
    }

    public String getTipoClietne() {
        return tipoCli;
    }

    public void setTipoClietne(String tipoClietne) {
        this.tipoCli = tipoClietne;
    }



    public Cliente(int cpf, String nome ){
        this.cpf = cpf;
        this.nome = nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }
}
