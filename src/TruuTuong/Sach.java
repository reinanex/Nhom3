package TruuTuong;

import BinhThuong.ClassCha;

public class Sach extends ClassCha {
    private int SoTrang; // số trang
    private String NXB; // nhà xuất bản

    // Constructor của lớp Sach
    public Sach(String TuaDe, double GiaMua, int SoTrang, String NXB, int ChatLuong, double GiaBan) {
        super(TuaDe, GiaMua, ChatLuong, GiaBan);
        this.SoTrang = SoTrang;
        this.NXB = NXB;
    }

    @Override
    public void inRa() {
        super.inRa();
        System.out.println("So trang: " + SoTrang);
        System.out.println("Nha xuat ban: " + NXB);
    }
}
