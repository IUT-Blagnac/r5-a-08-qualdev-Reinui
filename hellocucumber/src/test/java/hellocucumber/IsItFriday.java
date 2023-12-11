package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

class IsItFriday {
    static String isItFriday(String today) {
        if (today.equals("Friday")){
            return "TGIF";
        }else return "Nope";
    }
    
}