package TryWithFinallyOrResources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// This is just an example to show the use of finally i.e. for closing resources.
public class TryWithFinally {
    public static void main(String[] args) throws IOException {
        int num = 0;
        InputStreamReader in = null;
        BufferedReader br = null;

        try {
            in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            num = Integer.parseInt(br.readLine());
            System.out.println(num);

        } catch (IOException e) {
            System.out.println(e);

        } finally {
            br.close();
            in.close();
        }
    }
}
