package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class LongestPrefix{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of array you want ");
        int n = in.nextInt();
        String[] strs = new String[n];
        for(int i=0;i<strs.length;i++){
            System.out.println("enter any word ");
            strs[i]=in.next();
        }
        char[][] substr = new char[strs.length][];
        for (int j=0;j<strs.length;j++){
            substr[j] = strs[j].toCharArray();
            System.out.println(Arrays.toString(substr[j]));
        }
        String element = "" ;
        for(int h=0;h<substr[0].length;h++){
            boolean same = true;
            for (int k=1;k<strs.length;k++){
                if(h>=substr[k].length || substr[0][h]!= substr[k][h] ){
                    same = false;
                    break;
                }
            }
            if(same){
                element = element + substr[0][h];
            }
            else{
                break;
            }

        }
        System.out.println("longesr prefix is as follows:");
        System.out.println(element);
   }
}