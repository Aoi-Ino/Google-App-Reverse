package j$.time.format;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public abstract class DesugarDateTimeTextProviderHelper {
    private static String computeStandaloneMonthName(int i10, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar instance = Calendar.getInstance();
        instance.set(0, i10, 0);
        return simpleDateFormat.format(instance.getTime());
    }

    public static void fillWithStandaloneStyleMap(Map map, DateFormatSymbols dateFormatSymbols, Locale locale) {
        int length = dateFormatSymbols.getMonths().length;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (int i10 = 1; i10 < length; i10++) {
            String computeStandaloneMonthName = computeStandaloneMonthName(i10, "LLLL", locale);
            long j10 = (long) i10;
            linkedHashMap.put(Long.valueOf(j10), computeStandaloneMonthName);
            linkedHashMap2.put(Long.valueOf(j10), firstCodePoint(computeStandaloneMonthName));
            linkedHashMap3.put(Long.valueOf(j10), computeStandaloneMonthName(i10, "LLL", locale));
        }
        if (length > 0) {
            long j11 = (long) length;
            linkedHashMap.put(Long.valueOf(j11), "");
            linkedHashMap2.put(Long.valueOf(j11), "");
            linkedHashMap3.put(Long.valueOf(j11), "");
            map.put(TextStyle.FULL_STANDALONE, linkedHashMap);
            map.put(TextStyle.NARROW_STANDALONE, linkedHashMap2);
            map.put(TextStyle.SHORT_STANDALONE, linkedHashMap3);
        }
    }

    private static String firstCodePoint(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }
}
