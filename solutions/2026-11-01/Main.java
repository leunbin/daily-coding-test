import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Node {
        int id;
        int pri;
        int time;

        Node(int id, int pri, int time){
            this.id = id;
            this.pri = pri;
            this.time = time;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Node> queue = new ArrayList<>();

        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int id = Integer.parseInt(st.nextToken());
            int pri = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());

            Node job = new Node(id, pri, time);
            queue.add(job);
        }

        queue.sort((a,b) -> {
            if((a.pri == b.pri) && (a.time == b.time)){
                return a.id - b.id;
            } else if(a.pri == b.pri) {
                return a.time - b.time;
            } else {
                return b.pri - a.pri;
            }
        });

        for(int i = 0; i<n; i++){
            System.out.println(queue.get(i).id);
        }
    }
}
