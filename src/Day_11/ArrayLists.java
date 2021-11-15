package Day_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(0, 33);
        arrayList.add(0, 34);
        arrayList.add(0, 35);

        for(int i = 0; i<4; i++){
            arrayList.add(i);}
            System.out.println(arrayList);
    }
}
