class Solution {
    public int findTheWinner(int n, int k) {
        if (n == 1) {
        return 1;
    }

    int result = findTheWinner(n - 1, k);

    int winner = (result + k - 1) % n + 1;

    return winner;
      }
    }
