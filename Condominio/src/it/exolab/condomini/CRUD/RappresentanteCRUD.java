package it.exolab.condomini.CRUD;

import java.util.List;

import it.exolab.condomini.mapper.RappresentanteMapper;
import it.exolab.condomini.mapper.SqlMapFactory;
import it.exolab.condomini.model.Rappresentante;
import it.exolab.condomini.exceptions.EntityNotFoundException;
import it.exolab.condomini.exceptions.DuplicateEmailException;
import it.exolab.condomini.exceptions.FieldException;

public class RappresentanteCRUD {

	public void insert(Rappresentante rappresentante) throws DuplicateEmailException, FieldException {
		validate(rappresentante.getEmail(), rappresentante.getPassword(), rappresentante.getNome(),
				rappresentante.getCognome());
		SqlMapFactory.instance().openSession();

		RappresentanteMapper mapper = SqlMapFactory.instance().getMapper(RappresentanteMapper.class);
		Rappresentante rappresentante1 = mapper.find(rappresentante.getId());
		if (rappresentante1 == null) {
			mapper.insert(rappresentante);
		}
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void delete(int id) {

		SqlMapFactory.instance().openSession();

		RappresentanteMapper mapper = SqlMapFactory.instance().getMapper(RappresentanteMapper.class);

		mapper.delete(id);

		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public List<Rappresentante> findAll() throws EntityNotFoundException {
		SqlMapFactory.instance().openSession();

		RappresentanteMapper mapper = SqlMapFactory.instance().getMapper(RappresentanteMapper.class);
		List<Rappresentante> ret = mapper.findAll();

		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
		if(ret==null) {
			throw new EntityNotFoundException();
		}

		return ret;
	}

	public Rappresentante findByfindByEmailAndPassword(Rappresentante rappresentante) throws EntityNotFoundException {

		SqlMapFactory.instance().openSession();
		RappresentanteMapper mapper = SqlMapFactory.instance().getMapper(RappresentanteMapper.class);
		rappresentante = mapper.findByEmailAndPassword(rappresentante);
		if (rappresentante == null) {
			throw new EntityNotFoundException();
		}
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

		return rappresentante;
	}

	public Rappresentante findByfindByEmail(String email) throws EntityNotFoundException {

		SqlMapFactory.instance().openSession();
		RappresentanteMapper mapper = SqlMapFactory.instance().getMapper(RappresentanteMapper.class);
		Rappresentante rappresentante = mapper.findByEmail(email);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
		
		if(rappresentante==null) {
			throw new EntityNotFoundException();
		}

		return rappresentante;
	}

	public void checkPassword(String password) throws FieldException {

		int count = 0;
		if (password.length() >= 8) {
			for (int i = 0; i < password.length(); i++) {
				if (Character.isDigit(password.charAt(i))) {
					count++;
				}
			}
		} else
			throw new FieldException(password);

		if (count < 2) {
			throw new FieldException(password);
		}

	}

	public void checkEmail(String email) throws DuplicateEmailException {

		SqlMapFactory.instance().openSession();

		RappresentanteMapper mapper = SqlMapFactory.instance().getMapper(RappresentanteMapper.class);

		Rappresentante ret = mapper.findByEmail(email);
		if (ret != null) {
			throw new DuplicateEmailException();

		}
		SqlMapFactory.instance().closeSession();

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

	public void validate(String email, String password, String nome, String cognome)
			throws DuplicateEmailException, FieldException {
		checkEmail(email);
		checkPassword(password);
		checkNome(nome);
		checkCognome(cognome);
	}
}