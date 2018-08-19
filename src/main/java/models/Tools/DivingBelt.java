package models.Tools;

import models.ITool;

public class DivingBelt implements ITool {
    private String humanReadable;

    public DivingBelt() {
        this.humanReadable = "Diving belt";
    }

    public String applyTool(){
        return "Dive!";
    }
}
