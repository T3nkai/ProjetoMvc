package br.ufsc.ine5605.projetoMvc.exercicio6;

import br.ufsc.ine5605.projetoMvc.exercicio6.Interfaces.IControladorPessoas;
import br.ufsc.ine5605.projetoMvc.exercicio6.Interfaces.IPessoa;

import java.util.ArrayList;

public class ControladorPessoas implements IControladorPessoas {

    private Cliente cliente;
    private Tecnico tecnico;
    private ArrayList<Cliente> clientes;
    private ArrayList<Tecnico> tecnicos;

    public ControladorPessoas() {
        clientes = new ArrayList<>();
        tecnicos = new ArrayList<>();
    }


    @Override
    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }

    @Override
    public ArrayList<Tecnico> getTecnicos() {
        return this.getTecnicos();
    }

    @Override
    public IPessoa incluiCliente(int codigo, String nome) {
        if (nome != null) {
            if (!getClientes().contains(nome) && !getClientes().contains(codigo)) {
                cliente = new Cliente(nome, codigo);
                this.clientes.add(cliente);
                return cliente;

            }
        }


        return null;
    }
    @Override
    public IPessoa incluiTecnico(int codigo, String nome) {
        if (nome != null) {
            if (!getTecnicos().contains(nome) && !getTecnicos().contains(codigo)) {
                tecnico = new Tecnico(nome, codigo);
                this.tecnicos.add(tecnico);
                return tecnico;

            }
        }
        return null;
    }
}

