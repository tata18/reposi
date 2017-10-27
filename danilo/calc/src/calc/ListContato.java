package calc;

import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;

public class ListContato {
	private ArrayList<Contato> contatos= new ArrayList<Contato>();
	
	
	public void adicionarcontato(Contato c) {
		contatos.remove(c);
	}
	public void ListarContatos() {
		for( int i=0; i <contatos.size(); i++){
			System.out.println(contatos.get(i).getNome());
			System.out.println(contatos.get(i).getEndereço());
		}
	}

}