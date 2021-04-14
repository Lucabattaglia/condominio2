package it.exolab.condomini.CRUD;

import java.util.List;

import it.exolab.condomini.exceptions.EntityNotFoundException;
import it.exolab.condomini.exceptions.FieldException;
import it.exolab.condomini.mapper.Comunicazione_riunioneMapper;
import it.exolab.condomini.mapper.SqlMapFactory;
import it.exolab.condomini.model.Comunicazione_riunione;



public class Comunicazione_riunioneCRUD {
	
	public void insert(Comunicazione_riunione comunicazione_riunione) throws FieldException {
		
		validate(comunicazione_riunione.getTitolo(), comunicazione_riunione.getTesto());
		SqlMapFactory.instance().openSession();
		Comunicazione_riunioneMapper mapper = SqlMapFactory.instance().getMapper(Comunicazione_riunioneMapper.class);
		mapper.insert(comunicazione_riunione);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}
	
	public void update(Comunicazione_riunione comunicazione_riunione) throws FieldException {
		
		validate(comunicazione_riunione.getTitolo(), comunicazione_riunione.getTesto());
		SqlMapFactory.instance().openSession();
		Comunicazione_riunioneMapper mapper = SqlMapFactory.instance().getMapper(Comunicazione_riunioneMapper.class);
		mapper.update(comunicazione_riunione);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}
	
	public void delete(int id) {

		SqlMapFactory.instance().openSession();

		Comunicazione_riunioneMapper mapper = SqlMapFactory.instance().getMapper(Comunicazione_riunioneMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}
	
	
	public Comunicazione_riunione find(int id) throws EntityNotFoundException {
		SqlMapFactory.instance().openSession();

		Comunicazione_riunioneMapper mapper = SqlMapFactory.instance().getMapper(Comunicazione_riunioneMapper.class);

		Comunicazione_riunione comunicazione_riunione = mapper.find(id);

		SqlMapFactory.instance().closeSession();
		if(comunicazione_riunione==null) {
			throw new EntityNotFoundException();
		}
		return comunicazione_riunione;
		
	}
	
	
	

	public List<Comunicazione_riunione> findAll() throws EntityNotFoundException {
		SqlMapFactory.instance().openSession();

		Comunicazione_riunioneMapper mapper = SqlMapFactory.instance().getMapper(Comunicazione_riunioneMapper.class);

		List<Comunicazione_riunione> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();
		if(ret==null) {
			throw new EntityNotFoundException();
		}

		return ret;

	}

	
	
	
	public void checkTitolo(String titolo) throws FieldException {
		if (titolo == "") {
			throw new FieldException(titolo);
		}

	}

	public void checkTesto(String testo) throws FieldException {

		if (testo == "") {
			throw new FieldException(testo);
		}
	}

	public void validate(String titolo, String testo) throws FieldException {
		checkTitolo(titolo);
		checkTesto(testo);
	}

}
