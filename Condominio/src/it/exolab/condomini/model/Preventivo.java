package it.exolab.condomini.model;

public class Preventivo {
	
	private int id;
	private int id_riunione;
	private Riunione riunione;
	private String testo;
	private int id_rappresentante;
	private Rappresentante rappresentante;
	private int si_totali;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Riunione getRiunione() {
		return riunione;
	}
	public void setRiunione(Riunione riunione) {
		this.riunione = riunione;
	}
	public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	public Rappresentante getRappresentante() {
		return rappresentante;
	}
	public void setRappresentante(Rappresentante rappresentante) {
		this.rappresentante = rappresentante;
	}
	public int getSi_totali() {
		return si_totali;
	}
	public void setSi_totali(int si_totali) {
		this.si_totali = si_totali;
	}
	public int getId_riunione() {
		return id_riunione;
	}
	public void setId_riunione(int id_riunione) {
		this.id_riunione = id_riunione;
	}
	public int getId_rappresentante() {
		return id_rappresentante;
	}
	public void setId_rappresentante(int id_rappresentante) {
		this.id_rappresentante = id_rappresentante;
	}
	
	public Preventivo(int id, int id_riunione, Riunione riunione, String testo, int id_rappresentante,
			Rappresentante rappresentante, int si_totali) {
		this.id = id;
		this.id_riunione = id_riunione;
		this.riunione = riunione;
		this.testo = testo;
		this.id_rappresentante = id_rappresentante;
		this.rappresentante = rappresentante;
		this.si_totali = si_totali;
	}
	
	public Preventivo(int id_riunione, Riunione riunione, String testo, int id_rappresentante,
			Rappresentante rappresentante, int si_totali) {
		this.id_riunione = id_riunione;
		this.riunione = riunione;
		this.testo = testo;
		this.id_rappresentante = id_rappresentante;
		this.rappresentante = rappresentante;
		this.si_totali = si_totali;
	}
	
	public Preventivo() {

	}
	
	@Override
	public String toString() {
		return "Preventivo [id=" + id + ", id_riunione=" + id_riunione + ", riunione=" + riunione + ", testo=" + testo
				+ ", id_rappresentante=" + id_rappresentante + ", rappresentante=" + rappresentante + ", si_totali="
				+ si_totali + "]";
	}
	
	
	

}
