package olamundo;

public class Carro {
int quantidadesDeRodas;
int aroDaRoda;
String tipoDomotor;
String cor;
String marca;
String modelo;
double velocidadeMaxima;
boolean ligado;

public boolean isLigado( ) {
	return this.ligado;
}
public void ligarOCarro() {
	if(!this.ligado) {
		this.ligado = true;
	}
}
}
