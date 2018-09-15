import java.io.*;
import java.util.*;

public class wc {
    public static void main(String[] args) throws IOException {

        System.out.print("[Please...] 请输入命令：");
        Scanner input = new Scanner(System.in);

        String m = input.nextLine();
        String arr[] = m.split("\\s");

        switch (arr[0]) {
            case "-all":
                Luoji.luoji(arr);
                break; //返回字符数、单词数、行数
            default:
                System.out.println("\n******** 不存在该功能指令!");
                break;
        }

    }}





