package ru.skypro;

public class Griffindor extends Person{
    private int blago;
    private int chest;
    private int hrabrost;
    public Griffindor(String name, int strenght, int transgres, int blago, int chest, int hrabrost){
        super(name, strenght, transgres);
        this.blago = blago;
        this.chest = chest;
        this.hrabrost = hrabrost;
    }

    public int getBlago() {
        return blago;
    }

    public void setBlago(int blago) {
        this.blago = blago;
    }

    public int getChest() {
        return chest;
    }

    public void setChest(int chest) {
        this.chest = chest;
    }

    public int getHrabrost() {
        return hrabrost;
    }

    public void setHrabrost(int hrabrost) {
        this.hrabrost = hrabrost;
    }
    public void Opis() {
        System.out.println("Имя студента " + getName() + " Сила " + getStrenght() + " Расстояние трансгрессии " + getTransgres() + " Благородство " + getBlago() + " Честь " + getChest() + " Храбрость " + getHrabrost());
    }
    public static void SravnenieBlago(Griffindor[]griffindor, int one, int two) {
        if(griffindor[one].getBlago() > griffindor[two].getBlago()) {
            System.out.println(griffindor[one].getBlago() + " благороднее, чем " + griffindor[two].getBlago());
        }
        else if(griffindor[two].getBlago() > griffindor[one].getBlago()) {
            System.out.println(griffindor[two].getName() + " благороднее, чем " + griffindor[one].getName());
        }
    }
}
