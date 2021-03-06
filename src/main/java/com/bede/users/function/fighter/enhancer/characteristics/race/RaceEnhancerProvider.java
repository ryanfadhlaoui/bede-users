package com.bede.users.function.fighter.enhancer.characteristics.race;

import com.bede.users.entities.fighter.information.RaceEnum;
import com.bede.users.function.fighter.enhancer.characteristics.CharacteristicsEnhancer;
import org.springframework.stereotype.Component;

@Component
public class RaceEnhancerProvider {
    public CharacteristicsEnhancer get(RaceEnum raceEnum) {
        switch (raceEnum){
            case ORC:
                return new RaceEnhancer(4,4,4,0,0,0);
            case HUMAN:
                return new RaceEnhancer(2,2,2,2,2,2);
            case ELF:
                return new RaceEnhancer(0,0,0,4,4,4);
            case DWARF:
                return new RaceEnhancer(0,4,4,0,0,4);
            default:
                throw new IllegalArgumentException("No enhancer for raceEnum :" + raceEnum);
        }
    }
}
