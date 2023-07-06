package br.com.lenin.hexagonalexemplo.adapters.inbound.mapper;

import br.com.lenin.hexagonalexemplo.adapters.inbound.request.UsuarioRequest;
import br.com.lenin.hexagonalexemplo.application.core.domain.Usuario;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UsuarioRequestToUsuarioMapper {

    public static Usuario mapper(UsuarioRequest usuarioRequest) {
        Usuario usuario = new Usuario();
        BeanUtils.copyProperties(usuarioRequest, usuario);
        return usuario;
    }

}
