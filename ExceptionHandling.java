public class ExceptionHandling {
        public static void main(String[] args) {

        // Using try ,catch and finally block 

        int [] num = {1,2,3};
        try{
            int x = num[4];
            System.out.println(x);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("COmpleted");
        }

        // using throw keyword
        validate(14);

    }

    // Using throw keyword
    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not able to vote");
        }
        else {
            System.out.println("Able to vote");
        }
    }
}

