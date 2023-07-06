package br.com.lenin.hexagonalexemplo.adapters.outbound.repository;

import br.com.lenin.hexagonalexemplo.adapters.inbound.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
