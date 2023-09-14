package br.com.galinhapoedeira.galinhaovos.galinha.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class GalinhaResponse {
	private UUID idGalinha;
}
