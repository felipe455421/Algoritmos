package exerciciosDissertativos;

public class questoes {

	
/*1)	Qual � a diferen�a entre Classe e Objeto, atributo e caracter�stica, m�todo e a��o?
*/
	
/*R:	Classe � o conjunto de atributos e metodos que ser�o utilizados no nosso programa, os objetos s�o entidades
 * de um dominio para fazer consulta ou altera��es nos atribudos do mesmo, um atributo � uma variavel que pertence
 * a um objeto, caracter�stica s�o as variaveis utilizadas de um dominio, metodos s�o as a��es que os objetos podem
 * realizar quando solicitados, 
 *  */ 

/*2)	O que � Date e Calendar? Para que serve? Como � utilizada? 
	E SimpleDateFormat? Para que serve? Para que � utilizada?
*/

/*R:	A date representa o tempo, um tempo � composto por ano, m�s, dia atual, minuto atual, j� a Calendar
 * representa todos os campos de calend�rio necess�rios para implementar a formata��o de data e hora, para uma 
 * determinada l�ngua e estilo de calend�rio. Por exemplo, japon�s, americano, italiano, brasileiro entre outros,
 * na maior parte utilizamos essas classes para marcar dia/mes/ano at� mesmo horario, para a utiliza��o correta
 * ambas devem ser instanciadas e formatadas, Essa classe permite converter informa��es do tipo String para data 
 * do tipo Date, permitindo seguir um formato, utilizamos para formatar corretamente um dado de algum atributo
 * como "12/05/1996".
 * */

/*3)	O que � Encapsulamento e quais s�o os seus tipos? Descreve cada um de seus tipos, onde podem ser 
	utilizados e para em quais situa��es cada um � utilizado.
	*/
	
/*R:	Encapsulamento vem de encapsular, que em programa��o orientada a objetos significa separar o programa
 *	em partes, o mais isolado poss�vel, public, private, protected ou Package-Private (padr�o), public � o 
 *	nivel de acesso que permite que o usuario o utilize em qualquer parte do programa, private define que a �nica 
 *	classe que tem acesso ao atributo � a pr�pria classe que o define,  ele � praticamente igual ao default,
 * com a diferen�a de que o acesso � por pacote e por heran�a, eles geralmente s�o utilizados nos atributos e 
 * nos metodos criados em uma classe, geralmente utilizamos private em atributos para prote��o dos dados e utilizamos
 * public em metodos setters and getters e outros metodos de altera��o.
 * */	
	
/*4) O que s�o classes Wrappers e para que servem? */
	
/*R: Os Wrapper s�o conhecidos na linguagem Java como classes especiais que possuem m�todos capazes de fazer
 *  convers�es em vari�veis primitivas e tamb�m de encapsular tipos primitivos para serem trabalhados como objetos.
*/

/*5) O que s�o classes ArrayList e para que servem? Crie exemplos de utiliza��o.
*/	
/*R:	ArrayList � uma classe para cole��es, com arrays podemos agrupar varios dados declarando apenas uma variavel
 * assim utilizando menos memoria do sistema,
 * */
	
/*6) Conceitualmente o que � Heran�a em Java? Explique para o que deveria ser utilizado.
 * */
/*R: Heran�a � um metodo que utilizamos em java para "doar" codigos usados em outras classes, como por exemplo 
 * num banco existem gerentes e funcionarios, um gerente herda os dados da classe funcionario, dizemos que
 * um gerente � UM funcionario.
 * */	
	
	/*a) Crie as classes Aluno, Professor e Pessoa, e altere elas para que
	 *  utilize o conceito de heran�a, onde Aluno e Professor herdam Pessoa.*/
	
/*7) O que � a classe NumberFormat e DecimalFormat e para que ser? 
 * */
/*R: NumberFormat e DecimalFormat s�o classes usadas para formatar numeros da maneira que voc� quiser. 
 * */	
	
/*8) O que � Enumera��o em Java? Explique para que � utilizado, crie uma classe com um exemplo de enumera��o.
 * */
/*R: S�o tipos de campos que consistem em um conjunto fixo de constantes,
 *  sendo como uma lista de valores pr�-definidos
 * */
	
	
	
	
	
	
	
	
	
	
	
	
	
}
