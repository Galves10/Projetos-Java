import java.util.Scanner;
public class tabuada{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int y = x.nextInt();
        for (int i =1; i <= 10; i++){
            System.out.println(i +"-"+ i*y);

        }
    }
}
