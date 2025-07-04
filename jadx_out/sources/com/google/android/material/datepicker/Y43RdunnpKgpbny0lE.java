package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class Y43RdunnpKgpbny0lE {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final Y43RdunnpKgpbny0lE f5115HJFh0TGMpafqLE9haL = new Y43RdunnpKgpbny0lE(null, null);

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Long f5116lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final TimeZone f5117s3fjYDxWOUexjjVgyA;

    public Y43RdunnpKgpbny0lE(Long l, TimeZone timeZone) {
        this.f5116lEeR5KfoEr4xU5yHH7 = l;
        this.f5117s3fjYDxWOUexjjVgyA = timeZone;
    }

    public static Y43RdunnpKgpbny0lE HJFh0TGMpafqLE9haL() {
        return f5115HJFh0TGMpafqLE9haL;
    }

    public Calendar lEeR5KfoEr4xU5yHH7() {
        return s3fjYDxWOUexjjVgyA(this.f5117s3fjYDxWOUexjjVgyA);
    }

    public Calendar s3fjYDxWOUexjjVgyA(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f5116lEeR5KfoEr4xU5yHH7;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
