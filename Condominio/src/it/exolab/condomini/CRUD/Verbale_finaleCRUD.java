package it.exolab.condomini.CRUD;

import java.util.List;
import it.exolab.condomini.exceptions.EntityNotFoundException;
import it.exolab.condomini.exceptions.FieldException;
import it.exolab.condomini.mapper.SqlMapFactory;
import it.exolab.condomini.mapper.Verbale_finaleMapper;
import it.exolab.condomini.model.Verbale_finale;

public class Verbale_finaleCRUD {
	public void insert(Verbale_finale verbale_finale) throws FieldException {
		validate(verbale_finale.getTitolo(), verbale_finale.getTesto());
		SqlMapFactory.instance().openSession();

		Verbale_finaleMapper mapper = SqlMapFactory.instance().getMapper(Verbale_finaleMapper.class);
		mapper.insert(verbale_finale);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();
		Verbale_finaleMapper mapper = SqlMapFactory.instance().getMapper(Verbale_finaleMapper.class);
		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public List<Verbale_finale> findAll() throws EntityNotFoundException {
		SqlMapFactory.instance().openSession();
		Verbale_finaleMapper mapper = SqlMapFactory.instance().getMapper(Verbale_finaleMapper.class);
		List<Verbale_finale> verbali_finali = mapper.findAll();
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
		if (verbali_finali == null) {
			throw new EntityNotFoundException();
		}
		return verbali_finali;
	}

	public Verbale_finale find_Verbale_Preventivo_Riunione(int id) throws EntityNotFoundException {
		SqlMapFactory.instance().openSession();
		Verbale_finaleMapper mapper = SqlMapFactory.instance().getMapper(Verbale_finaleMapper.class);
		Verbale_finale verbale_finale = mapper.find_Verbale_Preventivo_Riunione(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
		if (verbale_finale == null) {
			throw new EntityNotFoundException();
		}
		return verbale_finale;
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