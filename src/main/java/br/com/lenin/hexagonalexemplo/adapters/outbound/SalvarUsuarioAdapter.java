package br.com.lenin.hexagonalexemplo.adapters.outbound;

import br.com.lenin.hexagonalexemplo.adapters.inbound.mapper.UsuarioEntityToUsuarioMapper;
import br.com.lenin.hexagonalexemplo.adapters.outbound.repository.UsuarioRepository;
import br.com.lenin.hexagonalexemplo.application.core.domain.Usuario;
import br.com.lenin.hexagonalexemplo.application.ports.out.SalvarUsuarioPort;
import br.com.lenin.hexagonalexemplo.adapters.inbound.entity.EnderecoEntity;
import br.com.lenin.hexagonalexemplo.adapters.inbound.entity.UsuarioEntity;
import br.com.lenin.hexagonalexemplo.adapters.inbound.mapper.EnderecoToEnderecoEntityMapper;
import br.com.lenin.hexagonalexemplo.adapters.inbound.mapper.UsuarioToUsuarioEntityMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@AllArgsConstructor
public class SalvarUsuarioAdapter implements SalvarUsuarioPort {

    private final UsuarioRepository usuarioRepository;

    private final UsuarioToUsuarioEntityMapper usuarioToUsuarioEntityMapper;

    private final UsuarioEntityToUsuarioMapper usuarioToUsuarioEntitymMapper;

    private final EnderecoToEnderecoEntityMapper enderecoToEnderecoEntityMapper;

    @Override
    @Transactional
    public Usuario salvar(Usuario usuario) {
        UsuarioEntity usuarioEntity = usuarioToUsuarioEntityMapper.mapper(usuario);
        EnderecoEntity enderecoEntity = enderecoToEnderecoEntityMapper.mapper(usuario.getEndereco());
        usuarioEntity.setEndereco(enderecoEntity);
        return usuarioToUsuarioEntitymMapper.mapper(usuarioRepository.save(usuarioEntity));
    }
}
