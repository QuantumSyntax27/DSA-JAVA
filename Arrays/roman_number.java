package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class roman_number{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number plz to convert to roman number:"+" ");
        int num = in.nextInt();
        int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbol ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String ans = " ";
        for(int i=0;i<value.length;i++){
            while(num >= value[i]){
                ans = ans + symbol[i];
                num= num - value[i];
            }
        }
        System.out.println("roman number:"+ans);
    }
} 