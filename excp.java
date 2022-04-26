// Java program to demonstrate
// NumberFormatException
class NumberFormat_Demo {
    public static void main(String args[]) {
        try {
            // "anindita" is not a number
            int num = Integer.parseInt("anindita");

            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }
}
