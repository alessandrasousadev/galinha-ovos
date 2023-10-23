package br.com.galinhapoedeira.galinhaovos.galinha.application.api;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;
@Value
public class GalinhaAlteracaoRequest {
	@NotBlank
	private String nomeCompleto;
	@NotNull
	private LocalDate dataNascimento;
}
