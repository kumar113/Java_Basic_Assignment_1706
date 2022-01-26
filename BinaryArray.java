import java.util.Scanner;

public class BinaryArray{

    public int[] SortingArray(int [] arr,int size){
        int i,zero=0;
        for(i=0;i<size;i++){
            if(arr[i]==0)
                zero++;
        }
       //initialize index to zero again...
        i=0;
        while(zero>0){
            arr[i]=0;
            i++;
            zero--;
        }
        while(i<size){
            arr[i]=1;
            i++;
        }
        return arr;
    } 
    public static void main(String[] args){
        int n;
        Scanner ic = new Scanner(System.in);
        int binary_array[] = new int[100];
        try{
            System.out.println("Enter the size of array:");
            n = ic.nextInt();
            System.out.println("Enter array elements:");
            for(int i=0;i<n;i++){
                binary_array[i]=ic.nextInt();
            }
        }
        finally{
            ic.close();
        }
       
        
        BinaryArray letsPassArray = new BinaryArray();
        binary_array = letsPassArray.SortingArray(binary_array,n);
        System.out.println("number are:");
        for(int i=0;i<n;i++){
             System.out.println(binary_array[i]);
        }
    }
    
}
