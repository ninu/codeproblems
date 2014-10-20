public class TicTacToe{

    public static void checkTicTacToe(){
        char[][] board = new char[][] {
                {'x', 'o', 'x'},
                {'x', 'o', 'o'},
                {'o', 'o', 'x'}
        };
        
        //check rows/cols
        for (int i = 0; i < board.length; i++) {
            String row = "";
            String col = "";
            for (int j = 0; j < board.length; j++) {
                row += board[i][j];
                col += board[j][i];
            }
            System.out.println("Row: " + row);
            System.out.println("Col: " + col);
        }
        
        //check diagonals -- the logic in this loop could be folded into the previous one
        String diag1 = ""; //top-left to bottom-right
        String diag2 = ""; //bottom-left to top-right
        for (int i = 0; i < board.length; i++) {
            diag1 += board[i][i];
            diag2 += board[board.length-i-1][board.length-i-1];
        }
        System.out.println("Diag1: " + diag1);
        System.out.println("Diag2: " + diag2);
    }
    public static void main(String[] args){
        checkTicTacToe();
    }
}
