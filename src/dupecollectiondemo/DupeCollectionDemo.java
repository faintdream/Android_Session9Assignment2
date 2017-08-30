/*
 * In this collection we create a collection with duplicate values
 * then we copy it with redundent information removed.
 * in this we make use of two collections 1) ArrayList 2) HashSet
 */

package dupecollectiondemo;

import java.util.ArrayList;     // importing Arralylist
import java.util.HashSet;       // importing hashset , it is a special collection 
                                // which removes redundancy from a given list

public class DupeCollectionDemo {           //main class 
    
    public static void main(String[] args) {    // main section
        ArrayList <String> dupe_names= new ArrayList<String>();      // defining an array list dupe_names to hold 
        dupe_names.add("akash");                                     // duplicate values
        dupe_names.add("monish");                   //some random names
        dupe_names.add("akash");                    // may be not :), that's me
        dupe_names.add("monish");                   // and my best friend only
        dupe_names.add("akash");                    //
        
        System.out.println("ArrayList Size: "+ dupe_names.size());  // printing size of ArrayList
        System.out.println(dupe_names);                         // printing values
        HashSet  nodupes_names=new HashSet(dupe_names);         // printing size of hashset
        System.out.println("HashSet Size: "+ nodupes_names.size()); // printing hashset size
        System.out.println(nodupes_names);                          //printing values.
                
    }
    
}
