package it.exolab.condomini.CRUD;

import java.util.List;

import it.exolab.condomini.exceptions.DuplicateEmailException;
import it.exolab.condomini.exceptions.EntityNotFoundException;
import it.exolab.condomini.exceptions.FieldException;
import it.exolab.condomini.mapper.PreventivoMapper;
import it.exolab.condomini.mapper.RappresentanteMapper;
import it.exolab.condomini.mapper.SqlMapFactory;
import it.exolab.condomini.model.Preventivo;
import it.exolab.condomini.model.Rappresentante;

public class PreventivoCRUD {

	public void insert(Preventivo preventivo) throws FieldException {
		checkTesto(preventivo.getTesto());
		SqlMapFactory.instance().openSession();

		PreventivoMapper mapper = SqlMapFactory.instance().getMapper(PreventivoMapper.class);
		mapper.insert(preventivo);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();
		PreventivoMapper mapper = SqlMapFactory.instance().getMapper(PreventivoMapper.class);
		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public List<Preventivo> findAll() throws EntityNotFoundException {
		SqlMapFactory.instance().openSession();
		PreventivoMapper mapper = SqlMapFactory.instance().getMapper(PreventivoMapper.class);
		List<Preventivo> preventivi = mapper.findAll();
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
		if (preventivi == null) {
			throw new EntityNotFoundException();
		}
		return preventivi;
	}

	public Preventivo find_Preventivo_Rappresentante_Riunione(int id) throws EntityNotFoundException {
		SqlMapFactory.instance().openSession();
		PreventivoMapper mapper = SqlMapFactory.instance().getMapper(PreventivoMapper.class);
		Preventivo preventivo = mapper.find_Preventivo_Rappresentante_Riunione(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
		if (preventivo == null) {
			throw new EntityNotFoundException();
		}
		return preventivo;
	}

	public void checkTesto(String testo) throws FieldException {
		if (testo == "") {
			throw new FieldException(testo);
		}

	}

}