package com.example.bicyclefinder;

import androidx.annotation.NonNull;
import java.io.Serializable;

public class Bikes {
    private String brand;
    private String category;
    private String gender;
    private String colour;
    private String description;
    private int bikeId;
    private int imageResourceId;


    public static final Bikes[] bikes = {
            new Bikes("Kildemoes", "Adult","Blue", "Female",
                    "Made of aluminium with an iron core, rubber handles and gear going up to 7",
                    1, 1),
            new Bikes("Specialized", "Adult", "Green", "Male and Female",
                    "Made of aluminium with an iron core, rubber handles and gear going up to 3",
                    2, 1),
            new Bikes("Centurion", "Adult", "Black","Male",
                    "Made of carbon, rubber handles and gear going up to 11",
                    3, 1),
            new Bikes("Jupiter","Child", "Multicoloured","Boys and girls",
                    "Made of aluminium, rubber handles and no gears",
                    4, 1),
            new Bikes("Batavus", "Child","Dark Blue", "Boy",
                    "Made of aluminium, rubber handles and gear going up to 3",
                    5, 1),
            new Bikes("Avenue","Child", "Pink", "Girl", "Made of aluminium with , rubber handles and gear going up to 3",
                    6, 1)};

    private Bikes(String brand, String category, String colour, String gender, String description, int bikeId, int imageResourceId){
        this.brand = brand;
        this.category = category;
        this.colour = colour;
        this.gender = gender;
        this.description = description;
        this.bikeId = bikeId;
        this.imageResourceId = imageResourceId;
    }
    public String getBrand(){
        return brand;
    }
    public String getCategory(){
        return category;
    }
    private String getColour(){
        return colour;
    }
    private String getGender(){
        return gender;
    }
    private String getDescription(){
        return description;
    }
    public int getBikeId(){
        return bikeId;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }

    @NonNull
    @Override

    public String toString(){
        return this.brand;}
}