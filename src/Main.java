import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        String str = "bcejdot";
        char c = 't';
        ArrayList<String> words = SpellingSolver.compWord(str,c);
        System.out.println(words);

        ArrayList<String> pans = SpellingSolver.getPangrams(str,c);
        System.out.println(pans);
    }
}
