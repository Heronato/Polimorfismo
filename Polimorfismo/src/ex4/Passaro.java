package ex4;

public class Passaro extends Animais {

	public Passaro(String nome) {
		super(nome);
	}
	
	public void Imprime() {
		System.out.println("O pássaro " + this.getNome());
		movimento();
		System.out.println("voando");
		falar();
		System.out.println("Piu Piu");
	}

}
