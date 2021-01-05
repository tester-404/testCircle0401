import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;
public class Debug2 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <=10; i++){
              int q = Integer.parseInt(RandomStringUtils.randomNumeric(1));
              list.add(q);
        }
        System.out.println(list);
    }
}
