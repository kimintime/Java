class PrintThis {

    public static void main(String [] args) {

        Class firstObject = new Class ();

        firstObject.print();

 

        Class secondObject = new Class ();

        secondObject. print ();

 

        Class. print ();

    }

}

class Class {

    static int counter = 0;

 

    Class () {

        counter ++;

    }

    public static void print () {

        System.out.println("Counter value is: " + counter);

    }

}