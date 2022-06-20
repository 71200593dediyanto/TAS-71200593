package org.example;

import java.util.Vector;

public class Patient extends Virus{
    private static final int DIE = 0;
    private static final int ALIVE = 1;
    private int m_state = 1;
    private int m_resistance;
    private Vector<Virus> listVirus;


    public Patient(){}

    @Override
    public void DoBorn() {
        Virus v = new Flu();
        v.DoBorn();
    }

    @Override
    public Vector<Virus> DoClone() {
        Virus v = new Flu();
        Vector <Virus> list = v.DoClone();
        return list;
    }

    @Override
    public void DoDie() {
        super.setResistance(100000);
        int tmp1 = super.getResistance();
        this.setResistance(0);
        int tmp2 = this.getResistance();
        if (tmp2 < tmp1){
            System.out.println("Pasien Telah Turu atau Mati !!");
        }
    }

    @Override
    public void InitResistance() {
        super.setResistance(10);
    }

    public void TakeMedicine(int nilai){
        setM_resistance(nilai);
        super.ReduceResistance(nilai);
    }

    public void setM_resistance(int m_resistance) {
        this.m_resistance = m_resistance;
    }

    public int getM_resistance() {
        return m_resistance;
    }

    public int getState() {
        return m_state;
    }

    public void setState(int m_state) {
        this.m_state = m_state;
    }

    @Override
    public int getResistance() {
        return super.getResistance();
    }

    @Override
    public void setResistance(int resistance) {
        super.setResistance(resistance);
    }

    public Vector<Virus> getListVirus() {
        return listVirus;
    }

    public void setListVirus(Vector<Virus> listVirus) {
        this.listVirus = listVirus;
    }
}
