package game.a2020;

public abstract class AbstractBlock {
    public Boolean emp=true;
    public int value;
    GridPoint point; // don't forget this!
    abstract void changePoint(GridPoint point);
    abstract GridPoint move(GridPoint from, Direction direction); // it is better to use recursion and then return the final
    // GridPoint it ends up in
    abstract void animateMovement(GridPoint origin); //Best option is javafx.animation.TranslateTransition
    abstract void animateCreation(); //Best option is javafx.animation.ScaleTransition
}
