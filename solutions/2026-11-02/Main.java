import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int max = 0;

        st = new StringTokenizer(br.readLine());
        int[] servers = new int[N];

        for(int i = 0; i<N; i++){
            int el = Integer.parseInt(st.nextToken());
            servers[i] = el;
        }

        for(int start = 0; start < N-2; start++){
            for(int middle = start+1; middle<N-1; middle++) {
                for(int end = middle+1; end<N; end++){
                    int sum = servers[start]+servers[middle]+servers[end];
                    if(sum <= L) {
                        max = Math.max(max, sum);
                    }
                }
            }
        }

        System.out.println(max);
    }
}
