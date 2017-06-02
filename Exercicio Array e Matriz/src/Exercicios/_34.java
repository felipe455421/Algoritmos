package Exercicios;

import javax.swing.JOptionPane;

public class _34 {
public static void main(String[] args) {
	
	String nome;
	double saldo;
	Double saque;
	int usrPedido;
	int sair = 0;
	double deposito;
	int i = 0;
	double num[] = new double[10];
	String txt[] = new String[10];
	
	
	
	nome = JOptionPane.showInputDialog("Digite o nome do titular da conta");
	saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo atual sem centavos"));
	num[i] = saldo;
	txt[i] = "Saldo no inicio da operação: R$ ";
	while (sair == 0 ){

	if (saldo < 0){
		
		sair = 1;
		JOptionPane.showMessageDialog(null, "Ligue urgente para agência bancária!");
	}else{
		usrPedido = Integer.parseInt(JOptionPane.showInputDialog("Saque efetuado lhe restá R$ " + saldo + " Digite a opção desejada :" +
		"\n" + "0 - Sair" + "\n" + "1 - Saque" + "\n" + "2 - Depósito" + "\n" + "3 - Saldo Atual"
		+ "\n" + "4 - Extrato "));
		i++;
		
/* A - */if (usrPedido == 1){
		
		saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser sacado"));
		saldo = saldo - saque;
		num[i] = saque;
		txt[i] = "-";
		}
		
/* C - */if (usrPedido == 2){
			deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado"));
			saldo += deposito;
			num[i] = deposito;
			txt[i] = "+";
			
		}

/* D - */if (usrPedido == 3){
	
		JOptionPane.showMessageDialog(null, "O seu saldo atual é: R$ "+ saldo);
	
	
		}
		
		if (usrPedido == 4){
			
			for(double x : num){
				for(String z : txt){
				
				if(x != 0.0 && z != null)
					
				System.out.println(z + x);
			}
			}
			System.out.println("O seu saldo atual é: R$ " + saldo);
			
		}

		if (usrPedido == 0){
			sair = 1;
			
		}
		
}

	}
	JOptionPane.showMessageDialog(null, "Você possui: R$ " + saldo + "\n"+"Tenha um bom dia Sr(a) " + nome);

}
}
/*34.	Criar uma classe de nome ContaCorrente, no qual perguntará o nome do dono da conta,
e o saldo inicial da conta. Esses valores devem ser armazenados. 

a.	Perguntar para o usuário o valor a ser sacado “Digite o valor a ser sacado”, efetue o saque 
e imprima o saldo novamente.

b.	Após o usuário informar o nome e o saldo do usuário, informar o seguinte menu para o usuário:

	------------------------------------------
	Digite a opção desejada:
	0 - Sair
	1 - Saque
	------------------------------------------
	Se o usuário digitar 1, o algoritmo deve efetuar o saque, conforme foi efetuado no exercício
	 40. a. Após ele digitar o saque deve sair do sistema. Caso o usuário digite 0, deve sair do
	  sistema. Retirar a impressão do saldo.

c.	Incluir a opção 2 de depósito, se digitar esta opção deverá ser perguntado “Digite o valor a ser
 depositado”. Efetue o depósito.
 
d.	Incluir a opção 3 para imprimir saldo atual. Se digitar esta opção deverá exibir o saldo 
atual da conta.

e.	Após efetuar a ação da opção selecionada pelo usuário (1,2,3) pedir para o usuário digitar
 novamente a opção desejada. Enquanto o usuário não digitar a opção 0, deve continuar a perguntar
  a nova opção desejada para o usuário.
  
f.	Ao imprimir o saldo deve verificar se o saldo do usuário é negativo, caso sim, imprima a 
mensagem “Ligue urgente para agência bancária!”.

g.	Incluir a opção 4 de extrato, no qual deverá imprimir o saldo inicial, todo o histórico de operações bancárias efetuadas e o saldo inicial, conforme o modelo abaixo:
	Saldo inicial: R$ 1000
	
-	R$ 500
+	R$ 50
-	R$ 450
+	R$ 45
+	1000
			Saldo atual: R$ 1145
		Necessitará guardar o valor do saldo inicial, e o históricos das operações de saque e depósito. Estas operações devem ser armazenadas em um array do tipo double, no qual será impressa quando selecionado a opção 4 de extrato.

h.	Criar duas opções 5 para valores depositados e 6 para valores sacados.
 Na opção 5 deverá exibir todos os valores depositados na conta até o momento e imprimir o
  valor totalizado destes depósitos. Na opção 6 deverá exibir todos os valores sacados da conta 
  até o momento e imprimir o valor totalizados destes saques.
  
i.	Verificar se o usuário digitou a opção correta no programa, caso não digitou avise ele 
que não digitou a opção correta e peça para o usuário digitar novamente a opção.

j.	Criar uma opção 7 para simulação de empréstimo, no qual pedirá para o usuário o 
valor a ser emprestado e o meses. Deverá ser impresso o valor total a ser pago no empréstimo e o 
valor da parcela do empréstimo. Os valores dos juros do empréstimo devem seguir as seguintes regras:

i.	R$ 0 até 1000
	1.	Até 48 meses 1% ao mês
	2.	Mais 48 meses 1,5% ao mês
ii.	R$ 1001 até 50000
	1.	Até 48 meses 3% ao mês
	2.	Maior 48 meses 5,05%
iii.	Maior R$ 50000
	1.	7% independente dos meses*/
