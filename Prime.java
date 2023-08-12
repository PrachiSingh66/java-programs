import java.util.Scanner;
public class Prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int i,count=0;
        if(num==0||num==1)
            System.out.println(num+" is not prime number.");
        else{
            for(i=2;i<=(num/2);i++){
                if(num%i==0){
                    System.out.println(num+ " is not prime number.");
                    count=1;
                    break;
                }
            }
        if(count==0){
            System.out.println(num + " is prime number.");
        }
        }

    }
}
