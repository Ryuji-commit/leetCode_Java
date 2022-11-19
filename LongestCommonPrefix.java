import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, (s1, s2) -> s1.length() - s2.length());
        String minLengthStr = strs[0];
        String prefix = "";

        for (int i = minLengthStr.length(); i >= 0; i--) {
            prefix = minLengthStr.substring(0, i);


            boolean isAllStartPrefix = true;
            for (String elm : strs) {
                if (!elm.startsWith(prefix)) {
                    isAllStartPrefix = false;
                }
            }

            if (isAllStartPrefix) {
                return prefix;
            }
        }

        return "";
    }
}
