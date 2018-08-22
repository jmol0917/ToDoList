package comp5216.sydney.edu.au.todolist;

import java.text.SimpleDateFormat;
import java.util.Date;

public class customItem {
    public String item;
    public String date;

    public customItem(String item) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date getDate = new Date();

        this.item = item;
        this.date = getDate.toString();
    }
}
