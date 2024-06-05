package TruuTuong;

public class Bang {
    package TruuTuong;

import BinhThuong.ClassCha

public class Tape extends Publication {
    private int duration; // in minutes
    private String producer;

    public Tape(String title, double purchasePrice, int duration, String producer, int quantitySold, double salePrice) {
        super(title, purchasePrice, quantitySold, salePrice);
        this.duration = duration;
        this.producer = producer;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Producer: " + producer);
    }
}
    
}
