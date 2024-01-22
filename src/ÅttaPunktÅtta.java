import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ÅttaPunktÅtta {
    public static void main(String[] args){
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String currentDateTime = dateFormat.format(currentDate);
        System.out.println(currentDateTime);
    }
}

