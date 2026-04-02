class Solution {

    public static boolean Solve(int i , int j , int k, char[][] board , String word)
    {
        if(k == word.length()) return true ;

        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || word.charAt(k) != board[i][j]) return false ;

        char temp = board[i][j] ;
        board[i][j] = '#' ; // use for we cannot use the store element again .
        boolean ans = Solve(i+1,j,k+1,board,word) || Solve(i-1,j,k+1,board,word) || Solve(i,j+1,k+1,board,word) || Solve(i,j-1,k+1,board,word)  ;

        board[i][j] = temp ;
        return ans ;
    }
    public boolean exist(char[][] board, String word) {
        
        int m = board.length ;
        int n = board[0].length ;

        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(Solve(i,j,0,board,word)) return true ;
            }
        }

        return false ;
    }
}