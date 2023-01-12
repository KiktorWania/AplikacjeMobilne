import java.util.Scanner;

public class Tablica {
    private int[] arr ;
    private Scanner scanner;
    public Tablica(){
        scanner = new Scanner(System.in);
        System.out.print("Podaj długość tablicy: ");
        arr = new int[scanner.nextInt()];
    }

    public void set(){
        int index, value;

        System.out.print("Dodaj do tablicy: Podaj index i wartosc: ");
        index = scanner.nextInt();
        value = scanner.nextInt();
        while(index < 0 || index > arr.length){
            System.out.println("Podaj poprawny index");
            index = scanner.nextInt();
        }

        arr[index] = value;
    }

    public void get(){
        System.out.print("Zwrot z tablicy: Podaj index: ");
        int index = scanner.nextInt();
        while(index < 0 || index > arr.length) {
            System.out.println("Podaj poprawny index:");
            index = scanner.nextInt();
        }
        System.out.println("Wartosc pod indexem: " + index + " = " + arr[index]);
    }

    public void print(){
        System.out.print("Array: ");
        for(int x : arr){
            System.out.print(x + ", ");
        }
    }

    //gettery i settery aka. akcesory

    public int[] getArr() {
        return arr;
    }
    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
