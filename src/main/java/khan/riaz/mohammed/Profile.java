package khan.riaz.mohammed;

import java.util.*;

public class Profile implements CollectionsInterface{

    private ArrayList names;
    private Set qualifications;
    private Map skills;

    public Profile(){

        names = new ArrayList();
        qualifications = new HashSet();
        skills = new HashMap();

    }


    @Override
    public void addToArrayList(String item) {

        names.add(item);

    }

    @Override
    public void addToSet(String item) {

        qualifications.add(item);

    }

    @Override
    public void addToMap(String key, String value) {

        skills.put(key, value);

    }

    public static void main(String[] args) {

        //code here

    }
}
