package it.exolab.condomini.model;

public class Presenza {
	
	private int id;
	private int id_comunicazione;
	private Comunicazione_riunione comunicazione_riunione;
	private int id_rappresentante;
	private Rappresentante rappresentante;
	private String presenza_rappresentante;
	private int id_delegato;
	private Delegato delegato;
	private String presenza_delegato;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Comunicazione_riunione getComunicazione_riunione() {
		return comunicazione_riunione;
	}
	public void setComunicazione_riunione(Comunicazione_riunione comunicazione_riunione) {
		this.comunicazione_riunione = comunicazione_riunione;
	}
	public Rappresentante getRappresentante() {
		return rappresentante;
	}
	public void setRappresentante(Rappresentante rappresentante) {
		this.rappresentante = rappresentante;
	}
	public String getPresenza_rappresentante() {
		return presenza_rappresentante;
	}
	public void setPresenza_rappresentante(String presenza_rappresentante) {
		this.presenza_rappresentante = presenza_rappresentante;
	}
	public Delegato getDelegato() {
		return delegato;
	}
	public void setDelegato(Delegato delegato) {
		this.delegato = delegato;
	}
	public String getPresenza_delegato() {
		return presenza_delegato;
	}
	public void setPresenza_delegato(String presenza_delegato) {
		this.presenza_delegato = presenza_delegato;
	}
	public int getId_comunicazione() {
		return id_comunicazione;
	}
	public void setId_comunicazione(int id_comunicazione) {
		this.id_comunicazione = id_comunicazione;
	}
	public int getId_rappresentante() {
		return id_rappresentante;
	}
	public void setId_rappresentante(int id_rappresentante) {
		this.id_rappresentante = id_rappresentante;
	}
	public int getId_delegato() {
		return id_delegato;
	}
	public void setId_delegato(int id_delegato) {
		this.id_delegato = id_delegato;
	}
	
	public Presenza(int id, int id_comunicazione, Comunicazione_riunione comunicazione_riunione, int id_rappresentante,
			Rappresentante rappresentante, String presenza_rappresentante, int id_delegato, Delegato delegato,
			String presenza_delegato) {
		this.id = id;
		this.id_comunicazione = id_comunicazione;
		this.comunicazione_riunione = comunicazione_riunione;
		this.id_rappresentante = id_rappresentante;
		this.rappresentante = rappresentante;
		this.presenza_rappresentante = presenza_rappresentante;
		this.id_delegato = id_delegato;
		this.delegato = delegato;
		this.presenza_delegato = presenza_delegato;
	}
	
	public Presenza(int id_comunicazione, Comunicazione_riunione comunicazione_riunione, int id_rappresentante,
			Rappresentante rappresentante, String presenza_rappresentante, int id_delegato, Delegato delegato,
			String presenza_delegato) {
		this.id_comunicazione = id_comunicazione;
		this.comunicazione_riunione = comunicazione_riunione;
		this.id_rappresentante = id_rappresentante;
		this.rappresentante = rappresentante;
		this.presenza_rappresentante = presenza_rappresentante;
		this.id_delegato = id_delegato;
		this.delegato = delegato;
		this.presenza_delegato = presenza_delegato;
	}
	
	public Presenza() {

	}
	
	@Override
	public String toString() {
		return "Presenza [id=" + id + ", id_comunicazione=" + id_comunicazione + ", comunicazione_riunione="
				+ comunicazione_riunione + ", id_rappresentante=" + id_rappresentante + ", rappresentante="
				+ rappresentante + ", presenza_rappresentante=" + presenza_rappresentante + ", id_delegato="
				+ id_delegato + ", delegato=" + delegato + ", presenza_delegato=" + presenza_delegato + "]";
	}
	
	
	
	

}
