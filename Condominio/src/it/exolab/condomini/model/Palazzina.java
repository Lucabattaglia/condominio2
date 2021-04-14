package it.exolab.condomini.model;

public class Palazzina {
	
	private int id;
	private String nome;
	
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
	public Palazzina(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
    public Palazzina(String nome) {
		this.nome = nome;
	}
	public Palazzina() {
    	
    }
	@Override
	public String toString() {
		return "Palazzina [id=" + id + ", nome=" + nome + "]";
	}
	
	
    
}
