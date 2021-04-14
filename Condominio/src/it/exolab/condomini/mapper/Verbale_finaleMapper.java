package it.exolab.condomini.mapper;

import java.util.List;

import it.exolab.condomini.model.Verbale_finale;

public interface Verbale_finaleMapper {

	public void insert(Verbale_finale verbale_finale);

	public void delete(int id);

	public Verbale_finale find_Verbale_Preventivo_Riunione(int id);

	public List<Verbale_finale> findAll();

}