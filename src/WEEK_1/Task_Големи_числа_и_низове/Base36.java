package WEEK_1.Task_Големи_числа_и_низове;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Base64;

/*
 *  6. Base36
 *  Говорихме, че има различни бройни системи. Има двоична, осмична, десетична шестнадесетична… и.т.н.
 *  Една доста интересна бройна система е 36-тичната. Защо? Защото съдържа всички цифри от 0 до 9, така и всички
 *  букви от английската азбука – A до Z.
 *  Сега задачата ви е да направите програма, която показва как изглеждат числата в различните бройни системи.
 *  Затова трябва да отпечатате числото 0x7DEDEDE1 в:
 *  1. Двоичен формат (с представка 0b отпред)
 *  2. Осмичен формат (с представка 0 отпред)
 *  3. Десетичен формат
 *  4. Шестнадесетичен формат (с представка 0x и ако има букви в числото, те да са малки)
 *  5. 36-тично, като всички букви са главни.
 */
public class Base36 {
    public static void main(String[] args) {
        int userInput = 0x7DEDEDE1;

        // Two methods for Binary user input representation below
        String userInputBinary = Integer.toBinaryString(userInput);

        String userInputBinaryFirstVersion = "0b" + userInputBinary;
        System.out.println(userInputBinaryFirstVersion); // 0b1111101111011011110110111100001

        String userInputBinarySecondVersion = new StringBuilder()
                .insert(0,"0b")
                .append(userInputBinary)
                .toString();
        System.out.println(userInputBinarySecondVersion); // 0b1111101111011011110110111100001

        // Two methods for Octal user input representation below
        String userInputOcta = Integer.toOctalString(userInput);

        String userInputOctalFirstVersion = "0" + userInputOcta;
        System.out.println(userInputOctalFirstVersion); // 017573366741

        String userInputOctalSecondVersion = new StringBuilder()
                .insert(0,"0")
                .append(userInputOcta)
                .toString();
        System.out.println(userInputOctalSecondVersion); // 017573366741

        // Decimal user input representation below
        String userInputDecimal = Integer.toString(userInput, 10);
        System.out.println(userInputDecimal); // 2112744929

        // Two methods for Hexadecimal user input representation below
        String userInputHexadecimal = Integer.toHexString(userInput);

        String userInputHexadecimalFirstVersion = "0x" + userInputHexadecimal;
        System.out.println(userInputHexadecimalFirstVersion); // 0x7dedede1

        String userInputHexadecimalSecondVersion = new StringBuilder()
                .insert(0,"0x")
                .append(userInputHexadecimal)
                .toString();
        System.out.println(userInputHexadecimalSecondVersion); // 0x7dedede1

        // Base36 user input representation below
        String userInputBase36 = Integer.toString(userInput, 36).toUpperCase();
        System.out.println(userInputBase36); // YXVGF5

        base64();
    }


    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }
    public static void base64()
    {
        System.out.println("------------------");
        int numberToConvert = 0x7DEDEDE1;

        String binaryValue = Integer.toBinaryString(numberToConvert);
        String octalValue = Integer.toOctalString(numberToConvert);
        String decimalValue = Integer.toString(numberToConvert);
        String hexadecimalValue = Integer.toHexString(numberToConvert).toUpperCase();

        int base64Value = Integer.parseInt("7DEDEDE1", 36);

        System.out.println("Binary: " + binaryValue);
        System.out.println("Octal: " + octalValue);
        System.out.println("Decimal: " + decimalValue);
        System.out.println("Hexademical: " + hexadecimalValue);
        System.out.println("Base36: " + base64Value);

        System.out.println("------------------");
    }

}
