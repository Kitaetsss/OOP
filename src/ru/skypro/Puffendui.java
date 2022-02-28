package ru.skypro;

public class Puffendui extends Hogwards {
    private int work;
    private int loyalty;
    private int honesty;

    public Puffendui(String name, int strenght, int transgres, int work, int loyalty, int honesty) {
        super(name, strenght, transgres);
        this.work = work;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getWork() {
        return work;
    }

    public void setWork(int work) {
        this.work = work;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() + ", Трудолюбие " + work + ", верность " + loyalty + ", честность " + honesty + ".";
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void comparePuffendui(Puffendui student) {
        if (this.work > student.getWork()) {
            System.out.println("Трудолюбие " + this.getName() + " выше чем у " + student.getName());
        } else if (this.work == student.getWork()) {
            System.out.println("Трудолюбие " + getName() + " и " + student.getName() + " равны.");
        } else {
            System.out.println("Трудолюбие " + this.getName() + " ниже чем у " + student.getName());
        }
        if (this.loyalty > student.getLoyalty()) {
            System.out.println("Верность " + this.getName() + " выше чем у " + student.getName());
        } else if (this.loyalty == student.getLoyalty()) {
            System.out.println("Верность " + getName() + " и " + student.getName() + " равны.");
        } else {
            System.out.println("Верность " + this.getName() + " ниже чем у " + student.getName());
        }
        if (this.honesty > student.getHonesty()) {
            System.out.println("Честность " + this.getName() + " выше чем у " + student.getName());
        } else if (this.honesty == student.getHonesty()) {
            System.out.println("Честность " + getName() + " и " + student.getName() + " равны.");
        } else {
            System.out.println("Честность " + this.getName() + " ниже чем у " + student.getName());
        }
    }
}
