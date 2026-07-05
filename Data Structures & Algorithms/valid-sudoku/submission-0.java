class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> rowMap = new HashMap<>();
        HashMap<Integer, HashSet<Character>> colMap = new HashMap<>();
        HashMap<String, HashSet<Character>> threebythreemap = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentCharacter = board[i][j];
                if (currentCharacter == '.'){
                    continue;
                }
                rowMap.putIfAbsent(i, new HashSet<>());

                if(rowMap.get(i).contains(currentCharacter)){
                    return false;
                }
                rowMap.get(i).add(currentCharacter);

                colMap.putIfAbsent(j, new HashSet<>());

                if(colMap.get(j).contains(currentCharacter)){
                    return false;
                }
                colMap.get(j).add(currentCharacter);

                String boxkey = (i/3) + "#" + (j/3);

                threebythreemap.putIfAbsent(boxkey, new HashSet<>());

                if(threebythreemap.get(boxkey).contains(currentCharacter)){
                    return false;
                }

                threebythreemap.get(boxkey).add(currentCharacter);


            }
            
        }
      return true;
    }
}
