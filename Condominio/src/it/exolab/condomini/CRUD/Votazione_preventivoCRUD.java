package it.exolab.condomini.CRUD;

import java.util.List;

import it.exolab.condomini.exceptions.EntityNotFoundException;
import it.exolab.condomini.exceptions.FieldException;
import it.exolab.condomini.mapper.SqlMapFactory;
import it.exolab.condomini.mapper.Votazione_preventivoMapper;
import it.exolab.condomini.model.Votazione_preventivo;

public class Votazione_preventivoCRUD {

	public void insert(Votazione_preventivo votazione_preventivo) throws FieldException {

		checkVotazione(votazione_preventivo.getVotazione());
		SqlMapFactory.instance().openSession();
		Votazione_preventivoMapper mapper = SqlMapFactory.instance().getMapper(Votazione_preventivoMapper.class);
		mapper.insert(votazione_preventivo);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void delete(int id) {

		SqlMapFactory.instance().openSession();

		Votazione_preventivoMapper mapper = SqlMapFactory.instance().getMapper(Votazione_preventivoMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public List<Votazione_preventivo> findAll() throws EntityNotFoundException {
		SqlMapFactory.instance().openSession();
		Votazione_preventivoMapper mapper = SqlMapFactory.instance().getMapper(Votazione_preventivoMapper.class);
		List<Votazione_preventivo> votazioni_preventivo = mapper.findAll();
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
		if (votazioni_preventivo == null) {
			throw new EntityNotFoundException();
		}
		return votazioni_preventivo;
	}

	public Votazione_preventivo findVotazione_Preventivo_Rappresentante_Riunione(int id)
			throws EntityNotFoundException {
		SqlMapFactory.instance().openSession();
		Votazione_preventivoMapper mapper = SqlMapFactory.instance().getMapper(Votazione_preventivoMapper.class);
		Votazione_preventivo votazione_preventivo = mapper.findVotazione_Preventivo_Rappresentante_Riunione(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
		if (votazione_preventivo == null) {
			throw new EntityNotFoundException();
		}
		return votazione_preventivo;
	}

	public void checkVotazione(String votazione) throws FieldException {
		if (votazione == "") {
			throw new FieldException(votazione);
		}

	}

}
