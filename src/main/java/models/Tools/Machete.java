package models.Tools;

import models.ITool;

public class Machete implements ITool {
    private String humanReadable;

    public Machete() {
        this.humanReadable = "Machete";
    }

    public String applyTool(){
        return "Cut!";
    }
}
