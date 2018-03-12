package DateExample;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @Author: HuangZiTeng
 * @Date: 9:30 2018/3/9 0009
 * @ClassUse: calender的使用
 * @Modified: no
 */
public class calenderExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入年份");
        String line = scanner.nextLine();
        System.out.println(retunPingRui(Integer.parseInt(line)));
//        System.out.println(calendar.get(Calendar.YEAR) + "年" + oneAplle(calendar.get(Calendar
//                .MONTH) + 1) + "月" + oneAplle(calendar.get(Calendar.DAY_OF_MONTH)) + "日" + getWeek(calendar
//                .get(Calendar.DAY_OF_WEEK)));

    }

    private static String getWeek(int arr) {
        String[] week = {"", "星期天", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六",};
        return week[arr];
    }

    private static String oneAplle(int temp) {

        return temp > 9 ? temp + "" : "0" + temp;
    }

    /**
     * 计算这一年是平年还是闰年
     *
     * @return
     */
    private static boolean retunPingRui(int year) {
        Calendar calendar = Calendar.getInstance();
        //设置为那一年的3月1日
        calendar.set(year, 2, 1);
        //将日向前前-1
        calendar.add(Calendar.DAY_OF_MONTH, -1);

        return calendar.get(Calendar.DAY_OF_MONTH) == 29;
    }
}
