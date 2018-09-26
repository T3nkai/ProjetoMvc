package br.ufsc.ine5605.projetoMvc.exercicio7;
/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

import br.ufsc.ine5605.projetoMvc.exercicio7.Interfaces.IControladorElevador;
import br.ufsc.ine5605.projetoMvc.exercicio7.Interfaces.IElevador;

/**
 *
 * @author Jean Hauck
 */
public class ControladorElevador implements IControladorElevador {


    private Elevador elevador;

    /**
     * Faz o elevador subir um andar. Se jah estiver no ultimo andar, dispara excecao
     *
     * @return Mensagem informando o que ocorreu com o elevador
     * @throws ElevadorJahNoUltimoAndarException
     */
    public String subir() throws ElevadorJahNoUltimoAndarException {
        try {
            return this.elevador.subir();
        } catch (ElevadorJahNoUltimoAndarException message) {
            return message.getMessage();
        }
    }



    /**
     * Faz o elevador descer um andar. Se jah estiver no terreo, dispara excecao
     *
     * @return Mensagem informando o que ocorreu com o elevador
     * @throws ElevadorJahNoTerreoException
     */
    public String descer() throws ElevadorJahNoTerreoException {
        try {
            return this.elevador.descer();
        } catch (ElevadorJahNoTerreoException message) {
            return message.getMessage();
        }
    }



    /**
     * Entra uma pessoa no Elevador. Se nao for possivel permitir a entrada da pessoa, dispara excecao
     *
     * @return Mensagem informando o que ocorreu com o elevador
     * @throws ElevadorCheioException
     */
    public String entraPessoa() throws ElevadorCheioException {
        try {
            return this.elevador.entraPessoa();
        } catch (ElevadorCheioException e) {
            return e.getMessage();
        }
    }



    /**
     * Sai uma pessoa no Elevador. Se nao for possivel permitir a saida de uma pessoa, dispara excecao
     *
     * @return Mensagem informando o que ocorreu com o elevador
     * @throws ElevadorJahVazioException
     */
    public String saiPessoa() throws ElevadorJahVazioException {
        try {
            return this.elevador.saiPessoa();
        } catch (ElevadorJahVazioException message) {
            return message.getMessage();
        }

    }



    /**
     * @return Elevador
     */
    public Elevador getElevador() {
        return this.elevador;
    }



    /**
     * @param andarAtual         andar atual do elevador
     * @param totalAndaresPredio total de andares do predio
     * @param capacidade         capacidade maxima do elevador
     * @param totalPessoas       total de pessoas atual do elevador
     * @return retorna o Elevador instanciado como um IElevador
     */
    public IElevador inicializarElevador(int andarAtual, int totalAndaresPredio, int capacidade, int totalPessoas) {
        this.elevador = new Elevador(capacidade, totalAndaresPredio, andarAtual, andarAtual);
        return this.elevador;
    }


}