package it.exolab.condomini.CRUD;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import it.exolab.condomini.exceptions.EntityNotFoundException;
import it.exolab.condomini.exceptions.FieldException;
import it.exolab.condomini.mapper.PresenzaMapper;
import it.exolab.condomini.mapper.SqlMapFactory;
import it.exolab.condomini.mapper.Verbale_finaleMapper;
import it.exolab.condomini.model.Presenza;
import it.exolab.condomini.model.Verbale_finale;

public class PresenzaCRUD {

	public void insert(Presenza presenza) throws FieldException {
		SqlMapFactory.instance().openSession();
		PresenzaMapper mapper = SqlMapFactory.instance().getMapper(PresenzaMapper.class);
		mapper.insert(presenza);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();
		PresenzaMapper mapper = SqlMapFactory.instance().getMapper(PresenzaMapper.class);
		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public List<Presenza> findAll() throws EntityNotFoundException {
		SqlMapFactory.instance().openSession();
		PresenzaMapper mapper = SqlMapFactory.instance().getMapper(PresenzaMapper.class);
		List<Presenza> presenze = mapper.findAll();
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
		if (presenze == null) {
			throw new EntityNotFoundException();
		}
		return presenze;
	}

	public Presenza find_Presenza_And_Rappresentante_Or_Delegato(int id) throws EntityNotFoundException {
		SqlMapFactory.instance().openSession();
		PresenzaMapper mapper = SqlMapFactory.instance().getMapper(PresenzaMapper.class);
		Presenza presenza = mapper.find_Presenza_And_Rappresentante_Or_Delegato(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
		if (presenza == null) {
			throw new EntityNotFoundException();
		}
		return presenza;
	}

}