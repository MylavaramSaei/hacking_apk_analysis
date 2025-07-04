package f2zPq7MOnQrtOlZ1Zg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;

/* loaded from: classes.dex */
public class Z9WdNiOsPR0y54zHW4 {

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static Z9WdNiOsPR0y54zHW4 f5811s3fjYDxWOUexjjVgyA;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f5812lEeR5KfoEr4xU5yHH7;

    public Z9WdNiOsPR0y54zHW4(Context context) {
        this.f5812lEeR5KfoEr4xU5yHH7 = context.getApplicationContext();
    }

    public static final boolean HJFh0TGMpafqLE9haL(PackageInfo packageInfo, boolean z) {
        PackageInfo packageInfo2;
        if (!z) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            R9SAhYMerGybF9OAjL[] r9SAhYMerGybF9OAjLArr = LIMtzhnLwQyigzK0KO.f5803lEeR5KfoEr4xU5yHH7;
            if ((z ? s3fjYDxWOUexjjVgyA(packageInfo2, r9SAhYMerGybF9OAjLArr) : s3fjYDxWOUexjjVgyA(packageInfo2, r9SAhYMerGybF9OAjLArr[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public static Z9WdNiOsPR0y54zHW4 lEeR5KfoEr4xU5yHH7(Context context) {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(context);
        synchronized (Z9WdNiOsPR0y54zHW4.class) {
            try {
                if (f5811s3fjYDxWOUexjjVgyA == null) {
                    A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7(context);
                    f5811s3fjYDxWOUexjjVgyA = new Z9WdNiOsPR0y54zHW4(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f5811s3fjYDxWOUexjjVgyA;
    }

    public static final R9SAhYMerGybF9OAjL s3fjYDxWOUexjjVgyA(PackageInfo packageInfo, R9SAhYMerGybF9OAjL... r9SAhYMerGybF9OAjLArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk = new G7AC3DWIx9i9fdanjk(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < r9SAhYMerGybF9OAjLArr.length; i++) {
                if (r9SAhYMerGybF9OAjLArr[i].equals(g7AC3DWIx9i9fdanjk)) {
                    return r9SAhYMerGybF9OAjLArr[i];
                }
            }
        }
        return null;
    }
}
