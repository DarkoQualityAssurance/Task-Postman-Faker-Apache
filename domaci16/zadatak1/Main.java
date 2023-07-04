package zadatak1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntUnaryOperator;

/*
1.	Napraviti static metodu u main koje rade kao sql min, max, sum, avg i distinct u SQLu koristeci ArrayList<Integer>.
Ne morate praviti drugu klasu sem main, a metode prihvataju ArrayList<Integer> kao parametar.
Distinct vraća novi ArrayList<Integer> dok ostale metode imaju povratne tipove tipa int (za min, max i sum) i double (za avg)
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> toDistinct = new ArrayList<>();
        array.add(5);
        array.add(7);
        array.add(12);
        array.add(1);
        array.add(61);
        array.add(7);
        array.add(12);
        int minResult = min(array);
        int maxResult = max(array);
        int sumResult = sum(array);
        double avgResult = avg(array);
        ArrayList<Integer> disResult = dinstinct(array,toDistinct);
        System.out.println("The minimal number in array : " + array + " is : " + minResult + "\n and maximum number in a same array is :  " + maxResult + " \n,also a result of count all numbers in same array is :  " + sumResult + "\n and average number is : " + avgResult);
        System.out.println("The unique numbers from array " + array + " are : " + disResult);

    }

    public static int min(ArrayList<Integer> array) {
        int minBroj = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < minBroj) {
                minBroj = array.get(i);
            }

        }
        return minBroj;
    }
    public static int max(ArrayList<Integer> array){
        int maxBroj = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > maxBroj) {
                maxBroj = array.get(i);
            }

        }
        return maxBroj;
    }

    public static int sum(ArrayList<Integer> array){
        int sumBroj = 0;
        for (int i = 0; i < array.size(); i++) {
                sumBroj += array.get(i);
        }
        return sumBroj;
    }
    public static double avg(ArrayList<Integer> array){
        int sumBroj = 0;
        for (int i = 0; i < array.size(); i++) {
            sumBroj += array.get(i);
        }
        return (double) sumBroj/array.size();
    }
    public static ArrayList<Integer> dinstinct(ArrayList<Integer> array, ArrayList<Integer> toDistinct){

        for (int i = 0; i < array.size(); i++) {
            if (!toDistinct.contains(array.get(i))){
                toDistinct.add(array.get(i));
            }
        }
        return toDistinct ;

    }

    }




