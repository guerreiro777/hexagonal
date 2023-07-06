package br.com.lenin.hexagonalexemplo.adapter.inbound;

import br.com.lenin.hexagonalexemplo.application.core.domain.Usuario;
import br.com.lenin.hexagonalexemplo.mock.MockFactory;
import br.com.lenin.hexagonalexemplo.adapters.inbound.UsuarioController;
import br.com.lenin.hexagonalexemplo.adapters.inbound.mapper.UsuarioRequestToUsuarioMapper;
import br.com.lenin.hexagonalexemplo.adapters.inbound.request.UsuarioRequest;
import br.com.lenin.hexagonalexemplo.application.ports.in.SalvarUsuarioUseCasePort;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UsuarioControllerTest {
    @InjectMocks
    private UsuarioController usuarioController;

    @Mock
    private SalvarUsuarioUseCasePort salvarUsuarioServicePort;

    private UsuarioRequest usuarioRequest;

    private UsuarioRequestToUsuarioMapper usuarioRequestToUsuarioMapper;

    private Usuario usuario;

    @Before
    public void setUp() {
        usuarioRequest = MockFactory.obterDadosUsuario();
        usuario = UsuarioRequestToUsuarioMapper.mapper(usuarioRequest);
        usuario.setEndereco(MockFactory.obterDadosUsuarioEndereco());
    }

    @Test
    public void testSalvarUsuarioComSucesso() {
        when(salvarUsuarioServicePort.salvarUsuario(any(), any())).thenReturn(usuario);
        usuarioController.salvarUsuario(usuarioRequest);
        verify(salvarUsuarioServicePort, times(1)).salvarUsuario(any(), any());
    }

    @Test(expected = Exception.class)
    public void testSalvarUsuarioComErro() {
        when(salvarUsuarioServicePort.salvarUsuario(any(), any())).thenThrow(Exception.class);
        usuarioController.salvarUsuario(usuarioRequest);
        verify(salvarUsuarioServicePort, times(1)).salvarUsuario(any(), any());
    }
}
