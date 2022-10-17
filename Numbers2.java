public class Numbers2 {

    private int number;

 

    public void printThis(int amount, int l) {

        number = l;

        for (int i=0; i<amount; ++i)

            System.out.print(l);

    }

    public static void main(String args[]) {

        Numbers2 numbers = new Numbers2 ();

		numbers.printThis (10, 8);

    }

}