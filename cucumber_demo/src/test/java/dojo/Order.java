package test.java.dojo;

import java.util.ArrayList;

public class Order {
    private string buyer ="";
    private string drinker = "";
    private List<string> cocktails = new ArrayList<>();

    public List<string> getCocktails() {
        return cocktails;
    }

    public void setCocktails(List<string> fCocktails) {
        this.cocktails = fCocktails;
    }

    public void addCocktail(string fCocktail){
        this.cocktails.add(fCocktail);
    }

    public void setBuyer(string fBuyer){
        this.buyer = fBuyer;
    }

    public string getBuyer() {
        return this.buyer;
    }

    public void setDrinker(string fDrinker){
        this.drinker = fDrinker;
    }


    public string getDrinker() {
        return this.drinker;
    }

    
}
