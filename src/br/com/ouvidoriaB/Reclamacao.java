package br.com.ouvidoriaB;

public class Reclamacao extends ManifestaçãoB {
			
	public String description;
	
	public Reclamacao(String titulo, String solicitante, String tipo, int codigoManifest, String description) {
		super(titulo, solicitante, tipo, codigoManifest);
		this.description = description;
	}

	public Reclamacao(String titulo, String solicitante, String tipo, int codigoManifest) {
		super(titulo, solicitante, tipo, codigoManifest);
	}

	public Reclamacao(String titulo, String descricao, String solicitante, String tipo) {
		super(titulo, descricao, solicitante, tipo);
	}	
	
}
