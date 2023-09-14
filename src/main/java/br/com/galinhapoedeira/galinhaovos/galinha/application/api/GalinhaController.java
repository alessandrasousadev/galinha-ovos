package br.com.galinhapoedeira.galinhaovos.galinha.application.api;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class GalinhaController implements GalinhaAPI {

	@Override
	public GalinhaResponse postGalinha(@Valid GalinhaRequest galinhaRequest) {
		log.info("[inicia] GalinhaController - postGalinha");
		log.info("[finaliza] GalinhaController - postGalinha");
		return null;
	}

}
