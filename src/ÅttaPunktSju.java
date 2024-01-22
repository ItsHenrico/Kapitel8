import java.text.SimpleDateFormat;
import java.util.Date;

public class ÅttaPunktSju {
    public static void main(String[] args){
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String currentDateTime = dateFormat.format(currentDate);
        System.out.println(currentDateTime);
    }
}
