package it.exolab.condomini.servlet;

import java.io.IOException;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.exolab.condomini.controller.RappresentanteController;
import it.exolab.condomini.exceptions.EntityNotFoundException;
import it.exolab.condomini.model.Rappresentante;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//      DelegatoController delegatocontroller = new DelegatoController();
//      RiunioneController riunionecontroller = new RiunioneController();
//      Comunicazione_riunioneController c_riunionecontroller = new Comunicazione_riunioneController();
//      PalazzinaController palazzinacontroller = new PalazzinaController();
//      Verbale_finaleController verbalefinalecontroller = new Verbale_finaleController();
//      Votazione_preventivoController votazionepreventivocontroller = new Votazione_preventivoController();
//      PreventivoController preventivocontroller = new PreventivoController();
//      PresenzaController presenzacontroller = new PresenzaController();
      
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		boolean ret = true;
		String loginregistrazione = request.getParameter("loginregistrazione");
		
		RappresentanteController rappresentantecontroller = new RappresentanteController(request, response);
		
		if(loginregistrazione.equals("login")) {
			rappresentantecontroller.login();
			rappresentantecontroller.redirect();
			
		} else {
			rappresentantecontroller.registrazione();
			rappresentantecontroller.redirect();
		}
	}

}
