package it.exolab.condomini.mapper;

import java.util.List;

import it.exolab.condomini.model.Rappresentante;

public interface RappresentanteMapper {
	
	public void insert(Rappresentante rappresentante);
	public void delete(int id);
	public Rappresentante find(int id);
	public List<Rappresentante> findAll();
	public Rappresentante findByEmailAndPassword(Rappresentante rappresentante);
	public Rappresentante findByEmail(String email);

}
