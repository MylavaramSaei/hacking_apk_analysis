package i8aHOwH04efS6lZ3Oa;

import android.content.Context;
import fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static Context f6043lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static Boolean f6044s3fjYDxWOUexjjVgyA;

    public static synchronized boolean lEeR5KfoEr4xU5yHH7(Context context) {
        Boolean boolValueOf;
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f6043lEeR5KfoEr4xU5yHH7;
        if (context2 != null && (bool = f6044s3fjYDxWOUexjjVgyA) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f6044s3fjYDxWOUexjjVgyA = null;
        if (!pbVGzGjWvY2LDXC8vo.TCyPEKSzIyweCN5yp1()) {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f6044s3fjYDxWOUexjjVgyA = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                boolValueOf = Boolean.FALSE;
            }
            f6043lEeR5KfoEr4xU5yHH7 = applicationContext;
            return f6044s3fjYDxWOUexjjVgyA.booleanValue();
        }
        boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f6044s3fjYDxWOUexjjVgyA = boolValueOf;
        f6043lEeR5KfoEr4xU5yHH7 = applicationContext;
        return f6044s3fjYDxWOUexjjVgyA.booleanValue();
    }
}
