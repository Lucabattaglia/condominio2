package it.exolab.condomini.mapper;

import java.util.List;

import it.exolab.condomini.model.Comunicazione_riunione;

public interface Comunicazione_riunioneMapper {

	public void insert(Comunicazione_riunione comunicazione_riunione);

	public void update(Comunicazione_riunione comunicazione_riunione);

	public void delete(int id);

	public Comunicazione_riunione find(int id);

	public List<Comunicazione_riunione> findAll();

}