// NOTE: it is recommended to use this even if you don't understand the following code.

import java.util.*;
import java.io.*;
import java.lang.*;

public class planeville {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Locale.setDefault(Locale.US);
        InputStream fin = System.in;
        OutputStream fout = System.out;
        // uncomment the two following lines if you want to read/write from files
        fin = new FileInputStream("/workspaces/Liste/Liste/Planeville/input0.txt");
        fout = new FileOutputStream("/workspaces/Liste/Liste/Planeville/output0.txt");

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fout));
        reader = new BufferedReader(new InputStreamReader(fin));
        scn = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(next());

        int[] V = new int[N];
        for (int i = 0; i < N; ++i)
            V[i] = Integer.parseInt(next());

        int S = 0;


        for (int i = 0; i < N; i++) {
            S += V[i] + 2;
        }


        writer.write(String.valueOf(S));
        writer.write('\n');

        writer.flush();
    }

    static String next() throws IOException {
        while (!scn.hasMoreTokens()) scn = new StringTokenizer(reader.readLine());
        return scn.nextToken();
    }

    static BufferedReader reader;
    static StringTokenizer scn;
}
