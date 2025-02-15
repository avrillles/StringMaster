import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord){
        String[] sep = sentence.split(" ");
        for (int i = 0; i < sep.length; i++) {
            if (sep[i].equals(word)) {
                sep[i] = newWord;
            }
        }
        String result = String.valueOf(sep[0]);
        for (int i = 1; i < sep.length; i++) {
            result += " " + sep[i];
        }

        return result;

    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName){
        char[] letterf = firstName.toCharArray();
        char[] letterl = lastName.toCharArray();
        letterf[0] = Character.toUpperCase(letterf[0]);
        letterl[0] = Character.toUpperCase(letterl[0]);
        for (int i = 1; i < letterf.length; i++) {
            letterf[i] = Character.toLowerCase(letterf[i]);
        }
        for (int i = 1; i < letterl.length; i++) {
            letterl[i] = Character.toLowerCase(letterl[i]);
        }
        if (lastName.equals(" ")) {
            return String.valueOf(letterf);
        }
        else {
            String result = String.valueOf(letterf) + " " + String.valueOf(letterl);
            return result;
        }
    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {
        char[] a = word.toCharArray();
        String newWord = "";
        int i = 0, j = 0;
        while (j < a.length) {
            if (a[i] == a[j])
                j++;
            else {
                newWord += a[i];
                i = j;
                j++;
            }
        }
        newWord += a[j - 1];
        return newWord;
    }
}

