package TruuTuong;

import BinhThuong.ClassCha;

public class Bang extends ClassCha {
    private int ThoiGian; // tính theo phút
    private String NhaCC; // nhà cung cấp

    // Constructor của lớp Bang
    public Bang(String TuaDe, double GiaMua, int ThoiGian, String NhaCC, int ChatLuong, double GiaBan) {
        super(TuaDe, GiaMua, ChatLuong, GiaBan);
        this.ThoiGian = ThoiGian;
        this.NhaCC = NhaCC;
    }

    @Override
    public void inRa() {
        super.inRa();
        System.out.println("ThoiGian: " + ThoiGian + " phút");
        System.out.println("NhaCC: " + NhaCC);
    }
}
