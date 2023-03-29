package enums;

public enum Day {
    MONDAY(1,"Pazartesi"),
    TUESDAY(2,"Salı"),
    WEDNESDAY(3,"Çarşamba");

    private int number;
    private String name;

    private Day(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
