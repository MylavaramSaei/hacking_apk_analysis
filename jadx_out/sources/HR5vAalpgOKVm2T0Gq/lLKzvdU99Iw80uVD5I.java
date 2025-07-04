package HR5vAalpgOKVm2T0Gq;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class lLKzvdU99Iw80uVD5I {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static String f414HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final Object f415lEeR5KfoEr4xU5yHH7 = new Object();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static boolean f416s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static int f417zZKhbgvUfsK4AEX3r0;

    public static int lEeR5KfoEr4xU5yHH7(Context context) {
        s3fjYDxWOUexjjVgyA(context);
        return f417zZKhbgvUfsK4AEX3r0;
    }

    public static void s3fjYDxWOUexjjVgyA(Context context) {
        Bundle bundle;
        synchronized (f415lEeR5KfoEr4xU5yHH7) {
            try {
                if (f416s3fjYDxWOUexjjVgyA) {
                    return;
                }
                f416s3fjYDxWOUexjjVgyA = true;
                try {
                    bundle = i8aHOwH04efS6lZ3Oa.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(context).s3fjYDxWOUexjjVgyA(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
                if (bundle == null) {
                    return;
                }
                f414HJFh0TGMpafqLE9haL = bundle.getString("com.google.app.id");
                f417zZKhbgvUfsK4AEX3r0 = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
