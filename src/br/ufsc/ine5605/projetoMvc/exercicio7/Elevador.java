package br.ufsc.ine5605.projetoMvc.exercicio7;/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

import br.ufsc.ine5605.projetoMvc.exercicio7.Interfaces.IElevador;
/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

/**
 *
 * @author Jean Hauck
 */
public class Elevador implements IElevador {

    private int capaciadade;
    private int totalPessoa;
    private int totalAndaresPredio;
    private int andarAtual;
    private TipoAndar tipoAndar;

    public Elevador(int capacidade, int totalPessoa, int totalAndaresPredio, int andarAtual){
        this.capaciadade = capacidade;
        this.totalPessoa = totalPessoa;
        this.totalAndaresPredio = totalAndaresPredio;
        this.andarAtual = andarAtual;
    }
    public void setTipoAndar(TipoAndar tipoAndar){
        this.tipoAndar = tipoAndar;
    }
    public TipoAndar getTipoAndar(){
        return tipoAndar;
    }
    public int getCapacidade(){
        return this.capaciadade;
    }

    public void setCapacidade(int capaciadade){
        this.capaciadade = capaciadade;
    }

    public int getTotalPessoas(){
        return this.totalPessoa;
    };
    public void setTotalPessoa(int totalPessoa){
        this.totalPessoa = totalPessoa;
    }

    public void setTotalAndaresPredio(int totalAndaresPredio){
        this.totalAndaresPredio = totalAndaresPredio;
    }

    public int getTotalAndaresPredio(){
        return this.totalAndaresPredio;
    }

    public int getAndarAtual(){
        return this.andarAtual;
    }

    public String descer() throws ElevadorJahNoTerreoException{
        if(andarAtual > 0){
            andarAtual--;
        }else{
            throw new ElevadorJahNoTerreoException();
        }

        return "elevador desceu para o andar "+andarAtual;
    }

    public String entraPessoa() throws ElevadorCheioException{
        if(totalPessoa < capaciadade){
            totalPessoa++;
        }else{
            throw new ElevadorCheioException();
        }
        return "O elevador tem "+totalPessoa+" no elevador";

    }

    public String saiPessoa() throws ElevadorJahVazioException{
        if(this.totalPessoa > 0){
            this.totalPessoa--;
        }else{
            throw new ElevadorJahVazioException();
        }
        return "O elevador tem "+totalPessoa+" no elevador";
    }

    public String subir() throws ElevadorJahNoUltimoAndarException{


        if(totalAndaresPredio > andarAtual ){
            andarAtual++;
        }else{
            throw new ElevadorJahNoUltimoAndarException();
        }


        return "elevador subiu para o andar "+andarAtual;
    }


}
