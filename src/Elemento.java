import java.util.Scanner;

public class Elemento {
	
	String nome;
	Elemento proximo;
	


	public void ler(){
		@SuppressWarnings("resource")
		Scanner tc = new Scanner(System.in);
		System.out.println("Nome");
		this.nome=tc.next();
	}
	
	public void mostrar(){
		System.out.println(this.nome);
	}

}