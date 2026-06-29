import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa02 {
    List<Mahasiswa02> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa02... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa02 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

     int binarySearch(String nim) {
        Collections.sort(mahasiswas, Comparator.comparing(mhs -> mhs.nim));
        Mahasiswa02 target = new Mahasiswa02(nim, null, null);
        return Collections.binarySearch(mahasiswas, target, Comparator.comparing(mhs -> mhs.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa02 lm = new ListMahasiswa02();
        Mahasiswa02 m = new Mahasiswa02("201234", "Noureen", "021xx1");
        Mahasiswa02 m1 = new Mahasiswa02("201235", "Akhleema", "021xx2");
        Mahasiswa02 m2 = new Mahasiswa02("201236", "Shannum", "021xx3");

        // menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        
        // menampilkan list mahasiswa
        lm.tampil();
        
        // update mahasiswa
        lm.update(lm.binarySearch("201235"), new Mahasiswa02("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
}