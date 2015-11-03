import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tc = new Scanner(System.in);
		
		Lista minhaLista = new Lista();
		
		int opc;
		do{
			System.out.println("Informe: \n1- AddInicio: \n2- AddFim: \n3- RemoveInicio \n4- RemoveFim \n5- Listar \n6- Mostrar Quantidade\n7- Remover na  posicão: \n8- Adiciona na posicao \n9- Mostrar na posicao \n10- Sair");
			opc=tc.nextInt();
			
			switch(opc){
			case 1:{
				Elemento e = new Elemento();
				e.ler();
				minhaLista.addInicio(e);
				break;
				}
			case 2:{
				Elemento e = new Elemento();
				e.ler();
				minhaLista.addFim(e);
				break;
			}
			case 3:{
			minhaLista.removeInicio();	
			break;
			}
			case 4:{
				minhaLista.removeFim();
				break;
			}
			case 5:{
				minhaLista.listar();
			}
			case 6:{
				minhaLista.quantidade();
				break;
			}
			case 7:{
				int p;
				System.out.println("Digite a posição");
				p=tc.nextInt();
				minhaLista.removePosicao(p);
				break;
			}
			case 8:{
				Elemento e = new Elemento();
				e.ler();
				int p;
				System.out.println("Digite a posição");
				p=tc.nextInt();
				minhaLista.addPosicao(e, p);
				break;
			}
			case 9:{
				int p;
				System.out.println("Digite a posição");
				p=tc.nextInt();
				minhaLista.mostraNaPosicao(p);
				break;
			}
			}
			
		}while (opc!=10);
		
	}

}
