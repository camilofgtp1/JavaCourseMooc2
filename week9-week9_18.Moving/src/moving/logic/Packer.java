package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int capacity;

    public Packer(int maximumCapacity){

       this.capacity= maximumCapacity;

    }

    //all things we want to pack are given as parameter
    //put each thing in the list into a box until is full
    //if the box is full, get a new Box
    //add box to box list
    //return a list of boxes
    public List<Box> packThings(List<Thing> things){

        ArrayList<Box> packed = new ArrayList<Box>();

        /*
        for (Thing t: things){

            Box b = new Box(capacity);
            b.addThing(t);
            packed.add(b);

        }
        return packed;*/

        for (Thing t : things){

            Box b = new Box(this.capacity);
            if(this.capacity-b.getVolume()<=t.getVolume()){
                b.addThing(t);
                packed.add(b);

            } else {
                Box b1 = new Box(this.capacity);
                b1.addThing(t);
                packed.add(b1);
            }
        }
            return packed;
    }
}