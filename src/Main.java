import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.list;

public class Main {
    public static void main(String[] args) {
        List<Napoje> list = new ArrayList<Napoje>();
        list.add(new Woda());
        list.add(new Cola());
        list.add(new helena());

        for (int i = 0; i < list.size(); i++)
            list.get(i).pij();

    }



}