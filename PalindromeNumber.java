class PalindromeNumber {
    public boolean isPalindrome(int x) {
        char[] elementsOfX = String.valueOf(x).toCharArray();

        for (int i = 0; i < elementsOfX.length; i++) {
            int indexOfPairElm = elementsOfX.length - 1 - i;

            if (i == indexOfPairElm) {
                return true;
            }

            if (elementsOfX[i] != elementsOfX[indexOfPairElm]) {
                return false;
            }
        }

        return true;
    }
}
