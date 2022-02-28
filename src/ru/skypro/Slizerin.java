package ru.skypro;

public class Slizerin extends Hogwards{
    private int trick;
    private int determination;
    private int ambitions;
    private int resourcefulness;
    private int authority;
    public Slizerin(String name, int strenght, int transgres, int trick, int determination, int ambitions, int resourcefulness, int authority) {
        super(name, strenght, transgres);
        this.trick = trick;
        this.determination = determination;
        this.ambitions = ambitions;
        this.resourcefulness = resourcefulness;
        this.authority = authority;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbitions() {
        return ambitions;
    }

    public void setAmbitions(int ambitions) {
        this.ambitions = ambitions;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return super.toString() + ", Хитрость " + trick + ", решимость " + determination + ", амбиции " + ambitions + " , находчивость " + resourcefulness + " , жажда власти " + authority;
    }
    public void compareSlizerin(Slizerin student) {
        if (this.trick > student.getTrick()) {
            System.out.println("Хитрость " + this.getName() + " выше чем у " + student.getName());
        }else if (this.trick == student.getTrick()) {
            System.out.println("Хитрость " + getName() + " и " + student.getName() + " равны.");
        }else {
            System.out.println("Хитрость " + this.getName() + " ниже чем у " + student.getName());
        }
        if (this.determination > student.getDetermination()) {
            System.out.println("Решимость " + this.getName() + " выше чем у " + student.getName());
        }else if (this.determination == student.getDetermination()) {
            System.out.println("Решимость " + getName() + " и " + student.getName() + " равны.");
        }else {
            System.out.println("Решимость " + this.getName() + " ниже чем у " + student.getName());
        }
        if (this.ambitions > student.getAmbitions()) {
            System.out.println("Амбиции " + this.getName() + " выше чем у " + student.getName());
        }else if (this.ambitions == student.getAmbitions()) {
            System.out.println("Амбиции " + getName() + " и " + student.getName() + " равны.");
        }else {
            System.out.println("Амбиции " + this.getName() + " ниже чем у " + student.getName());
        }
        if (this.resourcefulness > student.getResourcefulness()) {
            System.out.println("Находчивость " + this.getName() + " выше чем у " + student.getName());
        }else if (this.resourcefulness == student.getResourcefulness()) {
            System.out.println("Находчивость " + getName() + " и " + student.getName() + " равны.");
        }else {
            System.out.println("Находчивость " + this.getName() + " ниже чем у " + student.getName());
        }
        if (this.authority > student.getAuthority()) {
            System.out.println("Жажда власти " + this.getName() + " выше чем у " + student.getName());
        }else if (this.authority == student.getAuthority()) {
            System.out.println("Жажда власти " + getName() + " и " + student.getName() + " равны.");
        }else {
            System.out.println("Жажда власти " + this.getName() + " ниже чем у " + student.getName());
        }
    }
}
