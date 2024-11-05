public class SudokuSolver {
    private final int N = 9;
    private int [][]board;
    SudokuSolver(int[][]board){
        this.board = board;
    }

    public boolean resolve(){
        return resolve(board);
    }
    private boolean resolve(int[][] board){
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if(board[i][j] == 0) {
                    for (int v = 1; v <= N; v++) {
                        if (checkGroups(i, j, v) && checkRowCol(i, j, v)) {
                            board[i][j] = v;
                            if (resolve(board)) {
                                return true;
                            }
                            board[i][j] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private boolean checkGroups(int row, int col, int num){
        if (row <= 2)row = 0;
        else if(row <= 5)row = 3;
        else row = 6;
        if (col <= 2)col = 0;
        else if(col <= 5)col = 3;
        else col = 6;
        for (int i = row; i < row + 3; i++){
            for (int j = col; j < col + 3; j++){
                if (board[i][j] == num)return false;
            }
        }
        return true;
    }
    private boolean checkRowCol(int row, int col, int num){
        for (int i = 0; i < N; i++){
            if (board[i][col] == num || board[row][i] == num)return false;
        }
        return true;
    }
    public void printBoard(){
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
