package br.com.lenin.hexagonalexemplo.adapters.inbound.mapper;

import br.com.lenin.hexagonalexemplo.adapters.inbound.entity.UsuarioEntity;
import br.com.lenin.hexagonalexemplo.application.core.domain.Usuario;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UsuarioToUsuarioEntityMapper {

    public UsuarioEntity mapper(Usuario usuario) {
        UsuarioEntity usuarioEntity = new UsuarioEntity();
        BeanUtils.copyProperties(usuario, usuarioEntity);
        return usuarioEntity;
    }

}
