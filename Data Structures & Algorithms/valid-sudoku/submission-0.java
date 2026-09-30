class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                
                char c = board[row][col];

                if (c == '.') {
                    continue;
                }

                int box = (row / 3) * 3 + (col / 3);

                if (boxes[box].contains(c)
                        || rows[row].contains(c)
                        || cols[col].contains(c)) {
                    return false;
                }
                boxes[box].add(c);
                rows[row].add(c);
                cols[col].add(c);
            }
        }
        return true;
    }


}
