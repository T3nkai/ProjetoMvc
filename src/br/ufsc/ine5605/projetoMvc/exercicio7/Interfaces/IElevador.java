package br.ufsc.ine5605.projetoMvc.exercicio7.Interfaces;

/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

import br.ufsc.ine5605.projetoMvc.exercicio7.ElevadorCheioException;
import br.ufsc.ine5605.projetoMvc.exercicio7.ElevadorJahNoTerreoException;
import br.ufsc.ine5605.projetoMvc.exercicio7.ElevadorJahNoUltimoAndarException;
import br.ufsc.ine5605.projetoMvc.exercicio7.ElevadorJahVazioException;

/**
 *
 * @author Jean Hauck <jean.hauck at ufsc.br>
 * @date   11/09/2015
 */
public interface IElevador {

    public int getCapacidade();
    public int getTotalPessoas();
    public String descer() throws ElevadorJahNoTerreoException;
    public String entraPessoa() throws ElevadorCheioException;
    public String saiPessoa() throws ElevadorJahVazioException;
    public String subir() throws ElevadorJahNoUltimoAndarException;
    public void setTotalAndaresPredio(int totalAndaresPredio);
    public int getTotalAndaresPredio();
    public int getAndarAtual();

}
