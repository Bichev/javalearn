package samples.tasks;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Vladimir Bichev
 * Date: 23.10.11
 * Time: 19:08
 */
public class DummyGeneratorImpl implements DummyGenerator{

    public List<String> createListOfStrings () {
        List<String> listOfStrings = new LinkedList<String>();

        listOfStrings.add("1");
        listOfStrings.add("2");
        listOfStrings.add("3");
        listOfStrings.add("4");
        listOfStrings.add("5");
        listOfStrings.add("6");
        listOfStrings.add("7");

        return listOfStrings;
    }
}
