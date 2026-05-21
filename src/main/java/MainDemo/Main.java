package MainDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {




    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3);
        ListIterator<Integer> listIterator = list.listIterator();
        System.out.println(listIterator.previous());
    }


}


