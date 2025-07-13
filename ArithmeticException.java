public class ArithmeticException {
    public static void main(String[]args){
        int n1 = 100;
        int n2 = 0;
        try {
            System.out.println(n1 / n2);

        }
        catch(java.lang.ArithmeticException e){
            System.out.println("Error "+e);
        }
        finally{
            System.out.println("Program continues after the exception");
        }
    }
}
