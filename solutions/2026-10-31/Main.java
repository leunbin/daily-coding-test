import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());

        Deque<Integer> processes = new LinkedList<>();

        for(int i = 0; i<q; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String type = st.nextToken();
            int id = 0;

            if(st.hasMoreTokens()){
                id = Integer.parseInt(st.nextToken());
            }

            switch (type) {
                case "NORMAL":
                    processes.addLast(id);
                    break;
                case "URGENT":
                    processes.addFirst(id);
                    break;
                case "PROCESS":
                    Integer answer = processes.pollFirst();
                    System.out.println(answer == null ? -1 : answer);
                    break;
            }
        }
    }
}
