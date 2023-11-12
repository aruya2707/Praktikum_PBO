package Scenario;
import java.util.ArrayList;
import java.util.List;

class Niece {
    private String name;
    private int day;
    private int month;
    public List<String> presentList;  // Ganti dari Map menjadi List

    Niece(String name, int day, int month) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.presentList = new ArrayList<>();  // Ganti dari Map menjadi List
    }
    
    //buat order
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }
    
    public int clearPresents() {
        int numRemoved = presentList.size();
        presentList.clear();
        return numRemoved;
    }

    public void listPresents() {
        for (String present : presentList) {  // Ubah dari Map.Entry menjadi String
            System.out.println(name + " has received " + present);
        }
    }
    
    public boolean hasReceivedPresentFrom(Uncle uncle) {
        for (String present : presentList) {
            String uncleName = present.split(":")[0].trim(); // Memisahkan nama paman dari deskripsi hadiah
            if (uncle.getName().equals(uncleName)) {
                return true;
            }
        }
        return false;
    }

    
    @Override
    public String toString() {
        return "Niece: " + name + ", Birthday: " + month + "/" + day;
    }

    public String getName() {
        return name;
    }
}
