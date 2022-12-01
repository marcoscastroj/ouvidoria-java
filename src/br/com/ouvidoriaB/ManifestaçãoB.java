package br.com.ouvidoriaB;

import java.util.Objects;

public abstract class ManifestaçãoB {

	private String titulo;
	private String descricao;
	private int codigoManifest;
	private String solicitante;
	private String tipoManifestacao; // R (Reclamacao), E (Elogio) e S (Sugestao)
	
	public ManifestaçãoB(String titulo, String descricao, String solicitante, String tipo) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.solicitante = solicitante;
		this.tipoManifestacao = tipo;
	}

	public ManifestaçãoB(String titulo, String solicitante, String tipo, int codigoManifest) {
		this.titulo = titulo;
		this.codigoManifest = codigoManifest;
		this.solicitante = solicitante;
		this.tipoManifestacao = tipo;
	}
		
	public final void Mani (String manifests) throws ManiInvalida{
		if (manifests == null) {
			throw new ManiInvalida();
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCodigoManifest() {
		return codigoManifest;
	}

	public void setCodigoManifest(int codigoManifest) {
		this.codigoManifest = codigoManifest;
	}
	
	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public String getTipoManifestacao() {
		return tipoManifestacao;
	}

	public void setTipoManifestacao(String tipoConta) {
		this.tipoManifestacao = tipoConta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoManifest);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ManifestaçãoB other = (ManifestaçãoB) obj;
		return codigoManifest == other.codigoManifest;
	}

	
}
