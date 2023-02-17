package dziedziczenie;

import dziedziczenie.potwory.Monster;
import dziedziczenie.potwory.Smok;
import dziedziczenie.potwory.Zombie;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Monster[] monsters = new Monster[5];
        monsters[0] = new Smok(20, 2000, 100);
        monsters[1] = new Zombie(3, 200, 10);
        monsters[2] = new Zombie(6, 100, 15);
        monsters[3] = new Zombie(10, 50, 20);
        monsters[4] = new Smok(25, 1000, 200);
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        
        while(!input.equals("wyjdz")){
            
            for (Monster m : monsters){
                if(input.equals(m.getName())){
                    m.info();
                }
            }
            
            input = scanner.nextLine();
        }
    }
    
}
