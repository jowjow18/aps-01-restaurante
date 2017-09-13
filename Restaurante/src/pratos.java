
public class pratos {

	private String prato [];
	private String nome;
	private double preco;
	private String descricao;
	
	public String getNome(){
		return nome;
	}
	
	public void Prato (String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	public void setDescricao (String descricao){
		this.descricao = descricao;
	}
}
