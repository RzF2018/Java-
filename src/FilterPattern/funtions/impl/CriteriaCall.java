package FilterPattern.funtions.impl;

import FilterPattern.funtions.CriteriaType;
import FilterPattern.products.Function;
import FilterPattern.products.Phone;

import java.util.ArrayList;
import java.util.List;

public class CriteriaCall implements CriteriaType {

    @Override
    public List<Phone> criteriaType(List<Phone> phones) {

        List<Phone> call_phone = new ArrayList<>();
        for (Phone phone : phones){
            if (phone.getFunction() == Function.CALL){
                call_phone.add(phone);
            }
        }

        return call_phone;
    }
}
