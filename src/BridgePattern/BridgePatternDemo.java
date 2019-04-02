package BridgePattern;

import BridgePattern.abstracts.AppleTree;
import BridgePattern.interfaces.impl.GreenApple;
import BridgePattern.interfaces.impl.RedApple;

public class BridgePatternDemo {
    public static void main(String[] args) {
        AppleTree redAppleTree = new Apples("red", new RedApple());
        AppleTree greenAppleTree = new Apples("green", new GreenApple());

        redAppleTree.appleTreeType();
        greenAppleTree.appleTreeType();
    }
}
