public class Main {
    public static void main(String[] args) {
        int[] intArray = {8,9,-5,-80,-19,3,2,5};

        System.out.println(recursiveBinarySearch(intArray, 5));
    }

    public static  int interativeBinarySearch(int[] input, int value){
        int start = 0;
        int end = input.length;

        while (start < end){
            int midpoint = (start + end)/2;
            System.out.println("mid point = "+ midpoint);
            if(input[midpoint] == value){
                return midpoint;
            }
            else if(input[midpoint]<value){
                start = midpoint + 1;
            }
            else{
                end = midpoint;
            }
        }
        return -1;
    }
    public static int recursiveBinarySearch(int[] input, int value){
        return rescursiveBinarySearch(input,0, input.length, value);
    }
    public static int rescursiveBinarySearch(int[] input, int start, int end, int value){
        if(start >= end){
            return-1;
        }
        int midpoint = (start + end)/2;

        System.out.println("midpoint =" + midpoint);
        if(input[midpoint] == value){
            return midpoint;
        }
        else if(input[midpoint]<value){
            return rescursiveBinarySearch(input,midpoint+1,end,value);
        }
        else {
            return rescursiveBinarySearch(input, start, midpoint, value);
        }
    }
}