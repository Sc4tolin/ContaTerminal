import java.util.Scanner;
public class ContaTerminal {
    //Fechamento do Scanner: Finalizamos a execução do Scanner usando o método close() para liberar recursos.

    
    //Entrada de Dados: Usamos métodos nextLine() e nextInt() do Scanner para ler as entradas do usuário e armazená-las nas variáveis agencia, numero, nomeCliente e saldo.
   
    //TODO: conhecer e importar a classe scanner (Feito)
        // Exibir as mensagens para o nosso usuario 
        // Obter pela classe scanner os valores digitados no terminal
        // Exibir a mensagem final 


    public static void main(String[] args) {

      
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome" );
        String nome = sc.nextLine();

        System.out.println("Por favor digite o numero da conta");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor digite o numero da Agencia ");
        String agencia = sc.nextLine();

        System.out.println("Por favor digite o saldo da conta ");
        double saldo = sc.nextDouble();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em noso banco, sua agencia é " + agencia + ", conta  "+ numero+"e seu saldo"+ saldo+"já está disponivel para sacar.");



        sc.close();

        
    }





















    //public static void main(String[] args) throws Exception {

        //TODO: conhecer e importar a classe scanner (Feito)
        // Exibir as mensagens para o nosso usuario 
        // Obter pela classe scanner os valores digitados no terminal
        // Exibir a mensagem final 
        
      // public void nomeCliente () {

      // }


            
        
        
    }

