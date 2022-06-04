import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    String[][] lista = {
      {"O mais correto antes de realizar commit no git, é de trazer a versão mais nova?",
       "verdadeiro",
       "-",}, 
      {"O comando EXTEND é usado na herança de características?",
       "falso", 
       "-"}, 
      {"Atributo especifica uma classe?",
       "verdadeiro",
       "-",}, 
      {"O JDK é para executar uma aplicação JAVA?",
       "falso", 
       "-"}, 
       };

  try (Scanner scanner = new Scanner(System.in)){;
  int acertos = 0;
  
  String nomeUsuario;
  System.out.println("Entre com  seu nome: ");
  nomeUsuario = scanner.nextLine();
  
    
  for(int fileira=0; fileira<lista.length; fileira++){

         System.out.println(lista[fileira][0]);
         System.out.println("Porfavor, "+nomeUsuario+" entre com verdadeiro ou falso");
         String respostaUsuario = scanner.nextLine();

         lista[fileira][2] = respostaUsuario;
    
        if(respostaUsuario.equals(lista[fileira][1])){
          acertos++;
        }
 
         System.out.println("\n ------------");
  }

      
  System.out.println("Parabéns, "+nomeUsuario+"!!! Você acertou: "+acertos+ "perguntas"); 
    int totalErros = lista.length - acertos;
  System.out.println("Você errou: "+ totalErros);  


  
  }

  }


}