package oothinking.part5;

import java.util.Objects;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public boolean isEven(int number) {
        return (number % 2) == 0;
    }

    public boolean isOdd(int number) {
        return (number % 2) != 0;
    }

    public boolean isPrime(int number) {
        // Corner case
        if (number <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;

        return true;
    }

    public int parseInt(char[] chars) {
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            Character.getNumericValue(aChar);
        }
        return result;
    }

    public int parseInt(String str) {
       return Integer.parseInt(str);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyInteger myInteger = (MyInteger) o;
        return value == myInteger.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public static void main(String[] args) {
        MyInteger number = new MyInteger(7);
        System.out.println(number.isPrime());
    }
}
