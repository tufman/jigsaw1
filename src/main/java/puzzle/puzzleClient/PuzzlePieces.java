package puzzle.puzzleClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PuzzlePieces {

   private  String name ;
   private boolean rotate ;
   private PuzzlePiece[] puzzlePieces ;

    public PuzzlePieces(String name, boolean rotate, Stack<ArrayList<Integer>> inputStackFromFileReader ) {
        this.name = name;
        this.rotate = rotate;
        puzzlePieces = new PuzzlePiece[inputStackFromFileReader.size()];
        stackToArr(inputStackFromFileReader);
    }

    private void stackToArr(Stack<ArrayList<Integer>> inputStackFromFileReader) {
        int counter = 0;
        while  (inputStackFromFileReader.size()>0 ){
            inputStackFromFileReader.pop();
            int [] vals = new int[5];
            puzzlePieces[counter++] = new PuzzlePiece(vals);
        }
    }
}

