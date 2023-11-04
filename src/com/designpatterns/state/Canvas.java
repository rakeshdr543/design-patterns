package com.designpatterns.state;

public class Canvas {
    private Tool currentTool;

    public Tool getCurrentTool(){
        return this.currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
