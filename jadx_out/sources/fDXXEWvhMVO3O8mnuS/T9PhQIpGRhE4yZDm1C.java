package fDXXEWvhMVO3O8mnuS;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class T9PhQIpGRhE4yZDm1C {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public static Boolean f5872Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final Method f5873HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public static final Method f5874IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static final Method f5875KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public static final Method f5876TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final Method f5877husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final int f5878lEeR5KfoEr4xU5yHH7 = Process.myUid();

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public static final Method f5879pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final Method f5880s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final Method f5881zZKhbgvUfsK4AEX3r0;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f5880s3fjYDxWOUexjjVgyA = method;
        if (pbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL()) {
            try {
                method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused2) {
            }
        } else {
            method2 = null;
        }
        f5873HJFh0TGMpafqLE9haL = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f5881zZKhbgvUfsK4AEX3r0 = method3;
        try {
            method4 = WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
            method4 = null;
        }
        f5877husNiw3snxdgZPAGJm = method4;
        if (pbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL()) {
            try {
                method5 = WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused5) {
            }
        } else {
            method5 = null;
        }
        f5875KYHag8HRDlnO3X9zmZ = method5;
        if (pbVGzGjWvY2LDXC8vo.IPyIQcaNa8aB7drBED()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            }
        } else {
            method6 = null;
        }
        f5876TCyPEKSzIyweCN5yp1 = method6;
        if (pbVGzGjWvY2LDXC8vo.IPyIQcaNa8aB7drBED()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            }
        } else {
            method7 = null;
        }
        f5874IPyIQcaNa8aB7drBED = method7;
        if (pbVGzGjWvY2LDXC8vo.IPyIQcaNa8aB7drBED()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
            }
        } else {
            method8 = null;
        }
        f5879pbVGzGjWvY2LDXC8vo = method8;
        f5872Acstmh57AKoSEkEFNJ = null;
    }

    public static synchronized boolean HJFh0TGMpafqLE9haL(Context context) {
        Boolean bool = f5872Acstmh57AKoSEkEFNJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z = LIMtzhnLwQyigzK0KO.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        f5872Acstmh57AKoSEkEFNJ = Boolean.valueOf(z);
        return z;
    }

    public static void lEeR5KfoEr4xU5yHH7(WorkSource workSource, int i, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f5873HJFh0TGMpafqLE9haL;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        Method method2 = f5880s3fjYDxWOUexjjVgyA;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    public static WorkSource s3fjYDxWOUexjjVgyA(Context context, String str) {
        String str2;
        ApplicationInfo applicationInfoS3fjYDxWOUexjjVgyA;
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            applicationInfoS3fjYDxWOUexjjVgyA = i8aHOwH04efS6lZ3Oa.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(context).s3fjYDxWOUexjjVgyA(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "Could not find package: ";
        }
        if (applicationInfoS3fjYDxWOUexjjVgyA == null) {
            str2 = "Could not get applicationInfo from package: ";
            Log.e("WorkSourceUtil", str2.concat(str));
            return null;
        }
        int i = applicationInfoS3fjYDxWOUexjjVgyA.uid;
        WorkSource workSource = new WorkSource();
        lEeR5KfoEr4xU5yHH7(workSource, i, str);
        return workSource;
    }
}
