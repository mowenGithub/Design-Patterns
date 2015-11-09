package com.mowen.designpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by mowen on 15-11-7.
 */
public class Main {
    public static void main(String[] args) {
        List<Double> weights = new ArrayList<Double>();
        weights.add(0.3);
        weights.add(0.7);

        System.out.println(weightedChoice(weights));
    }

    //比重随机值
    private static int weightedChoice(List<Double> weights) {
        Random random = new Random();
        double total = 0;
        int winner = 0;
        for(int i = 0; i < weights.size(); ++i) {
            double weight = weights.get(i).doubleValue();
            total += weight;
            if(random.nextDouble() * total < weight) {
                winner = i;
            }
        }
        if(random.nextDouble() <= total) {
            return winner;
        }
        return -1;
    }
}
