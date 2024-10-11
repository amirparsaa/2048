package game.a2020;

public class Block extends AbstractBlock{

    int value;
    @Override
    void changePoint(GridPoint point) {

    }

    @Override
    GridPoint move(GridPoint from, Direction direction) {
        if (direction==Direction.UP){

        }
        return from;
    }

    @Override
    void animateMovement(GridPoint origin) {

    }



    @Override
    void animateCreation() {

    }
}
