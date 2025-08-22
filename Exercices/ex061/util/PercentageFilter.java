package dev.ex.util;

import dev.ex.model.LPAStudent;

import java.util.Comparator;

public class PercentageFilter implements Comparator<LPAStudent> {
    public int compare(LPAStudent a, LPAStudent b){
        return Double.compare(a.getPercentComplete(), b.getPercentComplete());
    }
}
