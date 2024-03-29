package solutions.hackerrank.prepkit1week;
/**
 * Problem: https://www.hackerrank.com/challenges/one-week-preparation-kit-tower-breakers-1/
 * 
 * Two players are playing a game of Tower Breakers! Player 1 always moves first, and both players always play optimally.The rules of the game are as follows:
 * 1. Initially there are n towers.
 * 2. Each tower is of height m.
 * 3. The players move in alternating turns.
 * 4. In each turn, a player can choose a tower of height x and reduce its height to y, where 1<= y < x and y evenly divides x.
 * 5. If the current player is unable to make a move, they lose the game.
 * Given the values of n and m, determine which player will win. If the first player wins, return 1. Otherwise, return 2.
 * 
 * Example 1:
 * n=2, m=6
 * There are 2 towers, each 6 units tall. Player 1 has a choice of two moves:
 * - remove 3 pieces from a tower to leave 3 as 6 modulo 3 =0 
 * - remove 5 pieces to leave 1 
 * Let Player 1 remove 3. Now the towers are 3 and 6 units tall.
 * Player 2 matches the move. Now the towers are both 3 units tall.
 * Now Player 1 has only one move.
 * Player 1 removes 2 pieces leaving 1. Towers are 1 and 2 units tall.
 * Player 2 matches again. Towers are both 1 unit tall.
 * Player 1 has no move and loses. Return 2.
 * 
 * Example 2:
 * n=2, m=2
 * output: 2
 * Explanation
 * We'll refer to player 1 as P1 and player 2 as P2 
 * In the first test case, P1 chooses one of the two towers and reduces it to 1. Then P2 reduces the remaining tower to a height of 1. As both towers now have height 1, P1 cannot make a move so P2 is the winner.
 * 
 * Example 3:
 * n=1, m=4
 * output: 1
 * Explanation
 * We'll refer to player 1 as P1 and player 2 as P2 
 * In this test case, there is only one tower of height 4. P1 can reduce it to a height of either 1 or 2. P1 chooses 1 as both players always choose optimally. Because P2 has no possible move, P1 wins.
 */
public class TowerBreakers {
    /**
     * PSEUDO CODE video:
     * 
     * @param n
     * @param m
     * @return
     */
    public int solution(int n, int m) {
        int k=0;
        if (m==1 || n %2 ==0) 
            k=2;
        else
            k =1;
        return k;
    }
}
