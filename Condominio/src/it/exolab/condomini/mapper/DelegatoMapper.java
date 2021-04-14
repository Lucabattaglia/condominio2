package it.exolab.condomini.mapper;

import java.util.List;

import it.exolab.condomini.model.Delegato;

public interface DelegatoMapper {

	public void insert(Delegato delegato);

	public void delete(int id);

	public Delegato findDelegatoandRappresentante(int id);

	public List<Delegato> findAll();

}