import org.junit.Test;
import samples.Person;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jitendra on 7/4/16.
 */
public class HashSetTest {

    @Test
    public void testDuplicate() {
        Set<Person> persons = new HashSet<Person>();
        Person p = new Person("Jittu", 35);
        assert persons.add(p);
        assert !persons.add(p); // must return false because person is already inside set
    }
}
