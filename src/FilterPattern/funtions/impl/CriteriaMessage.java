package FilterPattern.funtions.impl;

import FilterPattern.funtions.CriteriaType;
import FilterPattern.products.Function;
import FilterPattern.products.Phone;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMessage implements CriteriaType {
    @Override
    public List<Phone> criteriaType(List<Phone> phones) {

        List<Phone> message_phone = new ArrayList<>();
        for (Phone phone : phones){
            if (phone.getFunction() == Function.MESSAGE){
                message_phone.add(phone);
            }
        }

        return message_phone;
    }
}
