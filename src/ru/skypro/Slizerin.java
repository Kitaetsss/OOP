package ru.skypro;

public class Slizerin extends Person{
    private int hitrost;
    private int reshitelnost;
    private int ambicii;
    private int nahodchivost;
    private int vlast;
    public Slizerin(String name, int strenght, int transgres, int hitrost, int reshitelnost, int ambicii, int nahodchivost, int vlast) {
        super(name, strenght, transgres);
        this.hitrost = hitrost;
        this.reshitelnost = reshitelnost;
        this.ambicii = ambicii;
        this.nahodchivost = nahodchivost;
        this.vlast = vlast;
    }

    public int getHitrost() {
        return hitrost;
    }

    public void setHitrost(int hitrost) {
        this.hitrost = hitrost;
    }

    public int getReshitelnost() {
        return reshitelnost;
    }

    public void setReshitelnost(int reshitelnost) {
        this.reshitelnost = reshitelnost;
    }

    public int getAmbicii() {
        return ambicii;
    }

    public void setAmbicii(int ambicii) {
        this.ambicii = ambicii;
    }

    public int getNahodchivost() {
        return nahodchivost;
    }

    public void setNahodchivost(int nahodchivost) {
        this.nahodchivost = nahodchivost;
    }

    public int getVlast() {
        return vlast;
    }

    public void setVlast(int vlast) {
        this.vlast = vlast;
    }
    public static void  SreavnenieVlasti(Slizerin[]slizerin, int one, int two){
        if (slizerin[one].getVlast() > slizerin[two].getVlast()) {
            System.out.println(slizerin[one].getName() + " жаждет власти больше, чем " + slizerin[two].getName());
        }
        else if(slizerin[one].getVlast() < slizerin[two].getVlast()) {
            System.out.println(slizerin[two].getName() + " жаждет власти больше, чем " + slizerin[one].getName());
        }
    }
}
