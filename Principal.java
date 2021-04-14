package Sorveteria;

import java.util.Scanner;

public class Principal extends Sorvete{

	public static void main(String[] args) {
		
		Scanner codigo = new Scanner(System.in);
		int contador = 1;
		Sorvete sorvete = new Sorvete("chocolate");
		sorvete.inserir(sorvete);
		while (contador == 1) { 
			System.out.println(" Digite 1 para inserir, 2 para remover e 3 para listar todos os itens.");
			int opcao = codigo.nextInt();
			if (opcao == 1){
				System.out.println("Informe o sabor: ");
				String sabor = codigo.next();
				Sorvete so = new Sorvete(sabor);
				sorvete.inserir(so);
				System.out.println("Sorvete adicionado com sucesso! ");
			}else if (opcao == 2){
				System.out.println("Informe o sabor a ser removido: ");
				String remover = codigo.next();
				Sorvete re = new Sorvete(remover);
				sorvete.equals(re);
				System.out.println("Sabor removido com sucesso!!! ");
				
			}else if (opcao == 3){
				sorvete.listarTodos();
			}
			System.out.println("Digite 0 para sair ou 1 para continuar: ");
			contador = codigo.nextInt();
		}
		
				
		
		

	}

}


