package com.synechron.arrays_examples;

public class Array_Rotation
{  
    public static void main(String[] args)
    {     
        int [] arr ={1, 2, 3, 4, 5};   
        int n = 2;    
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++)  //O(N)
        {   
            System.out.print(arr[i] + " ");   
        }    
        for(int i = 0; i < n; i++)  //O(N)
        {   
            int j,first;      
            first = arr[0];  // [0=1][0=2][0=3]
            for(j = 0; j < arr.length-1; j++) //O(N)
            {       
                arr[j] = arr[j+1]; //1) [2][3][4][5] , 2)[3][4][5][1] 
            }  
            arr[j++] = first;   //1) [1] , 2)[2]
        }  
          
        System.out.println();  
            
        System.out.println("Array After Rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  