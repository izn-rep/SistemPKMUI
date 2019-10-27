/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Desktop;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Izani Note-PC1
 */
public class time {
    Calendar now = Calendar.getInstance();

Date date = now.getTime();

int day = now.get(Calendar.DAY_OF_MONTH);

int mon = now.get(Calendar.MONTH) + 1;

int year = now.get(Calendar.YEAR);

int hrs = now.get(Calendar.HOUR_OF_DAY);

int min = now.get(Calendar.MINUTE);

int sec = now.get(Calendar.SECOND);
}
