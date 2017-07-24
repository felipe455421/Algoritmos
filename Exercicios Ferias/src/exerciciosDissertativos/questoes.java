package exerciciosDissertativos;

public class questoes {

	
/*1)	Qual é a diferença entre Classe e Objeto, atributo e característica, método e ação?
*/
	
/*R:	Classe é o conjunto de atributos e metodos que serão utilizados no nosso programa, os objetos são entidades
 * de um dominio para fazer consulta ou alterações nos atribudos do mesmo, um atributo é uma variavel que pertence
 * a um objeto, característica são as variaveis utilizadas de um dominio, metodos são as ações que os objetos podem
 * realizar quando solicitados, 
 *  */ 

/*2)	O que é Date e Calendar? Para que serve? Como é utilizada? 
	E SimpleDateFormat? Para que serve? Para que é utilizada?
*/

/*R:	A date representa o tempo, um tempo é composto por ano, mês, dia atual, minuto atual, já a Calendar
 * representa todos os campos de calendário necessários para implementar a formatação de data e hora, para uma 
 * determinada língua e estilo de calendário. Por exemplo, japonês, americano, italiano, brasileiro entre outros,
 * na maior parte utilizamos essas classes para marcar dia/mes/ano até mesmo horario, para a utilização correta
 * ambas devem ser instanciadas e formatadas, Essa classe permite converter informações do tipo String para data 
 * do tipo Date, permitindo seguir um formato, utilizamos para formatar corretamente um dado de algum atributo
 * como "12/05/1996".
 * */

/*3)	O que é Encapsulamento e quais são os seus tipos? Descreve cada um de seus tipos, onde podem ser 
	utilizados e para em quais situações cada um é utilizado.
	*/
	
/*R:	Encapsulamento vem de encapsular, que em programação orientada a objetos significa separar o programa
 *	em partes, o mais isolado possível, public, private, protected ou Package-Private (padrão), public é o 
 *	nivel de acesso que permite que o usuario o utilize em qualquer parte do programa, private define que a única 
 *	classe que tem acesso ao atributo é a própria classe que o define,  ele é praticamente igual ao default,
 * com a diferença de que o acesso é por pacote e por herança, eles geralmente são utilizados nos atributos e 
 * nos metodos criados em uma classe, geralmente utilizamos private em atributos para proteção dos dados e utilizamos
 * public em metodos setters and getters e outros metodos de alteração.
 * */	
	
/*4) O que são classes Wrappers e para que servem? */
	
/*R: Os Wrapper são conhecidos na linguagem Java como classes especiais que possuem métodos capazes de fazer
 *  conversões em variáveis primitivas e também de encapsular tipos primitivos para serem trabalhados como objetos.
*/

/*5) O que são classes ArrayList e para que servem? Crie exemplos de utilização.
*/	
/*R:	ArrayList é uma classe para coleções, com arrays podemos agrupar varios dados declarando apenas uma variavel
 * assim utilizando menos memoria do sistema,
 * */
	
/*6) Conceitualmente o que é Herança em Java? Explique para o que deveria ser utilizado.
 * */
/*R: Herança é um metodo que utilizamos em java para "doar" codigos usados em outras classes, como por exemplo 
 * num banco existem gerentes e funcionarios, um gerente herda os dados da classe funcionario, dizemos que
 * um gerente É UM funcionario.
 * */	
	
	/*a) Crie as classes Aluno, Professor e Pessoa, e altere elas para que
	 *  utilize o conceito de herança, onde Aluno e Professor herdam Pessoa.*/
	
/*7) O que é a classe NumberFormat e DecimalFormat e para que ser? 
 * */
/*R: NumberFormat e DecimalFormat são classes usadas para formatar numeros da maneira que você quiser. 
 * */	
	
/*8) O que é Enumeração em Java? Explique para que é utilizado, crie uma classe com um exemplo de enumeração.
 * */
/*R: São tipos de campos que consistem em um conjunto fixo de constantes,
 *  sendo como uma lista de valores pré-definidos
 * */
	
	
	
	
	
	
	
	
	
	
	
	
	
}
