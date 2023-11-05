package com.designpatterns.adapter;

public class PenAdapter implements Pen{

    SketchPen sp= new SketchPen();

    @Override
    public void write() {
        sp.sketch();
    }
}
