import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long L = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] req = new int[N];

        for(int i = 0; i<N; i++){
            int el = Integer.parseInt(st.nextToken());
            req[i] = el;
        }

        int start = 0;
        int max = 0;
        long sum = 0;

        for(int end = 0; end < N; end++){
            sum += req[end];

            while(sum > L){
                sum -= req[start];
                start++;
            }

            int length = end - start + 1;
            max = Math.max(max, length);
        }

        System.out.println(max);
    }
}
