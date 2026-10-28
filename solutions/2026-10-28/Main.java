import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());
        int cnt = 0;

        int n = Integer.parseInt(token.nextToken())+2;
        int m = Integer.parseInt(token.nextToken())+2;

        //1 : 움직일 수 있음 0: 움직일 수 없음
        int[][] matrix = new int[n][m];

        for(int i = 1; i<=n-2; i++){
            char[] chars = br.readLine().toCharArray();

            for(int j = 1; j<=chars.length; j++){
                if(chars[j-1] == '.'){
                    matrix[i][j] = 1;
                }
            }
        }

        //1 1 1 1 1
        //1 0 1 1 1
        //1 1 1 0 1
        //1 1 1 1 1
        //0 0 0 0 0

        token = new StringTokenizer(br.readLine());

        int starty = Integer.parseInt(token.nextToken());
        int startx = Integer.parseInt(token.nextToken());

        int orders = Integer.parseInt(br.readLine());


        for(int order = 0; order<orders; order++){
            token = new StringTokenizer(br.readLine());

            String dir = token.nextToken();

            int steps = Integer.parseInt(token.nextToken());
            int dx = 0;
            int dy = 0;

            switch (dir) {
                case "U": dy = -1; break;
                case "D": dy = 1; break;
                case "L": dx = -1; break;
                case "R": dx = 1; break;
            }

            while(steps > 0){
                if(matrix[starty+dy][startx+dx] == 0){
                    break;
                }

                cnt++;
                startx += dx;
                starty += dy;
                steps--;
            }
        }

        System.out.println(starty+" "+ startx+" " + cnt);
    }

    private static final class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int pointer;
        private int length;

        private FastScanner(InputStream in) {
            this.in = in;
        }

        private int read() throws IOException {
            if (pointer >= length) {
                length = in.read(buffer);
                pointer = 0;
                if (length <= 0) {
                    return -1;
                }
            }
            return buffer[pointer++];
        }

        private String next() throws IOException {
            StringBuilder sb = new StringBuilder();
            int c;
            do {
                c = read();
            } while (c <= ' ' && c != -1);

            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }
            return sb.toString();
        }

        private int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        private long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}
