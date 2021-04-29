package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    public int addDigits(String digitString) {
        if (digitString == null || digitString.length() == 0) {
            return -1;
        }
        return digitString.chars()
                .filter(c -> c >= '0')
                .filter(c -> c <= '9')
                .map(c -> c-'0')
                .sum();
    }
}
