package Sorveteria;

import java.util.ArrayList;
import java.util.Scanner;

public class Sorvete {
	
	private String sabor;
	ArrayList<Sorvete> sorvetes = new ArrayList<Sorvete>();
	
	public Sorvete() {
		
	}
	
	public Sorvete(String sabor) {
		this.sabor = sabor;
		
	}
		

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

		
	public void inserir(Sorvete sorvete) {
		sorvetes.add(sorvete);		
			
	}

	public void listarTodos() {
		for(Sorvete sorvete : sorvetes) {
			System.out.println(sorvete.toString());
		}
	}
	
	public String toString() {
		return "Sorvete de : " + this.getSabor();
	}
	
	public void remover(String sabor) {
		int posicao = -1;
		for(Sorvete re : sorvetes) {
			if(re.getSabor().equals(sabor)) {
				posicao = sorvetes.indexOf(re);
				break;
			}
			
		}
	
		if(posicao != -1) {
		sorvetes.remove(posicao);
		}else {
		System.out.println("Administrador não encontrado!");
	}
	}
}


		
			
		
			
			
		
	
		
		
		
		
	


