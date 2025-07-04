package Ywqw2A0s86HeuFkDt0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes.dex */
public final class XzJ1BS7H9Ilbkv4eVM {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f2220HJFh0TGMpafqLE9haL = 0;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f2221lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f2222s3fjYDxWOUexjjVgyA;

    public XzJ1BS7H9Ilbkv4eVM(Context context) {
        this.f2221lEeR5KfoEr4xU5yHH7 = context;
    }

    public final synchronized int lEeR5KfoEr4xU5yHH7() {
        PackageInfo packageInfoZZKhbgvUfsK4AEX3r0;
        if (this.f2222s3fjYDxWOUexjjVgyA == 0) {
            try {
                packageInfoZZKhbgvUfsK4AEX3r0 = i8aHOwH04efS6lZ3Oa.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(this.f2221lEeR5KfoEr4xU5yHH7).zZKhbgvUfsK4AEX3r0("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfoZZKhbgvUfsK4AEX3r0 = null;
            }
            if (packageInfoZZKhbgvUfsK4AEX3r0 != null) {
                this.f2222s3fjYDxWOUexjjVgyA = packageInfoZZKhbgvUfsK4AEX3r0.versionCode;
            }
        }
        return this.f2222s3fjYDxWOUexjjVgyA;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[Catch: all -> 0x0026, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x001d, B:14:0x0028, B:16:0x002f, B:18:0x0041, B:26:0x0062, B:21:0x0048, B:23:0x005b, B:29:0x0066, B:33:0x0075), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized int s3fjYDxWOUexjjVgyA() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f2220HJFh0TGMpafqLE9haL     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return r0
        L7:
            android.content.Context r0 = r5.f2221lEeR5KfoEr4xU5yHH7     // Catch: java.lang.Throwable -> L26
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L26
            i8aHOwH04efS6lZ3Oa.HJFh0TGMpafqLE9haL r0 = i8aHOwH04efS6lZ3Oa.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r3 = "com.google.android.gms"
            int r0 = r0.lEeR5KfoEr4xU5yHH7(r2, r3)     // Catch: java.lang.Throwable -> L26
            r2 = -1
            r3 = 0
            if (r0 != r2) goto L28
            java.lang.String r0 = "Metadata"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r3
        L26:
            r0 = move-exception
            goto L79
        L28:
            boolean r0 = fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo.TCyPEKSzIyweCN5yp1()     // Catch: java.lang.Throwable -> L26
            r2 = 1
            if (r0 != 0) goto L48
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L26
            java.util.List r0 = r1.queryIntentServices(r0, r3)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L48
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L48
            goto L62
        L48:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L26
            java.util.List r0 = r1.queryBroadcastReceivers(r0, r3)     // Catch: java.lang.Throwable -> L26
            r1 = 2
            if (r0 == 0) goto L66
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L66
            r2 = r1
        L62:
            r5.f2220HJFh0TGMpafqLE9haL = r2     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r2
        L66:
            java.lang.String r0 = "Metadata"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r3)     // Catch: java.lang.Throwable -> L26
            boolean r0 = fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo.TCyPEKSzIyweCN5yp1()     // Catch: java.lang.Throwable -> L26
            if (r2 == r0) goto L74
            goto L75
        L74:
            r2 = r1
        L75:
            r5.f2220HJFh0TGMpafqLE9haL = r2     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r2
        L79:
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ywqw2A0s86HeuFkDt0.XzJ1BS7H9Ilbkv4eVM.s3fjYDxWOUexjjVgyA():int");
    }
}
