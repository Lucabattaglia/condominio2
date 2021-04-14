package it.exolab.condomini.model;

public class Verbale_finale {
	private int id;
	private int id_riunione;
	private Riunione riunione;
	private String titolo;
	private String testo;
	private int id_preventivo;
	private Preventivo preventivo;

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
	public Preventivo getPreventivo() {
		return preventivo;
	}
	public void setPreventivo(Preventivo preventivo) {
		this.preventivo = preventivo;
	}
	public int getId_riunione() {
		return id_riunione;
	}
	public void setId_riunione(int id_riunione) {
		this.id_riunione = id_riunione;
	}
	public int getId_preventivo() {
		return id_preventivo;
	}
	public void setId_preventivo(int id_preventivo) {
		this.id_preventivo = id_preventivo;
	}
	
	public Verbale_finale(int id, int id_riunione, Riunione riunione, String titolo, String testo, int id_preventivo,
			Preventivo preventivo) {
		this.id = id;
		this.id_riunione = id_riunione;
		this.riunione = riunione;
		this.titolo = titolo;
		this.testo = testo;
		this.id_preventivo = id_preventivo;
		this.preventivo = preventivo;
	}
	
	public Verbale_finale(int id_riunione, Riunione riunione, String titolo, String testo, int id_preventivo,
			Preventivo preventivo) {
		this.id_riunione = id_riunione;
		this.riunione = riunione;
		this.titolo = titolo;
		this.testo = testo;
		this.id_preventivo = id_preventivo;
		this.preventivo = preventivo;
	}
	
	public Verbale_finale() {
		
	}
	
	@Override
	public String toString() {
		return "Verbale_finale [id=" + id + ", id_riunione=" + id_riunione + ", riunione=" + riunione + ", titolo="
				+ titolo + ", testo=" + testo + ", id_preventivo=" + id_preventivo + ", preventivo=" + preventivo + "]";
	}
	
	
	
	
	
	
}
