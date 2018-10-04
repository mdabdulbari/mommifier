import java.util.ArrayList;
import java.util.List;

public class Mommifier {
    private final List<String> vowels;

    Mommifier() {
        vowels = new ArrayList<>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
    }

    String mommify(String input) {
        if (!(percentageOfVolwes(input) > 30)) {
            return input;
        }

        String mommifiedString = "";
        for (int i = 0; i < input.length(); i += 1) {
            Character currentCharacter = input.charAt(i);
            if (vowels.contains(currentCharacter)) {
                mommifiedString = mommifiedString + "mommy";
            } else {
                mommifiedString = mommifiedString + currentCharacter;
            }
        }

        return mommifiedString;
    }

    private int percentageOfVolwes(String givenString) {
        int numberOfVowels = 0;
        for (int i = 0; i < givenString.length(); i += 1) {
            if (vowels.contains(givenString.charAt(i))){
                numberOfVowels += 1;
            }
        }

        return numberOfVowels / givenString.length() * 100;
    }
}
