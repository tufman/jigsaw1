package puzzle.puzzleClient;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        int [] arr =  new int[5];
        PuzzlePiece p1 = new PuzzlePiece(arr);
        PuzzlePiece p2 = new PuzzlePiece(arr);

        List<PuzzlePiece>  puzzlePieces = new ArrayList<>();
        puzzlePieces.add(p1);
        puzzlePieces.add(p2);

     /*   PuzzlePieces puzzlePieces1 = new PuzzlePieces("test", false,puzzlePieces );
        Gson gson  =  new Gson();
        String jsonTemplate =  gson.toJson(puzzlePieces1);
        System.out.println(jsonTemplate);*/
    }
}
