package com.google.android.material.datepicker;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class husNiw3snxdgZPAGJm {
    public static String HJFh0TGMpafqLE9haL(long j, Locale locale) {
        return R9SAhYMerGybF9OAjL.zZKhbgvUfsK4AEX3r0(locale).format(new Date(j));
    }

    public static String IPyIQcaNa8aB7drBED(long j, Locale locale) {
        return R9SAhYMerGybF9OAjL.e54J8UWNHWALQNixXM(locale).format(new Date(j));
    }

    public static String KYHag8HRDlnO3X9zmZ(long j) {
        return R9SAhYMerGybF9OAjL.Z9WdNiOsPR0y54zHW4(Locale.getDefault()).format(new Date(j));
    }

    public static String TCyPEKSzIyweCN5yp1(long j) {
        return IPyIQcaNa8aB7drBED(j, Locale.getDefault());
    }

    public static String husNiw3snxdgZPAGJm(Context context, int i) {
        return R9SAhYMerGybF9OAjL.TCyPEKSzIyweCN5yp1().get(1) == i ? String.format(context.getString(tmIBXGVvBsrJ7i63G2.IPyIQcaNa8aB7drBED.f7058Z9WdNiOsPR0y54zHW4), Integer.valueOf(i)) : String.format(context.getString(tmIBXGVvBsrJ7i63G2.IPyIQcaNa8aB7drBED.f7060e54J8UWNHWALQNixXM), Integer.valueOf(i));
    }

    public static String lEeR5KfoEr4xU5yHH7(Context context, long j, boolean z, boolean z2, boolean z3) {
        String strZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(j);
        if (z) {
            strZZKhbgvUfsK4AEX3r0 = String.format(context.getString(tmIBXGVvBsrJ7i63G2.IPyIQcaNa8aB7drBED.f7061hoXrIDAFrSwfShk8da), strZZKhbgvUfsK4AEX3r0);
        }
        return z2 ? String.format(context.getString(tmIBXGVvBsrJ7i63G2.IPyIQcaNa8aB7drBED.f7055T9PhQIpGRhE4yZDm1C), strZZKhbgvUfsK4AEX3r0) : z3 ? String.format(context.getString(tmIBXGVvBsrJ7i63G2.IPyIQcaNa8aB7drBED.f7049Acstmh57AKoSEkEFNJ), strZZKhbgvUfsK4AEX3r0) : strZZKhbgvUfsK4AEX3r0;
    }

    public static boolean pbVGzGjWvY2LDXC8vo(long j) {
        Calendar calendarTCyPEKSzIyweCN5yp1 = R9SAhYMerGybF9OAjL.TCyPEKSzIyweCN5yp1();
        Calendar calendarPbVGzGjWvY2LDXC8vo = R9SAhYMerGybF9OAjL.pbVGzGjWvY2LDXC8vo();
        calendarPbVGzGjWvY2LDXC8vo.setTimeInMillis(j);
        return calendarTCyPEKSzIyweCN5yp1.get(1) == calendarPbVGzGjWvY2LDXC8vo.get(1);
    }

    public static String s3fjYDxWOUexjjVgyA(long j) {
        return HJFh0TGMpafqLE9haL(j, Locale.getDefault());
    }

    public static String zZKhbgvUfsK4AEX3r0(long j) {
        return pbVGzGjWvY2LDXC8vo(j) ? s3fjYDxWOUexjjVgyA(j) : TCyPEKSzIyweCN5yp1(j);
    }
}
