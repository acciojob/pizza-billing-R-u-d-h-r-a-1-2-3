package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);  //calling parents constructor
        // your code goes here

        addExtraCheese();
        addExtraToppings();

        //ALL THE THREE WILL WORK
//
//        super.addExtraCheese();git
//        super.addExtraToppings();
//
//        this.addExtraCheese();
//        this.addExtraToppings();
//    }
    }
}
