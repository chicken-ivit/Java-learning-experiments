import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行";
        StringBuilder str_fix = new StringBuilder();
        for(int i = 0; i < str.length(); i+=7){
            if (i % 2 == 0){
                str_fix.append(str.substring(i, 7 + i)).append(",");
            }else
                str_fix.append(str.substring(i, 7 + i)).append("。").append('\n');
        }
        str = String.valueOf(str_fix);
        try {
            File path = new File("D:\\Java_output_text/output.txt");
            path.createNewFile(); // 创建新文件
            BufferedWriter out = new BufferedWriter(new FileWriter(path));
            out.write(String.valueOf(str));
            out.flush(); // 把缓存区内容压入文件
            out.close(); // 最后记得关闭文件
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        System.out.println(str);

        Scanner input = new Scanner(System.in);
        System.out.println("请输入要查找的字符串：");
        String search = input.next();

        int count = 0;

        for(int i = 0; i < str.length()-1; i++) {
            int start = str.indexOf(search);
            if (start != -1) {
                str = str.substring(start + search.length());
                count ++;
            }else
                break;
        }
        System.out.println(count);
    }
}





