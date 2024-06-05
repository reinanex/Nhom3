package BinhThuong;

public class ClassCha {
    protected String TuaDe;
    protected double GiaMua;
    protected int ChatLuong;
    protected double GiaBan;

    public ClassCha(String TuaDe, double GiaMua, int ChatLuong, double GiaBan) {
        this.TuaDe = TuaDe;
        this.GiaMua = GiaMua;
        this.ChatLuong = ChatLuong;
        this.GiaBan = GiaBan;

    }

    public double TongGiaTri() {
        return this.ChatLuong * this.GiaBan;
    }

    public void inRa() {
        System.out.println("TuaDe: " + TuaDe);
        System.out.println("GiaMua: " + GiaMua);
        System.out.println("ChatLuong: " + ChatLuong);
        System.out.println("GiaBan: " + GiaBan);
    }
}
    

