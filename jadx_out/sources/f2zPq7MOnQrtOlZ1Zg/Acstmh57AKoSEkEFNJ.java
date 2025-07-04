package f2zPq7MOnQrtOlZ1Zg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class Acstmh57AKoSEkEFNJ {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final int f5795lEeR5KfoEr4xU5yHH7 = 12451000;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final AtomicBoolean f5796s3fjYDxWOUexjjVgyA = new AtomicBoolean();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final AtomicBoolean f5794HJFh0TGMpafqLE9haL = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int HJFh0TGMpafqLE9haL(android.content.Context r10, int r11) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2zPq7MOnQrtOlZ1Zg.Acstmh57AKoSEkEFNJ.HJFh0TGMpafqLE9haL(android.content.Context, int):int");
    }

    public static boolean KYHag8HRDlnO3X9zmZ(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    public static boolean TCyPEKSzIyweCN5yp1(Context context, String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        if (fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !husNiw3snxdgZPAGJm(context);
    }

    public static boolean husNiw3snxdgZPAGJm(Context context) {
        if (!fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    public static String lEeR5KfoEr4xU5yHH7(int i) {
        return lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(i);
    }

    public static Resources s3fjYDxWOUexjjVgyA(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean zZKhbgvUfsK4AEX3r0(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return TCyPEKSzIyweCN5yp1(context, "com.google.android.gms");
        }
        return false;
    }
}
