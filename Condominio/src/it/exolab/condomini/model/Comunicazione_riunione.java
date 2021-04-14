package it.exolab.condomini.model;

public class Comunicazione_riunione {
	
	private int id;
	private String titolo;
	private String testo;
	private String url;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Comunicazione_riunione(int id, String titolo, String testo, String url) {
		this.id = id;
		this.titolo = titolo;
		this.testo = testo;
		this.url = url;
	}
	
	public Comunicazione_riunione(String titolo, String testo, String url) {
		this.titolo = titolo;
		this.testo = testo;
		this.url = url;
	}
	
	public Comunicazione_riunione() {

	}
	
	@Override
	public String toString() {
		return "Comunicazione_riunione [id=" + id + ", titolo=" + titolo + ", testo=" + testo + ", url=" + url + "]";
	}
	
	

}
