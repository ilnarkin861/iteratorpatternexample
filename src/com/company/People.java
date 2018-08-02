package com.company;

import java.util.ArrayList;
import java.util.List;

public class People implements Container {


    List<Person> personList = new ArrayList<>();
    private int index = 0;


    public void add(Person person){
        personList.add(person);
    }

    @Override
    public Iterator getIterator() {
        return new PersonIterator();
    }

    private class PersonIterator implements Iterator{
        @Override
        public boolean hasNext() {
            return (index < personList.size()) ? true : false;
        }

        @Override
        public Object next() {
            if (hasNext()) return personList.get(index++);
            return null;
        }
    }
}
