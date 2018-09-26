package br.ufsc.ine5605.projetoMvc.exercicio7;/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

/**
 *
 * @author Jean Hauck <jean.hauck at ufsc.br>
 * @date   18/10/2017
 */
public class ElevadorJahNoUltimoAndarException extends Exception{

    public ElevadorJahNoUltimoAndarException(){
        this("Elevador ja esta no ultimo andar");
    }

    public ElevadorJahNoUltimoAndarException(String menssage){
        super(menssage);
    }
}
