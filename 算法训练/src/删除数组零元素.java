import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/12 10:41
 **/
/*从键盘读入n个整数放入数组中，编写函数CompactIntegers，删除数组中所有值为0的元素，
其后元素向数组首端移动。注意，CompactIntegers函数需要接受数组及其元素个数作为参数，
函数返回值应为删除操作执行后数组的新元素个数。输出删除后数组中元素的个数并依次输出数组元素。
样例输入: （输入格式说明：5为输入数据的个数，3 4 0 0 2 是以空格隔开的5个整数）
5
3 4 0 0 2
样例输出:（输出格式说明：3为非零数据的个数，3 4 2 是以空格隔开的3个非零整数）
3
3 4 2*/
public class 删除数组零元素 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int len = sc.nextInt();
            int[] a = new int[len];
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i < len;i++){
                int t = sc.nextInt();
                a[i] = t;
                if(t != 0){
                    list.add(t);
                }
            }
            System.out.println(list.size());
            if(list.size()!=0) {
                for (int i = 0; i < list.size() - 1; i++) {
                    System.out.print(list.get(i) + " ");
                }
                System.out.println(list.get(list.size() - 1));
            }
        }
    }
}
