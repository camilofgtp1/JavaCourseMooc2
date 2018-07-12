/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camilo
 */
public class Box implements Thing {

    private int maximumCapacity;
    private ArrayList<Thing> contents;


    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        contents = new ArrayList<Thing>();


    }


    //things have to be added to the list
    public boolean addThing(Thing t){

        if (this.getVolume()>0){
            System.out.println("added");
            contents.add(t);
            maximumCapacity-=t.getVolume();
            return true;
        } return false;
    }

    //should return the current volume of all items NOT size of arraylist
    @Override
    public int getVolume() {
        int vol =0;

        for (Thing t: contents){

            vol+=t.getVolume();

        }

        return vol;

    }
}
