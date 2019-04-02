package BridgePattern.interfaces.impl;

import BridgePattern.interfaces.AppleAPI;

public class RedApple implements AppleAPI {
    @Override
    public void getAnApple(String appleColor) {
        System.out.println("get a red apple " + " - " + appleColor);
    }
}
