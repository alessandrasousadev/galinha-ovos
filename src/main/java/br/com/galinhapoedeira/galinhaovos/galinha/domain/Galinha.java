package br.com.galinhapoedeira.galinhaovos.galinha.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.galinhapoedeira.galinhaovos.galinha.application.api.GalinhaRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Galinha {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idGalinha;
	@NotBlank
	private String nomeCompleto;
	@NotNull
	private LocalDate dataNascimento;
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

	public Galinha(@Valid GalinhaRequest galinhaRequest) {
		this.nomeCompleto = galinhaRequest.getNomeCompleto();
		this.dataNascimento = galinhaRequest.getDataNascimento();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
}
