package SF66oTSCsXABfwyWiU;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public class cT5Hs3CQpLK8NvlZAw {

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static cT5Hs3CQpLK8NvlZAw f1447husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public String f1449lEeR5KfoEr4xU5yHH7 = null;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public Boolean f1450s3fjYDxWOUexjjVgyA = null;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public Boolean f1448HJFh0TGMpafqLE9haL = null;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final Queue f1451zZKhbgvUfsK4AEX3r0 = new ArrayDeque();

    public static synchronized cT5Hs3CQpLK8NvlZAw s3fjYDxWOUexjjVgyA() {
        try {
            if (f1447husNiw3snxdgZPAGJm == null) {
                f1447husNiw3snxdgZPAGJm = new cT5Hs3CQpLK8NvlZAw();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1447husNiw3snxdgZPAGJm;
    }

    public Intent HJFh0TGMpafqLE9haL() {
        return (Intent) this.f1451zZKhbgvUfsK4AEX3r0.poll();
    }

    public final synchronized String KYHag8HRDlnO3X9zmZ(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2;
        try {
            String str3 = this.f1449lEeR5KfoEr4xU5yHH7;
            if (str3 != null) {
                return str3;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        str2 = context.getPackageName() + serviceInfo.name;
                    } else {
                        str2 = serviceInfo.name;
                    }
                    this.f1449lEeR5KfoEr4xU5yHH7 = str2;
                    return this.f1449lEeR5KfoEr4xU5yHH7;
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                return null;
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public int TCyPEKSzIyweCN5yp1(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f1451zZKhbgvUfsK4AEX3r0.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return lEeR5KfoEr4xU5yHH7(context, intent2);
    }

    public boolean husNiw3snxdgZPAGJm(Context context) {
        if (this.f1450s3fjYDxWOUexjjVgyA == null) {
            this.f1450s3fjYDxWOUexjjVgyA = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f1450s3fjYDxWOUexjjVgyA.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f1450s3fjYDxWOUexjjVgyA.booleanValue();
    }

    public final int lEeR5KfoEr4xU5yHH7(Context context, Intent intent) {
        ComponentName componentNameStartService;
        String strKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(context, intent);
        if (strKYHag8HRDlnO3X9zmZ != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + strKYHag8HRDlnO3X9zmZ);
            }
            intent.setClassName(context.getPackageName(), strKYHag8HRDlnO3X9zmZ);
        }
        try {
            if (husNiw3snxdgZPAGJm(context)) {
                componentNameStartService = Pum9NZyDBKoCnecvlx.IPyIQcaNa8aB7drBED(context, intent);
            } else {
                componentNameStartService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
            return 402;
        } catch (SecurityException e2) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
            return 401;
        }
    }

    public boolean zZKhbgvUfsK4AEX3r0(Context context) {
        if (this.f1448HJFh0TGMpafqLE9haL == null) {
            this.f1448HJFh0TGMpafqLE9haL = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f1450s3fjYDxWOUexjjVgyA.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f1448HJFh0TGMpafqLE9haL.booleanValue();
    }
}
