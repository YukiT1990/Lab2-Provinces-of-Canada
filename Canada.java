package lab2;

public class Canada {

    private Province[] provinces;
    public Canada(){
        provinces = new Province[10];
        provinces[0] = new Province("Ontario", "Toronto", 13448494);
        provinces[1] = new Province("Quebec", "Quebec City", 8164361);
        provinces[2] = new Province("British Columbia", "Victoria", 4648055);
        provinces[3] = new Province("Alberta", "Edmonton", 4067175);
        provinces[4] = new Province("Manitoba", "Edmonton", 1278365);
        provinces[5] = new Province("Saskatchewan", "Regina", 1098352);
        provinces[6] = new Province("Nova Scotia", "Halifax", 923598);
        provinces[7] = new Province("New Brunswick", "Fredericton", 747101);
        provinces[8] = new Province("Newfoundland and Labrador", "St. John's", 519716);
        provinces[9] = new Province("Prince Edward Island", "Charlottetown", 142907);
    }


    public void displayAllProvinces() {
//        for (int i = 0; i < provinces.length; i++) {
//            System.out.println(provinces[i].getDetails());
//        }
        for(Province province: provinces) {
            System.out.println(province.getDetails());
        }
    }

    public int getNumOfProvincesBetween(int min, int max) {
        int count = 0;
        for(Province province: provinces) {
            if (province.getPopulation() >= min * 1000000 && province.getPopulation() <= max * 1000000) {
                count += 1;
            }
        }
        return count;
    }

}
