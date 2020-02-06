import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertingArabicNumberToRoman {

    private String convertToRoman(int arabicNumber) {
        ArabicToRomanNumberConverter converter = new ArabicToRomanNumberConverter();
        return converter.convert(arabicNumber);
    }

    @Test
    public void Convert_0_To_Empty_String(){
        String romanNumber = convertToRoman(0);
        assertEquals("", romanNumber);
    }

    @Test
    public void Convert_1_To_I(){
        String romanNumber = convertToRoman(1);
        assertEquals("I", romanNumber);
    }

    @Test
    public void Convert_2_To_II(){
        String romanNumber = convertToRoman(2);
        assertEquals("II", romanNumber);
    }

    @Test
    public void Convert_3_To_III(){
        String romanNumber = convertToRoman(3);
        assertEquals("III", romanNumber);
    }

    @Test
    public void Convert_5_To_V(){
        String romanNumber = convertToRoman(5);
        assertEquals("V", romanNumber);
    }

    @Test
    public void Convert_5_To_VI(){
        String romanNumber = convertToRoman(6);
        assertEquals("VI", romanNumber);
    }

    @Test
    public void Convert_8_To_VIII(){
        String romanNumber = convertToRoman(8);
        assertEquals("VIII", romanNumber);
    }
}
