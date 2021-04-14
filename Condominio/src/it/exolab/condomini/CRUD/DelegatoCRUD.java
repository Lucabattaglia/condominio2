package it.exolab.condomini.CRUD;

import java.util.List;

import it.exolab.condomini.exceptions.EntityNotFoundException;
import it.exolab.condomini.exceptions.FieldException;
import it.exolab.condomini.mapper.DelegatoMapper;
import it.exolab.condomini.mapper.SqlMapFactory;
import it.exolab.condomini.model.Delegato;

public class DelegatoCRUD {

	public void insert(Delegato delegato) throws FieldException {
		
		validate(delegato.getNome(), delegato.getCognome(), delegato.getCodice_fiscale());
		SqlMapFactory.instance().openSession();
		DelegatoMapper mapper = SqlMapFactory.instance().getMapper(DelegatoMapper.class);
		mapper.insert(delegato);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void delete(int id) {

		SqlMapFactory.instance().openSession();

		DelegatoMapper mapper = SqlMapFactory.instance().getMapper(DelegatoMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public List<Delegato> findAll() throws EntityNotFoundException {
		SqlMapFactory.instance().openSession();

		DelegatoMapper mapper = SqlMapFactory.instance().getMapper(DelegatoMapper.class);

		List<Delegato> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();
		
		if(ret==null) {
			throw new EntityNotFoundException();
		}

		return ret;

	}

	public Delegato findDelegatoandRappresentante(int id) throws EntityNotFoundException {

		SqlMapFactory.instance().openSession();
		DelegatoMapper mapper = SqlMapFactory.instance().getMapper(DelegatoMapper.class);

		Delegato delegato = mapper.findDelegatoandRappresentante(id);
		SqlMapFactory.instance().closeSession();
		if (delegato == null) {
			throw new EntityNotFoundException();
		} else {
			return delegato;
		}

	}

	public void checkCodice_fiscale(String codice_fiscale) throws FieldException {
		if (codice_fiscale == "") {
			throw new FieldException(codice_fiscale);
		}

	}

	public void checkNome(String nome) throws FieldException {
		if (nome == "") {
			throw new FieldException(nome);
		}

	}

	public void checkCognome(String cognome) throws FieldException {

		if (cognome == "") {
			throw new FieldException(cognome);
		}
	}

	public void validate(String nome, String cognome, String codice_fiscale) throws FieldException {
		checkNome(nome);
		checkCognome(cognome);
		checkCodice_fiscale(codice_fiscale);
	}

}