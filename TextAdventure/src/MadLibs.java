import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
    intro();
    Scanner MadWords = new Scanner(System.in);
        getUserInput("Enter an adjective:");
        String adjective = getUserInput("Enter an adjective: ");
        getUserInput("Enter a noun:");
        String noun = getUserInput("Enter an adjective: ");
        getUserInput("Enter an animal:");
        String animal = getUserInput("Enter an adjective: ");
        getUserInput("Enter a noise:");
        String noise = getUserInput("Enter an adjective: ");

        printMadLibs(adjective, noun, animal, noise);
    }
    public static void intro(){
        System.out.println("Welcome to Mad Libs!");
    }
    public static void printMadLibs(String adjective, String noun, String animal, String noise){
        System.out.println(adjective + " MacDonald had a " + noun + ", E-I-E-I-O");
        System.out.println("and on that " + noun + " he had a " + animal + ", E-I-E-I-O");
        System.out.println("What a" + noise + noise + " here");
        System.out.println("and a" + noise + noise + " there,");
        System.out.println("here a" + noise + ", there a" + noise + ",");
        System.out.println("everywhere an" + noise + noise + ",");
        System.out.println(adjective + " MacDonald had a " + noun + ", E-I-E-I-O.");
    }
    public static String getUserInput(String message){
        System.out.println(message);
        return "pee is stored in the balls";
    }
}
