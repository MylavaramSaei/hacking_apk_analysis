package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class R9SAhYMerGybF9OAjL {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static AtomicReference f5107lEeR5KfoEr4xU5yHH7 = new AtomicReference();

    public static Calendar Acstmh57AKoSEkEFNJ(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(KYHag8HRDlnO3X9zmZ());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    public static Calendar HJFh0TGMpafqLE9haL(Calendar calendar) {
        Calendar calendarAcstmh57AKoSEkEFNJ = Acstmh57AKoSEkEFNJ(calendar);
        Calendar calendarPbVGzGjWvY2LDXC8vo = pbVGzGjWvY2LDXC8vo();
        calendarPbVGzGjWvY2LDXC8vo.set(calendarAcstmh57AKoSEkEFNJ.get(1), calendarAcstmh57AKoSEkEFNJ.get(2), calendarAcstmh57AKoSEkEFNJ.get(5));
        return calendarPbVGzGjWvY2LDXC8vo;
    }

    public static TimeZone IPyIQcaNa8aB7drBED() {
        return TimeZone.getTimeZone("UTC");
    }

    public static java.util.TimeZone KYHag8HRDlnO3X9zmZ() {
        return java.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar TCyPEKSzIyweCN5yp1() {
        Calendar calendarLEeR5KfoEr4xU5yHH7 = husNiw3snxdgZPAGJm().lEeR5KfoEr4xU5yHH7();
        calendarLEeR5KfoEr4xU5yHH7.set(11, 0);
        calendarLEeR5KfoEr4xU5yHH7.set(12, 0);
        calendarLEeR5KfoEr4xU5yHH7.set(13, 0);
        calendarLEeR5KfoEr4xU5yHH7.set(14, 0);
        calendarLEeR5KfoEr4xU5yHH7.setTimeZone(KYHag8HRDlnO3X9zmZ());
        return calendarLEeR5KfoEr4xU5yHH7;
    }

    public static DateFormat Z9WdNiOsPR0y54zHW4(Locale locale) {
        return s3fjYDxWOUexjjVgyA("yMMMM", locale);
    }

    public static DateFormat e54J8UWNHWALQNixXM(Locale locale) {
        return s3fjYDxWOUexjjVgyA("yMMMMEEEEd", locale);
    }

    public static Y43RdunnpKgpbny0lE husNiw3snxdgZPAGJm() {
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = (Y43RdunnpKgpbny0lE) f5107lEeR5KfoEr4xU5yHH7.get();
        return y43RdunnpKgpbny0lE == null ? Y43RdunnpKgpbny0lE.HJFh0TGMpafqLE9haL() : y43RdunnpKgpbny0lE;
    }

    public static long lEeR5KfoEr4xU5yHH7(long j) {
        Calendar calendarPbVGzGjWvY2LDXC8vo = pbVGzGjWvY2LDXC8vo();
        calendarPbVGzGjWvY2LDXC8vo.setTimeInMillis(j);
        return HJFh0TGMpafqLE9haL(calendarPbVGzGjWvY2LDXC8vo).getTimeInMillis();
    }

    public static Calendar pbVGzGjWvY2LDXC8vo() {
        return Acstmh57AKoSEkEFNJ(null);
    }

    public static DateFormat s3fjYDxWOUexjjVgyA(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(IPyIQcaNa8aB7drBED());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    public static DateFormat zZKhbgvUfsK4AEX3r0(Locale locale) {
        return s3fjYDxWOUexjjVgyA("MMMMEEEEd", locale);
    }
}
