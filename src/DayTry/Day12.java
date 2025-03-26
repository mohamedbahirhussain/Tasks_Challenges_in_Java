package DayTry;

import java.util.*;

public class Day12 {
    public void sortlist(){
        List<String> names = Arrays.asList("Mohamed", "Bahir", "Hussain");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }
}
