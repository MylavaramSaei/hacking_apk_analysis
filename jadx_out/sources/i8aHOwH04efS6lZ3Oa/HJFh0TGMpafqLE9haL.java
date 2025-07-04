package i8aHOwH04efS6lZ3Oa;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public class HJFh0TGMpafqLE9haL {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f6042lEeR5KfoEr4xU5yHH7;

    public HJFh0TGMpafqLE9haL(Context context) {
        this.f6042lEeR5KfoEr4xU5yHH7 = context;
    }

    public CharSequence HJFh0TGMpafqLE9haL(String str) {
        Context context = this.f6042lEeR5KfoEr4xU5yHH7;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public int lEeR5KfoEr4xU5yHH7(String str, String str2) {
        return this.f6042lEeR5KfoEr4xU5yHH7.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo s3fjYDxWOUexjjVgyA(String str, int i) {
        return this.f6042lEeR5KfoEr4xU5yHH7.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo zZKhbgvUfsK4AEX3r0(String str, int i) {
        return this.f6042lEeR5KfoEr4xU5yHH7.getPackageManager().getPackageInfo(str, i);
    }
}
