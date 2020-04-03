package javabai20.abs.subclass;

import javabai20.abs.superclass.dongvat;

public class dongvattrencan extends dongvat {
    String moitruongsong;

    public dongvattrencan(String name, int chan, String moitruongsong) {
        super(chan, name);
        this.moitruongsong = moitruongsong;
    }

    @Override
    public String toString() {
        return super.toString() + "Môi trường sống: " + moitruongsong;
    }

    @Override
    public void dongvatsanmoi() {
        System.out.printf("con %s có %d chân, sống ở %s", getName(), getChan(), moitruongsong);
    }

    @Override
    public void dongvatduoinuoc() {
        System.out.printf("con %s có %d chân, sống ở %s", getName(), getChan(), moitruongsong);
    }

    public static void main(String[] args) {
        dongvat dv1 = new dongvattrencan("name", 4, "trên cạn");
        System.out.println(dv1);
    }

}
