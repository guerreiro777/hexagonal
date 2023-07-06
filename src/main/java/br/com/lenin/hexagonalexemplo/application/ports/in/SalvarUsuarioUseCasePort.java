package br.com.lenin.hexagonalexemplo.application.ports.in;

import br.com.lenin.hexagonalexemplo.application.core.domain.Usuario;

public interface SalvarUsuarioUseCasePort {

    Usuario salvarUsuario(Usuario usuario, String cep);

}
