import java.util.Scanner;

class Primenumber{
    public void claculate(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=scan.nextInt();
        
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.println("Not a prime number.");
                break;
            }
        }

    }
    
}