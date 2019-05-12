package com.example.assignment3;

public class Item {

        private String name;
        private String contents;
        private int imageID;

    public Item(String name, String contents, int imageID ) {
        this.name = name;
        this.contents = contents;
        this.imageID = imageID;
    }

    public static final Item[] menu = {

            new Item("Quinoa Salad","Rocket, Carrots,Black Olive, " +
                        "Corn, White Cabbage, Quinoa, Cranberry, Red Onion, Cherryy Tomato, Sunflower Seed, Honey Mustard Sauce",R.drawable.ic_quinoaSalad),
            new Item("Sunrise Salad", "Lettuce, Cucumber, Cherry Tomato, Broccoli, Mushroom, Purpule Onions, Boiled Egg, Turkey, Low Fat Cheese, Avocado," +
                    " Sunflower Seeds, Lemon Sauce", R.drawable.ic_SunriseSalad),
            new Item("Smoked Salmon Sandwich","Smoked Salmon, Tomato, Purple Onion, Avocado, Lettuce, Mushroom, Lemon, Vinigrette",R.drawable.ic_SmokedSalamonSandwich),
            new Item("Soft Yogurt","Seasonal Fruits, Soft Yogurt",R.drawable.ic_SoftYogurt)

        };


        public String getName(){
         return name;}

        public int getImageID(){
         return imageID;}

        public String getContents(){
        return contents;}


}



