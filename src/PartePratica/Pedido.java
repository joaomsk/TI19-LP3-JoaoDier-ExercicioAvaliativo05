package PartePratica;

import PartePratica.IngressosStrategies.TipoIngressos;

public class Pedido {
    private final Cliente cliente;
    private final TipoIngressos tipoIngresso;
    private final Integer valorPedido;

    public Pedido(Cliente cliente, TipoIngressos tipoIngresso) {
        this.cliente = cliente;
        this.tipoIngresso = tipoIngresso;
        this.valorPedido = calculaValorIngresso();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public TipoIngressos getTipoIngresso() {
        return tipoIngresso;
    }

    public Integer getValorPedido() {
        return valorPedido;
    }

    private Integer calculaValorIngresso() {
        Integer valor = null;

        try {
            TipoIngressos tipoIngresso = getTipoIngresso();
            valor = tipoIngresso.calcularPrecoIngresso(cliente);
        } catch (Exception e) {
            throw new IllegalArgumentException("Deu guru parceiro");
        }

        return valor;
    }
}
