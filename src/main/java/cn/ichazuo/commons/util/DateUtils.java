package cn.ichazuo.commons.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName: DateUtils 
 * @Description: (日期帮助类) 
 * @author ZhaoXu
 * @date 2015年6月28日 下午4:20:56 
 * @version V1.0
 */
public class DateUtils {
	private static final LocalDate now = LocalDate.now();
	
	/** yyyy-MM-dd HH:mm:ss */
	public static final String TIME_FORMAT_NORMAL = "yyyy-MM-dd HH:mm:ss";
	/** yyyy-MM-dd */
	public static final String DATE_FORMAT_NORMAL = "yyyy-MM-dd";
	/** yyyy.MM.dd */
	public static final String DATE_FORMAT_DOT = "yyyy.MM.dd";
	/** yyyyMMdd */
	public static final String DATE_FORMAT_NO_MINUS = "yyyyMMdd";
	/** yyMMdd */
	public static final String DATE_FORMAT_NO_MINUS_SHORT = "yyMMdd";
	/** yyyy-MM */
	public static final String MONTH_FORMAT_NORMAL = "yyyy-MM";
	/** MM */
	public static final String MONTH = "MM";
	/** dd */
	public static final String Day = "dd";
	/** MM-dd */
	public static final String MONTH_DAY_FORMAT = "MM-dd";
	/** MM月dd日 HH:mm */
	public static final String MONTH_DAY_HOUR_MINUTE_FORMAT = "MM月dd日 HH:mm";
	public static final String MONTH_DAY_YEAR = "yyyy年MM月dd日";
	public static final String MONTH_DAY_ = "MM月dd日";
	public static final String MONTH_DAY = "dd日";
	public static final String MONTH_YEAR_DAY_HOUR_MINUTE_FORMAT = "yyyy年MM月dd日HH:mm";
	/** yyyyMMdd */
	public static final String DATE_FORMAT_SHORT = "yyyyMMdd";
	/** yyyyMM */
	public static final String MONTH_FORMAT = "yyyyMM";
	/** yyyy.MM */
	public static final String MONTH_FORMAT_DOT = "yyyy.MM";
	/** yyyyMMddHHmm */
	public static final String DATE_FORMAT_MINUTE = "yyyyMMddHHmm";
	/** yyyyMMddHHmmss */
	public static final String TIME_FORMAT_SHORT = "yyyyMMddHHmmss";
	/** MM/dd/yyyy HH:mm:ss **/
	public static final String MONTH_DAY_YEAR_HOUR_MINUTE = "MM/dd/yyyy HH:mm:ss";
	/** HH:mm */
	public static final String HOUR_MINUTE = "HH:mm";
	
