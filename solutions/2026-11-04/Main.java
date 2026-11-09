import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        long[] stocks = new long[N+1];

        st = new StringTokenizer(br.readLine());

        for(int i = 1; i<=N; i++){
            int el = Integer.parseInt(st.nextToken());
            stocks[i] = stocks[i-1]+el;
        }

        for(int i = 0; i<Q; i++){
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());

            System.out.println(stocks[R] - stocks[L-1]);
        }
    }
}
