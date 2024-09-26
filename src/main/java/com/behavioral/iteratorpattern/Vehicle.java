package com.behavioral.iteratorpattern;

public class Vehicle {
    private String[] names = {"a", "b", "c"};

    public Iterator getIterator() {
        return new NameVehicle();
    }

    private class NameVehicle implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index >= names.length)
                return false;
            return true;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
