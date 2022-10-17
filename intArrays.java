public class intArrays {

   public static void main(String[] args) {

    

       int[] first = {1, 2, 3, 4};

       int[] second  = {5, 6, 7, 8};

       

       System.out.print(second [2]);

       System.out.print(first [0]);

       

       int[] third;

       

       third = second;

       second = first;

       first = third;

       

       System.out.print(third [0]);

       System.out.print(third [0]);

       System.out.print(second [0]);

       System.out.print(first [2]);

   }

}