package LIMtzhnLwQyigzK0KO;

import A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import xHA29AmDt6y96AnB3t.TCyPEKSzIyweCN5yp1;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final Object f922lEeR5KfoEr4xU5yHH7 = new Object();

    public static class HJFh0TGMpafqLE9haL {
        public static boolean HJFh0TGMpafqLE9haL(Context context) {
            return context.isDeviceProtectedStorage();
        }

        public static Context lEeR5KfoEr4xU5yHH7(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File s3fjYDxWOUexjjVgyA(Context context) {
            return context.getDataDir();
        }
    }

    /* renamed from: LIMtzhnLwQyigzK0KO.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public static class C0013lEeR5KfoEr4xU5yHH7 {
        public static File HJFh0TGMpafqLE9haL(Context context) {
            return context.getNoBackupFilesDir();
        }

        public static File lEeR5KfoEr4xU5yHH7(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable s3fjYDxWOUexjjVgyA(Context context, int i) {
            return context.getDrawable(i);
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public static String HJFh0TGMpafqLE9haL(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }

        public static int lEeR5KfoEr4xU5yHH7(Context context, int i) {
            return context.getColor(i);
        }

        public static <T> T s3fjYDxWOUexjjVgyA(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }
    }

    public static int HJFh0TGMpafqLE9haL(Context context, int i) {
        return s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(context, i);
    }

    public static File KYHag8HRDlnO3X9zmZ(Context context) {
        return C0013lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(context);
    }

    public static Object TCyPEKSzIyweCN5yp1(Context context, Class cls) {
        return s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(context, cls);
    }

    public static Drawable husNiw3snxdgZPAGJm(Context context, int i) {
        return C0013lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(context, i);
    }

    public static int lEeR5KfoEr4xU5yHH7(Context context, String str) {
        tXWeW0sqVddf7ZBflq.HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA(context).lEeR5KfoEr4xU5yHH7() ? 0 : -1;
    }

    public static Context s3fjYDxWOUexjjVgyA(Context context) {
        return HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(context);
    }

    public static ColorStateList zZKhbgvUfsK4AEX3r0(Context context, int i) {
        return KYHag8HRDlnO3X9zmZ.zZKhbgvUfsK4AEX3r0(context.getResources(), i, context.getTheme());
    }
}
