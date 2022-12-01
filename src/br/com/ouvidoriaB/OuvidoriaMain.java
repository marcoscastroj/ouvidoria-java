package br.com.ouvidoriaB;
import javax.swing.*;

public class OuvidoriaMain {

	public static void main(String[] args) {
		OuvidoriaVar ouvidoriaUniversidadeABC = new OuvidoriaVar("ABC","Hamurabi");
		
		int opcao = 6;
			
		JOptionPane.showMessageDialog(null, "Sistema Ouvidoria da Universidade ABC");
		
		
		while(opcao != 5) {
			
			String resposta = JOptionPane.showInputDialog("Opcões \n 1 listar as manifestacoes \n 2 criar nova manifestacao \n 3 listar manifestação de um requisitante \n 4 sair");
			opcao = Integer.parseInt(resposta);
			
			if(opcao == 1) {
				ouvidoriaUniversidadeABC.listarManifestacoes();
			
			} else if(opcao == 2) {
				
				String solicitante = JOptionPane.showInputDialog("Qual o nome do requisitante? ");
				
				String codigoManifest = JOptionPane.showInputDialog("Digite um código de acesso: ");
				int newCode = Integer.parseInt(codigoManifest);
				
				String tipoManifestacao = JOptionPane.showInputDialog("Qual tipo da manifestação? (R para reclamação, S para sugestão e E para elogio)");
				
				String titulo = JOptionPane.showInputDialog("Qual o titulo da manifestação?");
				
				String descricao = JOptionPane.showInputDialog("Qual a descrição da manifestação?");
				
				ManifestaçãoB novManifestInserida = null;
				
				if(tipoManifestacao.equalsIgnoreCase("S")) {
					novManifestInserida = new Sugestao(titulo, solicitante,tipoManifestacao, newCode,descricao);
					
				} else if(tipoManifestacao.equalsIgnoreCase("R")) {
					novManifestInserida = new Reclamacao(titulo, solicitante,tipoManifestacao, newCode,descricao);
					
				} else if(tipoManifestacao.equalsIgnoreCase("E")) {
					novManifestInserida = new Elogio(titulo, solicitante,tipoManifestacao, newCode,descricao);
				}
				
				System.out.println(novManifestInserida);
				
				//ManifestaçãoB novaManifestInserida = new ManifestaçãoB(titulo,descricao,solicitante,tipoManifestacao); >>>>> Não vai funcionar por causa do ABSTRACT, não instancia
				ManifestaçãoB novaManifestInserida = new Reclamacao(titulo,descricao,solicitante,tipoManifestacao); // POLI
				novaManifestInserida = new Reclamacao(titulo,descricao,solicitante,tipoManifestacao);
				
				ouvidoriaUniversidadeABC.adicionarManifestacaoParaOuvidoria(novaManifestInserida);

				JOptionPane.showMessageDialog(null, "Nova manifestação criada com sucesso!");
				
			} else if(opcao == 3) {
				String codigo = JOptionPane.showInputDialog("Qual o codigo do requisitante ");
				int codigoManifest = Integer.parseInt(codigo);

				ManifestaçãoB pesquisaCodigo = ouvidoriaUniversidadeABC.pesquisarContaPeloCodigo(codigoManifest);
				
				if(pesquisaCodigo.getCodigoManifest() == codigoManifest) {
					JOptionPane.showMessageDialog(null, "Manifestação de " + pesquisaCodigo.getSolicitante() + "\nMANIFESTAÇÕES: " + pesquisaCodigo.getTitulo() + "\n" + pesquisaCodigo.getDescricao());
				}
				
			} else if(opcao == 4) {
				
				JOptionPane.showMessageDialog(null, "Programa finalizado!");
				break;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Obrigado por usar Ouvidoria da ABC!");

	}

}
