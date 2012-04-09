package samples.tasks;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Vladimir Bichev
 * Date: 23.10.11
 * Time: 19:09
 */
public class Runner {

    public static void main (String[] args) {
        DummyGeneratorImpl dummyGenerator = new DummyGeneratorImpl();

        List<String> newListOfStrings = dummyGenerator.createListOfStrings();

        for (Iterator iterator = newListOfStrings.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}
