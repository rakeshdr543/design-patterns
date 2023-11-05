package com.designpatterns.adapter;

public class Assignment {

    private Pen pen;

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void  writeAssignment(){
        this.pen.write();
    }
}
