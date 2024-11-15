import java.util.Scanner;

// Abstract class untuk troops
abstract class Troops_COC {
    String nama;
    int elixir;

    // Konstruktor troops
    public Troops_COC(String nama, int elixir) {
        this.nama = nama;
        this.elixir = elixir;
    }

    // Abstract method
    public abstract void nyerang();
    public abstract void defend();

    // Regular method
    public void masak_troops(int jumlah_troops) {
        this.elixir = elixir * jumlah_troops;
        System.out.println(nama + " sudah dimasak chef, elixir terpakai sebanyak " + elixir);
    }
}

// Subclass Barbarian
class Barbarian extends Troops_COC {

    public Barbarian(String nama, int elixir) {
        super(nama, elixir);
    }

    public void nyerang() {
        System.out.println(nama + " lagi nyerang kompleks goblin dengan rawrrr!");
    }

    public void defend() {
        System.out.println("Goblin menyerang kapten, tapi " + nama + " kita gacor jaga base, townhall kita utuh!");
    }
}

// Subclass Archer
class Archer extends Troops_COC {

    public Archer(String nama, int elixir) {
        super(nama, elixir);
    }

    public void nyerang() {
        System.out.println(nama + " lagi nyerang kompleks goblin dengan rawrrr!");
    }

    public void defend() {
        System.out.println("Goblin menyerang kapten, tapi " + nama + " kita gacor jaga base, townhall kita utuh!");
    }
}

// Subclass Goblin
class Goblin extends Troops_COC {

    public Goblin(String nama, int elixir) {
        super(nama, elixir);
    }

    public void nyerang() {
        System.out.println(nama + " kita membelot ke kawannya kapten, kompleks goblin rata niinuuniinuu!");
    }

    public void defend() {
        System.out.println("Goblin menyerang kapten, tapi " + nama + " kita lebih strong, townhall kita utuh!");
    }
}

// Main class
public class coc_abstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis troops untuk digunakan:");
        System.out.println("1. Barbarian");
        System.out.println("2. Archer");
        System.out.println("3. Goblin");
        System.out.println("Masukkan pilihan troops: ");
        int pilihan = scanner.nextInt();

        System.out.println("Berapa banyak troops yang mau dimasak? ");
        int masakan = scanner.nextInt();

        System.out.println("Mau disuruh apa troopsnya? ");
        System.out.println("1. Serang");
        System.out.println("2. Defend");
        int pilihan2 = scanner.nextInt();

        switch (pilihan) {
            case 1:
                Barbarian barbarian = new Barbarian("Barbarian", 100);
                barbarian.masak_troops(masakan);
                if (pilihan2 == 1) {
                    barbarian.nyerang();
                } else {
                    barbarian.defend();
                }
                break;
            
            case 2:
                Archer archer = new Archer("Archer", 80);
                archer.masak_troops(masakan);
                if (pilihan2 == 1) {
                    archer.nyerang();
                } else {
                    archer.defend();
                }
                break;

            case 3:
                Goblin goblin = new Goblin("Goblin", 150);
                goblin.masak_troops(masakan);
                if (pilihan2 == 1) {
                    goblin.nyerang();
                } else {
                    goblin.defend();
                }
                break;

            default:
                System.out.println("Troops tidak ada di pilihan kapten, pilih ulang troops");
                System.exit(0);
                break;
        }
        scanner.close();
    }
}