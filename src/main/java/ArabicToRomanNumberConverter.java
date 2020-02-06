import javafx.util.Pair;

import java.util.ArrayList;

public class ArabicToRomanNumberConverter {

    public String convert(int arabicNumber) {
        boolean noNumber = arabicNumber == 0;
        if (noNumber)
            return getDefaultRomanNumber();
        return getRepeatingRomanNumber(arabicNumber);
    }

    private String getRepeatingRomanNumber(int arabicNumber) {
        String romanNumber = "";

        Pair<Integer, String> one = new Pair<>(1, "I");
        Pair<Integer, String> five = new Pair<>(5, "V");

        ArrayList<Pair<Integer, String>> list = new ArrayList<>();
        list.add(five);
        list.add(one);

        for (Pair<Integer, String> digit : list){
            while (arabicNumber >= digit.getKey()) {
                romanNumber += digit.getValue();
                arabicNumber -= digit.getKey();
            }
        }
        return romanNumber;
    }

    private String getDefaultRomanNumber() {
        return "";
    }

}
