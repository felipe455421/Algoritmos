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
	txt[i] = "Saldo no inicio da opera��o: R$ ";
	while (sair == 0 ){

	if (saldo < 0){
		
		sair = 1;
		JOptionPane.showMessageDialog(null, "Ligue urgente para ag�ncia banc�ria!");
	}else{
		usrPedido = Integer.parseInt(JOptionPane.showInputDialog("Saque efetuado lhe rest� R$ " + saldo + " Digite a op��o desejada :" +
		"\n" + "0 - Sair" + "\n" + "1 - Saque" + "\n" + "2 - Dep�sito" + "\n" + "3 - Saldo Atual"
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
	
		JOptionPane.showMessageDialog(null, "O seu saldo atual �: R$ "+ saldo);
	
	
		}
		
		if (usrPedido == 4){
			
			for(double x : num){
				for(String z : txt){
				
				if(x != 0.0 && z != null)
					
				System.out.println(z + x);
			}
			}
			System.out.println("O seu saldo atual �: R$ " + saldo);
			
		}

		if (usrPedido == 0){
			sair = 1;
			
		}
		
}

	}
	JOptionPane.showMessageDialog(null, "Voc� possui: R$ " + saldo + "\n"+"Tenha um bom dia Sr(a) " + nome);

}
}
/*34.	Criar uma classe de nome ContaCorrente, no qual perguntar� o nome do dono da conta,
e o saldo inicial da conta. Esses valores devem ser armazenados. 

a.	Perguntar para o usu�rio o valor a ser sacado �Digite o valor a ser sacado�, efetue o saque 
e imprima o saldo novamente.

b.	Ap�s o usu�rio informar o nome e o saldo do usu�rio, informar o seguinte menu para o usu�rio:

	------------------------------------------
	Digite a op��o desejada:
	0 - Sair
	1 - Saque
	------------------------------------------
	Se o usu�rio digitar 1, o algoritmo deve efetuar o saque, conforme foi efetuado no exerc�cio
	 40. a. Ap�s ele digitar o saque deve sair do sistema. Caso o usu�rio digite 0, deve sair do
	  sistema. Retirar a impress�o do saldo.

c.	Incluir a op��o 2 de dep�sito, se digitar esta op��o dever� ser perguntado �Digite o valor a ser
 depositado�. Efetue o dep�sito.
 
d.	Incluir a op��o 3 para imprimir saldo atual. Se digitar esta op��o dever� exibir o saldo 
atual da conta.

e.	Ap�s efetuar a a��o da op��o selecionada pelo usu�rio (1,2,3) pedir para o usu�rio digitar
 novamente a op��o desejada. Enquanto o usu�rio n�o digitar a op��o 0, deve continuar a perguntar
  a nova op��o desejada para o usu�rio.
  
f.	Ao imprimir o saldo deve verificar se o saldo do usu�rio � negativo, caso sim, imprima a 
mensagem �Ligue urgente para ag�ncia banc�ria!�.

g.	Incluir a op��o 4 de extrato, no qual dever� imprimir o saldo inicial, todo o hist�rico de opera��es banc�rias efetuadas e o saldo inicial, conforme o modelo abaixo:
	Saldo inicial: R$ 1000
	
-	R$ 500
+	R$ 50
-	R$ 450
+	R$ 45
+	1000
			Saldo atual: R$ 1145
		Necessitar� guardar o valor do saldo inicial, e o hist�ricos das opera��es de saque e dep�sito. Estas opera��es devem ser armazenadas em um array do tipo double, no qual ser� impressa quando selecionado a op��o 4 de extrato.

h.	Criar duas op��es 5 para valores depositados e 6 para valores sacados.
 Na op��o 5 dever� exibir todos os valores depositados na conta at� o momento e imprimir o
  valor totalizado destes dep�sitos. Na op��o 6 dever� exibir todos os valores sacados da conta 
  at� o momento e imprimir o valor totalizados destes saques.
  
i.	Verificar se o usu�rio digitou a op��o correta no programa, caso n�o digitou avise ele 
que n�o digitou a op��o correta e pe�a para o usu�rio digitar novamente a op��o.

j.	Criar uma op��o 7 para simula��o de empr�stimo, no qual pedir� para o usu�rio o 
valor a ser emprestado e o meses. Dever� ser impresso o valor total a ser pago no empr�stimo e o 
valor da parcela do empr�stimo. Os valores dos juros do empr�stimo devem seguir as seguintes regras:

i.	R$ 0 at� 1000
	1.	At� 48 meses 1% ao m�s
	2.	Mais 48 meses 1,5% ao m�s
ii.	R$ 1001 at� 50000
	1.	At� 48 meses 3% ao m�s
	2.	Maior 48 meses 5,05%
iii.	Maior R$ 50000
	1.	7% independente dos meses*/
