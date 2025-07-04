package ZJNyOIPL0usMs2xSAn;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static long f2302lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static Method f2303s3fjYDxWOUexjjVgyA;

    public static void HJFh0TGMpafqLE9haL(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean husNiw3snxdgZPAGJm() {
        try {
            if (f2303s3fjYDxWOUexjjVgyA == null) {
                f2302lEeR5KfoEr4xU5yHH7 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2303s3fjYDxWOUexjjVgyA = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2303s3fjYDxWOUexjjVgyA.invoke(null, Long.valueOf(f2302lEeR5KfoEr4xU5yHH7))).booleanValue();
        } catch (Exception e) {
            HJFh0TGMpafqLE9haL("isTagEnabled", e);
            return false;
        }
    }

    public static void lEeR5KfoEr4xU5yHH7(String str) {
        HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(str);
    }

    public static void s3fjYDxWOUexjjVgyA() {
        HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA();
    }

    public static boolean zZKhbgvUfsK4AEX3r0() {
        try {
            if (f2303s3fjYDxWOUexjjVgyA == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return husNiw3snxdgZPAGJm();
    }
}
