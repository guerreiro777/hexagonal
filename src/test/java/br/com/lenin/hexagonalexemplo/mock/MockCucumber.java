package br.com.lenin.hexagonalexemplo.mock;

import br.com.lenin.hexagonalexemplo.adapters.inbound.request.UsuarioRequest;

public class MockCucumber {

    public static UsuarioRequest obterDadosUsuario(){
        return MockFactory.obterDadosUsuario();
    }
}
