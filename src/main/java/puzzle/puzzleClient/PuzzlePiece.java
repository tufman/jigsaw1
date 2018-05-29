package puzzle.puzzleClient;

import java.util.ArrayList;

public class PuzzlePiece {
     private int id;
    private int [] piece = new int[4];

     public PuzzlePiece(ArrayList<Integer> input) {
        this.id = input.get(0);
         piece[0] = input.get(1);
         piece[1] = input.get(2);
         piece[2] = input.get(3);
         piece[3] = input.get(4);
    }


}
