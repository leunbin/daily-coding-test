import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] req = new int[N];

        for(int i = 0; i<N; i++){
            int el = Integer.parseInt(st.nextToken());
            req[i] = el;
        }

        int start;
        int end;
        int max = 0;

        for(start = 0; start < N; start++){
            int sum = 0;
            for(end = start; end<N; end++){
                sum += req[end];
                if(sum > L){
                    int length = end - start;
                    max = Math.max(max, length);
                    break;
                }
            }
        }

        System.out.println(max);
    }
}
