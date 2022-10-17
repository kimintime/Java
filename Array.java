
public class Array {

	public static void main(String[] args) {

		int[] intArray = {3, 5, 4, 1, 9, 6, 8, 2, 0 ,7};

 

		for(int i = 0; i < intArray.length-1; i++) {

    		for(int j = i + 1; j < intArray.length; j++) { 

        		if(intArray [i] < intArray [j]) { 

            		int temp = intArray [i]; 

            		intArray[i] = intArray[j];

            		intArray [j] = temp;

       			 }

    		}

    		System.out.print(intArray [i] + " ");

		}

		System.out.print(intArray [intArray.length-1]);
	}

	
}

