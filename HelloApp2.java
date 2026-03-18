public class HelloApp2 {
    public static void main(String[] args) {
        // Check if the user actually provided an argument
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello! (Tip: Try passing a name as an argument next time).");
        }
    }
}
