package org.example.Model;

public class Register {

    static class EmptyStockException extends Exception{
        public EmptyStockException(String str){
            super(str);
        }
    }
    private double storedValue;

    public Register() {
    }

    public Register(double storedValue) {
        this.storedValue = storedValue;
    }

    public double getStoredValue() {
        return storedValue;
    }

    public void setStoredValue(double storedValue) {
        this.storedValue = storedValue;
    }

    @Override
    public String toString() {
        return "Register{" +
                "storedValue=" + storedValue +
                '}';
    }


    public static class ItemRegister extends Register{

        private static int napkinStock;
        private static int knifeStock ;
        private static int forkStock;
        private static int spoonStock ;
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
            napkinStock = 20;
            knifeStock = 20;
            forkStock = 20;
            spoonStock = 20;

        }


        public static void checkStockLevels() {
            if (napkinStock < 5 || knifeStock < 5 || forkStock < 5 || spoonStock < 5) {
                System.out.println("WARNING: One or more item stocks are running low!");
                if (napkinStock < 5) {
                    System.out.println("Napkin stock: " + napkinStock);
                }
                if (knifeStock < 5) {
                    System.out.println("Knife stock: " + knifeStock);
                }
                if (forkStock < 5) {
                    System.out.println("Fork stock: " + forkStock);
                }
                if (spoonStock < 5) {
                    System.out.println("Spoon stock: " + spoonStock);
                }
            }
        }


        public ItemRegister(double storedValue) {
            super(storedValue);
        }
    // to add item simply int itemCount = setKnife(getKnife()+incrementValue);
        public static int getNapkinStock() {
            return napkinStock;
        }

        public static void setNapkinStock(int napkinStock) {
            checkStockLevels();
            ItemRegister.napkinStock = napkinStock;
        }

        public static int getKnifeStock() {
            return knifeStock;
        }

        public static void setKnifeStock(int knifeStock) {
            checkStockLevels();
            ItemRegister.knifeStock = knifeStock;
        }

        public static int getForkStock() {
            return forkStock;
        }

        public static void setForkStock(int forkStock) {
            checkStockLevels();
            ItemRegister.forkStock = forkStock;
        }

        public static int getSpoonStock() {
            return spoonStock;
        }

        public static void setSpoonStock(int spoonStock) {
            checkStockLevels();
            ItemRegister.spoonStock = spoonStock;
        }
    }

}

