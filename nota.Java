
import java.util.Scanner;
public class nota {
    public static void  main(String[] args){
    Scanner input = new Scanner(System.in);
    double nota = input.nextDouble();
    if (nota < 4.0){
        System.out.println("II");
    }
    else if (nota >4.0 && nota <7.0){
        System.out.println("IM");
    }
    else if (nota >7.0 && nota <9.0){
        System.out.println("MS");
    }
    else if (nota == 10){
        System.out.println("SS");
    }
    }
}