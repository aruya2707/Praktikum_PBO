package Scenario;
import java.util.HashMap;
import java.util.Map;

class Uncle {
    private String name;
    private Map<Niece, String> presents;

    Uncle(String name) {
        this.name = name;
        this.presents = new HashMap<>();
    }
    
    // Method to add a present to a niece
    public boolean addPresent(Niece recipient, String desc) {
        if (presents.containsKey(recipient) || recipient.hasReceivedPresentFrom(this)) {
            System.out.println("Cannot give the same present to " + recipient.getName() +
                    " again or another uncle has already given this present.");
            return false;
        }

        presents.put(recipient, desc);
        return true;
    }




    // Method to list presents given by this uncle
    public void listPresents() {
        for (Map.Entry<Niece, String> entry : presents.entrySet()) {
            System.out.println(name + " gives " + entry.getValue() + " to " + entry.getKey().getName());
        }
    }
    
    public boolean hasPresentForNiece(Niece niece) {
        return presents.containsKey(niece);
    }

    public String getPresentForNiece(Niece niece) {
        return presents.get(niece);
    }

    public void removePresentForNiece(Niece niece) {
        presents.remove(niece);
    }
    
    @Override
    public String toString() {
        return "Uncle: " + name;
    }

    public String getName() {
        return name;
    }
}
