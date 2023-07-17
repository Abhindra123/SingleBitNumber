import java.util.Scanner;

public class SingleBitNumber {
    public static boolean checkOnes(int num,int i){
        if ((num&(1<<i))==0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int count=0;
        int num=sc.nextInt();
        for(int i=0;i<32;i++){
            boolean flag=checkOnes(num,i);
            if(flag){
                count=count+1;
            }

        }
        System.out.println("the total 1's present in it are : "+count);
    }
}