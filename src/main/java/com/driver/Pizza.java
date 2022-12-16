package com.driver;

public class Pizza {

    private int price;        // Calculate final bill price
    private boolean isVeg;
    private String bill;

    private int cheesePrice;

    private int toppingsPrice;

    private int takeawayPrice;

    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isTakeAwayAdded;

    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheesePrice = 80;
        this.takeawayPrice = 20;

        if(isVeg){
            this.price = 300;
            this.toppingsPrice = 70;
        }else{
            this.price = 400;
            this.toppingsPrice = 120;
        }

        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isTakeAwayAdded = false;
        this.isBillGenerated = false;
        // your code goes here

        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
        //Base Price Of The Pizza: 300
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false){
            this.price = this.price + this.cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded == false){
            this.price = this.price + this.toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded == false){
            this.price = this.price + this.takeawayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false){
            if(isCheeseAdded){
                this.bill = this.bill + "Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(isToppingsAdded){
                this.bill = this.bill + "Extra Toppings Added: "+this.toppingsPrice+"\n";
            }
            if(isTakeAwayAdded){
                this.bill = this.bill + "Paper bag Added: "+this.takeawayPrice+"\n";
            }
            this.bill = this.bill + "Total Price :"+this.price+"\n";
            this.isBillGenerated = true;
        }

        return this.bill;
    }
}
