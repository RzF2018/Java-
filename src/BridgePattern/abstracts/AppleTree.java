package BridgePattern.abstracts;

import BridgePattern.interfaces.AppleAPI;

public abstract class AppleTree {

    protected AppleAPI appleAPI;
    protected AppleTree(AppleAPI appleAPI){
        this.appleAPI = appleAPI;
    }

    public abstract void appleTreeType();
}
