package br.com.galinhapoedeira.galinhaovos.galinha.application.service;

import br.com.galinhapoedeira.galinhaovos.galinha.application.api.GalinhaRequest;
import br.com.galinhapoedeira.galinhaovos.galinha.application.api.GalinhaResponse;
import jakarta.validation.Valid;

public interface GalinhaService {
	GalinhaResponse criaGalinha(@Valid GalinhaRequest galinhaRequest);

}
