package models.Tools;

import models.ITool;

public class GrapplingHook implements ITool {
    private String humanReadable;

    public GrapplingHook() {
        this.humanReadable = "Grappling hook";
    }

    public String applyTool(){
        return "Climb!!";
    }
}
