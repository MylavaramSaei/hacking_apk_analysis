package fDXXEWvhMVO3O8mnuS;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public abstract class KYHag8HRDlnO3X9zmZ {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static Boolean f5868HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static Boolean f5869lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static Boolean f5870s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static Boolean f5871zZKhbgvUfsK4AEX3r0;

    public static boolean HJFh0TGMpafqLE9haL(Context context) {
        if (s3fjYDxWOUexjjVgyA(context) && !pbVGzGjWvY2LDXC8vo.KYHag8HRDlnO3X9zmZ()) {
            return true;
        }
        if (zZKhbgvUfsK4AEX3r0(context)) {
            return !pbVGzGjWvY2LDXC8vo.TCyPEKSzIyweCN5yp1() || pbVGzGjWvY2LDXC8vo.Acstmh57AKoSEkEFNJ();
        }
        return false;
    }

    public static boolean KYHag8HRDlnO3X9zmZ(PackageManager packageManager) {
        if (f5869lEeR5KfoEr4xU5yHH7 == null) {
            boolean z = false;
            if (pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f5869lEeR5KfoEr4xU5yHH7 = Boolean.valueOf(z);
        }
        return f5869lEeR5KfoEr4xU5yHH7.booleanValue();
    }

    public static boolean husNiw3snxdgZPAGJm(Context context) {
        if (f5868HJFh0TGMpafqLE9haL == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f5868HJFh0TGMpafqLE9haL = Boolean.valueOf(z);
        }
        return f5868HJFh0TGMpafqLE9haL.booleanValue();
    }

    public static boolean lEeR5KfoEr4xU5yHH7(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f5871zZKhbgvUfsK4AEX3r0 == null) {
            boolean z = false;
            if (pbVGzGjWvY2LDXC8vo.TCyPEKSzIyweCN5yp1() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f5871zZKhbgvUfsK4AEX3r0 = Boolean.valueOf(z);
        }
        return f5871zZKhbgvUfsK4AEX3r0.booleanValue();
    }

    public static boolean s3fjYDxWOUexjjVgyA(Context context) {
        return KYHag8HRDlnO3X9zmZ(context.getPackageManager());
    }

    public static boolean zZKhbgvUfsK4AEX3r0(Context context) {
        if (f5870s3fjYDxWOUexjjVgyA == null) {
            boolean z = false;
            if (pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f5870s3fjYDxWOUexjjVgyA = Boolean.valueOf(z);
        }
        return f5870s3fjYDxWOUexjjVgyA.booleanValue();
    }
}
