package cz.trantanh.gpe.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Util used for working with date
 * Created by tran.t.anh(@)email.cz on 13.04.2020.
 */
public class DateUtils {

    private static final String DATE_PATTER = "dd.MM.yyyy'T'hh:mm:ss";

    private DateUtils() {
    }

    public static String dateToString(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_PATTER);
        return simpleDateFormat.format(date);
    }
}
