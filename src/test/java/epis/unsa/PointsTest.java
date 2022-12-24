package epis.unsa;

import static epis.unsa.Points.interpreter;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PointsTest{
  @Test
  public void testInterpreter(){

    assertEquals(interpreter(0, 0,"D:/Intellij/Workspace/gameoflife-limpker10/src/main/resources/firstFile.txt" ).size(),6);

  }

}
