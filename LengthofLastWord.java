public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String stripedS = s.strip();
        int lastSpace = stripedS.lastIndexOf(" ");
        if (lastSpace < 0) {
            return stripedS.length();
        } else {
            return stripedS.length() - lastSpace - 1;
        }
    }
}
