package oothinking.part6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Ex {
    public static void main(String[] args) {
        //divideOn2Or3();
        //moreThenLongMaxValue();
        //isPrimeMoreThenLongMax();
        //System.out.println(isPrime(BigInteger.valueOf(4)));
        mersenne();
    }

    public static void divideOn2Or3() {
        int count = 10;
        for (int i = 0; true; i++) {
            BigDecimal bd = new BigDecimal(i);

            BigDecimal reminder2 = bd.remainder(new BigDecimal(2));
            BigDecimal reminder3 = bd.remainder(new BigDecimal(3));

            if (reminder2 == BigDecimal.ZERO || reminder3 == BigDecimal.ZERO) {
                BigDecimal result = bd.setScale(50, RoundingMode.UP);
                System.out.println(result);
                count--;
            }
            if (count == 0) break;
        }
    }

    public static void moreThenLongMaxValue() {
        int count = 10;
        for (long i = 0; true; i++) {
            BigDecimal bd = new BigDecimal(i);
            BigDecimal result = bd.pow(2);
            if(result.compareTo(BigDecimal.valueOf(Long.MAX_VALUE)) == 1){
                System.out.println(result);
                count--;
            }
            if (count == 0) break;
        }
    }

    public static void isPrimeMoreThenLongMax() {
        int count = 5;
        BigDecimal maxLong = BigDecimal.valueOf(Long.MAX_VALUE);

        for (BigDecimal i = maxLong; true; i=i.add(BigDecimal.ONE)) {

            for (BigDecimal j = maxLong; j.compareTo(i) == -1; j=j.add(BigDecimal.ONE)) {
                BigDecimal rem = i.remainder(j);
                if(rem.compareTo(BigDecimal.ZERO)  == 0){
                    System.out.println(i);
                    count--;
                }
            }
            if (count == 0) break;
        }
    }

    public static boolean isPrime(BigInteger number) {
        // Corner case
        if (number.compareTo(BigInteger.ONE) == -1)
            return false;

        // Check from 2 to n-1
        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(number) == -1; i=i.add(BigInteger.ONE))
            if (number.remainder(i) == BigInteger.ZERO)
                return false;

        return true;
    }

    public static void mersenne() {
        System.out.println("p\t   2^p - 1");
        System.out.println("-------------");
        for (int p = 19; p < 100; p++) {
            if(isPrime(BigInteger.valueOf(p))){
                BigInteger twoToThePowerOfP = BigInteger.valueOf(2).pow(p);//(Math.pow(2, p)) - 1;
                BigInteger mersenneNumber =twoToThePowerOfP.subtract(BigInteger.ONE);
                if (isPrime(mersenneNumber)) {
                    System.out.print(p + "\t   " + mersenneNumber + "\n");
                }
            }
        }
    }


}
