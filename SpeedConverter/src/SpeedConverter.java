public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) return -1L;
        return Math.round(kilometersPerHour/1.609);
    }

    public static void printConversion(double kilometersPerHour){
        long mph = toMilesPerHour(kilometersPerHour);
        if(mph == -1) System.out.println("Invalid Value");
        else System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
    }
    public static void main(String[] args){
        boolean result = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756,3.1757);
        System.out.println(result);
    }
}

class LeapYear {
    public static boolean isLeapYear(int year){
        if(year < 1)return false;
        if(year > 9999) return false;
        if((year%4) == 0){
            if((year%100) == 0){
                return (year % 400) == 0;
            }else
                return true;
        } else
            return false;
    }
}

class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double in1, double in2){

        int val1 = (int)(in1 * 1000);
        int val2 = (int)(in2 * 1000);
        float res1 = (float)(val1) /1000;
        float res2 = (float)(val2) /1000;

        System.out.println(in1 + " " + in2);
        System.out.println(val1 + " " + val2);
        System.out.println(res1 + " " + res2);

        return (res1 == res2);
    }
}

class EqualSumChecker {
    public static boolean hasEqualSum(int in1, int in2, int in3){
        int sum = in1 + in2;
        return sum == in3;
    }
}

class TeenNumberChecker {
    public static boolean hasTeen(int age1, int age2, int age3){
        boolean flag = false;

        flag = isTeen(age1);
        if(flag) return true;

        flag = isTeen(age2);
        if(flag) return true;

        flag = isTeen(age3);
        if(flag) return true;

        return flag;
    }
    public static boolean isTeen(int age){
        if(age >= 13 && age <=19) return true;
        return false;
    }
}