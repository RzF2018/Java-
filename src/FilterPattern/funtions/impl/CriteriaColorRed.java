package FilterPattern.funtions.impl;

import FilterPattern.funtions.CriteriaType;
import FilterPattern.products.Color;
import FilterPattern.products.Phone;

import java.util.ArrayList;
import java.util.List;

public class CriteriaColorRed implements CriteriaType {


    @Override
    public List<Phone> criteriaType(List<Phone> phones) {
        List<Phone> red_phone = new ArrayList<>();
        for (Phone phone : phones){
            if (phone.getColor() == Color.Red){
                red_phone.add(phone);
            }
        }
        return red_phone;
    }
}
