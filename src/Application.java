public class Application {

    // field
    // method (function)
    // constructor

    public static void main(String[] args) {
        if (args != null && args.length > 0) {
            System.out.println("Hello World " + args[0]);
        } else {
            System.out.println("Hello World");
        }

        System.out.println("--------");

        int[] numbers = new int[10];
        numbers[3] = 30;
        numbers[7] = 70;

        for (int i = 0; i < numbers.length; i++) { // classic for loop
            System.out.println("Index: " + i + " value: " + numbers[i]);
        }

        System.out.println("--------");

        for (int number : numbers) { // foreach
            System.out.println("Value: " + number);
        }
    }
}

// alt + shift + F10 -> shift + F10 - run
// shift + F9 - debug
// F7 - move inside with debug
// F8 - move with debug
// F9 - move to the next breakpoint with debug
// alt + F8 - evaluate debugging code
// shift + F6 - rename
// ctrl + alt + L - format code

// source code (.cpp) -> compile (windows x86) -> (.exe) -> run
// source code (.cpp) -> compile (ubuntu ARM) -> (.exe) -> run

// source code (.java) -> compile -> bytecode (.class) -> JVM (windows x86) -> run
//                                                     -> JVM (ubuntu ARM) -> run