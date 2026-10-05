
import java.util.Scanner;
public class Maior {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String idadetexto= sc.nextLine();
       int idade = Integer.parseInt(idadetexto);
       if (idade >= 18){
        System.err.println("Maior de idade");
       }
       else{
        System.out.println("Menor de idade"); 
       }

    }
}