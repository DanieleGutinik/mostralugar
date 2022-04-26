/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_lugares;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniele_38
 */
public class Lugar {
	private String nome;
	private List<Integer> avaliacoes = new ArrayList<Integer>();

	Lugar(String nomeLugar) {
		this.nome = nomeLugar.toUpperCase();
	}

	void mostraNoMapa() throws URISyntaxException, IOException {
		String nomeurl = this.nome.replace(" ", "%20");
		Desktop.getDesktop().browse(new URI("https://www.google.com/maps/search/?api=1&query="+nomeurl));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public void addAvaliacao(int avaliacao) {
		avaliacoes.add(avaliacao);
		
	}

	public Integer totalDeAvaliacoes() {		
		return this.avaliacoes.size();
	}
	
	
}
