public class MainInhe{
    public static void main(String args[]) {
        Ruang ru = new Ruang(4);
        ru.hitungLuas();
        ru.cetakLuas();

        PersegiChild p = new PersegiChild(1);
        p.hitungLuas();
        p.cetakLuas();
    }
}