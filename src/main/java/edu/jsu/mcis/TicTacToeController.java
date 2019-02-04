//git needed me to change something so I added a message, I'm so done (with part one :D)
package edu.jsu.mcis;


import java.awt.event.*;

public class TicTacToeController implements ActionListener {

    private final TicTacToeModel model;
    private final TicTacToeView view;
    
    /* CONSTRUCTOR */

    public TicTacToeController(int width) {
        
        /* Initialize model, view, and width */

        model = new TicTacToeModel(width);
        view = new TicTacToeView(this, width);
        
    }

    
    public String getMarkAsString(int row, int col) {       
        return (model.getMark(row, col).toString());       
    }
   
    public TicTacToeView getView() {       
        return view;       
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        // INSERT YOUR CODE HERE
        String name = event.getSource().getName();
        int row = Integer.valueOf(name.charAt(6));
        int col = Integer.valueOf(name.charAt(7));

        model.makeMark(row, col);
        view.updateSquares();
        
        String result = model.getResult().toString();

        if(!result.equals("NONE")){
            view.disableSquares();
            view.showResult(result);
        }

    }

}
