import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter all 7 letters:");
        String str = input.nextLine();
        System.out.println("Enter the required letter");
        char c = input.next().charAt(0);
        ArrayList<String> words = SpellingSolver.compWord(str,c);

        for(int i = 0; i<words.size(); i++){
            System.out.print(words.get(i) +", ");
            if(i % 35 == 0 && i != 0){
                System.out.println();
            }
        }

        ArrayList<String> pans = SpellingSolver.getPangrams(str,c);

        System.out.println("\n\n"+ pans);
    }
}
