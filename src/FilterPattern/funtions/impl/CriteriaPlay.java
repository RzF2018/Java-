package FilterPattern.funtions.impl;

import FilterPattern.funtions.CriteriaType;
import FilterPattern.products.Function;
import FilterPattern.products.Phone;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPlay implements CriteriaType {

    @Override
    public List<Phone> criteriaType(List<Phone> phones) {
        List<Phone> play_phone = new ArrayList<>();
        for (Phone phone : phones){
            if (phone.getFunction() == Function.PLAY){
                play_phone.add(phone);
            }
        }
        return play_phone;
    }
}
