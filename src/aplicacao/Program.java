package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Program {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Entre com Produto");
       System.out.printf("Nome: ");
       String nome = sc.nextLine();
       System.out.printf("Preço: ");
       double preco = sc.nextDouble();
       System.out.printf("Quantidade: ");
       int qtd = sc.nextInt();
       
       Produto produto = new Produto(nome,preco,qtd);
       System.out.println("Autualizado:" +  produto);
       
       produto.setNome("TV");
       System.out.println("Nome:" + produto.getNome());
     
       System.out.println(produto.toString());
       System.out.println();
       System.out.print("Digite QTD de entrada:");
       qtd = sc.nextInt();
       produto.addProduto(qtd);
       
       System.out.println("Autualizado:" +  produto);
       
       System.out.print("Digite QTD de Saida: ");
       qtd = sc.nextInt();
       produto.removeProduto(qtd);
       System.out.println("Autualizado:" +  produto);
       sc.close();
       
      
       
	}

}
