package br.com.ouvidoriaB;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class OuvidoriaVar {

	private String nomeInstituicao;
	//private String NomeResponsavel;

	private ArrayList<ManifestaçãoB> manifestacoes = new ArrayList<ManifestaçãoB>();

	public OuvidoriaVar(String nomeInstituicao, String NomeResponsavel) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public void listarManifestacoes() {

		// if(manifestacoes.size() > 0) {
		if (!manifestacoes.isEmpty()) {

			String listagem = "Listagem de Todas as Manifestações da " + nomeInstituicao + "\n";
			
			for (ManifestaçãoB manifestacao : manifestacoes) {

				if(manifestacao.getTipoManifestacao().equalsIgnoreCase("R")) {
					listagem += "Reclamação de " + manifestacao.getSolicitante()  + " com a descrição: " + manifestacao.getTitulo() + "\n";
				} else if(manifestacao.getTipoManifestacao().equalsIgnoreCase("S")) {
					listagem += "Sugestão de " + manifestacao.getSolicitante()  + " com a descrição: " + manifestacao.getTitulo() + "\n";
				} else if(manifestacao.getTipoManifestacao().equalsIgnoreCase("E")) {
					listagem += "Elogio de " + manifestacao.getSolicitante()  + " com a descrição: " + manifestacao.getTitulo() + "\n";
				}
			}

			JOptionPane.showMessageDialog(null,listagem);
			
		} else {
			JOptionPane.showMessageDialog(null, "Sem manifestações a exibir ");
		}
	}

	public void adicionarManifestacaoParaOuvidoria(ManifestaçãoB novaManifestacao) {
		this.manifestacoes.add(novaManifestacao);
	}

	public ManifestaçãoB pesquisarContaPeloCodigo(int numero) {

		ManifestaçãoB manifestRequisitada = null;

		for (ManifestaçãoB manifestacao : manifestacoes) {

			if (manifestacao.getCodigoManifest() == numero) {
				manifestRequisitada = manifestacao;
				break;
			}
		}

		return manifestRequisitada;
	}
	
	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}
	
}
