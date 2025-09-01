// Arrays :- Arrays ek fixed-size data structure hai jisme same type ke elements ko store kiya jata hai.
// Arrays :- An array in Java is a container object that holds a fixed number of values of a single type.
// 1. One-Dimensional Array
// 2. Multi-Dimensional Array

// Declaration
   // int[] numbers; // Recommended Style
   // OR
   // int number[]; // Allowed, but less common

// Creation
// number = new int[5]; // Create an array of size 5


public class arrays {

   public static void main(String[] args) {

    int [] a = new int[5];
    //0,0,0,0,0,
    a[4] = 55;
    System.out.println(a[4]);
    for(int i=0 ;i<5;i++){
        System.out.println(a[i]);
   }
   for(int i : a)
   System.out.println();
}
}

// Initialization : Array element can be initialized individually in bunk.
// number [0] = 10;
// number [1] = 20;
// int[] values = {1,2,3, 4, 5}; // Combined declaration, creation and initialization