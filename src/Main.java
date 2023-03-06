public class Main {
    public static void main(String[] args) {
       /* System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        //changed1jghkygkhhjhughgghbfj*/

        MyClass myObject = new MyClass();
        int sum1 = myObject.add(2, 3);           // Calls the first add() method
        double sum2 = myObject.add(2.5, 3.5);    // Calls the second add() method
        String str = myObject.add("Hello", "World");   // Calls the third add() method

    }
}