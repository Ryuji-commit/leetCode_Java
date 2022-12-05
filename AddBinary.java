public class AddBinary {
    public String addBinary(String a, String b) {
        char[] charArrOfA = a.toCharArray();
        char[] charArrOfB = b.toCharArray();

        int maxLength = charArrOfA.length >= charArrOfB.length ? charArrOfA.length : charArrOfB.length;
        char[] result = new char[maxLength + 1];

        int appender = 0;
        for (int i = 1; i <= maxLength; i++) {

            int aval = charArrOfA.length >= i ? Character.digit(charArrOfA[charArrOfA.length - i], 10) : 0;
            int bval = charArrOfB.length >= i ? Character.digit(charArrOfB[charArrOfB.length - i], 10) : 0;
            int sumval = aval + bval + appender;

            if (sumval < 2) {
                result[maxLength - i + 1] = Character.forDigit(sumval, 10);
                appender = 0;
            } else {
                result[maxLength - i + 1] = Character.forDigit(sumval - 2, 10);
                appender = 1;
            }

        }

        if (appender == 1) {
            result[0] = '1';
            return String.valueOf(result);
        }

        return String.valueOf(result, 1, maxLength);
    }
}
