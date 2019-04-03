package FilterPattern.logic;

import FilterPattern.funtions.CriteriaType;
import FilterPattern.products.Phone;

import java.util.List;

public class AndCriteria implements CriteriaType {

    private CriteriaType base1Type;
    private CriteriaType add2Type;

    public AndCriteria(CriteriaType base1Type, CriteriaType add2Type){
        this.base1Type = base1Type;
        this.add2Type = add2Type;
    }

    @Override
    public List<Phone> criteriaType(List<Phone> phones) {
        List<Phone> baseCriteriaTypePhone = base1Type.criteriaType(phones);
        return add2Type.criteriaType(baseCriteriaTypePhone);
    }
}
