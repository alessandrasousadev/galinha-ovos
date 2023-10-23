package br.com.galinhapoedeira.galinhaovos.galinha.application.service;

import java.util.List;
import java.util.UUID;

import br.com.galinhapoedeira.galinhaovos.galinha.application.api.GalinhaAlteracaoRequest;
import br.com.galinhapoedeira.galinhaovos.galinha.application.api.GalinhaDetalhadaResponse;
import br.com.galinhapoedeira.galinhaovos.galinha.application.api.GalinhaListResponse;
import br.com.galinhapoedeira.galinhaovos.galinha.application.api.GalinhaRequest;
import br.com.galinhapoedeira.galinhaovos.galinha.application.api.GalinhaResponse;
import jakarta.validation.Valid;

public interface GalinhaService {
	GalinhaResponse criaGalinha(@Valid GalinhaRequest galinhaRequest);
	List<GalinhaListResponse> buscaTodasGalinhas();
	GalinhaDetalhadaResponse buscaGalinhaAtravesId(UUID idGalinha);
	void deletaGalinhaAtravesId(UUID idGalinha);
	void patchAlteraGalinha(UUID idGalinha, @Valid GalinhaAlteracaoRequest galinhaAlteracaoRequest);
}
