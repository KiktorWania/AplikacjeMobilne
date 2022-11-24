import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(possibleTriangle(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat()));
    }

    static boolean possibleTriangle(float a, float b, float c){
        float arr[] = {a,b,c};
        Arrays.sort(arr);

        if(arr[0] + arr[1] > arr[2]){
            return true;
        }else{
            return false;
        }
    }
}