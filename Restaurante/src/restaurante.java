
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
	
}
