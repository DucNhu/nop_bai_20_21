package javabai20.abs.subclass;

import javabai20.abs.superclass.dongvat;

public class dongvatduoinuoc extends dongvat {
    String moitruongsong;

    public dongvatduoinuoc(String name, int chan, String moitruongsong) {
        super(chan, name);
        this.moitruongsong = moitruongsong;
    }

    @Override
    public String toString() {
        return super.toString() + "moi truong song: " + moitruongsong;
    }

    @Override
    public void dongvatsanmoi() {
        System.out.printf("con %s có %d chân, sống ở %s", getName(), getChan(), moitruongsong);
    }

    @Override
    public void dongvatduoinuoc() {
        System.out.printf("con %s có %d chân, sống ở %s", getName(), getChan(), moitruongsong);
    }
}
