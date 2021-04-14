package it.exolab.condomini.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Session;

import it.exolab.condomini.exceptions.DuplicateEmailException;
import it.exolab.condomini.exceptions.EntityNotFoundException;
import it.exolab.condomini.exceptions.FieldException;
import it.exolab.condomini.model.Rappresentante;

public class RappresentanteController extends BaseController {
		
	public RappresentanteController(HttpServletRequest request, HttpServletResponse response) {
		super(request, response);
	}

	public Rappresentante login() {
		Rappresentante utente = new Rappresentante();
		try {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			utente.setEmail(email);
			utente.setPassword(password);
			utente = rappresentantecrud.findByfindByEmailAndPassword(utente);
			request.getSession().setAttribute("utente", utente);
		} catch (EntityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			return utente;
		
	}
	
	public void registrazione() {
		
		try {
			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String numero_appartamento = request.getParameter("numero_appartamento");
			String codice_fiscale = request.getParameter("codice_fiscale");
			int id_palazzina = Integer.parseInt(request.getParameter("id_palazzina"));
			Rappresentante utente = new Rappresentante(nome, cognome, email, password, numero_appartamento, codice_fiscale, id_palazzina);
			rappresentantecrud.insert(utente);
			request.getSession().setAttribute("utente", utente);
		} catch (DuplicateEmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public void delete(Rappresentante rappresentante) {
		    rappresentantecrud.delete(rappresentante.getId());
	}
}
