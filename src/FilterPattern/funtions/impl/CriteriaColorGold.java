package FilterPattern.funtions.impl;

import FilterPattern.funtions.CriteriaType;
import FilterPattern.products.Color;
import FilterPattern.products.Function;
import FilterPattern.products.Phone;

import java.util.ArrayList;
import java.util.List;

public class CriteriaColorGold implements CriteriaType {


    @Override
    public List<Phone> criteriaType(List<Phone> phones) {
        List<Phone> gold_phone = new ArrayList<>();
        for (Phone phone : phones){
            if (phone.getColor() == Color.Gold){
                gold_phone.add(phone);
            }
        }
        return gold_phone;
    }
}
