package PBO5;
import java.util.ArrayList;
public class Restaurant {
	// merupakan variabel instance
//	public String[] nama_makanan;
//	public double[] harga_makanan;
//	public int[] stok;
//	public static byte id=0;
	//melakukan enkapsulasi (Always keep data private)
	//Don’t use too many basic types in a class.
	private ArrayList<String> namaMakanan;
    private ArrayList<Double> hargaMakanan;
    private ArrayList<Integer> stok;
    private int id = 0;
	
	//Constructor
//	public Restaurant() {
//		nama_makanan = new String[10];
//		harga_makanan = new double[10];
//		stok = new int[10];
//	}
	public Restaurant() {
        namaMakanan = new ArrayList<>();
        hargaMakanan = new ArrayList<>();
        stok = new ArrayList<>();
    }
	
//	public void tambahMenuMakanan(String nama, double harga, int stok) {
//		this.nama_makanan[id] = nama;
//		this.harga_makanan[id] = harga;
//		this.stok[id] = stok;
//	}
	public void tambahMenuMakanan(String nama, double harga, int stok) {
        namaMakanan.add(nama);
        hargaMakanan.add(harga);
        this.stok.add(stok);
        id++;
    }
	
//	public void tampilMenuMakanan() {
//		for(int i =0; i<id; i++) {
//			System.out.println(nama_makanan[i] +"{"+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
//		}
//	}
	
	public void tampilMenuMakanan() {
        for (int i = 0; i < id; i++) {
            System.out.println(namaMakanan.get(i) + " [" + stok.get(i) + "]\tRp. " + hargaMakanan.get(i));
        }
    }
	
	public boolean isOutOfStock(int id) {
		if(stok.get(id) == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
//	public static void nextId() {
//		id++;
//	}
	// Getter untuk id (optional)
    public int getId() {
        return id;
    }
}
