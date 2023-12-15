package dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String buyer ="";
    private String drinker = "";
    private List<String> cocktails = new ArrayList<>();

    public List<String> getCocktails() {
        return cocktails;
    }

    public void setCocktails(List<String> fCocktails) {
        this.cocktails = fCocktails;
    }

    public void addCocktail(String fCocktail){
        this.cocktails.add(fCocktail);
    }

    public void setBuyer(String fBuyer){
        this.buyer = fBuyer;
    }

    public String getBuyer() {
        return this.buyer;
    }

    public void setDrinker(String fDrinker){
        this.drinker = fDrinker;
    }


    public String getDrinker() {
        return this.drinker;
    }

    
}
