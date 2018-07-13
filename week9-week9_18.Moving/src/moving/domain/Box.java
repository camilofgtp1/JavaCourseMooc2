/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author camilo
 */
public class Box implements Thing {

    private int maximumCapacity;
    private List<Thing> contentsList;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        contentsList= new ArrayList<Thing>();

    }


    //adds thing to list if box volume is enough, else returns false
    public boolean addThing(Thing t) {


        if((maximumCapacity-this.getVolume())<t.getVolume()){
            return false;
        } else {
            //boxContents.put(t.getVolume(), t.toString());
            contentsList.add(t);

        }
        return true;


    }

    //should return the current volume of all items NOT size of arraylist
    @Override
    public int getVolume() {


        int vol = 0;
        for (Thing t: contentsList) {

            vol += t.getVolume();
        }

        return vol;


    }

    /*public void getContents() {

        for (String value : boxContents.values()) {
            System.out.println(value);

        }
    }*/
}
