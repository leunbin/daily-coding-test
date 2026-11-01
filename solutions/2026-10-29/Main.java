import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] str = new char[n+1];
        char[] s = br.readLine().toCharArray();

        for(int i = 0; i<n; i++){
            str[i] = s[i];
        }

        int foreidx = 0;
        int nowidx = 1;
        String answer = "";
        int cnt = 1;

        while(nowidx<=n){
            if(str[foreidx] == str[nowidx]){
                cnt++;
                foreidx = nowidx;
                nowidx++;
            }

            if(str[foreidx] != str[nowidx]){
                if(cnt != 1){
                    answer += str[foreidx] + String.valueOf(cnt);
                    cnt = 1;
                    foreidx = nowidx;
                    nowidx++;
                } else {
                    answer += str[foreidx];
                    foreidx = nowidx;
                    nowidx++;
                }
            }
        }

        System.out.println(answer);
    }
}
