package SF66oTSCsXABfwyWiU;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public class DfpieXfdYs58yZAiXY {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public String f1374HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int f1375husNiw3snxdgZPAGJm = 0;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f1376lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public String f1377s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f1378zZKhbgvUfsK4AEX3r0;

    public DfpieXfdYs58yZAiXY(Context context) {
        this.f1376lEeR5KfoEr4xU5yHH7 = context;
    }

    public static String HJFh0TGMpafqLE9haL(sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        String strZZKhbgvUfsK4AEX3r0 = husniw3snxdgzpagjm.T9PhQIpGRhE4yZDm1C().zZKhbgvUfsK4AEX3r0();
        if (strZZKhbgvUfsK4AEX3r0 != null) {
            return strZZKhbgvUfsK4AEX3r0;
        }
        String strHJFh0TGMpafqLE9haL = husniw3snxdgzpagjm.T9PhQIpGRhE4yZDm1C().HJFh0TGMpafqLE9haL();
        if (!strHJFh0TGMpafqLE9haL.startsWith("1:")) {
            return strHJFh0TGMpafqLE9haL;
        }
        String[] strArrSplit = strHJFh0TGMpafqLE9haL.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public final synchronized void IPyIQcaNa8aB7drBED() {
        PackageInfo packageInfoKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(this.f1376lEeR5KfoEr4xU5yHH7.getPackageName());
        if (packageInfoKYHag8HRDlnO3X9zmZ != null) {
            this.f1377s3fjYDxWOUexjjVgyA = Integer.toString(packageInfoKYHag8HRDlnO3X9zmZ.versionCode);
            this.f1374HJFh0TGMpafqLE9haL = packageInfoKYHag8HRDlnO3X9zmZ.versionName;
        }
    }

    public final PackageInfo KYHag8HRDlnO3X9zmZ(String str) {
        try {
            return this.f1376lEeR5KfoEr4xU5yHH7.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    public boolean TCyPEKSzIyweCN5yp1() {
        return husNiw3snxdgZPAGJm() != 0;
    }

    public synchronized int husNiw3snxdgZPAGJm() {
        int i = this.f1375husNiw3snxdgZPAGJm;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f1376lEeR5KfoEr4xU5yHH7.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo.TCyPEKSzIyweCN5yp1()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f1375husNiw3snxdgZPAGJm = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f1375husNiw3snxdgZPAGJm = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo.TCyPEKSzIyweCN5yp1()) {
            this.f1375husNiw3snxdgZPAGJm = 2;
        } else {
            this.f1375husNiw3snxdgZPAGJm = 1;
        }
        return this.f1375husNiw3snxdgZPAGJm;
    }

    public synchronized String lEeR5KfoEr4xU5yHH7() {
        try {
            if (this.f1377s3fjYDxWOUexjjVgyA == null) {
                IPyIQcaNa8aB7drBED();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1377s3fjYDxWOUexjjVgyA;
    }

    public synchronized String s3fjYDxWOUexjjVgyA() {
        try {
            if (this.f1374HJFh0TGMpafqLE9haL == null) {
                IPyIQcaNa8aB7drBED();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1374HJFh0TGMpafqLE9haL;
    }

    public synchronized int zZKhbgvUfsK4AEX3r0() {
        PackageInfo packageInfoKYHag8HRDlnO3X9zmZ;
        try {
            if (this.f1378zZKhbgvUfsK4AEX3r0 == 0 && (packageInfoKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ("com.google.android.gms")) != null) {
                this.f1378zZKhbgvUfsK4AEX3r0 = packageInfoKYHag8HRDlnO3X9zmZ.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1378zZKhbgvUfsK4AEX3r0;
    }
}
