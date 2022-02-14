package Joaircraftwaketurbulence;

import Joaircraftwaketurbulence.aircraft.Aircraft;
import Joaircraftwaketurbulence.aircraft.TakeOffDistancingRules;

import java.time.LocalDateTime;
import java.util.List;

import static Joaircraftwaketurbulence.aircraft.WakeTurbulence.*;
import static java.time.LocalDateTime.now;

public class Main {

    public static void main(String[] args)
    {

        List<Aircraft> fighter = List.of(
                new Aircraft("B737",LIGHT, 1000),
                new Aircraft("A320", LIGHT, 1001),
                new Aircraft("A330", MEDIUM, 1002),
                new Aircraft("ATR90", LIGHT, 1003),
                new Aircraft("A380", SUPER, 1004)

        );

        TakeOffDistancingRules takeOffRules = new TakeOffDistancingRules();

        int offset = 0;

        for (Aircraft x : fighter)
        {

            //offset += takeOffRules.calculateWaitTime(x);

            offset += x.getWakeTurbulence().getTimeOffset();

            LocalDateTime depTime = now().plusSeconds(offset);

            //System.out.println("Fighter " + x.getModeADecimal() + " takes off at " + depTime.toLocalTime());
            System.out.println("Fighter " + x.getModeAOctal() + " takes off at " + depTime.toLocalTime());


        }


    }




}
