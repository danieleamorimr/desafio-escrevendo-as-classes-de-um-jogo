package model;

public class Hero {

    private String name;
    private Integer age;
    private String type;
    private String attack;

    public Hero(String name, Integer age, String type) throws Exception {
        this.name = name;
        this.age = age;
        this.type = type;
        switch (type) {
            case ("warrior"):
                attack = "sword";
                break;
            case ("wizard"):
                attack = "magic";
                break;
            case ("monk"):
                attack = "martial arts";
                break;
            case ("ninja"):
                attack = "shuriken";
                break;
            default:
                throw new Exception("Invalid warrior.");
        }

    }

    public void attack() {
        System.out.println("The hero " + name + ", who is " + age + " years old, is a "
                + type + ". He/She attacked with " + attack + ".");
    }

}