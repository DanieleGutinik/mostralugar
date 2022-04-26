/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_lugares;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 *
 * @author Daniele_Gutinik
 * Projeto de Estudo  Classe, Objeto, Lista
 * Metódo, retorno, lista. Getter e Setter
 * EncapsulamentoI
 */
public class Main{
	
	public static void main(String[] args) throws URISyntaxException, IOException{
		
		Lugar objetoLugar = new Lugar("Parque do Atleta");		
	
		
		objetoLugar.addAvaliacao(5);
		objetoLugar.addAvaliacao(4);
		objetoLugar.addAvaliacao(2);
		objetoLugar.mostraNoMapa();
		
		Integer total = objetoLugar.totalDeAvaliacoes();
		
		System.out.print(total);
		
		
		
	}
	
	
}
