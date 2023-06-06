
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int num1;
     int num2;
     int result;
     String ope;

     Contexto conta = new Contexto();
     Scanner leitor = new Scanner(System.in);

        System.out.print("Qual a sua operação? ");
        ope = leitor.nextLine();

        System.out.print("Numero 1: ");
        num1 = leitor.nextInt();

        System.out.print("Numero 2: ");
        num2 = leitor.nextInt();

     if (ope.equals("soma")){
        conta.setConta(new ConcreteAdicao());
     } else if (ope.equals("sub")){
         conta.setConta(new ConcreteSubtracao());
     } else if (ope.equals("mult")) {
         conta.setConta(new ConcreteMultiplicacao());
     }


        result= conta.fazerStrategy(num1,num2);
        System.out.println(result);

    }
}
