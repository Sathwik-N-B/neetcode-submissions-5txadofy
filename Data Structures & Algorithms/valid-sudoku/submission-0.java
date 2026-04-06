class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean rowHas[][] = new boolean[9][9];
        boolean colHas[][] = new boolean[9][9];
        boolean subBoxHas[][] = new boolean[9][9];

        for(int row=0; row<9;row++) {
            for(int col=0; col<9; col++) {
                char currentChar = board[row][col];

                if(currentChar == '.') {
                    continue;
                }

                int digitIndex = currentChar - '0' - 1;

                int subBoxIndex = (row/3) * 3 + (col/3);

                if(rowHas[row][digitIndex] || colHas[col][digitIndex] || subBoxHas[subBoxIndex][digitIndex]) {
                    return false;
                }

                rowHas[row][digitIndex] = true;
                colHas[col][digitIndex] = true;
                subBoxHas[subBoxIndex][digitIndex] = true;
            }
        }
        return true;
    }
}
