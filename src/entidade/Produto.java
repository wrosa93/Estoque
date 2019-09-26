package entidade;

public class Produto {
   private String nome;
   private double preco;
   private int    qtd;
 
  public Produto(String nome, double preco, int qtd) {
	this.nome = nome;
	this.preco = preco;
	this.qtd = qtd;
}

  public Produto(String nome, double preco) {
	this.nome = nome;
	this.preco = preco;
}

  
  
	 public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQtd() {
		return qtd;
	}


public double totalEstoque(){
	  return preco * qtd;
  }
  
  public void addProduto (int qtd){
	  this.qtd += qtd;
  }
  public void removeProduto(int qtd){
	  this.qtd -= qtd;
  }
  public String toString(){
	  return nome 
			  + ", $" 
			  + String.format("%.2f", preco)
			  + ", "
			  + qtd 
			  + " unidade, Total: " 
			  +  String.format("%.2f", totalEstoque() ) ;
  }
}
