package ru.skypro;

public class Puffendui extends Person {
    private int trud;
    private int vernost;
    private int chestnost;
    public Puffendui(String name, int strenght, int transgres, int trud,int vernost, int chestnost) {
        super(name, strenght,transgres);
        this.trud = trud;
        this.vernost = vernost;
        this.chestnost = chestnost;
    }

    public int getTrud() {
        return trud;
    }

    public void setTrud(int trud) {
        this.trud = trud;
    }

    public int getVernost() {
        return vernost;
    }

    public void setVernost(int vernost) {
        this.vernost = vernost;
    }

    public int getChestnost() {
        return chestnost;
    }

    public void setChestnost(int chestnost) {
        this.chestnost = chestnost;
    }
    public static void SravnenieVernosti(Puffendui[]puffendui, int one, int two) {
        if(puffendui[one].getVernost() > puffendui[two].getVernost()) {
            System.out.println(puffendui[one].getName() + " вернее, чем " + puffendui[two].getName());
        }
        else if(puffendui[two].getVernost() > puffendui[one].getVernost()) {
            System.out.println(puffendui[two].getName() + " вернее, чем " + puffendui[one].getName());
        }
    }
}
