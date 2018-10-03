package br.ufsc.ine5605.projetoMvc.exercicio8;/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

import br.ufsc.ine5605.projetoMvc.exercicio8.Interfaces.IControladorJogo;

import java.util.ArrayList;

/**
 * @author Jean Hauck <jean.hauck at ufsc.br>
 * @date 15/04/2016
 */
public class ControladorJogo implements IControladorJogo {

    private Personagem personagem;
    private ArrayList<Personagem> personagens;
    private Carta carta;
    private Jogador jogador;
    private ArrayList<Jogador> jogadores;

    public ControladorJogo(){
        jogadores =  new  ArrayList<>();
        personagens =  new  ArrayList<>();
    }

    /**
     * Permite incluir um novo Personagem na lista de personagens do jogo
     *
     * @param energia     Energia do novo Personagem
     * @param habilidade  Habilidade do novo Personagem
     * @param velocidade  Velocidade do novo Personagem
     * @param resistencia Resistencia do novo Personagem
     * @param tipo        TipoPersonagem (Enum) do novo Personagem. Deve ser utilizado TipoPersonagem.TIPO
     * @return Retorna o Personagem incluido na lista
     */
    public Personagem incluiPersonagemNaLista(int energia, int habilidade, int velocidade, int resistencia, TipoPersonagem tipo) {
        this.personagem = new Personagem(energia, habilidade, velocidade, resistencia, tipo);
        this.personagens.add(personagem);
        return personagem;
    }

    /**
     * Permite incluir uma nova Carta no baralho do jogo
     *
     * @param personagem Personagem da nova carta que sera incluida
     * @return Retorna a Carta que foi incluida no baralho
     */
    public Carta incluiCartaNoBaralho(Personagem personagem) {
        this.carta = new Carta(personagem);
        return this.carta;
    }

    /**
     * Permite incluir um novo Jogador, que eh colocado na lista de jogadores
     *
     * @param nome Nome do Jogador a ser incluido
     * @return Retorna o Jogador incluido na lista
     */
    public Jogador incluiJogador(String nome)
    {
        jogador = new Jogador(nome);
        jogadores.add(jogador);

        return jogador;

    }

    /**
     * Inicia o jogo, incluindo os dois jogadores na partida
     * Tambem distribui aleatoriamente 5 cartas do baralho para cada jogador
     *
     * @param jogador1 Jogador 1
     * @param jogador2 Jogador 2
     */
    public void iniciaJogo(Jogador jogador1, Jogador jogador2) {
        System.out.println(jogador1);


    }

    /**
     * Realiza uma jogada, ou seja:
     * 1. Recebe a mesa onde estao as cartas lancadas pelo Jogador 1 e pelo Jogador 2
     * 2. Compara os valores totais das cartas dos jogadores
     * 3. Inclui na mao do Jogador vencedor a carta do perdedor
     * 4. Se o outro jogador perdedor nao tem mais cartas na mao, retorna o Jogador vencedor como vencedor da partida
     *
     * @param mesa Mesa atual, contendo: Jogador 1, Jogador 2, Carta do Jogador 1 e Carta do Jogador 2
     * @return Retorna o Jogador vencedor como vencedor da partida. Se nenhum jogador venceu a partida, retorna NULL
     */
    public Jogador jogada(Mesa mesa) {
        return this.jogador;
    }

}