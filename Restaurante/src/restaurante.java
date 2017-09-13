
public class restaurante {

	private String nome;
	private String descricao;
	private double preco;
	
	public void Nome (String nome){
	this.nome = nome;
	}
	
	public void Descricao (String descricao){
		this.descricao = descricao;
		}
		
	public void Preco (double preco){
		this.preco = preco;
		}
	
	public String setmostrarCardapio (){
		return nome + ": " + preco
				+ descricao;
	}
	
	public void Pedido(){
		System.out.println("Informe seu pedido: Prato1, Prato2, Prato3, Prato4, Prato5");
	}
	
}
