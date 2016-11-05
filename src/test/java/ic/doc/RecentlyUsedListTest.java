package ic.doc;

import org.hamcrest.core.Is;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

public class RecentlyUsedListTest {

    RecentlyUsedList list = new RecentlyUsedList();

    @Test
    public void isInitialisedEmpty() {
        assertTrue(list.isEmpty());
        assertThat(list.size(), is(0));
    }

    @Test
    public void allowsItemsToBeAdded() {
        list.add("hello");
        assertFalse(list.isEmpty());
        assertThat(list.size(), is(1));
    }

    @Test
    public void allowsElementsToBeRetrieved() {
        list.add("one");
        assertThat(list.get(0), Is.<Object>is("one"));
    }

    @Test
    public void keepTheMostRecentItemAtTheTopOfList() {
        list.add("one");
        list.add("two");
        assertThat(list.get(0), Is.<Object>is("two"));
        assertThat(list.get(1), Is.<Object>is("one"));
    }

    @Test
    public void preventDuplicationInput() {
        list.add("one");
        list.add("one");
        assertThat(list.size(), is(1));
    }

    @Test
    public void movesTheMostRecentEntryToTheTopOfListDuplicateAdded() {
        list.add("one");
        list.add("two");
        list.add("one");
        assertThat(list.size(), is(2));
        assertThat(list.get(0), Is.<Object>is("one"));
    }





}
