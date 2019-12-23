package com.company;

public interface MoonTown {
    long ProjitochniyMinimum = (SugarBredlam.getSugarCost() + CoalBredlam.getCoalCost() + CheeseBredlam.getCheeseCost()) * 10;

    static long RaiseProjitochniyMinimum(int i, long Proj) {
        if (i == 11 || i == 0 || i == 1) Proj = Math.round(Proj* 1.3);
        return Proj;
    }
}
