package f2zPq7MOnQrtOlZ1Zg;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class IPyIQcaNa8aB7drBED {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final int f5801lEeR5KfoEr4xU5yHH7 = Acstmh57AKoSEkEFNJ.f5795lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final IPyIQcaNa8aB7drBED f5802s3fjYDxWOUexjjVgyA = new IPyIQcaNa8aB7drBED();

    public static IPyIQcaNa8aB7drBED husNiw3snxdgZPAGJm() {
        return f5802s3fjYDxWOUexjjVgyA;
    }

    public PendingIntent HJFh0TGMpafqLE9haL(Context context, int i, int i2, String str) {
        Intent intentLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(context, i, str);
        if (intentLEeR5KfoEr4xU5yHH7 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, intentLEeR5KfoEr4xU5yHH7, yXUWiIShOcfJRNCmU8.zZKhbgvUfsK4AEX3r0.f7335lEeR5KfoEr4xU5yHH7 | 134217728);
    }

    public boolean IPyIQcaNa8aB7drBED(Context context, String str) {
        return Acstmh57AKoSEkEFNJ.TCyPEKSzIyweCN5yp1(context, str);
    }

    public int KYHag8HRDlnO3X9zmZ(Context context) {
        return TCyPEKSzIyweCN5yp1(context, f5801lEeR5KfoEr4xU5yHH7);
    }

    public int TCyPEKSzIyweCN5yp1(Context context, int i) throws PackageManager.NameNotFoundException {
        int iHJFh0TGMpafqLE9haL = Acstmh57AKoSEkEFNJ.HJFh0TGMpafqLE9haL(context, i);
        if (Acstmh57AKoSEkEFNJ.zZKhbgvUfsK4AEX3r0(context, iHJFh0TGMpafqLE9haL)) {
            return 18;
        }
        return iHJFh0TGMpafqLE9haL;
    }

    public Intent lEeR5KfoEr4xU5yHH7(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && fDXXEWvhMVO3O8mnuS.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f5801lEeR5KfoEr4xU5yHH7);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(i8aHOwH04efS6lZ3Oa.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(context).zZKhbgvUfsK4AEX3r0(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public boolean pbVGzGjWvY2LDXC8vo(int i) {
        return Acstmh57AKoSEkEFNJ.KYHag8HRDlnO3X9zmZ(i);
    }

    public PendingIntent s3fjYDxWOUexjjVgyA(Context context, int i, int i2) {
        return HJFh0TGMpafqLE9haL(context, i, i2, null);
    }

    public String zZKhbgvUfsK4AEX3r0(int i) {
        return Acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7(i);
    }
}
