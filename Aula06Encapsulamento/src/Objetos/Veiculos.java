package Objetos;

public class Veiculos {
	
	private String placa;
	private String cor;
	private int quantidadePassageiros;
	private double capacidadeTanque;
	private int velocidadeMaxima;
	private double consumoMedio;
	
	public Veiculos(String placa, String cor, int quantidadePassageiros, double capacidadeTanque, int velocidadeMaxima,
			double consumoMedio) {
		this.placa = placa;
		this.cor = cor;
		this.quantidadePassageiros = quantidadePassageiros;
		this.capacidadeTanque = capacidadeTanque;
		this.velocidadeMaxima = velocidadeMaxima;
		this.consumoMedio = consumoMedio;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getQuantidadePassageiros() {
		return quantidadePassageiros;
	}
	public void setQuantidadePassageiros(int quantidadePassageiros) {
		this.quantidadePassageiros = quantidadePassageiros;
	}
	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public double getConsumoMedio() {
		return consumoMedio;
	}
	public void setConsumoMedio(double consumoMedio) {
		this.consumoMedio = consumoMedio;
	}
	
	@Override
	public String toString() {
		return "Veiculos [placa=" + placa + ", cor=" + cor + ", quantidadePassageiros=" + quantidadePassageiros
				+ ", capacidadeTanque=" + capacidadeTanque + ", velocidadeMaxima=" + velocidadeMaxima
				+ ", consumoMedio=" + consumoMedio + "]";
	}
	
	
}
