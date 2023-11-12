package Scenario;

public class Main {

    public static void main(String[] args) {
        Family family = new Family();

        // Adding uncles and nieces
        family.addUncle("Albert");
        family.addUncle("Bill");
        family.addUncle("Charlie");
        family.addUncle("David");

        family.addNiece("Amy", 12, 3);
        family.addNiece("Beatrice", 10, 3);
        family.addNiece("Claire", 15, 1);
        family.addNiece("Emily", 20, 11);
        System.out.println("*************************");

        // Listing uncles and nieces
        family.listUncles();
        System.out.println("*************************");
        family.listNieces();
        System.out.println("*************************");

        // Adding presents
        Uncle albert = family.findUncle("Albert");
        Uncle bill = family.findUncle("Bill");
        Uncle charlie = family.findUncle("Charlie");
        Uncle david = family.findUncle("David");

        albert.addPresent(family.findNiece("Amy"), "Book");
        albert.addPresent(family.findNiece("Amy"), "Book");
        albert.addPresent(family.findNiece("Claire"), "Book");
        charlie.addPresent(family.findNiece("Claire"), "Book");
        bill.addPresent(family.findNiece("Amy"), "Kite"); // Duplicate present, should return false
        charlie.addPresent(family.findNiece("Beatrice"), "Art Kit");
        david.addPresent(family.findNiece("Claire"), "Puzzle");

        System.out.println("*************************");
        // Listing presents from uncles
        albert.listPresents();
        System.out.println("*************************");
        bill.listPresents();
        System.out.println("*************************");
        charlie.listPresents();
        System.out.println("*************************");
        david.listPresents();
        System.out.println("*************************");

        // Listing presents for nieces
        family.findNiece("Amy").listPresents();
        family.findNiece("Beatrice").listPresents();
        family.findNiece("Claire").listPresents();
        family.findNiece("Emily").listPresents();
        System.out.println(family.findNiece("Ujang"));
        System.out.println(family.findUncle("Bill"));

        // Testing additional functionalities
        family.listPresentsByUncle(albert);
        System.out.println("*************************");
        family.listPresentsForNiece(family.findNiece("Amy"));
        System.out.println("*************************");
        family.deletePresentsForNiece(family.findNiece("Amy"));
        System.out.println("*************************");
        family.findNiece("Amy").listPresents();
        family.listPresentsForNiece(family.findNiece("Claire"));
    }
}
