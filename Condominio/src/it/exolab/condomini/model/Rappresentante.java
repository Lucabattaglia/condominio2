package it.exolab.condomini.model;

public class Rappresentante {
	
	private int id;
	private String nome;
	private String cognome;
	private String codice_fiscale;
	private String email;
	private String password;
	private String numero_appartamento;
	private String ruolo;
	private int id_palazzina;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNumero_appartamento() {
		return numero_appartamento;
	}
	public void setNumero_appartamento(String numero_appartamento) {
		this.numero_appartamento = numero_appartamento;
	}
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	public int getPalazzina() {
		return id_palazzina;
	}
	public void setPalazzina(int id_palazzina) {
		this.id_palazzina = id_palazzina;
	}
	
	public Rappresentante(int id, String nome, String cognome, String codice_fiscale, String email, String password,
			String numero_appartamento, String ruolo, int id_palazzina) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.codice_fiscale = codice_fiscale;
		this.email = email;
		this.password = password;
		this.numero_appartamento = numero_appartamento;
		this.ruolo = ruolo;
		this.id_palazzina = id_palazzina;
	}
	
	public Rappresentante(String nome, String cognome, String email, String password,
			String numero_appartamento, String codice_fiscale, String ruolo, int id_palazzina) {
		this.nome = nome;
		this.cognome = cognome;
		this.codice_fiscale = codice_fiscale;
		this.email = email;
		this.password = password;
		this.numero_appartamento = numero_appartamento;
		this.ruolo = ruolo;
		this.id_palazzina = id_palazzina;
	}
	public Rappresentante(String nome, String cognome, String email, String password,
			String numero_appartamento, String codice_fiscale,  int id_palazzina) {
		this.nome = nome;
		this.cognome = cognome;
		this.codice_fiscale = codice_fiscale;
		this.email = email;
		this.password = password;
		this.numero_appartamento = numero_appartamento;
		this.id_palazzina = id_palazzina;
	}
	public Rappresentante(String email, String password) {
		this.email=email;
		this.password=password;
	}
	
	public Rappresentante() {

	}
	
	@Override
	public String toString() {
		return "Rappresentante [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", codice_fiscale="
				+ codice_fiscale + ", email=" + email + ", password=" + password + ", numero_appartamento="
				+ numero_appartamento + ", ruolo=" + ruolo + ", id_palazzina=" + id_palazzina + "]";
	}
	
	
	
	
	

}
