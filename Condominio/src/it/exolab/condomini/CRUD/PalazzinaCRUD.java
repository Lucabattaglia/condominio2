package it.exolab.condomini.CRUD;

import java.util.List;

import it.exolab.condomini.exceptions.EntityNotFoundException;
import it.exolab.condomini.mapper.PalazzinaMapper;
import it.exolab.condomini.mapper.SqlMapFactory;
import it.exolab.condomini.model.Palazzina;


public class PalazzinaCRUD {
	
	public List<Palazzina> findAll() throws EntityNotFoundException {
		SqlMapFactory.instance().openSession();

		PalazzinaMapper mapper = SqlMapFactory.instance().getMapper(PalazzinaMapper.class);

		List<Palazzina> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();
		if(ret==null) {
			throw new EntityNotFoundException();
		}

		return ret;

	}
	
	public Palazzina find(int id) throws EntityNotFoundException {
		SqlMapFactory.instance().openSession();

		PalazzinaMapper mapper = SqlMapFactory.instance().getMapper(PalazzinaMapper.class);

		Palazzina ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();
		if(ret==null) {
			throw new EntityNotFoundException();
		}

		return ret;
	}


}
