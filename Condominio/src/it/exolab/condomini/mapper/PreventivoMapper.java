package it.exolab.condomini.mapper;

import java.util.List;

import it.exolab.condomini.model.Preventivo;

public interface PreventivoMapper {

	public void insert(Preventivo preventivo);

	public void delete(int id);

	public List<Preventivo> findAll();

	public Preventivo find_Preventivo_Rappresentante_Riunione(int id);
}