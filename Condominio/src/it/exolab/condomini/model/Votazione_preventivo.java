package it.exolab.condomini.model;

public class Votazione_preventivo {
	
	private int id;
	private int id_preventivo;
	private Preventivo preventivo;
	private int id_rappresentante;
	private Rappresentante rappresentante;
	private int id_riunione;
	private Riunione riunione;
	private String votazione;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Preventivo getPreventivo() {
		return preventivo;
	}
	public void setPreventivo(Preventivo preventivo) {
		this.preventivo = preventivo;
	}
	public Rappresentante getRappresentante() {
		return rappresentante;
	}
	public void setRappresentante(Rappresentante rappresentante) {
		this.rappresentante = rappresentante;
	}
	
	public Riunione getRiunione() {
		return riunione;
	}
	public void setRiunione(Riunione riunione) {
		this.riunione = riunione;
	}
	public String getVotazione() {
		return votazione;
	}
	public void setVotazione(String votazione) {
		this.votazione = votazione;
	}
	public int getId_preventivo() {
		return id_preventivo;
	}
	public void setId_preventivo(int id_preventivo) {
		this.id_preventivo = id_preventivo;
	}
	public int getId_rappresentante() {
		return id_rappresentante;
	}
	public void setId_rappresentante(int id_rappresentante) {
		this.id_rappresentante = id_rappresentante;
	}
	public int getId_riunione() {
		return id_riunione;
	}
	public void setId_riunione(int id_riunione) {
		this.id_riunione = id_riunione;
	}
	
	public Votazione_preventivo(int id, int id_preventivo, Preventivo preventivo, int id_rappresentante,
			Rappresentante rappresentante, int id_riunione, Riunione riunione, String votazione) {
		this.id = id;
		this.id_preventivo = id_preventivo;
		this.preventivo = preventivo;
		this.id_rappresentante = id_rappresentante;
		this.rappresentante = rappresentante;
		this.id_riunione = id_riunione;
		this.riunione = riunione;
		this.votazione = votazione;
	}
	
	public Votazione_preventivo(int id_preventivo, Preventivo preventivo, int id_rappresentante,
			Rappresentante rappresentante, int id_riunione, Riunione riunione, String votazione) {
		this.id_preventivo = id_preventivo;
		this.preventivo = preventivo;
		this.id_rappresentante = id_rappresentante;
		this.rappresentante = rappresentante;
		this.id_riunione = id_riunione;
		this.riunione = riunione;
		this.votazione = votazione;
	}
	
	public Votazione_preventivo() {

	}
	
	@Override
	public String toString() {
		return "Votazione_preventivo [id=" + id + ", id_preventivo=" + id_preventivo + ", preventivo=" + preventivo
				+ ", id_rappresentante=" + id_rappresentante + ", rappresentante=" + rappresentante + ", id_riunione="
				+ id_riunione + ", riunione=" + riunione + ", votazione=" + votazione + "]";
	}
	
	
}