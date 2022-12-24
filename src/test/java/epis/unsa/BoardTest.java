package epis.unsa;

import static epis.unsa.Points.interpreter;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BoardTest {
    final String url = "D:/Intellij/Workspace/gameoflife-limpker10/src/main/resources/firstFile.txt";
    @Test
    public void testgetWidth() {
        assertEquals(new Board(7, 3, Points.interpreter(0, 0, url)).getWidth() , 7);
    }

    @Test
    public void testgetHeight() {
        assertEquals(new Board(15, 8, Points.interpreter(0, 0, url)).getHeight() , 8);
    }
    @Test
    public void testcell(){
        assertTrue( new Board(15, 8, Points.interpreter(0, 0, url)).cell(0,2));
    }
    @Test
    public void countNeighbors() {
        assertEquals(new Board(15, 8, Points.interpreter(0, 0, url)).countNeighbors(0,2) , 1);
    }
    @Test
    public void nextState() {
        assertEquals(new Board(15, 8, Points.interpreter(0, 0, url)).countNeighbors(0,3) , 3);
    }
}
