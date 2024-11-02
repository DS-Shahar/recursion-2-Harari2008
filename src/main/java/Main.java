public class Program {
    public static void main(String[] args) {
        int[] numbers = {6, 8, 12, 34};
        System.out.println(isAllPrime(numbers, numbers.length - 1));
    }

    public static int sumArray(int[] numbers, int idx) {
        if (idx == 0) {
            return numbers[0];
        }
        return numbers[idx] + sumArray(numbers, idx - 1);
    }

    public static int sumPositives(int[] numbers, int idx) {
        if (idx == 0) {
            return numbers[0];
        }
        if (numbers[idx] > 0) {
            return numbers[idx] + sumPositives(numbers, idx - 1);
        }
        return sumPositives(numbers, idx - 1);
    }

    public static int findIndex(int[] numbers, int target, int idx) {
        if (idx == 0) {
            return -1;
        }
        if (numbers[idx] == target) {
            return idx;
        }
        return findIndex(numbers, target, idx - 1);
    }

    public static boolean isSorted(int[] numbers, int idx) {
        if (idx == 0) {
            return true;
        }
        if (numbers[idx] <= numbers[idx - 1]) {
            return false;
        }
        return isSorted(numbers, idx - 1);
    }

    public static boolean isAllPrime(int[] numbers, int idx) {
        if (idx == 0) {
            return true;
        }
        if (!isPrime(numbers[idx], 2)) {
            return false;
        }
        return isAllPrime(numbers, idx - 1);
    }

    public static boolean isPrime(int num, int divisor) {
        if (divisor > (num / 2) + 1) {
            return true;
        }
        if (num % divisor == 0) {
            return false;
        }
        return isPrime(num, divisor + 1);
    }
}
