package it.exolab.condomini.mapper;

import java.util.List;

import it.exolab.condomini.model.Palazzina;


public interface PalazzinaMapper {
	
	public Palazzina find(int id);
	public List<Palazzina> findAll();

}
