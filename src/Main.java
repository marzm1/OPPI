import java.util.*;

import static java.util.Collections.list;

public class Main {
    public static void main(String[] args) {
        List<Napoje> list = new ArrayList<Napoje>();
        list.add(new Woda("koka"));
        list.add(new Cola("koka"));
        list.add(new Helena("koka"));

        for (int i = 0; i < list.size(); i++)
            list.get(i).pij();

        list.sort(new Comparator<Napoje>() {
            @Override
            public int compare(Napoje o1, Napoje o2) {
              String nazwa1 =  o1.getNazwa();
              String nazwa2 =  o2.getNazwa();
                String className1 = o1.getClass().getSimpleName();
                String className2 = o2.getClass().getSimpleName();
              if (Objects.equals(nazwa1, nazwa2)){
                return className1.compareTo(className2);
              }
              else{
                return  nazwa1.compareTo(nazwa2);
            }
        }});

        System.out.println(list);

    }



}