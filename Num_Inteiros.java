import java.util.Scanner;

public class Num_Inteiros {
    
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();
        
        if(num >= 0){
            System.out.println("O número " + num + " é positivo!");
        }
            else{
                System.out.println("O número " + num + " é negativo!");
            }
         sc.close();
    }
   
}
