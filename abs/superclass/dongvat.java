package javabai20.abs.superclass;

public abstract class dongvat {
    int chan;
    String name;

    public abstract void dongvatsanmoi();
    public abstract void dongvatduoinuoc();
    public dongvat() {
        name="";
        chan = 0;
    }
    public dongvat(int chan, String name) {
        this.chan = chan;
        this.name = name;
    }

    public int getChan() {
        return chan;
    }

    public void setChan(int chan) {
        this.chan = chan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "dongvat{" +
                "chan=" + chan +
                ", name='" + name + '\'' +
                '}';
    }
}
