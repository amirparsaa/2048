package game.a2020;

import javafx.scene.effect.Light;

import java.util.Random;

public class BlockGrid extends AbstractBlockgrid {

    @Override
    boolean checkEnd() {
        return false;
    }

    @Override
    boolean addNewBlock() {
        return false;
    }

    @Override
    void down() {
        for (int row = 1; row < 4; row++)
            for (int column = 0; column < 4; column++) // the 'for' parameters might change for other directions
                if (!isBlockEmpty(row,column)) {
                    AbstractBlock block = getBlock(new GridPoint(row,column));
                    GridPoint origin = block.point;
                    block.changePoint(block.move(block.point, Direction.DOWN));
                    block.animateMovement(origin);
                }
    }

    @Override
    void right() {
        for (int row = 1; row < 4; row++)
            for (int column = 0; column < 4; column++) // the 'for' parameters might change for other directions
                if (!isBlockEmpty(row,column)) {
                    AbstractBlock block = getBlock(new GridPoint(row,column));
                    GridPoint origin = block.point;
                    block.changePoint(block.move(block.point, Direction.RIGHT));
                    block.animateMovement(origin);
                }
    }

    @Override
    void left() {
        for (int row = 1; row < 4; row++)
            for (int column = 0; column < 4; column++) // the 'for' parameters might change for other directions
                if (!isBlockEmpty(row,column)) {
                    AbstractBlock block = getBlock(new GridPoint(row,column));
                    GridPoint origin = block.point;
                    block.changePoint(block.move(block.point, Direction.LEFT));
                    block.animateMovement(origin);
                }
    }

    @Override
    void setBlock(GridPoint point, AbstractBlock toBlock) {

    }

    @Override
    GridPoint getRandomEmptyPoint() {
        while(true){
            Random random = new Random();
            int randI = random.nextInt(5)-1;
            int randJ = random.nextInt(5)-1;
            if (isBlockEmpty(randI, randJ)){
                blocks[randI][randJ].emp=false;
                int randNum = random.nextInt(4);
                if (randNum==3){
                    blocks[randI][randJ].value=4;
                }else blocks[randI][randJ].value=2;

                GridPoint point = new GridPoint(randI,randJ);

                return point;

            }
        }

    }

    @Override
    boolean isBlockEmpty(int i, int j) {
        return blocks[i][j].emp;
    }

    @Override
    void debugMessage() {

    }
}
