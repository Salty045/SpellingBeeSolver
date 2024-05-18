import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SpellingSolver {

    public static ArrayList<String> validWords() throws IOException {
        ArrayList<String> words = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader("words.txt"));
        while(br.readLine() != null){
            words.add(br.readLine().toLowerCase());
        }

        return words;
    }

    public static ArrayList<String> compWord(String str, char c) throws IOException {
        ArrayList<String> words = validWords();
        for(int i = words.size() - 1; i >= 0; i--){
            if(!checkChars(words.get(i), str) || words.get(i).length() <= 3 || words.get(i).indexOf(c) == -1){
                words.remove(i);
            }
        }
        return words;
    }

    public static boolean checkChars(String word, String str){
        for(char c : word.toCharArray()){
            if(str.indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }

    public static ArrayList<String> getPangrams(String str, char c1) throws IOException {

        ArrayList<String> words = compWord(str, c1);
        ArrayList<String> pangrams = new ArrayList<>();

        for(String word : words){
            if(isPangram(word,str)){
                pangrams.add(word);
            }
        }
        return pangrams;
    }

    public static boolean isPangram(String word, String chars){
        for(char c : chars.toCharArray()){
            if(word.indexOf(c) == -1){
                return false;
            }
        }

        return true;
    }

}
