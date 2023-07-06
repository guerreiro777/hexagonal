package br.com.lenin.hexagonalexemplo.adapters.inbound;

import br.com.lenin.hexagonalexemplo.adapters.inbound.request.UsuarioRequest;
import br.com.lenin.hexagonalexemplo.application.core.domain.Usuario;
import br.com.lenin.hexagonalexemplo.application.ports.in.SalvarUsuarioUseCasePort;
import br.com.lenin.hexagonalexemplo.adapters.inbound.mapper.UsuarioRequestToUsuarioMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@AllArgsConstructor
public class UsuarioController {

    private final SalvarUsuarioUseCasePort salvarUsuarioServicePort;

    @PostMapping
    public Usuario salvarUsuario(@RequestBody UsuarioRequest usuarioRequest) {
        Usuario usuario = UsuarioRequestToUsuarioMapper.mapper(usuarioRequest);
        return salvarUsuarioServicePort.salvarUsuario(usuario, usuarioRequest.getCep());
    }

}
