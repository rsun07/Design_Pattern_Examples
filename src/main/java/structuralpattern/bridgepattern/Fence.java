package structuralpattern.bridgepattern;

public abstract class Fence {
    protected Painter painter;

    public Fence(Painter painter) {
        this.painter = painter;
    }

    public abstract void paint();
}
