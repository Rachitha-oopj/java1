class Bank2{
    int getInterestRate(){
    return 0;}}    
class Canara extends Bank2{
    int getInterestRate(){
        return 5;}}
class SBI extends Bank2{
    int getInterestRate(){
        return 6;}}
class SCDCC extends Bank2{
    int getInterestRate(){
        return 8;}}
public class Bank{
    public static void main(String[] args){
        Canara Bank1=new Canara();
        SBI Bank2=new SBI();
        SCDCC Bank3=new SCDCC();
        System.out.println("Bank1: "+ Bank1.getInterestRate()+"%");
        System.out.println("Bank2: "+ Bank2.getInterestRate()+"%");
        System.out.println("Bank3: "+ Bank3.getInterestRate()+"%");
        
    }
}
