package it.exolab.condomini.mapper;

import java.util.List;

import it.exolab.condomini.model.Votazione_preventivo;

public interface Votazione_preventivoMapper {
	
	public void insert(Votazione_preventivo votazione_preventivo);
	public void delete(int id);
	public List<Votazione_preventivo> findAll();
	public Votazione_preventivo findVotazione_Preventivo_Rappresentante_Riunione(int id);

}
