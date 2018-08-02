package com.company;

public class Main {

    public static void main(String[] args) {
	    People people = new People();
	    people.add(new Person("John"));
	    people.add(new Person("Mike"));
	    people.add(new Person("Mitchel"));
	    people.add(new Person("Tom"));

        Iterator iterator = people.getIterator();

        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
