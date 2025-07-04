package D3qEI0j1Bvj6FYKAih;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import tGGjvtdOhUewv2twsg.HJFh0TGMpafqLE9haL;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final HJFh0TGMpafqLE9haL f80HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f81lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final SharedPreferences f82s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public boolean f83zZKhbgvUfsK4AEX3r0;

    public lEeR5KfoEr4xU5yHH7(Context context, String str, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        Context contextLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(context);
        this.f81lEeR5KfoEr4xU5yHH7 = contextLEeR5KfoEr4xU5yHH7;
        this.f82s3fjYDxWOUexjjVgyA = contextLEeR5KfoEr4xU5yHH7.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f80HJFh0TGMpafqLE9haL = hJFh0TGMpafqLE9haL;
        this.f83zZKhbgvUfsK4AEX3r0 = HJFh0TGMpafqLE9haL();
    }

    public static Context lEeR5KfoEr4xU5yHH7(Context context) {
        return LIMtzhnLwQyigzK0KO.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(context);
    }

    public final boolean HJFh0TGMpafqLE9haL() {
        return this.f82s3fjYDxWOUexjjVgyA.contains("firebase_data_collection_default_enabled") ? this.f82s3fjYDxWOUexjjVgyA.getBoolean("firebase_data_collection_default_enabled", true) : zZKhbgvUfsK4AEX3r0();
    }

    public synchronized boolean s3fjYDxWOUexjjVgyA() {
        return this.f83zZKhbgvUfsK4AEX3r0;
    }

    public final boolean zZKhbgvUfsK4AEX3r0() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f81lEeR5KfoEr4xU5yHH7.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f81lEeR5KfoEr4xU5yHH7.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
