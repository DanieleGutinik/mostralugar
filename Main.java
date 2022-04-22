/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_lugares;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author Daniele_38
 */
public class Main{
	
	public static void main(String[] args) throws URISyntaxException, IOException{
		String lugar = "Praça"; // variavel
		String escola = "Escolas"; // variavel
		Double avaliacao = 5d/2d; // Variavel Double 5d / 2d
		
		System.out.println(lugar);
		System.out.println(avaliacao);
	
		mostrarLugarNoMapa(lugar);
		mostrarLugarNoMapa(escola);
	}		

	private static void mostrarLugarNoMapa(String lugar) throws URISyntaxException, IOException {
		Desktop.getDesktop().browse(new URI("https://www.google.com/maps/search/?api=1&query="+lugar));
	}
}
