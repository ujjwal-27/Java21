package TryWithFinallyOrResources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) {
        int num = 0;

        try (InputStreamReader in = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(in)) {
            num = Integer.parseInt(br.readLine());
            System.out.println(num);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
