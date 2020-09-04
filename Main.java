
//Questão 1------------------------------:

/* 1) Tem como função carregar e executar os aplicativos java,convertendo os bytecodes em código executável de máquina.Através dela que  os programas escritos em  java podem funcionar em qualquer plataforma de hardware e software que possua uma versão da jvm,tornando essas aplicações indepedentes da plataforma onde funcionam.*/

//Questão 2------------------------------:

/*2) A diferença é que o JRE é o ambiente de execução do java, ou seja, para executar uma aplicação java, é necessario ter uma JRE instalada. Ja o JDK é ambiente de desenvolvimento do java, porque ele fornece todos os componentes necessarios para realizar a construção de aplicações, como por exemplo o compilador (Javac), a Java Lang (Linguagem java) e etc.*/

//Questão 3-----------------------------:

/*
class Main {
  public static void main(String[] args) {
   System.out.println("Terminei a aula de hoje com um programa Java!");
  }
}
*/

//Questão 4------------------------------:

/* O programa não compila se apagar o arquivo .class*/


//Questão 5------------------------------:

/*
class Main {
  public static void start(String[] args) {
   System.out.println("Terminei a aula de hoje com um programa Java!");
  }
}

 Se o nome do metodo main for alterado para "start", o programa não irá compilar pois o nome do metodo principal (main) deve ser igual ao da classe principal (Main).
*/


//Questão 6------------------------------:

/*
class Main {
  public static void Main(String[] args) {
   System.out.println("Leandro torce para o :");
   System.out.print("Flamengo");
  }
}
*/

//Questão 7----------------------------:

/* 
 CLASS MAIN{
   PUBLIC STATIC VOID MAIN(STRING[] ARGS){
     SYSTEM.OUT.PRINTLN("LENDRO TORCE PARA O: ");
     SYSTEM.OUT.PRINT("FLAMENGO");
   }
 }

O programa não compilou,apresentou alguns erros pois java é uma linguagem que destingue letras maiúsculas de minusculas em suas funções e métodos e também em todos os comandos.


*/

//Questão 8----------------------------:

/*O programa não compila pois o nome da classe principal (Main) tem que ser igual ao nome do arquivo a qual ela pertence.
*/

class Main {
  public static void main(String[] args) {
   System.out.println("Leandro torce para o :");
   System.out.print("Flamengo");
  }
}