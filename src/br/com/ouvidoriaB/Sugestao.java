package br.com.ouvidoriaB;

public class Sugestao extends ManifestaçãoB{

	public String description;
	
	public Sugestao(String titulo, String solicitante, String tipo, int codigoManifest, String description) {
		super(titulo, solicitante, tipo, codigoManifest);
		this.description = description;
	}

	public Sugestao(String titulo, String solicitante, String tipo, int codigoManifest) {
		super(titulo, solicitante, tipo, codigoManifest);
	}

	public Sugestao(String titulo, String descricao, String solicitante, String tipo) {
		super(titulo, descricao, solicitante, tipo);
	}
	
}
