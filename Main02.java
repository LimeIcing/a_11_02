import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main02 {

    /*
    Write a method called alternate that accepts two List s as its parameters and returns a new List containing
    alternating elements from the two lists, in the following order:

    First element from first list
    First element from second list
    Second element from first list
    Second element from second list
    Third element from first list
    Third element from second list
    . . .

    If the lists do not contain the same number of elements, the remaining elements from the longer list should be
    placed consecutively at the end. For example, for a first list of [1, 2, 3, 4, 5] and a second list of
    [6, 7, 8, 9, 10, 11, 12] , a call of alternate(list1, list2) should return a list containing
    [1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12] .
     */

    public static void main(String[] args) {
        List a = new LinkedList();
        a.add(1);
        a.add(1);
        a.add(1);
        List b = new LinkedList();
        b.add(0);
        List c = alternate(a,b);
        System.out.println(c);
    }

    public static List alternate(List s, List t) {
        List returnList = new LinkedList();
        int shortestSize = s.size();
        int shortestList = 0;
        if (t.size() < s.size()) {
            shortestSize = t.size();
            shortestList = 1;
        }

        int counter = 0;
        for (int i = 0; i < shortestSize; i++) {
            returnList.add(s.get(i));
            returnList.add(t.get(i));
            counter++;
        }

        if (s.size() != t.size()) {
            if (shortestList == 0) {
                for (int i = counter; i < t.size(); i++) {
                    returnList.add(t.get(i));
                }
            } else {
                for (int i = counter; i < s.size(); i++) {
                    returnList.add(s.get(i));
                }
            }
        }

        return returnList;
    }
}
