package PartePratica;

import PartePratica.IngressosStrategies.TipoIngressos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(
                "João",
                LocalDate.of(2001, 4, 9),
                true);

        Pedido pedido = new Pedido(cliente, TipoIngressos.camarote);
    }
}
