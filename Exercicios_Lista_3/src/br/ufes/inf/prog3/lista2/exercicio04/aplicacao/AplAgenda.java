package br.ufes.inf.prog3.lista2.exercicio04.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.ufes.inf.prog3.lista2.exercicio04.dominio.ContatoEmail;
import br.ufes.inf.prog3.lista2.exercicio04.dominio.ContatoTelefoneCelular;
import br.ufes.inf.prog3.lista2.exercicio04.dominio.ContatoTelefoneComercial;
import br.ufes.inf.prog3.lista2.exercicio04.dominio.ContatoTelefoneResidencial;
import br.ufes.inf.prog3.lista2.exercicio04.dominio.IContato;

/** Aplica��o da Agenda. */
public final class AplAgenda {
	private static final Scanner scanner = new Scanner(System.in);
	/** Onde s�o mantidos os contatos. */
	private static List contatos = new ArrayList();

	/** Adiciona um contato. */
	private static void adicionarContato(IContato contato) {
		contatos.add(contato);
	}

	/** Obt�m um contato, dado o �ndice. */
	private static IContato obterContato(int indice) {
		if (indice < contatos.size())
			return (IContato) contatos.get(indice);
		else
			return null;
	}

	/** Imprime todos os contatos e seus �ndices. */
	private static void imprimirContatos() {
		if (contatos.size() == 0)
			System.out.println("\tAgenda vazia.");
		else
			for (int i = 0; i < contatos.size(); i++) {
				IContato contato = (IContato) contatos.get(i);
				System.out.println("\t" + i + ": " + contato.getNome() + " (" + contato.getContato() + ")");
			}
		System.out.println();
	}

	/** L� do teclado. */
	private static String lerTeclado() {
		return scanner.nextLine();
	}

	/** M�todo main. */
	public static void main(String[] args) {
		System.out.println("Bem-vindo � Agenda.\n");
		System.out.println("Digite o comando. '?' para ajuda e 'S' para sair.");
		System.out.print("\n> ");
		// L� o comando.
		String comando = lerTeclado();
		// Continua pedindo comandos at� encontrar o comando S, de sair.
		while (!"S".equalsIgnoreCase(comando)) {
			// Comando ?: ajuda.
			if ("?".equals(comando)) {
				System.out.println("\nCOMANDOS DISPON�VEIS:\n" + " ?: Mostra esta lista de comandos;\n\n"
						+ " A: Mostra a agenda;\n" + " C: Mostra um contato da agenda;\n" + " S: Sai do programa;\n\n"
						+ "+T: Adiciona um telefone;\n");
			}
			// Comando A: mostrar agenda.
			else if ("A".equalsIgnoreCase(comando)) {
				System.out.println("\nAGENDA:");
				imprimirContatos();
			}
			// Comando C: mostrar contato.
			else if ("C".equalsIgnoreCase(comando)) {
				executarMostrarContato();
			}
			// Comando +T: adicionar telefone.
			else if ("+T".equalsIgnoreCase(comando)) {
				executarAdicionarTelefone();
			}
			// L� o pr�ximo comando.
			System.out.print("\n> ");
			comando = lerTeclado();
		}
	}

	/** Comando C: mostrar contato. */
	public static void executarMostrarContato() {
		// L� o �ndice.
		System.out.print("\nN�mero: ");
		String indice = lerTeclado();
		// Verifica se � um n�mero.
		if (indice.matches("[0-9]+")) {
			// Converte para inteiro.
			int i = Integer.parseInt(indice);
			// Verifica se o �ndice existe.
			if (i < contatos.size()) {
				// Imprime o contato.
				IContato contato = (IContato) contatos.get(i);
				System.out.println(
						"\nNome: " + contato.getNome() + "\n" + contato.getTipo() + ": " + contato.getContato());
			}
			// N�o existe.
			else
				System.out.println("Agenda n�o cont�m item de n�mero " + i);
		}
		// N�o � n�mero.
		else
			System.out.println("N�o � um n�mero.");
	}

	/** Comando +T: adicionar telefone. */
public static void executarAdicionarTelefone() {
	// Criar a implementa��o para adicionar telefone
	
	System.out.println("Informe o tipo de contato desejado");
	System.out.println("1 - Telefone Celular");
	System.out.println("2 - Telefone Comercial");
	System.out.println("3 - Telefone Residencial");
	System.out.println("4 - E-mail");
	System.out.println("0 - Sair");
	
	String opcao = lerTeclado();
	
	// enquanto a op��o digitada n�o for um n�mero, pede para digita a op��o novamente.
	while (!opcao.matches("[0-9]+")) {
		
		System.err.println("Op��o inv�lida!");
		System.err.println("Digite novamente.");
		opcao = lerTeclado();
	}
	
	int opcaoSelecionada = Integer.parseInt(opcao);

	switch (opcaoSelecionada){
		
		case 1 :
			ContatoTelefoneCelular celular = new ContatoTelefoneCelular();
			System.out.println("Digite o nome do contato: ");
			celular.setNome(lerTeclado());
			System.out.println("Digite o n�mero de telefone:");
			celular.setContato(lerTeclado());
			adicionarContato(celular);
			break;
			
		case 2 :
			ContatoTelefoneComercial comercial = new ContatoTelefoneComercial();
			System.out.println("Digite o nome do contato: ");
			comercial.setNome(lerTeclado());
			System.out.println("Digite o n�mero de telefone:");
			comercial.setContato(lerTeclado());
			adicionarContato(comercial);
			break;
			
		case 3 :
			ContatoTelefoneResidencial residencial = new ContatoTelefoneResidencial();
			System.out.println("Digite o nome do contato: ");
			residencial.setNome(lerTeclado());
			System.out.println("Digite o n�mero de telefone:");
			residencial.setContato(lerTeclado());
			adicionarContato(residencial);
			break;
			
		case 4 :
			ContatoEmail email = new ContatoEmail();
			System.out.println("Digite o nome do contato: ");
			email.setNome(lerTeclado());
			System.out.println("Digite endere�o de e-mail:");
			email.setContato(lerTeclado());
			adicionarContato(email);
			break;
		
		case 0 :
			//main(null);
			return;
	}
	}
}