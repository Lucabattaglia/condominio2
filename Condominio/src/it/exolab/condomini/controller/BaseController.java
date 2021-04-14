package it.exolab.condomini.controller;

import java.io.File;  
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import it.exolab.condomini.CRUD.Comunicazione_riunioneCRUD;
import it.exolab.condomini.CRUD.DelegatoCRUD;
import it.exolab.condomini.CRUD.PalazzinaCRUD;
import it.exolab.condomini.CRUD.PresenzaCRUD;
import it.exolab.condomini.CRUD.PreventivoCRUD;
import it.exolab.condomini.CRUD.RappresentanteCRUD;
import it.exolab.condomini.CRUD.RiunioneCRUD;
import it.exolab.condomini.CRUD.Verbale_finaleCRUD;
import it.exolab.condomini.CRUD.Votazione_preventivoCRUD;
import it.exolab.condomini.model.Rappresentante;
public class BaseController {

	RappresentanteCRUD rappresentantecrud = new RappresentanteCRUD();
    DelegatoCRUD delegatocrud = new DelegatoCRUD();
    RiunioneCRUD riunionecrud = new RiunioneCRUD();
    Comunicazione_riunioneCRUD c_riunionecrud = new Comunicazione_riunioneCRUD();
    PalazzinaCRUD palazzinacrud = new PalazzinaCRUD();
    Verbale_finaleCRUD verbalefinalecrud = new Verbale_finaleCRUD();
    Votazione_preventivoCRUD votazionepreventivocrud = new Votazione_preventivoCRUD();
    PreventivoCRUD preventivocrud = new PreventivoCRUD();
    PresenzaCRUD presenzacrud = new PresenzaCRUD();
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	
	public BaseController(HttpServletRequest request, HttpServletResponse response) {
		this.request=request;
		this.response=response;
	}
	
	public void redirect() {
		
		try {
			Rappresentante utente = (Rappresentante) request.getSession().getAttribute("utente");
			if(utente.getRuolo().equals("rappresentante")) {
			request.getRequestDispatcher("area_personale.jsp").include(request, response);
			} else {
				request.getRequestDispatcher("area_personale_admin.jsp").include(request, response);
			}
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
}
