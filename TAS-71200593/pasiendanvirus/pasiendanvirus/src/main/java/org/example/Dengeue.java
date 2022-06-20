package org.example;

import java.util.Vector;

public class Dengeue extends Virus{
    private String protein;

    public Dengeue(){}

    public Dengeue(Dengeue d){

    }

    @Override
    public void DoBorn() {
        Virus virus = new Dengeue();
    }

    @Override
    public Vector<Virus> DoClone() {
        Vector <Virus> v = new Vector<Virus>();
        v.addElement(new Dengeue());
        v.addElement(new Dengeue());
        this.InitResistance();
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
        super.setResistance(15);
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

}
