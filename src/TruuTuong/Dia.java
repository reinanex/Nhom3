package TruuTuong;
import BinhThuong.ClassCha;
public class Dia extends ClassCha {
    private int ThoiGian; // tinh bang phut
    private String NXB; // Nha Xuat Ban
    
    public Disc (String TuaDe, double GiaMua, int ThoiGian, String NXB, int ChatLuong, double GiaBan) {
        super(TuaDe, GiaMua, ChatLuong, GiaBan);
        this.ThoiGian = ThoiGian;
        this.NXB = NXB;
    }

    @Override
    public void inRa() {
        super.inRa();
        System.out.println("Thoi Gian: " + ThoiGian + " phut");
        System.out.println("Nha Xuat Ban: " + NXB);
    }
}
