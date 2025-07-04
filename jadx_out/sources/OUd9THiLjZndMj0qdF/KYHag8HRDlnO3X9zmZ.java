package OUd9THiLjZndMj0qdF;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class KYHag8HRDlnO3X9zmZ {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static Method f1180HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static Method f1181husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static long f1182lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static Method f1183s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static Method f1184zZKhbgvUfsK4AEX3r0;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f1182lEeR5KfoEr4xU5yHH7 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f1183s3fjYDxWOUexjjVgyA = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f1180HJFh0TGMpafqLE9haL = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f1184zZKhbgvUfsK4AEX3r0 = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f1181husNiw3snxdgZPAGJm = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    public static void lEeR5KfoEr4xU5yHH7(String str) {
        Trace.beginSection(str);
    }

    public static void s3fjYDxWOUexjjVgyA() {
        Trace.endSection();
    }
}
