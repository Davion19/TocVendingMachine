package org.example.Model;

public class ItemRegister extends Register{

    private static int napkinStock = 20;
    private static int knifeStock = 20;
    private static int forkStock = 20;
    private static int spoonStock = 20;
    private static final int NAPKIN_PRICE = 10;
    private static final int KNIFE_PRICE = 25;
    private static final int FORK_PRICE = 15;
    private static final int SPOON_PRICE = 20;
    private static final int NAPKIN_CODE = 1;
    private static final int KNIFE_CODE = 2;
    private static final int FORK_CODE = 3;
    private static final int SPOON_CODE = 4;

    public ItemRegister() {
        super();

    }

    public ItemRegister(double storedValue) {
        super(storedValue);
    }
}
