package com.Liu;

public class DogComparator implements Comparator<Dog>{
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.height-o2.height>0) return 1;
        else if(o1.height-o2.height<0) return -1;
        else return 0;
    }
}
