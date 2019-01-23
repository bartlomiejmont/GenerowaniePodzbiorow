package com.company;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        Algortym permu = new Algortym();

        try {
            String zbior = br.readLine();
            permu.LiczPermutacje(zbior);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
