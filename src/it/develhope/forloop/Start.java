package it.develhope.forloop;
import java.util.Arrays;
public class Start {
    public static void main(String[] args) {
        String[] arr = {
                "monday",
                "tuesday",
                "wednesday",
                "thursday",
                "friday",
                "saturday",
                "sunday"
    };
        // start from 0 because the array index starts from 0
        for (int i = 0; i <arr.length ; i++) {
            if(i%2 ==0){
                arr[i] = arr[i].toUpperCase();
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
