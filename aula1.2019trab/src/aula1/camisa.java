package aula1;

public class camisa {
	
	String manga;
	String cor;
	String tipo;
	String tamanho;
	boolean desenho;
	
	void desenhar(){
		
		if(desenho)
			System.out.println("Desenho encontrado");
		else
			System.out.println("Desenho não encontrado");
		
	}
	
	void vestir(){
		
	}
	
	void lavar(){
		
	}
	
	void status(){
		System.out.println("Classe camisa");
		System.out.println("manga:" + manga);
		System.out.println("cor:" + cor);
		System.out.println("tipo:" + tipo);
		System.out.println("tamanho:" + tamanho);
	}

}
