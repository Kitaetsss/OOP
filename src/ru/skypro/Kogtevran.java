package ru.skypro;

public class Kogtevran extends Person{
    private int um;
    private int mudrost;
    private int tvorchestvo;
    public Kogtevran(String name, int strenght, int transgres, int um, int mudrost, int tvorchestvo) {
        super(name, strenght, strenght);
        this.um = um;
        this.mudrost = mudrost;
        this.tvorchestvo = tvorchestvo;
    }

    public int getUm() {
        return um;
    }

    public void setUm(int um) {
        this.um = um;
    }

    public int getMudrost() {
        return mudrost;
    }

    public void setMudrost(int mudrost) {
        this.mudrost = mudrost;
    }

    public int getTvorchestvo() {
        return tvorchestvo;
    }

    public void setTvorchestvo(int tvorchestvo) {
        this.tvorchestvo = tvorchestvo;
    }
    public static void SravnenieUma(Kogtevran[]kogtevran, int one, int two) {
        if(kogtevran[one].getUm() > kogtevran[two].getUm()) {
            System.out.println(kogtevran[one].getName() + " умнее, чем " + kogtevran[two].getName());
        }
        else if(kogtevran[two].getUm() > kogtevran[one].getUm()) {
            System.out.println(kogtevran[two].getName() + " умнее, чем " + kogtevran[one].getName());
        }
    }
}
