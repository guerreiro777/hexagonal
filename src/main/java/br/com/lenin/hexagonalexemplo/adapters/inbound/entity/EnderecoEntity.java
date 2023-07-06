package br.com.lenin.hexagonalexemplo.adapters.inbound.entity;

import br.com.lenin.hexagonalexemplo.application.core.domain.Endereco;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoEntity extends Endereco {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long id;

}
