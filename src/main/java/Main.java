import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] num = new int[4];
        char[] operate = new char[]{'＋','—','×','÷'};
        int answer;
        Random r = new Random();
        Random r1 = new Random();
        //获取输入，来决定要用多少个运算符，目前先默认用两个
        /*
        Scanner in = new Scanner(System.in);
        int o = in.nextInt();
        */
        for (int j = 0; j < 5; j++) {
            for (int i = 0;i<4;i++ ) {
                //nextInt()里面的数字是表示随机数的最大值，之后用输入代替，
                num[i] = r.nextInt(10);
            }
            //没有排除0作为分子的情况，没有将结果计算出来
            System.out.println(""+ num[0] +" "+ operate[r1.nextInt(4)] +" "+ num[1] +" "+ operate[r1.nextInt(4)] +" "+ num[2] +"=");
        }
        //用随机数在数组中随机选取加减乘除
        /*
        switch (opeartion) {
            case 0:
                answer = num[0] + num[1] + num[2] + num[3];
                System.out.println(answer +"="+ num[0] +"+"+ num[1] +"+"+ num[2] +"+"+ num[3]);
                break;
            case 1:
                answer = num[0] + num[1] + num[2] * num[3];
                System.out.println(answer +"="+ num[0] +"+"+ num[1] +"+"+ num[2] +"*"+ num[3]);
                break;
            case 2:
                answer = num[0] + num[1] * num[2] + num[3];
                System.out.println(answer +"="+ num[0] +"+"+ num[1] +"*"+ num[2] +"+"+ num[3]);
                break;
            case 3:
                answer = num[0] + num[1] * num[2] * num[3];
                System.out.println(answer +"="+ num[0] +"+"+ num[1] +"*"+ num[2] +"*"+ num[3]);
                break;
            case 4:
                answer = num[0] * num[1] + num[2] + num[3];
                System.out.println(answer +"="+ num[0] +"*"+ num[1] +"+"+ num[2] +"+"+ num[3]);
                break;
            case 5:
                answer = num[0] * num[1] + num[2] * num[3];
                System.out.println(answer +"="+ num[0] +"*"+ num[1] +"+"+ num[2] +"*"+ num[3]);
                break;
            case 6:
                answer = num[0] * num[1] * num[2] + num[3];
                System.out.println(answer +"="+ num[0] +"*"+ num[1] +"*"+ num[2] +"+"+ num[3]);
                break;
            case 7:
                answer = num[0] * num[1] * num[2] * num[3];
                System.out.println(answer +"="+ num[0] +"*"+ num[1] +"*"+ num[2] +"*"+ num[3]);
                break;
            default:
                break;
        }
        */
    }

}
