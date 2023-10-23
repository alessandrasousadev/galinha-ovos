package br.com.galinhapoedeira.galinhaovos.galinha.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.galinhapoedeira.galinhaovos.galinha.domain.Galinha;
import lombok.Value;

@Value
public class GalinhaDetalhadaResponse {
	
	private UUID idGalinha;
	private String nomeCompleto;
	private LocalDate dataNascimento;
	private LocalDateTime dataHoraDoCadastro;

	public GalinhaDetalhadaResponse(Galinha galinha) {
		this.idGalinha = galinha.getIdGalinha();
		this.nomeCompleto = galinha.getNomeCompleto();
		this.dataNascimento = galinha.getDataNascimento();
		this.dataHoraDoCadastro = galinha.getDataHoraDoCadastro();
	}
	
}
