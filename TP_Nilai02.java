public class TP_Nilai02 implements Comparable<TP_Nilai02> {
    TP_Mahasiswa02 mahasiswa;
    TP_MataKuliah02 mataKuliah;
    double nilai;

    public TP_Nilai02(TP_Mahasiswa02 mahasiswa, TP_MataKuliah02 mataKuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    @Override
    public int compareTo(TP_Nilai02 o) {
        return Double.compare(this.nilai, o.nilai);
    }

    @Override
    public String toString() {
        return String.format("| %-12s | %-20s | %-42s | %-3d | %-6.2f |",
                mahasiswa.getNim(), mahasiswa.getNama(),
                mataKuliah.getNamaMK(), mataKuliah.getSks(), nilai);
    }
}