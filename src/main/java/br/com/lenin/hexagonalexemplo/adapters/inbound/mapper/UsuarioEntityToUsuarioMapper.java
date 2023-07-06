package br.com.lenin.hexagonalexemplo.adapters.inbound.mapper;

import br.com.lenin.hexagonalexemplo.application.core.domain.Usuario;
import br.com.lenin.hexagonalexemplo.adapters.inbound.entity.UsuarioEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UsuarioEntityToUsuarioMapper {

    public Usuario mapper(UsuarioEntity usuarioEntity) {
        Usuario usuario = new Usuario();
        BeanUtils.copyProperties(usuarioEntity, usuario);
        return usuario;
    }

}
