import java.util.*;

class SelectionSort {


    static void selectionSort(int arr[]) {


        for(int i=0;i<arr.length-1;i++) {


            int min=i;


            for(int j=i+1;j<arr.length;j++) {

                if(arr[j]<arr[min])
                    min=j;
            }


            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }

    }



    public static void main(String args[]) {


        int scores[]={88,70,95,60,85};


        selectionSort(scores);


        System.out.println(Arrays.toString(scores));

    }
}