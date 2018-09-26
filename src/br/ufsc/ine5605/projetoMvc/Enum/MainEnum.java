package br.ufsc.ine5605.projetoMvc.Enum;

import java.util.ArrayList;

public class MainEnum {
    public static void main(String[] args) {


        ArrayList<Cliente> clientes = new ArrayList<>();

//        /*tipo cliente estring possivel erro de digitação*/
//        Cliente cliente1 = new Cliente(123423,"clietne 1","especial");
//        Cliente cliente2 = new Cliente(126523,"clietne 2","comum");
//        Cliente cliente3 = new Cliente(873423,"cliente 3","Devedpr");

//            /*utilizando variavel final*/
//        Cliente cliente1 = new Cliente(123423,"clietne 1", Cliente.ESPECIAL);
//        Cliente cliente2 = new Cliente(126523,"clietne 2",Cliente.COMUM);
//        Cliente cliente3 = new Cliente(873423,"cliente 3",Cliente.DEVEDOR);


        /*utilizando arrai para tipar*/
                Cliente cliente1 = new Cliente(123423,"clietne 1", TipoCliente.ESPECIAL);
        Cliente cliente2 = new Cliente(126523, "clietne 2", TipoCliente.COMUM);
        Cliente cliente3 = new Cliente(873423, "cliente 3", TipoCliente.DEVEDOR);

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

//        for (Cliente cliente : clientes) {
//            if (cliente.getTipoCliente().equals("ESPECIAL")) {
//                System.out.println(cliente.getNome() + " pode Compra com desconto");
//            } else if (cliente.getTipoCliente().equals("COMUM")) {
//                System.out.println(cliente.getNome() + " pode vender");
//            } else if (cliente.getTipoCliente().equals("DEVEDOR")) {
//                System.out.println(cliente.getNome() + " Verificar se pode vender");
//            }
//        }

        for (Cliente cliente : clientes) {
                System.out.println("Cliente: "+ cliente.getNome() + " "+ cliente.getTipoCliente().mensagem);
        }
    }
}
