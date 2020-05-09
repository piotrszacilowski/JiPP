package task05;

public enum Pizza {

    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, true, false),
    PROSCIUTTO(true, true, false, true);

    boolean tomatoSauce;
    boolean cheese;
    boolean mushrooms;
    boolean ham;

    Pizza(boolean tomatoSauce, boolean cheese, boolean mushrooms, boolean ham) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
        this.ham = ham;
    }

    @Override
    public String toString() {
        String info = name() + " {";
        if (tomatoSauce)
            info += "tomato sauce";
        if (cheese)
            info += ", cheese";
        if (mushrooms)
            info += ", mushrooms";
        if (ham)
            info += ", ham";

        info += "}";
        return info;
    }
}