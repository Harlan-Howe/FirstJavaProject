public class FirstClass
{
    public static void main(String[] args)
    {
        System.out.print("Hello, World!");
        System.out.println("How are you today?\nI hope you're nifty.");

        int numDwarves; // instantiation
        numDwarves = 7; // initialization

        int numStooges = 3; //instantiation & initialization both

        System.out.println("There are "+numDwarves+" dwarves in my cottage.");
        System.out.println("At first, there were "+numStooges+ " stooges.");

        numStooges = numStooges + 1;
//        numStooges += 1;
//        numStooges++;
        System.out.println("Now, with Shemp, there are "+numStooges+" stooges.");
    }

}
