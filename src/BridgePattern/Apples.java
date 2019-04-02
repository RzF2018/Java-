package BridgePattern;

import BridgePattern.abstracts.AppleTree;
import BridgePattern.interfaces.AppleAPI;

public class Apples extends AppleTree {

    private String appleColor;

    public Apples(String appleColor, AppleAPI appleAPI){
        super(appleAPI);
        this.appleColor = appleColor;
    }

    @Override
    public void appleTreeType() {
        appleAPI.getAnApple(appleColor);
    }
}
