import java.util.Calendar;

public class ÅttaPunktÅtta {
    public static void main(String[] args){
        System.out.println(getCurrentYear() + "/" + getCurrentMonth() + "/" + getCurrentDay());
    }

    static String date = Calendar.getInstance().getTime().toString();
    public static String getCurrentYear() {
        return ÅttaPunktÅtta.date.substring(24, 28);
    }

    public static String getCurrentDay(){
        return ÅttaPunktÅtta.date.substring(8, 10);
    }

    public static String getCurrentMonth(){
        String month = ÅttaPunktÅtta.date.substring(4, 7);

        String[] Month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Agu", "Sep", "Oct", "Nov", "Dec"};
        for (int i = 0; i < 12; i++) {
            if(month.equals(Month[i])) {
                month = Integer.toString(i + 1);
                    if(i < 10){ //sätter en nolla om talet är under 10
                        month = (0 + month);
                    }
            }
        }
        return (month);
    }
}

