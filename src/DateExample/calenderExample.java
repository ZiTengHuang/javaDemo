package DateExample;

import java.util.Calendar;

/**
 * @Author: HuangZiTeng
 * @Date: 9:30 2018/3/9 0009
 * @ClassUse:
 * @Modified: no
 */
public class calenderExample {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.YEAR) + "年" + oneAplle(calendar.get(Calendar
                .MONTH) + 1) + "月" + oneAplle(calendar.get(Calendar.DAY_OF_MONTH)) + "日" + getWeek(calendar
                .get(Calendar.DAY_OF_WEEK)));

    }

    private static String getWeek(int arr) {
        String[] week = {"", "星期天", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六",};
        return week[arr];
    }

    private static String oneAplle(int temp) {

        return temp > 9 ? temp + "" : "0" + temp;
    }


}
