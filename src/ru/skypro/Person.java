package ru.skypro;

public class Person {
    private String name;
    private int strenght;
    private int transgres;
    public Person(String name, int strenght, int transgres) {
        this.name = name;
        this.strenght = strenght;
        this.transgres = transgres;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getTransgres() {
        return transgres;
    }

    public void setTransgres(int transgres) {
        this.transgres = transgres;
    }
    public static void SravnenieSili(Griffindor[]griffindor, Slizerin[]slizerin, int z, int c){
        if(griffindor[z].getStrenght() > slizerin[c].getStrenght()) {
            System.out.println(griffindor[z].getName() + " обладает более мощной магией, чем " + slizerin[c].getName());
        }
        else if(griffindor[z].getBlago() < griffindor[c].getBlago()) {
            System.out.println(slizerin[c].getName() + " обладает более мощной магией, чем " + griffindor[z].getName());
        }
    }
}
