
package practicejava;

import java.util.Arrays;



public class PracticeJava {
    private static int []kites;
    //private static int size;
    
    PracticeJava(){
        kites = new int[]{67,9,36,76,54,2,5,6,7,8,45};
    }
    
    static int search(int x){
        for(int i = 0;i < kites.length - 1;i++){
            
                if(x == kites[i]){
                    return i;
                
                
            }
            
        
        
        
    }
        return 0;

    }
    public static void main(String[] args) {
       int [] arr = new int [10];
       int total = 0;
       for(int i = 0; i< arr.length;i++){
           total += i;
           
       }
       //getting sum and average of values in an array
       int [] nums = new int[]{4,5,7,8,9,2,3,5};
       int i = 0;
       i++;
       int sum = 0;
       for (i = 0; i < nums.length; i++){
          sum = sum += nums[i];  
       }
   
           int average = sum/nums.length;
          
           //System.out.println("Sum of values in array is "+ sum + " and average is "+ average);
              //Bubble sort 
    int[]monkeys = new int[]{3,45,6,78,65,5,27,46};
   
    for (int a = (monkeys.length-1); a >= 0; a--){
        for(int b = 1; b <= a; b++){
            if (monkeys[b-1] > monkeys[b]){
               int temp = monkeys[b-1]; //create a placeholder for the value stored in monk[b-1]
               monkeys[b-1] = monkeys[b];   //the value now stored in monk[b] is now stored in monk[b-1]
               monkeys[b] = temp;       //now make the placeholder to be monkeys[b]
            }
        }
       // System.out.println(Arrays.toString(monkeys));
}
    //Insertion sort
    int birds[] = new int[]{34,6,8,24,77,67,98,35,16};
    for(int c  = 0;c < birds.length - 1;c++){
        int min =  c;
        for(int d = c+1; d < birds.length;d++){
            if(birds[d]<birds[min]){
                min = d;
                int temp = birds[c];
                birds[c] = birds[min];
                birds[min] = temp;
                
            }
        }
       // System.out.println(Arrays.toString(birds));
    }
        System.out.println(search(9));
    }
    
    
 
}
