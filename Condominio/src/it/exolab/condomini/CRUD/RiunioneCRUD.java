package it.exolab.condomini.CRUD;

import java.util.List;

import it.exolab.condomini.exceptions.EntityNotFoundException;
import it.exolab.condomini.exceptions.FieldException;
import it.exolab.condomini.mapper.RiunioneMapper;
import it.exolab.condomini.mapper.SqlMapFactory;
import it.exolab.condomini.model.Riunione;

public class RiunioneCRUD {

	public void insert(Riunione riunione) throws FieldException {

		validate(riunione.getTitolo());
		SqlMapFactory.instance().openSession();
		RiunioneMapper mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);
		mapper.insert(riunione);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void delete(int id) {

		SqlMapFactory.instance().openSession();

		RiunioneMapper mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
		
	}
	
	public List<Riunione> findAll() throws EntityNotFoundException {
		SqlMapFactory.instance().openSession();

		RiunioneMapper mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);

		List<Riunione> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();
		if(ret==null) {
			throw new EntityNotFoundException();
		}

		return ret;

	}
	
	public Riunione find(int id) throws EntityNotFoundException {
		SqlMapFactory.instance().openSession();

		RiunioneMapper mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);

		Riunione ret = mapper.find(id);

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

	public void validate(String titolo) throws FieldException {
		checkTitolo(titolo);
	
	}


}
