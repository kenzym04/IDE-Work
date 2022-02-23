# Refreshment

## Maximal Palindrome
```
def maximalPalindrome(s):
    # ct[ch] = n 
    # this means we can use character 'ch' at most 'n' times.
    ct = {}
    for ch in s:
        ct[ch] = ct.get(ch, 0) + 1
        
    ret = []
    middle = ''
    for ch in sorted(ct.keys()):
        avail = ct.get(ch, 0)
        for _ in range(avail // 2):
            ret.append(ch)
            
        if middle == '' and avail % 2 == 1:
            middle = ch
        
    firstHalf = ''.join(ret)
    return firstHalf + middle + firstHalf[::-1]

```
## frequentDigits
```
 import java.util.ArrayList;
            import java.util.List;

            public class MostFrequentDigits1 {

                /**
                 * @param args
                 */
                public static void main(String[] args) {
                    // TODO Auto-generated method stub

                    long number = 12345612;
                    String str = "12342352397235823050237238523";
                    getMostFrequentDigitWInNumber(number);
                    getMostFrequentDigitInString(str);

                }

                public static void getMostFrequentDigitWInNumber(long number) {
                    List<Integer> list = new ArrayList<Integer>();
                    int[] frequency = new int[10];
                    int mostFrequentVal = 0;
                    while (number > 0) {
                        int digit = (int) (number % 10);
                        number /= 10;
                        frequency[digit]++;
                        if (frequency[digit] > mostFrequentVal) {
                            mostFrequentVal = frequency[digit];
                        }
                    }

                    for (int j = 0; j < frequency.length; j++) {
                        if (frequency[j] == mostFrequentVal) {
                            list.add(j);
                        }
                    }
                    System.out.println("most frequent digits in Number:" + list);
                }

                public static void getMostFrequentDigitInString(String str) {
                    List<Integer> list = new ArrayList<Integer>();
                    int mostFrequentVal = 0;
                    int[] frequency = new int[10];
                    for (int k = 0; k < str.length(); k++) {
                        char c = str.charAt(k);
                        int ind = Integer.valueOf(String.valueOf(c));
                        frequency[ind]++;
                        if (frequency[ind] > mostFrequentVal) {
                            mostFrequentVal = frequency[ind];
                        }
                    }

                    for (int j = 0; j < frequency.length; j++) {
                        if (frequency[j] == mostFrequentVal) {

                            list.add(j);
                        }
                    }
                    System.out.println("most frequent digits in string:" + list);
                }

            }

```


## Word Search
```
public class Solution {

public boolean findWord(char[][] board, String word) {
    int m = board.length;
    int n = board[0].length;
 
    boolean result = false;
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
           if(dfs(board,word,i,j,0)){
               result = true;
           }
        }
    }
 
    return result;
}
 
  public boolean dfs(char[][] board, String word, int i, int j, int k){
      int m = board.length;
      int n = board[0].length;

      if(i<0 || j<0 || i>=m || j>=n){
          return false;
      }

      if(board[i][j] == word.charAt(k)){
          char temp = board[i][j];
          board[i][j]='#';
          if(k==word.length()-1){
              return true;
          }else if(dfs(board, word, i-1, j, k+1)
          ||dfs(board, word, i+1, j, k+1)
          ||dfs(board, word, i, j-1, k+1)
          ||dfs(board, word, i, j+1, k+1)){
              return true;
          }
          board[i][j]=temp;
      }

      return false;
  }
}

```
