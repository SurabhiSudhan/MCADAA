package labsheet;

public class Matrixchainmultiplication {
	public static int matrixChainOrder(int[] p) {

        int n = p.length - 1;

        int[][] m = new int[n][n];
        int[][] s = new int[n][n];

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = m[i][k] + m[k + 1][j] + p[i] * p[k + 1] * p[j];
                    if (cost < m[i][j]) {
                        m[i][j] = cost;
                        s[i][j] = k;
                    }
                }
            }
        }

        return m[0][n - 1];
    }

    public static void main(String[] args) {
        int[] p = {10, 30, 5, 60}; 
        int minCost = matrixChainOrder(p);
        System.out.println("Minimum cost of multiplying the matrix chain: " + minCost);
    }
}






	

	


