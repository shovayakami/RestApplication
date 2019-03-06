package np.com.pangait.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bikra on 3/1/2019 3:39 PM.
 */
public class RestApplication {
    public static List<Person> personList = new ArrayList<>();
    static {
        personList.add(new Person("Rita", "Pita", 39, "Denver", "Colorado","USA",true));
        personList.add(new Person("Mita", "yadab", 34, "Philadelphia", "Pennsylvania","USA",false));
        personList.add(new Person("Dita", "oooo", 50, "Chicago", "Illinois","USA",true));
        personList.add(new Person("Jita", "bbbbb", 30, "dover", "Delaware","USA",true));
        personList.add(new Person("Mita", "nnnnnn", 20, "Boston", "Massachusetts","USA",false));

    }
}
