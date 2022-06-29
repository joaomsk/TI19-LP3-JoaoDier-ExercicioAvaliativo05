package PartePratica;

import PartePratica.IngressosStrategies.TipoIngressos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PedidoTest {
    private Cliente _clienteEstudante;
    private Cliente _clienteIdoso;
    private Cliente _cliente;

    @BeforeEach
    void init() {
        _clienteEstudante = new Cliente("João", LocalDate.of(2001, 04, 9), true);
        _clienteIdoso = new Cliente("Gabriel", LocalDate.of(1960, 04, 9), false);
        _cliente = new Cliente("João Gabriel", LocalDate.of(2001, 04, 9), false);
    }

    @Test
    void deveTestarCalculoParaIngressoPistaParaClienteEstudante(){
        Pedido pedido = new Pedido(_clienteEstudante, TipoIngressos.pista);
        Assertions.assertEquals(125, pedido.getValorPedido());
    }

    @Test
    void deveTestarCalculoParaIngressoPistaParaClienteIdoso(){
        Pedido pedido = new Pedido(_clienteIdoso, TipoIngressos.pista);
        Assertions.assertEquals(125, pedido.getValorPedido());
    }

    @Test
    void deveTestarCalculoParaIngressoPistaParaCliente(){
        Pedido pedido = new Pedido(_cliente, TipoIngressos.pista);
        Assertions.assertEquals(250, pedido.getValorPedido());
    }

    @Test
    void deveTestarCalculoParaIngressoPistaPremiumParaClienteEstudante(){
        Pedido pedido = new Pedido(_clienteEstudante, TipoIngressos.pistaPremium);
        Assertions.assertEquals(200, pedido.getValorPedido());
    }

    @Test
    void deveTestarCalculoParaIngressoPistaPremiumParaClienteIdoso(){
        Pedido pedido = new Pedido(_clienteIdoso, TipoIngressos.pistaPremium);
        Assertions.assertEquals(200, pedido.getValorPedido());
    }

    @Test
    void deveTestarCalculoParaIngressoPistaPremiumParaCliente(){
        Pedido pedido = new Pedido(_cliente, TipoIngressos.pistaPremium);
        Assertions.assertEquals(400, pedido.getValorPedido());
    }

    @Test
    void deveTestarCalculoParaIngressoCamaroteParaClienteEstudante(){
        Pedido pedido = new Pedido(_clienteEstudante, TipoIngressos.camarote);
        Assertions.assertEquals(750, pedido.getValorPedido());
    }

    @Test
    void deveTestarCalculoParaIngressoCamaroteParaClienteIdoso(){
        Pedido pedido = new Pedido(_clienteIdoso, TipoIngressos.camarote);
        Assertions.assertEquals(750, pedido.getValorPedido());
    }

    @Test
    void deveTestarCalculoParaIngressoCamaroteParaCliente(){
        Pedido pedido = new Pedido(_cliente, TipoIngressos.camarote);
        Assertions.assertEquals(750, pedido.getValorPedido());
    }

    @Test
    void deveTestarCalculoParaIngressoCadeiraInferiorParaClienteEstudante(){
        Pedido pedido = new Pedido(_clienteEstudante, TipoIngressos.cadeiraInferior);
        Assertions.assertEquals(100, pedido.getValorPedido());
    }

    @Test
    void deveTestarCalculoParaIngressoCadeiraInferiorParaClienteIdoso(){
        Pedido pedido = new Pedido(_clienteIdoso, TipoIngressos.cadeiraInferior);
        Assertions.assertEquals(80, pedido.getValorPedido());
    }

    @Test
    void deveTestarCalculoParaIngressoCadeiraInferiorParaCliente(){
        Pedido pedido = new Pedido(_cliente, TipoIngressos.cadeiraInferior);
        Assertions.assertEquals(200, pedido.getValorPedido());
    }

    @Test
    void deveTestarCalculoParaIngressoCadeiraSuperiorParaClienteEstudante(){
        Pedido pedido = new Pedido(_clienteEstudante, TipoIngressos.cadeiraSuperior);
        Assertions.assertEquals(75, pedido.getValorPedido());
    }

    @Test
    void deveTestarCalculoParaIngressoCadeiraSuperiorParaClienteIdoso(){
        Pedido pedido = new Pedido(_clienteIdoso, TipoIngressos.cadeiraSuperior);
        Assertions.assertEquals(60, pedido.getValorPedido());
    }

    @Test
    void deveTestarCalculoParaIngressoCadeiraSuperiorParaCliente(){
        Pedido pedido = new Pedido(_cliente, TipoIngressos.cadeiraSuperior);
        Assertions.assertEquals(150, pedido.getValorPedido());
    }
}