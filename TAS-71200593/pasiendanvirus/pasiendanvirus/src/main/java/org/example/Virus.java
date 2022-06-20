package org.example;
import java.io.*;
import java.util.*;

public abstract class Virus {
    private int resistance;
    private String m_dna;

    public Virus(){}

    public abstract void DoBorn();

    public abstract Vector<Virus> DoClone();

    public abstract void DoDie();

    public abstract void InitResistance();

    public void LoadADNInformation(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Masukka direktori file : ");
        String file = inp.nextLine();
        try {
            String tmp = "";

            FileInputStream adn = new FileInputStream(file);

            int i = 0;
            while ((i=adn.read()) != -1){
                tmp += (char)i;
            }
            adn.close();
            setM_dna(tmp);
            System.out.println("Nilai dna virus adalah "+getM_dna());
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void ReduceResistance(int m_resistance){
        if (getResistance()<=0){
            System.out.println("Virus Telah Mati");
            return;
        }
        int tmp = getResistance()-m_resistance;
        setResistance(tmp);
    }

    public int getResistance() {
        return resistance;
    }

    public String getM_dna() {
        return m_dna;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public void setM_dna(String m_dna) {
        this.m_dna = m_dna;
    }
}
