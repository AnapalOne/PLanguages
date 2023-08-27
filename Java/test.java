import java.util.Scanner;

class test {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = scanner.nextLine();

        int var = 100;
        float add = 1.110f;

        float added = var + add;
        System.out.println("hello there, " + word);
        System.out.println(added);
    }
}