package enums;

public class DayTest {
    private static  void printDay(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Pazartesi");
            case TUESDAY:
                System.out.println("Salı");
            case WEDNESDAY:
                System.out.println("Çarşamba");
            default:
                System.out.println("Geçersiz gün");
        }
    }

    public static void main(String[] args) {
    }
}


// ödev 1 enumu yap day yap içine iki tane field koy sonrada bir tane print eden kod yaz.
/*Static method niye, nedir ?
*
*
* */