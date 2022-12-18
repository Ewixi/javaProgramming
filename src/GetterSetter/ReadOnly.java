package GetterSetter;

public class ReadOnly {
    private String name = "Bartek";  // prywatne pole

    public String getName(){  // publiczna metoda do odczytu prywatnych pól  = GETTER
//        name = name + "jest ok";
//        return name;
        return name + "jest ok";
    }

    public void setName(String name1){ // umożliwiamy ustawienie wartości pola prywatnego, ale nie umożliwiamy pobrania pola = SETTER
        this.name = name;
    }

// skrót klawiszowy: alt insert do wyboru Getter/Setter

}


