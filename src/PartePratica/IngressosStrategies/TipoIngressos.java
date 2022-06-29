package PartePratica.IngressosStrategies;

import PartePratica.Cliente;

import java.time.LocalDate;

public enum TipoIngressos implements IngressoStrategy {
    pista {
        @Override
        public Integer calcularPrecoIngresso(Cliente cliente) {
            Integer valorIngresso = null;

            if (verificaDesconto(cliente)) {
                valorIngresso = (250 * 50) / 100;
            } else {
                valorIngresso = 250;
            }

            return valorIngresso;
        }

        public Boolean verificaDesconto(Cliente cliente) {
            if (cliente.getEstudante()) {
                return true;
            } else return calculaIdadeCliente(cliente.getDataNascimento()) > 60;
        }
    },
    pistaPremium {
        @Override
        public Integer calcularPrecoIngresso(Cliente cliente) {
            Integer valorIngresso = null;

            if (verificaDesconto(cliente)) {
                valorIngresso = 400 * 50 / 100;
            } else {
                return 400;
            }

            return valorIngresso;
        }

        public Boolean verificaDesconto(Cliente cliente) {
            if (cliente.getEstudante()) {
                return true;
            } else return calculaIdadeCliente(cliente.getDataNascimento()) > 60;
        }
    },
    camarote {
        @Override
        public Integer calcularPrecoIngresso(Cliente cliente) {
            return 750;
        }
    },
    cadeiraInferior {
        @Override
        public Integer calcularPrecoIngresso(Cliente cliente) {
            Integer valorIngresso = null;

            if (verificaDesconto(cliente)) {
                if (cliente.getEstudante()) {
                    valorIngresso = (200 * 50) / 100;
                } else if (calculaIdadeCliente(cliente.getDataNascimento()) > 60) {
                    int calculoDesconto = (200 * 60) / 100;
                    valorIngresso = 200 - calculoDesconto;
                }
            } else {
                return 200;
            }

            return valorIngresso;
        }

        public Boolean verificaDesconto(Cliente cliente) {
            if (cliente.getEstudante()) {
                return true;
            } else return calculaIdadeCliente(cliente.getDataNascimento()) > 60;
        }
    },
    cadeiraSuperior {
        @Override
        public Integer calcularPrecoIngresso(Cliente cliente) {
            Integer valorIngresso = null;

            if (verificaDesconto(cliente)) {
                if (cliente.getEstudante()) {
                    valorIngresso = (150 * 50) / 100;
                } else if (calculaIdadeCliente(cliente.getDataNascimento()) > 60) {
                    int calculoDesconto = (150 * 60) / 100;
                    valorIngresso = 150 - calculoDesconto;
                }
            } else {
                return 150;
            }

            return valorIngresso;
        }

        public Boolean verificaDesconto(Cliente cliente) {
            if (cliente.getEstudante()) {
                return true;
            } else return calculaIdadeCliente(cliente.getDataNascimento()) > 60;

        }
    };

    protected Integer calculaIdadeCliente(LocalDate dataNascimento) {
        LocalDate dataAtual = LocalDate.now();
        int idade = dataAtual.getYear() - dataNascimento.getYear();

        return idade;
    }
}

