package br.com.galinhapoedeira.galinhaovos.galinha.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Collectors;

import br.com.galinhapoedeira.galinhaovos.galinha.domain.Galinha;
import lombok.Value;


@Value
public class GalinhaListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private LocalDate dataNascimento;
	
	
	public GalinhaListResponse(Galinha galinha) {
		this.idCliente = galinha.getIdGalinha();
		this.nomeCompleto = galinha.getNomeCompleto();
		this.dataNascimento = galinha.getDataNascimento();
	}


	public static List<GalinhaListResponse> converte(List<Galinha> galinhas) {
		return galinhas.stream()
						.map(GalinhaListResponse::new)
						.collect(Collectors.toList());
	}
	

}
