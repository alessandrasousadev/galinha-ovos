package br.com.galinhapoedeira.galinhaovos.galinha.infra;

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

}
