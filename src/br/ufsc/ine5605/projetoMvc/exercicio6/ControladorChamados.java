package br.ufsc.ine5605.projetoMvc.exercicio6;

import br.ufsc.ine5605.projetoMvc.exercicio6.Interfaces.IChamado;
import br.ufsc.ine5605.projetoMvc.exercicio6.Interfaces.IControladorChamados;
import br.ufsc.ine5605.projetoMvc.exercicio6.Interfaces.ITipoChamado;

import java.util.ArrayList;
import java.util.Date;

public class ControladorChamados implements IControladorChamados {

    private Date data;
    private Cliente cliente;
    private Tecnico tecnico;
    private String titulo;
    private String descricao;
    private int prioridade;
    private TipoChamado tipoChamado;
    private ArrayList<ITipoChamado> tipoChamados;
    private IChamado chamado;
    private ArrayList<IChamado> chamados;
    private ControladorPessoas controladorPessoa;

    public ControladorChamados() {
        this.chamados = new ArrayList<>();
        this.tipoChamados = new ArrayList<>();
        ;
        this.controladorPessoa = new ControladorPessoas();
    }

    @Override
    public int getTotalChamadosPorTipo(ITipoChamado tipo) {
        int cont = 0;
        for (IChamado cham : chamados) {
            if (tipo.getCodigo() == cham.getTipo().getCodigo()) {
                cont++;
            }
        }
        return cont;
    }


    @Override
    public ITipoChamado incluiTipoChamado(int codigo, String nome, String descricao) {
        if (!(codigo == 0 && nome == null && descricao == null)) {
            boolean jatem = false;
            for (ITipoChamado charms : tipoChamados) {
                if (charms.getNome().equals(nome))
                    if (charms.getCodigo() == codigo) {
                        jatem = true;
                    }
            }
            if (!jatem) {
                tipoChamado = new TipoChamado(codigo, descricao, nome);
                tipoChamados.add(tipoChamado);
                return tipoChamado;
            }
        }
        return null;
    }


    @Override
    public IChamado incluiChamado(Date data, Cliente cliente, Tecnico tecnico, String titulo, String descricao, int prioridade, ITipoChamado tipo) {
        if (!(tecnico == null && cliente == null && tipo == null)) {
            this.chamado = new Chamado(descricao, cliente, prioridade, tecnico, (TipoChamado)tipo, titulo, data);
            this.chamados.add(chamado);

            return chamado;
        }

        return null;
    }

    private boolean tecnicoJacadastro(Tecnico tecnico) {
        boolean tecJAcadastrado = true;
        if (!controladorPessoa.getTecnicos().contains(tecnico.getCodigo())) {
            tecJAcadastrado = false;
        }
        return false;
    }

    private boolean clienteJacadastro(Cliente cliente) {
        boolean clienteJAcadastrado = true;
        if (!controladorPessoa.getClientes().contains(cliente.getCodigo())) {
            clienteJAcadastrado = false;
        }
        return false;
    }


}


