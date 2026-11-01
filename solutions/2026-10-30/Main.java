import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] servers = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n; i++){
            int el = Integer.parseInt(st.nextToken());
            servers[i] = el;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            if(map.containsKey(servers[i])){
                System.out.println(servers[i]+" "+(i+1));
                return;
            } else {
                map.put(servers[i], i);
            }
        }

        System.out.println(-1);
    }
}
