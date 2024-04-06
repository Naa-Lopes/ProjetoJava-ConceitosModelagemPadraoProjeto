package Exemplos;

	//Interface para animais de estimação
	interface AnimalEstimacao {
	 String getNome();
	 String getTipo();
	}
	
		//Implementação de objeto para cães
		class Cachorro implements AnimalEstimacao {
		 private String nome;
		 private String tipo;
		
		 public Cachorro(String nome, String tipo) {
		     this.nome = nome;
		     this.tipo = tipo;
		 }
		
		 @Override
		 public String getNome() {
		     return nome;
		 }
		
		 @Override
		 public String getTipo() {
		     return tipo;
		 }
		}
		
		//Implementação de objeto para gatos
		class Gato implements AnimalEstimacao {
		 private String nome;
		 private String tipo;
		
		 public Gato(String nome, String tipo) {
		     this.nome = nome;
		     this.tipo = tipo;
		 }
		
		 @Override
		 public String getNome() {
		     return nome;
		 }
		
		 @Override
		 public String getTipo() {
		     return tipo;
		 }
		}
		
		//Classe que representa um abrigo de animais de estimação
		class AbrigoAnimais {
		 private AnimalEstimacao animal;
		
		 public AbrigoAnimais(AnimalEstimacao animal) {
		     this.animal = animal;
		 }
		
		 public String getNomeAnimal() {
		     return animal.getNome();
		 }
		
		 public String getTipoAnimal() {
		     return animal.getTipo();
		 }
		}
		
		public class Main {
		 public static void main(String[] args) {
		     // Criando objetos
		     Cachorro cachorro = new Cachorro("Rex", "Cachorro");
		     Gato gato = new Gato("Whiskers", "Gato");
		
		     // Demonstração de granularidade e especificação de implementações de objetos
		     AbrigoAnimais abrigoCachorro = new AbrigoAnimais(cachorro);
		     AbrigoAnimais abrigoGato = new AbrigoAnimais(gato);
		
		     // Demonstraçãode programação para uma interface, não para uma implementação
		     System.out.println("Nome do animal no abrigo: " + abrigoCachorro.getNomeAnimal());
		     System.out.println("Tipo do animal: " + abrigoCachorro.getTipoAnimal());
		
		     System.out.println("Nome do animal no abrigo: " + abrigoGato.getNomeAnimal());
		     System.out.println("Tipo do animal: " + abrigoGato.getTipoAnimal());
		 }
	}
