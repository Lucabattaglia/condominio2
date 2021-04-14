package it.exolab.condomini.mapper;

import java.util.List;

import it.exolab.condomini.model.Presenza;


public interface PresenzaMapper {
	
	public void insert(Presenza presenza);
	public void delete(int id);
	public List<Presenza> findAll();
	public Presenza find_Presenza_And_Rappresentante_Or_Delegato(int id);

}
