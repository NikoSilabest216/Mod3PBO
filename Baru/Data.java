package Baru;

import Baru_2.Isi;

public class Data
{
    public String awal = "Halo guys";

    public void Kamu(int a)
    {
        System.out.println("Anda lahir tahun: "+a);
    }
    protected void Kamu(Double b)
    {
        System.out.println("Bobot anda: "+b+" Kg");
    }
    private String Kamu;


    public String getKamu() {
        return Kamu;
    }

    public void setKamu(String kamu) {
        Kamu = kamu;
    }
}

class Drive
{
    public static void main(String[] args)
    {
        Data anda = new Data();
        Isi baru = new Isi();
        baru.data();
        anda.Kamu(2020);
        anda.Kamu(5.32);
        anda.setKamu("Lapet");
        System.out.println("KAMU! "+anda.getKamu());
    }
}