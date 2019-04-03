package FilterPattern.logic;

import FilterPattern.funtions.CriteriaType;
import FilterPattern.products.Phone;

import java.util.List;

public class OrCriteria implements CriteriaType {

    private CriteriaType base1Type;
    private CriteriaType add2Type;

    public OrCriteria(CriteriaType base1Type, CriteriaType add2Type){
        this.base1Type = base1Type;
        this.add2Type = add2Type;
    }

    @Override
    public List<Phone> criteriaType(List<Phone> phones) {
        List<Phone> base1CriteriaTypePhone = base1Type.criteriaType(phones);
        List<Phone> add2TCriteriaTypePhone = add2Type.criteriaType(phones);

        for (Phone add2TypePhone : add2TCriteriaTypePhone){
            if (!base1CriteriaTypePhone.contains(add2TypePhone)){
                base1CriteriaTypePhone.add(add2TypePhone);
            }
        }

        return base1CriteriaTypePhone;
    }
}
