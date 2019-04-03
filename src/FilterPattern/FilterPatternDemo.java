package FilterPattern;

import FilterPattern.funtions.CriteriaType;
import FilterPattern.funtions.impl.*;
import FilterPattern.logic.AndCriteria;
import FilterPattern.logic.OrCriteria;
import FilterPattern.products.Color;
import FilterPattern.products.Function;
import FilterPattern.products.Phone;

import java.util.ArrayList;
import java.util.List;

public class FilterPatternDemo {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();

        phones.add(new Phone("dami_v1", Color.Red, Function.CALL));
        phones.add(new Phone("dami_v1",Color.Red, Function.MESSAGE));
        phones.add(new Phone("dami_v1",Color.Gold, Function.PLAY));

        CriteriaType dami_v1_gold = new CriteriaColorGold();
        CriteriaType dami_v1_red = new CriteriaColorRed();
        CriteriaType dami_v1_messageFunc = new CriteriaMessage();
        CriteriaType dami_v1_playFunc = new CriteriaPlay();
        CriteriaType dami_v2_GoldAndPlay = new AndCriteria(dami_v1_gold, dami_v1_playFunc);
        CriteriaType dami_v2_RedOrMessage = new OrCriteria(dami_v1_red, dami_v1_messageFunc);

        System.out.println("only gold Color:");
        getPhone(dami_v1_gold.criteriaType(phones));

        System.out.println("only Message Func:");
        getPhone(dami_v1_messageFunc.criteriaType(phones));

        System.out.println("only Play Func:");
        getPhone(dami_v1_playFunc.criteriaType(phones));

        System.out.println("gold color and Play Func:");
        getPhone(dami_v2_GoldAndPlay.criteriaType(phones));

        System.out.println("red color or Message Func:");
        getPhone(dami_v2_RedOrMessage.criteriaType(phones));

    }

    public static void getPhone(List<Phone> phones){
        for (Phone phone : phones){
            System.out.println("Phone: [ Name: " + phone.getName()
            + " ,Color: " + phone.getColor() + " ,Function: "
            + phone.getFunction() + " ]");
        }
    }
}
