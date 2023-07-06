package br.com.lenin.hexagonalexemplo.adapters.outbound;

import br.com.lenin.hexagonalexemplo.application.core.domain.Endereco;
import br.com.lenin.hexagonalexemplo.application.ports.out.BuscarEnderecoPort;
import br.com.lenin.hexagonalexemplo.adapters.outbound.rest.BuscarEnderecoRest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BuscarEnderecoAdapter implements BuscarEnderecoPort {

    private final BuscarEnderecoRest buscarEnderecoRest;

    @Override
    public Endereco buscar(String cep) {
        ResponseEntity<Endereco> endereco = buscarEnderecoRest.buscar(cep);
        return endereco.getBody();
    }
}
