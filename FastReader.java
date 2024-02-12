import java.io.*;
import java.util.StringTokenizer;

public class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public FastReader(String s) {
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(s)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    String nextLine(){
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    String next(){
        while (st == null || !st.hasMoreElements()){
            try{
                st = new StringTokenizer(br.readLine());
            }catch(IOException e){
                throw new RuntimeException(e);
            }
        }
        return st.nextToken();
    }

    public static int readInt() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c=System.in.read() ) > 32 ){
            n = (n<<3) + (n<<1) + (c&15);
        }
        return n;
    }
}
