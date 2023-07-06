package br.com.lenin.hexagonalexemplo.application.core.usecase;

import br.com.lenin.hexagonalexemplo.application.ports.in.SalvarUsuarioUseCasePort;
import br.com.lenin.hexagonalexemplo.application.ports.out.BuscarEnderecoPort;
import br.com.lenin.hexagonalexemplo.application.ports.out.SalvarUsuarioPort;
import br.com.lenin.hexagonalexemplo.application.core.domain.Endereco;
import br.com.lenin.hexagonalexemplo.application.core.domain.Usuario;

public class SalvarUsuarioUseCase implements SalvarUsuarioUseCasePort {

    private final SalvarUsuarioPort salvarUsuarioPort;

    private final BuscarEnderecoPort buscarEnderecoPort;

    public SalvarUsuarioUseCase(SalvarUsuarioPort salvarUsuarioPort, BuscarEnderecoPort buscarEnderecoPort) {
        this.salvarUsuarioPort = salvarUsuarioPort;
        this.buscarEnderecoPort = buscarEnderecoPort;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario, String cep) {
        Endereco endereco = buscarEnderecoPort.buscar(cep);
        usuario.setEndereco(endereco);
        return salvarUsuarioPort.salvar(usuario);
    }
}
