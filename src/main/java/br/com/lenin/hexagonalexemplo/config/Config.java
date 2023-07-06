package br.com.lenin.hexagonalexemplo.config;

import br.com.lenin.hexagonalexemplo.adapters.outbound.BuscarEnderecoAdapter;
import br.com.lenin.hexagonalexemplo.adapters.outbound.SalvarUsuarioAdapter;
import br.com.lenin.hexagonalexemplo.application.core.usecase.SalvarUsuarioUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public SalvarUsuarioUseCase salvarUsuarioService(SalvarUsuarioAdapter salvarUsuarioAdapter, BuscarEnderecoAdapter buscarEnderecoAdapter) {
        return new SalvarUsuarioUseCase(salvarUsuarioAdapter, buscarEnderecoAdapter);
    }
}
