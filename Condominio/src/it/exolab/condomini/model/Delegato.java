package it.exolab.condomini.model;

public class Delegato {
	
	private int id;
	private String nome;
	private String cognome;
	private String codice_fiscale;
    private int id_rappresentante;
    private Rappresentante rappresentante;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCodice_fiscale() {
		return codice_fiscale;
	}
	public void setCodice_fiscale(String codice_fiscale) {
		this.codice_fiscale = codice_fiscale;
	}
	public int getId_rappresentante() {
		return id_rappresentante;
	}
	public void setId_rappresentante(int id_rappresentante) {
		this.id_rappresentante = id_rappresentante;
	}
	public Rappresentante getRappresentante() {
		return rappresentante;
	}
	public void setRappresentante(Rappresentante rappresentante) {
		this.rappresentante = rappresentante;
	}
	public Delegato(int id, String nome, String cognome, String codice_fiscale, int id_rappresentante,
			Rappresentante rappresentante) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.codice_fiscale = codice_fiscale;
		this.id_rappresentante = id_rappresentante;
		this.rappresentante = rappresentante;
	}
	public Delegato(String nome, String cognome, String codice_fiscale, int id_rappresentante,
			Rappresentante rappresentante) {
		this.nome = nome;
		this.cognome = cognome;
		this.codice_fiscale = codice_fiscale;
		this.id_rappresentante = id_rappresentante;
		this.rappresentante = rappresentante;
	}
	public Delegato() {

	}
	@Override
	public String toString() {
		return "Delegato [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", codice_fiscale=" + codice_fiscale
				+ ", id_rappresentante=" + id_rappresentante + ", rappresentante=" + rappresentante + "]";
	}
	
	
	
	
	

}
