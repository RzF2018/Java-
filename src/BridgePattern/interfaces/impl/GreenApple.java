package BridgePattern.interfaces.impl;

import BridgePattern.interfaces.AppleAPI;

public class GreenApple implements AppleAPI {
    @Override
    public void getAnApple(String appleColor) {
        System.out.println("get a green apple "+ " - " + appleColor);
    }
}
