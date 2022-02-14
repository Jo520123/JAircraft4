package Joaircraftwaketurbulence.aircraft;

import java.util.List;
import java.util.Map;

import static Joaircraftwaketurbulence.aircraft.WakeTurbulence.*;

public class TakeOffDistancingRules {

    private Map<WakeTurbulence, Integer> rules;


    public TakeOffDistancingRules()
    {

        rules = Map.of(
                LIGHT,60,
                MEDIUM, 90,
                HEAVY, 110,
                SUPER, 180
        );


    }


    public int calculateWaitTime(Aircraft j)
    {

        return rules.get(j.getWakeTurbulence());

    }


}
