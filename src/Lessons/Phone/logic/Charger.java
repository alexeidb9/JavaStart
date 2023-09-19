package Lessons.Phone.logic;

import Lessons.Phone.model.Telephone;

public class Charger {

    Telephone telephone;

    public void charge(Telephone t) {
        int currentCharge = t.getChargeLevel();
        t.setChargeLevel(currentCharge + 1);
    }


}
