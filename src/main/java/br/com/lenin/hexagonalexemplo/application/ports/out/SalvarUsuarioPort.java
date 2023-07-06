package br.com.lenin.hexagonalexemplo.application.ports.out;


import br.com.lenin.hexagonalexemplo.application.core.domain.Usuario;

public interface SalvarUsuarioPort {
    Usuario salvar(Usuario usuario);
}
