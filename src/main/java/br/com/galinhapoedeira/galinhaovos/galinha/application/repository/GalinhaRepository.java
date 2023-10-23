package br.com.galinhapoedeira.galinhaovos.galinha.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.galinhapoedeira.galinhaovos.galinha.domain.Galinha;

public interface GalinhaRepository {
	Galinha salva(Galinha galinha);
	List<Galinha> buscaTodasGalinhas();
	Galinha buscaGalinhaAtravesId(UUID idGalinha);
	void deletaGalinha(Galinha galinha);
}
