package tr.edu.maltepe.oop;

public abstract class Person
{
    private String name;

    void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void playing(){
        System.out.println("Person can play");
    }

    public abstract void swimming(String prof, SportCenter sc);

    public abstract void playingFootball(String prof, SportCenter sc);
}
