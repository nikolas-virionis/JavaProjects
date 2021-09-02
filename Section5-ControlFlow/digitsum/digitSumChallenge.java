package digitsum;
public class digitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(51464921));
    }

    public static int sumDigits(int number) {
        if (number < 10) return -1;
        int sum = 0;
        int maxNumber = decimalFinder(number);
        for (int i = 10; i <= maxNumber * 10; i *= 10) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int decimalFinder(int number) {
        for (int i = 10; i < number; i *= 10) {
            if (number / i > 1) {
                if (number / i < 10) return i;
                continue;
            }
        }
        return -1;
    }
}
