package org.example;

import java.util.Vector;

public class Flu extends Virus {
    private static final int BLUE = 0x0000ff;
    private int color;

    public Flu(){}
    public Flu(Flu f){}

    @Override
    public void DoBorn() {
        Virus virus = new Flu();
    }

    @Override
    public Vector<Virus> DoClone() {
        Vector <Virus> v = new Vector<Virus>();
        v.addElement(new Flu());
        this.InitResistance();
        return v;
    }

    @Override
    public void DoDie() {
        super.setResistance(0);
        System.out.println("Virus Telah Mati !");
    }

    @Override
    public void InitResistance() {
        super.setResistance(10);
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
