import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        List<Integer> servers = new ArrayList<>();

        for(int i = 0; i<N; i++){
            servers.add(Integer.parseInt(st.nextToken()));
        }

        servers.sort((a,b) -> b-a);

        int start = 0;
        int middle = 1;
        int end = 2;
        int max = servers.get(start)+servers.get(middle)+servers.get(end);

        while(start < N-3) {
            max = Math.min(max, servers.get(start)+servers.get(middle)+servers.get(end));

            if(max > L) {
                if(end < N-1){
                    end++;
                } else {
                    if(middle < N-2) {
                        middle++;
                        end = middle+1;
                    } else {
                        start++;
                        middle = start + 1;
                        end = middle + 1;
                    }
                }
            } else {
                System.out.println(max);
                break;
            }
        }
    }
}
