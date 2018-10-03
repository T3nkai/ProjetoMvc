package br.ufsc.ine5605.projetoMvc.exercicio8;/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

import br.ufsc.ine5605.projetoMvc.exercicio8.Interfaces.ICarta;

/**
 *
 * @author Jean Hauck <jean.hauck at ufsc.br>
 * @date 15/04/2016
 */
public class Carta implements ICarta {
    private Personagem personagem;
    private int valorTotalCarta;

    public Carta(Personagem personagem) {
        this.personagem = personagem;
    }


    public void setValorTotalCarta(int valorTotalCarta) {
        this.valorTotalCarta = valorTotalCarta;
    }

    public int getValorTotalCarta(){
        return this.valorTotalCarta;
    };

    public void setPersonagem(Personagem personagem){
        this.personagem = personagem;

    }
    public Personagem getPersonagem(){
        return this.personagem;
    };
}