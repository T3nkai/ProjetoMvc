package br.ufsc.ine5605.projetoMvc.Enum;

public enum TipoCliente {
    ESPECIAL("pode Compra com desconto"),
    COMUM("Pode vender"),
    DEVEDOR("Verificar se pode vender");

    public String mensagem;

    TipoCliente (String mensagemRecebida){
        mensagem = mensagemRecebida;
    }
}
