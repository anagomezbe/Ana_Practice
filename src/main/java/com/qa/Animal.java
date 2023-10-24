package com.qa;

public class Animal {

    public Animal(String name, String favouriteFood, String type, String gender, int age){
        this.name= name;
        this.favouriteFood= favouriteFood;
        this.type= type;
        this.gender= gender;
        this.age= age;
    }

    public Animal(String name, String favouriteFood, String type, String gender){
        this(name,favouriteFood,type,gender,1);

//        this.name= name;
//        this.favouriteFood= favouriteFood;
//        this.type= type;
//        this.gender= gender;
//        this.age = 1;
    }

    @Override
    public String toString() {
        String output = String.format(" %s is a %s %s. Favourite food: %s . Age: %d years old. ",
                        this.name, this.gender, this.type, this.favouriteFood, this.age);
        return output;
    }

    private String name;
    private String favouriteFood;
    private String type;
    private String gender;
    private int age;

    public String getName() {
        return name;
    }
    public String getFavouriteFood() {
        return favouriteFood;
    }
    public String getType() {
        return type;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
