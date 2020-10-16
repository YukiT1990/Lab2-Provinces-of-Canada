package lab2;

/**
 * @author Yuki Tsukada
 */


public class Province {
    private String name;
    private String capital;
    private long population;

    public Province(String name, String capital, long population) {
        if (isValidProvince(name) && isValidCapitalCity(capital)
                && isValidPopulation(population)) {

            this.name = name;
            this.capital = capital;
            this.population = population;
        } else {
            // if there is any error; create the default data, shown below
            this.population = DEFAULT_POPULATION; // 4,648,055
            this.name = DEFAULT_PROVINCE; // “British Columbia”
            this.capital = DEFAULT_CAPITAL; // “Victoria”
        }
        /**
         * for checking separately
         */
//        if(isValidProvince(name)) {
//            this.name = name;
//        } else {
//            this.name = DEFAULT_PROVINCE; // “British Columbia”
//        }
//        if(isValidCapitalCity(capital)) {
//            this.capital = capital;
//        } else {
//            this.capital = DEFAULT_CAPITAL; // “Victoria”
//        }
//        if (isValidPopulation(population)) {
//            this.population = population;
//        } else {
//            this.population = DEFAULT_POPULATION; // 4,648,055
//        }
    }
    public Province() {
        this.population = DEFAULT_POPULATION; // 4,648,055
        this.name = DEFAULT_PROVINCE; // “British Columbia”
        this.capital = DEFAULT_CAPITAL; // “Victoria”
    }


    /**
     * default values
     */
    public static final long DEFAULT_POPULATION = 4648055;
    public static final String DEFAULT_PROVINCE = "British Columbia";
    public static final String DEFAULT_CAPITAL = "Victoria";


    /**
     * check whether String province is a valid province
     * @param province
     * @return
     */
    private boolean isValidProvince(String province) {
        String[] CanadianProvinces = {"Ontario", "Quebec", "Nova Scotia",
                "New Brunswick", "Manitoba", "British Columbia", "Prince Edward Island",
                "Saskatchewan", "Alberta", "Newfoundland and Labrador"};
        for (int i = 0; i < CanadianProvinces.length; i++) {
            if (province == CanadianProvinces[i]) {
                return true;
            }
        }
        return false;
    }

    /**
     * check whether String capital is a valid capital
     * @param capital
     * @return
     */
    private boolean isValidCapitalCity(String capital) {
        String[] CanadianCapitals = {"Toronto", "Quebec City", "Halifax",
                "Fredericton", "Winnipeg", "Victoria", "Charlottetown",
                "Regina", "Edmonton", "St. John's"};
        for (int i = 0; i < CanadianCapitals.length; i++) {
            if (capital == CanadianCapitals[i]) {
                return true;
            }
        }
        return false;
    }


    /**
     * check whether long population is a valid number
     * @param population
     * @return
     */
    private boolean isValidPopulation(long population) {
        if (population >= 30000 && population <= 15000000) {
            return true;
        } else {
            return false;
        }
    }


    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setName(String name) {
        if (isValidProvince(name)) {
            this.name = name;
        }
        this.name = "British Columbia";
    }

    public void setCapital(String capital) {
        if (isValidCapitalCity(capital)) {
            this.capital = capital;
        }
        this.capital = "Victoria";
    }

    public void setPopulation(long population) {
        if (isValidPopulation(population)) {
            this.population = population;
        }
        this.population = 4648055;
    }


    public String getDetails() {
        String detail = String.format("The capital of %s (population. %d) is %s.", this.name, this.population, this.capital);
        return detail;
    }



}
