package Decorator;

import Bridge.Shape;

public abstract class ShapeDecoration implements Component{
    protected Component component;

    ShapeDecoration(Component component){
        this.component = component;
    }

    @Override
    public void draw() {
        component.draw();
    }
}