	/**
	 * @Title: parseDate 
	 * @Description: (String转Date类型) 
	 * @param formatDate 日期字符串
	 * @param pattern 转换格式
	 * @return
	 */
	public static Date parseDate(String formatDate,String pattern){
		if(pattern == null){
			pattern = TIME_FORMAT_NORMAL;
		}
	    SimpleDateFormat format=new SimpleDateFormat(pattern);
	    Date date = null;
		try {
			date = format.parse(formatDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    return date;
	}
	
	/**
	 * @Title: parseDate 
	 * @Description: (String转Date类型,默认为yyyy-MM-dd HH:mm:ss) 
	 * @param formatDate 日期字符串
	 * @return
	 * @author ZhaoXu
	 */
	public static Date parseDate(String formatDate){
	    SimpleDateFormat format=new SimpleDateFormat(TIME_FORMAT_NORMAL);
	    Date date = null;
		try {
			date = format.parse(formatDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    return date;
	}
	
	/**
	 * @Title: formatDate 
	 * @Description: (格式化日期) 
	 * @param date 日期 
	 * @param pattern 格式
	 * @return
	 */
	public static String formatDate(Date date,String pattern){
		if(pattern == null){
			pattern = TIME_FORMAT_NORMAL;
		}
		SimpleDateFormat format=new SimpleDateFormat(pattern);
		return format.format(date);
	}
	
	/**
	 * @Title: formatDate 
	 * @Description: (格式化日期,默认为:yyyy-MM-dd HH:mm:ss) 
	 * @param date 日期
	 * @author ZhaoXu
	 */
	public static String formatDate(Date date){
		SimpleDateFormat format=new SimpleDateFormat(TIME_FORMAT_NORMAL);
		return format.format(date);
	}
	
	/**
	 *  
	 * @Title: getCurrentDate 
	 * @Description: (获取当前日期,默认格式yyyy-MM-dd HH:mm:ss) 
	 * @return
	 */
    public static String getCurrentDate(){ 
    	return formatDate(new Date(),TIME_FORMAT_NORMAL);
    } 
    
    /**
     * 
     * @Title: getCurrentDate 
     * @Description: (根据格式返回当前日期) 
     * @param pattern 转换格式
     * @return
     */
    public static String getCurrentDate(String pattern){  
    	return formatDate(new Date(),pattern);
    }
    
    /**
     * @Title: getConstellation 
     * @Description: (根据日期返回星座信息) 
     * @param month
     * @param day
     * @return
     * @author ZhaoXu
     */
    public static String getConstellation(int month,int day){
    	String constellation = null;
		//计算星座
		switch(month){
		case 1:
			if(day >= 20){
				constellation = "水瓶座";
			}else{
				constellation = "摩羯座";
			}
			break;
		case 2:
			if(day >= 19){
				constellation = "双鱼座";
			}else{
				constellation = "水瓶座";
			}
			break;
		case 3:
			if(day >= 21){
				constellation = "白羊座";
			}else{
				constellation = "双鱼座";
			}
			break;
		case 4:
			if(day >= 20){
				constellation = "金牛座";
			}else{
				constellation = "白羊座";
			}
			break;
		case 5:
			if(day >= 21){
				constellation = "双子座";
			}else{
				constellation = "金牛座";
			}
			break;
		case 6: 
			if(day >= 22){
				constellation = "巨蟹座";
			}else{
				constellation = "双子座";
			}
			break;
		case 7:
			if(day >= 23){
				constellation = "狮子座";
			}else{
				constellation = "巨蟹座";
			}
			break;
		case 8:
			if(day >= 23){
				constellation = "处女座";
			}else{
				constellation = "狮子座";
			}
			break;
		case 9:
			if(day >= 23){
				constellation = "天秤座";
			}else{
				constellation = "处女座";
			}
			break;
		case 10:
			if(day >= 24){
				constellation = "天蝎座";
			}else{
				constellation = "天秤座";
			}
			break;
		case 11:
			if(day >= 23){
				constellation = "射手座";
			}else{
				constellation = "天蝎座";
			}
			break;
		case 12:
			if(day >= 22){
				constellation = "摩羯座";
			}else{
				constellation = "射手座";
			}
			break;
		}
		return constellation;
    }
    
    /**
     * @Title: calcAge 
     * @Description: (计算年龄) 
     * @param year 出生年份
     * @param month 月份
     * @param day 日
     * @return
     * @author ZhaoXu
     */
    public static int calcAge(int year,int month,int day){
    	LocalDate now = LocalDate.now();
		
    	int birNum = now.getYear() - year;
		if(now.getMonthValue() > month){
			birNum = birNum + 1;
		}else if(now.getMonthValue() == month){
			if(now.getDayOfMonth() >= day){
				birNum = birNum + 1;
			}
		}
		return birNum;
    }
    
    /**
     * @Title: getJobYear 
     * @Description: (获得工作时间) 
     * @param jobYear
     * @return
     * @author ZhaoXu
     */
    public static String getJobYear(int jobYear){
		// 工作年限
		if (now.getYear() - jobYear == 0) {
			return "半年";
		} else {
			return (now.getYear() - jobYear) + "年";
		}
    }
    
    /**
     * @Title: getNowDate 
     * @Description: (获得当前时间) 
     * @return
     */
    public static Date getNowDate(){
    	return new Date();
    }
    
 
    /**
     * @Title: getWeekOfDate 
     * @Description: (获得周几) 
     * @param dt
     * @return
     */
    public static String getWeekOfDate(Date dt) {
        String[] weekDays = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
    }
}
