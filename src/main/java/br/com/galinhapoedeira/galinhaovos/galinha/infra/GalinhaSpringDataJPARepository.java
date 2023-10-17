package br.com.galinhapoedeira.galinhaovos.galinha.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.galinhapoedeira.galinhaovos.galinha.domain.Galinha;

public interface GalinhaSpringDataJPARepository extends JpaRepository<Galinha, UUID>{

}
