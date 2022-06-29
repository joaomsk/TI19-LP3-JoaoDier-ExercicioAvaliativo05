package PartePratica.IngressosStrategies;

import PartePratica.Cliente;

public interface IngressoStrategy {
    Integer calcularPrecoIngresso(Cliente cliente);
}
