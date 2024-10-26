import static java.lang.Math.pow;

public class SimpleCalculator{
    public static void main(String[] args){
        int num1=8;
        int num2=2;
        int sum=num1+num2;
        int diff=num1-num2;
        int mul=num1*num2;
        int div=num1/num2;
        int quo=num1/num2;
        int rem=num1%num2;
        int exp=(int)pow(num1,num2);
        System.out.println("Sum is "+sum);
        System.out.println("Diff is "+diff);
        System.out.println("Product is "+mul);
        System.out.println("Division is "+div);
        System.out.println("Quotient is "+quo);
        System.out.println("Reminder is "+rem);
        System.out.println("Exponential is "+exp);
    }
}
