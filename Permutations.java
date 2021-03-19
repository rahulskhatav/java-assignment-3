import java.util.Scanner;

public class Permutations{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] done = new int[str.length()];
        PermutationsUtil(str, "", done);
        sc.close();
    }
    public static void PermutationsUtil(String str, String temp, int[] done){
        if( temp.length() == str.length()){
            System.out.println(temp);
            return;
        }
        for( int j = 0; j < str.length(); j++ ){
            if(done[j] == 0){
                done[j] = 1;
                PermutationsUtil(str, temp+str.charAt(j), done);
                done[j] = 0;
            }
        }
    }
}