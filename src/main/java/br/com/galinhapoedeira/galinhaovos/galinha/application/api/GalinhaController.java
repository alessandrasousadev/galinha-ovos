package br.com.galinhapoedeira.galinhaovos.galinha.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.galinhapoedeira.galinhaovos.galinha.application.service.GalinhaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class GalinhaController implements GalinhaAPI {
	private final GalinhaService galinhaService;

	@Override
	public GalinhaResponse postGalinha(GalinhaRequest galinhaRequest) {
		log.info("[inicia] GalinhaController - postGalinha");
		GalinhaResponse galinhaCriada =  galinhaService.criaGalinha(galinhaRequest);
		log.info("[finaliza] GalinhaController - postGalinha");
		return galinhaCriada;
	}

	@Override
	public List<GalinhaListResponse> getTodasGalinhas() {
		log.info("[inicia] GalinhaController - getTodasGalinhas");
		List<GalinhaListResponse> galinhas = galinhaService.buscaTodasGalinhas();
		log.info("[finaliza] GalinhaController - getTodasGalinhas");
		return galinhas;
	}

	@Override
	public GalinhaDetalhadaResponse getGalinhaAtravesId(UUID idGalinha) {
		log.info("[inicia] GalinhaController - getGalinhaAtravesId");
		log.info("[idGalinha] {}", idGalinha);
		GalinhaDetalhadaResponse galinhaDetalhada = galinhaService.buscaGalinhaAtravesId(idGalinha);
		log.info("[finaliza] GalinhaController - getGalinhaAtravesId");	
		return galinhaDetalhada;
	}

	@Override
	public void deletaGalinhaAtravesId(UUID idGalinha) {
		log.info("[inicia] GalinhaController - deletaGalinhaAtravesId");
		log.info("[idGalinha] {}", idGalinha);
		log.info("[finaliza] GalinhaController - deletaGalinhaAtravesId");
		galinhaService.deletaGalinhaAtravesId(idGalinha);
	}

}
