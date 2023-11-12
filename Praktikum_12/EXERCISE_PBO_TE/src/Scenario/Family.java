package Scenario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Family {
    private List<Uncle> uncles;
    private List<Niece> nieces;

    // create constructor
    public Family() {
        this.uncles = new ArrayList<>();
        this.nieces = new ArrayList<>();
    }
    
    // Add a new niece. If there is already a niece of this name,
    //false is returned and nothing is added.
    public boolean addNiece(String name, int day, int month) {
        if (findNiece(name) == null) {
            Niece niece = new Niece(name, day, month);
            nieces.add(niece);
            return true;
        }
        return false;
    }

    //Add a new uncle. If there is already an uncle of the name,
    //false is returned and nothing is added.
    public boolean addUncle(String name) {
        if (findUncle(name) == null) {
            Uncle uncle = new Uncle(name);
            uncles.add(uncle);
            return true;
        }
        return false;
    }

    //Lookup a niece by name; return null if not found.
    public Niece findNiece(String name) {
        for (Niece niece : nieces) {
            if (niece.getName().equals(name)) {
                return niece;
            }
        }
        return null;
    }

    //Lookup an uncle by name; return null if not found.
    public Uncle findUncle(String name) {
        for (Uncle uncle : uncles) {
            if (uncle.getName().equals(name)) {
                return uncle;
            }
        }
        return null;
    }

    //List berdasarkan ultah
    public void listNieces() {
        // Sorting nieces by birthday
        List<Niece> sortedNieces = new ArrayList<>(nieces);
        Collections.sort(sortedNieces, Comparator.comparingInt(Niece::getMonth)
                                                    .thenComparingInt(Niece::getDay));

        // Printing sorted nieces
        System.out.println("List of Nieces (Ordered by Birthday):");
        for (Niece niece : sortedNieces) {
            System.out.println(niece);
        }
    }

    // List berdasarkan alphabet
    public void listUncles() {
    	// Sorting uncles alphabetically
        List<Uncle> sortedUncles = new ArrayList<>(uncles);
        Collections.sort(sortedUncles, Comparator.comparing(Uncle::getName, String.CASE_INSENSITIVE_ORDER));

        // Printing sorted uncles
        System.out.println("List of Uncles (Alphabetically):");
        for (Uncle uncle : sortedUncles) {
            System.out.println(uncle);
        }
    }
    
    public void listPresentsByUncle(Uncle uncle) {
        uncle.listPresents();
    }

    public void listPresentsForNiece(Niece niece) {
        for (Uncle uncle : uncles) {
            if (uncle.hasPresentForNiece(niece)) {
                System.out.println(uncle.getName() + " is giving " + uncle.getPresentForNiece(niece) +
                        " to " + niece.getName());
            } else {
                System.out.println(uncle.getName() + " has no present for " + niece.getName());
            }
        }
    }
    
    public void deletePresentsForNiece(Niece niece) {
        for (Uncle uncle : uncles) {
            uncle.removePresentForNiece(niece);
        }
    }
    
}
