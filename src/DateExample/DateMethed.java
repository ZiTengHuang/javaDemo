package DateExample;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: HuangZiTeng
 * @Date: 11:45 2018/3/6 0006
 * @ClassUse:
 * @Modified: no
 */
public class DateMethed {

    public static void main(String[] args) throws ParseException {
//        Date date = new Date();
//        System.out.println(date.getTime());
////        DateFormat dateFormat = DateFormat.getTimeInstance();
////        System.out.println(dateFormat);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日：HH：mm:ss");
//        System.out.println(sdf.format(date));
        DateStringToNew();
        String shengri = "1993年5月20日";

        getDate(shengri);
    }

    private static void DateStringToNew() {
        Date date = new Date();
        String str = "1993年5月20日";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        try {
            date = simpleDateFormat.parse(str);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void getDate(String shengri) throws ParseException {

//        long nowDate = System.currentTimeMillis();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
//        System.out.println("现在日期是: " + dateFormat.format(nowDate));
//        System.out.println("你的生日是：" + shengri);
//        Date date1 = dateFormat.parse(shengri);
//        Long shengria = date1.getTime();
//        System.out.println(((nowDate-shengria)/1000/60/60/24/365));
//        System.out.println(new SimpleDateFormat("dd天").format(new Date((nowDate-shengria)/1000/60/60)));
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = dateFormat.parse(shengri);
        long demp = new Date().getTime() - date.getTime();
        System.out.println(demp / 1000 / 60 / 60 / 24 / 365);
        System.out.println(dateFormat.format(demp));
    }
}
