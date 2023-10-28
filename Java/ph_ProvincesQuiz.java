import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ph_ProvincesQuiz
{
    public static void main (String[] args)
    {
        // { {province, capital} }
        // Data from https://wikipedia.org/wiki/Provinces_of_the_Philippines
        String[][] list = 
            { {"Abra", "Bangued"}
            , {"Agusan del Norte", "Cabadbaran"}
            , {"Agusan del Sur", "Prosperidad"}
            , {"Aklan", "Kalibo"}
            , {"Albay", "Legazpi"}
            , {"Antique", "San Jose de Buenavista"}
            , {"Apayao", "Kabugao"}
            , {"Aurora", "Baler"}
            , {"Basilan", "Bataan"}
            , {"Batanes", "Basco"}
            , {"Batangas", "Batangas City"}
            , {"Benguet", "La Trinidad"}
            , {"Biliran", "Naval"}
            , {"Bohol", "Tagbilaran"}
            , {"Bukidnon", "Malaybalay"}
            , {"Bulacan", "Malolos"}
            , {"Cagayan", "Tuguegarao"}
            , {"Camarines Norte", "Daet"}
            , {"Camarines Sur", "Pili"}
            , {"Camiguin", "Mambajao"}
            , {"Capiz", "Roxas"}
            , {"Catanduanes", "Virac"}
            , {"Cavite", "Imus"}
            , {"Cebu", "Cebu City"}
            , {"Cotabato", "Kidapawan"}
            , {"Davao de Oro", "Nabunturan"}
            , {"Davao del Norte", "Tagum"}
            , {"Davao del Sur", "Digos"}
            , {"Davao Occidental", "Malita"}
            , {"Davao Oriental", "Malita"}
            , {"Dinagat Islands", "San Jose"}
            , {"Eastern Samar", "Borongan"}
            , {"Guimaras", "Jordan"}
            , {"Ifugao", "Lagawe"}
            , {"Ilocos Norte", "Laoag"}
            , {"Ilocos Sur", "Vigan"}
            , {"Iloilo", "Iloilo City"}
            , {"Isabela", "Ilagan"}
            , {"Kalinga", "Tabuk"}
            , {"La Union", "San Fernando"}
            , {"Laguna", "Santa Cruz"}
            , {"Lanao del Norte", "Tubod"}
            , {"Lanao del Sur", "Marawi"}
            , {"Leyte", "Tacloban"}
            , {"Maguindanao del Norte", "Datu Odin Sinsuat"}
            , {"Maguindanao del Sur", "Buluan"}
            , {"Marinduque", "Boac"}
            , {"Masbate", "Masbate City"}
            , {"Misamis Occidental", "Oroquieta"}
            , {"Misamis Oriental", "Cagayan de Oro"}
            , {"Mountain Province", "Bontoc"}
            , {"Negros Occidental", "Bacolod"}
            , {"Negros Oriental", "Dumaguete"}
            , {"Northern Samar", "Catarman"}
            , {"Nueva Ecija", "Palayan"}
            , {"Nueva Vizcaya", "Bayombong"}
            , {"Occidental Mindoro", "Mamburao"}
            , {"Oriental Mindoro", "Calapan"}
            , {"Palawan", "Puerto Princesa"}
            , {"Pampanga", "San Fernando"}
            , {"Pangasinan", "Lingayen"}
            , {"Quezon", "Lucena"}
            , {"Quirino", "Cabarroguis"}
            , {"Rizal", "Antipolo"}
            , {"Romblon", "Romblon"}
            , {"Samar", "Catbalogan"}
            , {"Sarangani", "Alabel"}
            , {"Siquijor", "Siquijor"}
            , {"Sorsogon", "Sorsogon City"}
            , {"South Cotabato", "Koronadal"}
            , {"Southern Leyte", "Maasin"}
            , {"Sultan Kudarat", "Isulan"}
            , {"Sulu", "Jolo"}
            , {"Surigao del Norte", "Surigao City"}
            , {"Surigao del Sur", "Tandag"}
            , {"Tarlac", "Tarlac City"}
            , {"Tawi-Tawi", "Bongao"}
            , {"Zambales", "Iba"}
            , {"Zamboanga del Norte", "Dipolog"}
            , {"Zamboange del Sur", "Pagadian"}
            , {"Zamboanga Sibugay", "Ipil"}
          };

        System.out.println("This is a quiz about the province's capitals in the Philippines.");
        System.out.print("Continue? [y/n] ");

        Scanner input = new Scanner(System.in);
        String prompt = input.nextLine();

        if (!prompt.equalsIgnoreCase("y"))
            return;

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < list.length; i++) 
            numbers.add(i);

        Collections.shuffle(numbers);

        int score = 0;
        int listIndex = 0;
        while (listIndex < list.length) {
            int numbersIndex = numbers.get(listIndex);

            System.out.printf("What is the capital of %s? ", list[numbersIndex][0]);
            String ans = input.nextLine();

            if (ans.equalsIgnoreCase(list[numbersIndex][1])) {
                System.out.println("Correct!");
                score++;
            }
            else {
                System.out.printf("Incorrect answer. The correct capital of %s is %s.\n", list[numbersIndex][0], list[numbersIndex][1]);
            }
            listIndex++;
        }

        System.out.printf("Your score is %d/81.\n", score);
    }
}
