import java.util.*;
public class Larofthree {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);{
        System.out.println("Enter the first number");
        int num1=scanner.nextInt();
        System.out.println("Enter the second number");
        int num2=scanner.nextInt();
        System.out.println("Enter the third number");
        int num3=scanner.nextInt();
        if(num1>num2){
            if(num1>num3){
                System.out.println("First number is the largest number");
            }else{
                System.out.println("Third number is the largest number");
            }
        }else if(num2>num1){
            if(num2>num3){
                System.out.println("Second number is the highest number");
            }else{
                System.out.println("Third number is the highest number");
            }
        }
        scanner.close(); 
        }
    }
}
