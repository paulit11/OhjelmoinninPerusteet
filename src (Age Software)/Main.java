import java.util.Scanner;

public class Main {

    // Start of Main
    public static void main(String[] args) {
        Scanner Itsepalvelukassa = new Scanner(System.in);
        System.out.println("Anna ikäsi:");

        int age = Itsepalvelukassa.nextInt();

        if (age > 0 && age < 18) {
            System.out.println("Olet alaikäinen");

            if (age >= 15) {
                System.out.println("Saat ajaa mopoa");
            }

        } else if (age >= 65) {
            System.out.println("Olet eläkeläinen");

        } else {
            System.out.println("Olet aikuinen");
        }

        Teht1(age);
        Teht2(age);
        Teht3(age);
        Teht4(age);
        Teht5(age);
        Teht6(age);
        Teht7(age);
    }
    // End of Main

    public static void Teht1(int age) {
        
        if (age == 16 || age == 17) {
            System.out.println("Voit ajaa kevaria");
        }
    }

    public static void Teht2(int age) {
        
        if (age == 18) {
            System.out.println("Olet juuri tullut täysi-ikäiseksi ja saat ajaa autoa");
        }
    }

    public static void Teht3(int age) {
        
        if (age % 10 == 0) {
            System.out.println("Ikäsi on tasanumero");
        }
    }

    public static void Teht4(int age) {
        
        if (age == 100) {
            System.out.println("Wau! Kolme numeroa!");
            System.out.println("Sehä on enemmän ku 99!");
            System.out.println("Silti vähemmän ku 463.");
        }
    }

    public static void Teht5(int age) {
        
        if (age > 58) {
            System.out.println("Voit mennä varhaiseläkkeelle.");
        }
    }

    public static void Teht6(int age) {
        
        if (age == 65) {
            System.out.println("Hyviä eläkepäiviä!");
        }
    }

    public static void Teht7(int age) {

        if (age >= 40 && age <= 50) {
            System.out.println("Parasta keski-ikää!");
        }
    }
}