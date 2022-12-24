package epis.unsa;
import javax.swing.*; 
import java.awt.Color;
import java.awt.Graphics;

public class JBoard extends JPanel{
  private Board board;
  public JBoard(Board board){
    this.board = board;
  }
  public void nextState(){
    board = board.nextState();
  }

  @Override
  public void paintComponent(final Graphics g){
    super.paintComponent(g);
    int width = getWidth();
    int height = getHeight();

    for(int j = 0; j < board.getHeight(); j++){
      for(int i = 0; i < board.getWidth(); i++){
        g.setColor(board.cell(i, j) ? Color.BLACK: Color.WHITE);
        g.fillRect(j * width / board.getWidth(), 
            i * height / board.getHeight(), 
            width / board.getWidth(), 
            height / board.getHeight());
        g.setColor(Color.GRAY);
        g.drawRect(j * width / board.getWidth(), 
            i * height / board.getHeight(), 
            width / board.getWidth(), 
            height / board.getHeight());
      }
    }
  }
}
