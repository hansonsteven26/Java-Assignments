package PhoneBook;

import java.util.*;

public class PeopleSorter {
    
    ArrayList<People> person = new ArrayList<>();       

    public PeopleSorter(ArrayList<People> person) {         
        this.person = person;     
    }              

    public ArrayList<People> getSortedPeopleByName() {         
        Collections.sort(person, People.nameComparator);         
        return person;     
    } 
}
