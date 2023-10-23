package br.com.galinhapoedeira.galinhaovos.galinha.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.galinhapoedeira.galinhaovos.galinha.application.api.GalinhaAlteracaoRequest;
import br.com.galinhapoedeira.galinhaovos.galinha.application.api.GalinhaDetalhadaResponse;
import br.com.galinhapoedeira.galinhaovos.galinha.application.api.GalinhaListResponse;
import br.com.galinhapoedeira.galinhaovos.galinha.application.api.GalinhaRequest;
import br.com.galinhapoedeira.galinhaovos.galinha.application.api.GalinhaResponse;
import br.com.galinhapoedeira.galinhaovos.galinha.application.repository.GalinhaRepository;
import br.com.galinhapoedeira.galinhaovos.galinha.domain.Galinha;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class GalinhaApplicationService implements GalinhaService {
	private final GalinhaRepository galinhaRepository;

	@Override
	public GalinhaResponse criaGalinha(@Valid GalinhaRequest galinhaRequest) {
		log.info("[inicia] GalinhaApplicationService - criaGalinha");
		Galinha galinha = galinhaRepository.salva(new Galinha(galinhaRequest));
		log.info("[finaliza] GalinhaApplicationService - criaGalinha");
		return GalinhaResponse.builder()
				.idGalinha(galinha.getIdGalinha())
				.build();
	}

	@Override
	public List<GalinhaListResponse> buscaTodasGalinhas() {
		log.info("[inicia] GalinhaApplicationService - buscaTodasGalinhas");
		List<Galinha> galinhas = galinhaRepository.buscaTodasGalinhas();	
		log.info("[finaliza] GalinhaApplicationService - buscaTodasGalinhas");
		return GalinhaListResponse.converte(galinhas);
	}

	@Override
	public GalinhaDetalhadaResponse buscaGalinhaAtravesId(UUID idGalinha) {
		log.info("[inicia] GalinhaApplicationService - buscaGalinhaAtravesId");
		Galinha galinha = galinhaRepository.buscaGalinhaAtravesId(idGalinha);
		log.info("[finaliza] GalinhaApplicationService - buscaGalinhaAtravesId");
		return new GalinhaDetalhadaResponse(galinha);
	}

	@Override
	public void deletaGalinhaAtravesId(UUID idGalinha) {
		log.info("[inicia] GalinhaApplicationService - deletaGalinhaAtravesId");
		Galinha galinha = galinhaRepository.buscaGalinhaAtravesId(idGalinha);
		galinhaRepository.deletaGalinha(galinha);
		log.info("[finaliza] GalinhaApplicationService - deletaGalinhaAtravesId");
	}

	@Override
	public void patchAlteraGalinha(UUID idGalinha, @Valid GalinhaAlteracaoRequest galinhaAlteracaoRequest) {
		log.info("[inicia] GalinhaApplicationService - patchAlteraGalinha");
		log.info("[finaliza] GalinhaApplicationService - patchAlteraGalinha");
	}

}
