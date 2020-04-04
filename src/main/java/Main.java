import java.util.Random;
/*asdasdasddasad
    还缺什么功能呢：不能除以0的判断没有完成
                    括号功能没有完成
                    计算答案功能，输出到文件的功能
                    查重的功能
                    没有做到完全随机，还需继续改进
                    代码太乱，没有分类
 */
public class Main {
    public static void main(String[] args) {
        int[] num = new int[4];
        float[] num1 = new float[4];
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
            //生成的随机浮点数为小于1的，乘以5,生成5以内的随机小数
            num1[0] = r.nextFloat()*5;
            String[] array = new String[2];
            //将浮点数转化为字符串
            String s = String.valueOf(num1[0]);
            //截取两位小数
            s = s.substring(0, 4);
            //从小数点位置，将字符串分成整数部分和分数部分
            array = s.split("\\.");
            int a = Integer.parseInt(array[0]);//获取整数部分
            int b = Integer.parseInt(array[1]);//获取小数部分,注意此处b已经是整数了
            int length = array[1].length();

            //numerator是分子
            int numerator  = b;
            //denomination：我是分母，因为固定两位小数，所以分母直接用100
            //int denominator  = (int) Math.pow(10, length);
            int denominator = 100;
            //他是最大公约数👇
            int greatestCommonDivisor = getGreatestCommonDivisor(numerator , denominator );
            numerator = numerator  / greatestCommonDivisor;
            denominator = denominator  / greatestCommonDivisor;
            if (a!=0) {
                System.out.println(""+ num[0] +" "+ operate[r1.nextInt(4)] +" "+ a + "'" + numerator + "/" + denominator +
                        " "+ operate[r1.nextInt(4)] +" "+ num[2] +"=");
            }else{
                System.out.println(""+ num[0] +" "+ operate[r1.nextInt(4)] +" " + numerator + "/" + denominator +
                        " "+ operate[r1.nextInt(4)] +" "+ num[2] +"=");
            }
            //没有排除0作为分子的情况，没有将结果计算出来
            //建议不要直接打印出来，而是使用数组进行保存，然后才能判断
            System.out.println(""+ num[0] +" "+ operate[r1.nextInt(4)] +" "+ a + "'" + numerator + "/" + denominator +
                    " "+ operate[r1.nextInt(4)] +" "+ num[2] +"=");
        }
    }
    //此方法用于获取两个数的最大公约数
    public static int getGreatestCommonDivisor(int a, int b) {//求两个数的最大公约数
        int t = 0;
        if(a < b){
            t = a;
            a = b;
            b = t;
        }
        int c = a % b;
        if(c == 0){
            return b;
        }else{
            return getGreatestCommonDivisor(b, c);
        }
    }



}
