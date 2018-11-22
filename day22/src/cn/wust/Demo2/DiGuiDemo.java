package cn.wust.Demo2;

public class DiGuiDemo {
    public static void main(String[] args) {
        System.out.println(getJieCheng(5));
        System.out.println(getSum(100));
        System.out.println(getFBNQ(12));
    }

    private static int getJieCheng(int n) {
        if (n == 1)
            return 1;
        return n * getJieCheng(n - 1);
    }

    private static int getSum(int n) {
        if (n == 1)
            return 1;
        return n + getSum(n - 1);
    }

    private static int getFBNQ(int month) {
        if (month == 1)
            return 1;
        if (month == 2)
            return 1;
        return getFBNQ(month - 1) + getFBNQ(month - 2);
    }
}
