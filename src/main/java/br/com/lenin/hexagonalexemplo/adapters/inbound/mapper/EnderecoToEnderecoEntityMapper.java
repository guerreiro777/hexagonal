package br.com.lenin.hexagonalexemplo.adapters.inbound.mapper;

import br.com.lenin.hexagonalexemplo.application.core.domain.Endereco;
import br.com.lenin.hexagonalexemplo.adapters.inbound.entity.EnderecoEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class EnderecoToEnderecoEntityMapper {

    public EnderecoEntity mapper(Endereco endereco) {
        EnderecoEntity enderecoEntity = new EnderecoEntity();
        BeanUtils.copyProperties(endereco, enderecoEntity);
        return enderecoEntity;
    }

}
