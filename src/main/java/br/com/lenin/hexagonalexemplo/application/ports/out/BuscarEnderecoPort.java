package br.com.lenin.hexagonalexemplo.application.ports.out;

import br.com.lenin.hexagonalexemplo.application.core.domain.Endereco;

public interface BuscarEnderecoPort {

    Endereco buscar(String cep);

}
