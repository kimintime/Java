public class test {

    public static void main(String args[]) {

       B object = new B(); 

       

       boolean truth = (Object) object instanceof B;

       System.out.println(truth);

       

       truth = (Object) object instanceof C;

       System.out.println(truth);       

    }

}

class B {

    

}

class C {

    

}