package br.com.lenin.hexagonalexemplo.mock;

import br.com.lenin.hexagonalexemplo.adapters.inbound.request.UsuarioRequest;
import br.com.lenin.hexagonalexemplo.application.core.domain.Endereco;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MockFactory {

    public static ObjectMapper mapper = new ObjectMapper();
    public static MockData data = new MockData();

    public static UsuarioRequest obterDadosUsuario(){
        return UsuarioRequest.builder()
                .cep(data.cep)
                .dataNascimento(data.dataNascimento)
                .github(data.github)
                .instagram(data.instagram)
                .linkedin(data.linkedin)
                .nome(data.nome)
                .build();
    }

    public static Endereco obterDadosUsuarioEndereco(){
        Endereco endereco = new Endereco();
        endereco.setCep("7272");
        return endereco;
    }

    public static String usuario() throws JsonProcessingException {
        return mapper.writeValueAsString(obterDadosUsuario());
    }
}
