import java.io.*;
import java.util.*;
public class Luoji {
        public static void luoji(String[] args) throws IOException {
            Scanner input = new Scanner(System.in);

            System.out.println("请输入路径");
            String path = input.nextLine();
            BufferedReader br = new BufferedReader( new FileReader(path));
            int countzifu = 0;
            int countdanci = 0;
            int counthang = 0;
            String line = null;
            for( ;(line=br.readLine())!=null ; )
                {
                    String[] strs = line.split("\\s");
                    for (int i = 0; i < strs.length; i++)
                    {
                        countdanci++;
                        countzifu += strs[i].length();
                    }
                    counthang++;  }
                    br.close();
            System.out.println("character: " + countzifu);
            System.out.println("word: " + countdanci);
            System.out.println("line :" + counthang); }
        }


