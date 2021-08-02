package com.lucky.testPattern.strategy;

public class CatHeightComparator implements Comparator<Cat>{
    @Override
    public int compare(Cat t1, Cat t2) {
        if(t1.height<t2.height) return -1;
        else if(t1.height>t2.height) return 1;
        else return 0;
    }
}
