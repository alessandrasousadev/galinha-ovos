package br.com.galinhapoedeira.galinhaovos.galinha.application.service;

import org.springframework.stereotype.Service;

import br.com.galinhapoedeira.galinhaovos.galinha.application.api.GalinhaRequest;
import br.com.galinhapoedeira.galinhaovos.galinha.application.api.GalinhaResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class GalinhaApplicationService implements GalinhaService {

	@Override
	public GalinhaResponse criaGalinha(@Valid GalinhaRequest galinhaRequest) {
		log.info("[inicia] GalinhaApplicationService - criaGalinha");
		log.info("[finaliza] GalinhaApplicationService - criaGalinha");
		return null;
	}

}
