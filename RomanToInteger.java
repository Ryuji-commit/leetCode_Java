class RomanToInteger {
    public int romanToInt(String s) {
        String[] elmOfS = s.split("");
        int result = 0;

        for (int i = 0; i < elmOfS.length; i++) {
            RomanNumerals cur = RomanNumerals.valueOf(elmOfS[i]);
            if (i == elmOfS.length - 1) {
                result += cur.getValue();
                break;
            }

            RomanNumerals next = RomanNumerals.valueOf(elmOfS[i + 1]);
            if (cur.compareTo(next) < 0) {
                i++;
                result += (next.getValue() - cur.getValue());
                continue;
            }

            if (cur.compareTo(next) >= 0) {
                result += cur.getValue();
                continue;
            }
        }

        return result;
    }
}

enum RomanNumerals {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private int value;

    private RomanNumerals(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public int compare(RomanNumerals other) {
        if (this.value == other.getValue()) {
            return 0;
        }

        if (this.value > other.getValue()) {
            return 1;
        }

        return -1;
    }
}
