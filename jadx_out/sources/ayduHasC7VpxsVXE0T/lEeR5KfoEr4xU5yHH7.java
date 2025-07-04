package ayduHasC7VpxsVXE0T;

import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 {
    public static void HJFh0TGMpafqLE9haL(String str, String str2, Object... objArr) {
        String strHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(str);
        if (Log.isLoggable(strHusNiw3snxdgZPAGJm, 3)) {
            Log.d(strHusNiw3snxdgZPAGJm, String.format(str2, objArr));
        }
    }

    public static void KYHag8HRDlnO3X9zmZ(String str, String str2, Object obj) {
        String strHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(str);
        if (Log.isLoggable(strHusNiw3snxdgZPAGJm, 4)) {
            Log.i(strHusNiw3snxdgZPAGJm, String.format(str2, obj));
        }
    }

    public static void TCyPEKSzIyweCN5yp1(String str, String str2, Object obj) {
        String strHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(str);
        if (Log.isLoggable(strHusNiw3snxdgZPAGJm, 5)) {
            Log.w(strHusNiw3snxdgZPAGJm, String.format(str2, obj));
        }
    }

    public static String husNiw3snxdgZPAGJm(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return lEeR5KfoEr4xU5yHH7("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    public static String lEeR5KfoEr4xU5yHH7(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    public static void s3fjYDxWOUexjjVgyA(String str, String str2, Object obj) {
        String strHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(str);
        if (Log.isLoggable(strHusNiw3snxdgZPAGJm, 3)) {
            Log.d(strHusNiw3snxdgZPAGJm, String.format(str2, obj));
        }
    }

    public static void zZKhbgvUfsK4AEX3r0(String str, String str2, Throwable th) {
        String strHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(str);
        if (Log.isLoggable(strHusNiw3snxdgZPAGJm, 6)) {
            Log.e(strHusNiw3snxdgZPAGJm, str2, th);
        }
    }
}
