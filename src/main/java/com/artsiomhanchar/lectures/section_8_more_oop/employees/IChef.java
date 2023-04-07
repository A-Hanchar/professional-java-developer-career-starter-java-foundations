package com.artsiomhanchar.lectures.section_8_more_oop.employees;

public interface IChef {
    String favouriteFood = "hamburger";

    default void cook(String food) {
        System.out.println("I am now cooking " + food);
    };

    default String cleanUp() {
        return "I'm done cleaning up";
    }

    default String getFavouriteFood() {
        return favouriteFood;
    }

//    it error, because value auto is final
//    default String setFavouriteFood(String favouriteFood) {
//        this.favouriteFood = favouriteFood;
//    }

    static int convertUnits() {
        return 0;
    }

//    String yellAtPeople();
}
