import java.util.Scanner;
public class PosNeg{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=scanner.nextInt();
     
      if(num>0)
      {
          System.out.println(num+" is positive");
      }
      else if(num<0){
          System.out.println(num+" is negative");
      }
      else{
          System.out.println(num+" is zero");
      }
    }
}
