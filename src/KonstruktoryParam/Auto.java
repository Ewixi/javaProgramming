package KonstruktoryParam;

public class Auto {

    public String marka;
    public String model;
    public Integer rok;
    public Integer przebieg;

    public Auto (String marka,String model,Integer rok, Integer przebieg){
        System.out.println("marka: " + marka +   " \nmodel: " + model + " \nrok: " + rok + " \nprzebieg: " + przebieg); // \n - jako oznaka nowej linijki

        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;

    }
}
