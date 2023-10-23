package br.com.galinhapoedeira.galinhaovos.galinha.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.galinhapoedeira.galinhaovos.galinha.application.repository.GalinhaRepository;
import br.com.galinhapoedeira.galinhaovos.galinha.domain.Galinha;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class GalinhaInfraRepository implements GalinhaRepository {
	private final GalinhaSpringDataJPARepository galinhaSpringDataJPARepository;

	@Override
	public Galinha salva(Galinha galinha) {
		log.info("[inicia] GalinhaInfraRepository - salva");
		galinhaSpringDataJPARepository.save(galinha);
		log.info("[finaliza] GalinhaInfraRepository - salva");
		return galinha;
	}

	@Override
	public List<Galinha> buscaTodasGalinhas() {
		log.info("[inicia] GalinhaInfraRepository - buscaTodasGalinhas");
		List<Galinha> todasGalinhas = galinhaSpringDataJPARepository.findAll();
		log.info("[finaliza] GalinhaInfraRepository - buscaTodasGalinhas");
		return todasGalinhas;
	}

	@Override
	public Galinha buscaGalinhaAtravesId(UUID idGalinha) {
		log.info("[inicia] GalinhaInfraRepository - buscaGalinhaAtravesId");
		Galinha galinha = galinhaSpringDataJPARepository.findById(idGalinha)
				.orElseThrow(() -> new RuntimeException("Galinha não encontrada!"));
		log.info("[finaliza] GalinhaInfraRepository - buscaGalinhaAtravesId");
		return galinha;
	}

	@Override
	public void deletaGalinha(Galinha galinha) {
		log.info("[inicia] GalinhaInfraRepository - deletaGalinha");
		log.info("[inicia] GalinhaInfraRepository - deletaGalinha");
	}

}
