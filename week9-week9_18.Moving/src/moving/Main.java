package moving;
import moving.domain.Item;
import moving.domain.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class Main {

    public static void main(String[] args) {
        // test your program here

        Box box = new Box(200);
        box.addThing( new Item("Olutkori", 10));
        box.addThing( new Item("Stone", 5) );
        System.out.println(box.getVolume());


    }
}
