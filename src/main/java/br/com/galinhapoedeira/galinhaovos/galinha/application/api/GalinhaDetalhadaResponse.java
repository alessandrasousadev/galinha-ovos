package br.com.galinhapoedeira.galinhaovos.galinha.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Value;

@Value
public class GalinhaDetalhadaResponse {
	private UUID idGalinha;
	private String nomeCompleto;
	private LocalDate dataNascimento;
	private LocalDateTime dataHoraDoCadastro;

	
}
