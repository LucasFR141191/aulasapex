package olamundo;

public class Pessoa {
private	String nome;
private	long cpf;
private    Endereco enderecoDaPessoa;
private	double altura;
private	String cordoCabelo;
private	String dataDeNascimento;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public long getCpf() {
		return this.cpf;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getCordoCabelo() {
		return cordoCabelo;
	}
	public void setCordoCabelo(String cordoCabelo) {
		this.cordoCabelo = cordoCabelo;
	}
}
