import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class WordFinder {
    public static void main(String[] args) {
        String filename = "words.txt"; // Replace with your input file name

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            HashSet<String> words = new HashSet<>();

            while ((line = br.readLine()) != null) {
                line = line.trim();
                line = line.toUpperCase();

                if (line.length() == 10 && !hasDuplicatesOrHyphen(line)) {
                    words.add(line);
                }
            }

            for (String word : words) {
                System.out.println(word);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean hasDuplicatesOrHyphen(String word) {
        HashSet<Character> characters = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            char d = '-';

            if (characters.contains(c)) {
                return true; // Duplicate character found
            }
            if (characters.contains(d)) {
                return true; // - found
            }

            characters.add(c);
        }

        return false; // No duplicates found
    }
}

