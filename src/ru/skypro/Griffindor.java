package ru.skypro;

public class Griffindor extends Hogwards{

    private final int nobility;
    private final int honour;
    private final int bravery;

    public Griffindor(String name, int strenght, int transgres, int nobility, int honour, int bravery){
        super(name, strenght, transgres);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }
    public int getNobility() {
        return nobility;
    }
    public int getHonour() {
        return honour;
    }
    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() + ", Благородство студента " + nobility + ", честь равна " + honour + ", храбрость равна " + bravery + ".";
    }
    public void compareGriffindor(Griffindor student) {
        if (this.nobility > student.getNobility()) {
            System.out.println("Благородство " + this.getName() + " выше чем у " + student.getName());
        }else if (this.nobility == student.getNobility()) {
            System.out.println("Благородство " + getName() + " и " + student.getName() + " равны.");
        }else {
            System.out.println("Благородство " + this.getName() + " ниже чем у " + student.getName());
        }
        if (this.honour > student.getHonour()) {
            System.out.println("Честь " + this.getName() + " выше чем у " + student.getName());
        }else if (this.honour == student.getHonour()) {
            System.out.println("Честь " + getName() + " и " + student.getName() + " равны.");
        }else {
            System.out.println("Честь " + this.getName() + " ниже чем у " + student.getName());
        }
        if (this.bravery > student.getBravery()) {
            System.out.println("Храбрость " + this.getName() + " выше чем у " + student.getName());
        }else if (this.bravery == student.getBravery()) {
            System.out.println("Храбрость " + getName() + " и " + student.getName() + " равны.");
        }else {
            System.out.println("Храбрость " + this.getName() + " ниже чем у " + student.getName());
        }
    }
}
