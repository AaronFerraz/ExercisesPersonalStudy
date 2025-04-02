package Fundamentals;

public class BinarySearch {
    public static int binarySearch(int[] array, int num){
        int min = 0;
        int max = array.length-1;
        int div;
        int passos = 0;

        while(true){
            div = (int) (max+min)/2;
            passos++;
            System.out.printf("div:%d min:%d max:%d\n", div, min, max);
            if(array[div] < num){
                min = div+1;
            }
            else{
                max = div-1;
            }

            if(array[div] == num){
                return passos;
            }
            else if (max-min == 0){
                break;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67};

        System.out.println(binarySearch(primes, 1));
    }
}
