// Completed on January 3rd, 2018

// Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

// helloName("Bob") → "Hello Bob!"
// helloName("Alice") → "Hello Alice!"
// helloName("X") → "Hello X!"

public class helloName {

    public static void main(String[] args) {
        helloName test = new helloName();

        System.out.println(test.helloName("Bob"));
        System.out.println(test.helloName("Alice"));
        System.out.println(test.helloName("X"));
    }

    public String helloName(String name) {
        return ("Hello " + name + "!");
    }

}
