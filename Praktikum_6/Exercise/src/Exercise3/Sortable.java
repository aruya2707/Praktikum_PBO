package Exercise3;

//CASE 1 sebagai sebuah class abstract
//// Abstract class for objects that can be sorted
//abstract class Sortable {
//    // Abstract method to compare two objects
//    public abstract int compare(Sortable b);
//
//    // Static method to perform Shell Sort
//    public static void shell_sort(Sortable[] a) {
//        int n = a.length;
//        int gap = n / 2;
//        while (gap > 0) {
//            for (int i = gap; i < n; i++) {
//                Sortable temp = a[i];
//                int j;
//                for (j = i; j >= gap && a[j - gap].compare(temp) > 0; j -= gap) {
//                    a[j] = a[j - gap];
//                }
//                a[j] = temp;
//            }
//            gap /= 2;
//        }
//    }
//}

//CASE 2 sebagai sebuah interface
public interface Sortable {
    int compare(Sortable b);
}
