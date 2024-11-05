public class Main {
    public static void main(String[] args){
        int [][]board = {{0,0,6,0,0,0,8,0,2},{7,0,0,4,2,8,0,9,6},{2,1,0,0,3,0,7,0,5},{0,3,1,0,0,0,9,8,0}
        ,{0,0,0,1,0,0,0,0,7},{8,2,0,9,5,0,0,0,3},{3,0,0,0,0,2,0,6,0},{0,8,5,0,7,6,0,0,0},{9,0,2,5,0,1,3,0,8}};
        SudokuSolver sudokuSolver = new SudokuSolver(board);
        if (sudokuSolver.resolve())sudokuSolver.printBoard();
        else System.out.println("No tiene solución");
    }
}
