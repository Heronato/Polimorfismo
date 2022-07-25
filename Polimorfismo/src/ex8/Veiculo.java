package ex8;

import java.util.Scanner;

public class Veiculo {
	
	private String modelo;
	private double preco;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String modelo, double preco) {
		this.modelo = modelo;
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getTipo() {
		return "ve�culo...";
	}
	
	public String getDetalhes() {
		return "Ve�culo: " + getModelo() + " custa R$" + getPreco();
	}
	
	public void mostrarDados() {
		String mostrar = getTipo() + "\n" + getDetalhes();
	}
	
	public void inserirDados() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o modelo do ve�culo: ");
		String vei = sc.next();
		System.out.print("Valor: ");
		double val = sc.nextDouble();
		
		setModelo(vei);
		setPreco(val);
	}

}
