package lab4;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

final class DateRange
{
    private Calendar startDate;
    private Calendar endDate;
    
    public DateRange(Date startDate, Date endDate)
    {
        this.startDate = new GregorianCalendar();
        this.startDate.setTime(startDate);
        
        this.endDate = new GregorianCalendar();
        this.endDate.setTime(endDate);
    }
    
    /**
     * Check whether a given Date is in the date range represented by this 
     * object
     */
    public boolean isInRange(Date date)
    {
        Calendar newDate = new GregorianCalendar();
        newDate.setTime(date);
        
        if (newDate.compareTo(startDate) >= 0 &&
            newDate.compareTo(endDate) <= 0)
        {
            return true;
        }
        return false;
    }
    
    /**
     * Returns a string in the form "Jan 1, 2005 - Jan 31, 2005"
     */
    public String toString()
    {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String dateRangeStr = df.format(startDate.getTime()) + " - " + 
                              df.format(endDate.getTime());   
        return dateRangeStr;
    }
    
    /**
     * Returns the date of the first day of the same month as "anyDate".
     */
    public static Date getFirstDayOfMonth(Date anyDate)
    {
        Calendar firstDayOfMonth = new GregorianCalendar();
        firstDayOfMonth.setTime(anyDate);
        firstDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);
        return firstDayOfMonth.getTime();
    }

    /**
     * Returns the date of the last day of the same month as "anyDate".
     */
    public static Date getLastDayOfMonth(Date anyDate)
    {
        Calendar lastDayOfMonth = new GregorianCalendar();
        lastDayOfMonth.setTime(anyDate);
        lastDayOfMonth.set(Calendar.DAY_OF_MONTH, 
                lastDayOfMonth.getActualMaximum(Calendar.DAY_OF_MONTH));
        return lastDayOfMonth.getTime();  
    }
}