public class Main {
    public static void main(String[] args) {
        Vaihe1();
        Vaihe2();
        Vaihe3();
    }

    public static void Vaihe1() {
        System.out.println("Vaihe 1:");
        int luku1 = 3;
        int luku2 = 7;

        if (luku1 == luku2) {
            System.out.println("Luku 1 ja Luku 2 ovat saman kokoisia.");
        }
        if (luku1 <= luku2) {
            System.out.println("Luku 2 on suurempi kuin luku 1.");
        }
        if (luku1 >= luku2) {
            System.out.println("Luku 2 on suurempi kuin luku 1.");
        }
        System.out.println();
    }

    public static void Vaihe2() {
        System.out.println("Vaihe 2:");
        int luku1 = 5;
        int luku2 = 10;
        int luku3 = 5;

        if (luku1 == luku2 || luku2 == luku3) {
            System.out.println("Luku1 ja Luku2 tai Luku2 ja Luku3 ovat yhtä suuria.");
        }

        if (luku1 > luku2 && luku1 == luku3) {
            System.out.println("Luku1 on suurempi kuin Luku2 ja yhtä suuri kuin Luku3.");
        }

        if (luku1 == luku2 && luku2 == luku3) {
            System.out.println("Luku1, Luku2 ja Luku3 ovat yhtä suuria.");
        }

        if (luku1 > luku2) {
            System.out.println("Luku1 on suurempi kuin Luku2.");
        } else if (luku2 > luku3) {
            System.out.println("Luku2 on suurempi kuin Luku3.");
        }

        if (luku1 == luku2) {
            System.out.println("Luku1 ja Luku2 ovat yhtä suuria.");
        } else if (luku1 == luku3) {
            System.out.println("Luku1 ja Luku3 ovat yhtä suuria.");
        }

        System.out.println();
    }

    public static void Vaihe3() {
        System.out.println("Vaihe 3:");
        String nimi1 = "Microsoft";
        String nimi2 = "Github";
        String nimi3 = "Microsoft";

        if (nimi1.equals(nimi2)) {
            System.out.println("Nimi1 ja Nimi2 ovat samoja.");
        }

        if (!nimi1.equals(nimi2)) {
            System.out.println("Nimi1 ja Nimi2 ovat erisuuria.");
        }

        if (nimi1.equals(nimi2)) {
            System.out.println("Nimi1 ja Nimi2 ovat samoja.");
        } else if (nimi1.equals(nimi3)) {
            System.out.println("Nimi1 ja Nimi3 ovat samoja.");
        }
        System.out.println();
    }
}