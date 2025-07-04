package SF66oTSCsXABfwyWiU;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class CSih7GetOUab1dYQjM {

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final Pattern f1370zZKhbgvUfsK4AEX3r0 = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final String f1371HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final String f1372lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final String f1373s3fjYDxWOUexjjVgyA;

    public CSih7GetOUab1dYQjM(String str, String str2) {
        this.f1372lEeR5KfoEr4xU5yHH7 = zZKhbgvUfsK4AEX3r0(str2, str);
        this.f1373s3fjYDxWOUexjjVgyA = str;
        this.f1371HJFh0TGMpafqLE9haL = str + "!" + str2;
    }

    public static CSih7GetOUab1dYQjM KYHag8HRDlnO3X9zmZ(String str) {
        return new CSih7GetOUab1dYQjM("S", str);
    }

    public static CSih7GetOUab1dYQjM lEeR5KfoEr4xU5yHH7(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new CSih7GetOUab1dYQjM(strArrSplit[0], strArrSplit[1]);
    }

    public static String zZKhbgvUfsK4AEX3r0(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f1370zZKhbgvUfsK4AEX3r0.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public String HJFh0TGMpafqLE9haL() {
        return this.f1372lEeR5KfoEr4xU5yHH7;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CSih7GetOUab1dYQjM)) {
            return false;
        }
        CSih7GetOUab1dYQjM cSih7GetOUab1dYQjM = (CSih7GetOUab1dYQjM) obj;
        return this.f1372lEeR5KfoEr4xU5yHH7.equals(cSih7GetOUab1dYQjM.f1372lEeR5KfoEr4xU5yHH7) && this.f1373s3fjYDxWOUexjjVgyA.equals(cSih7GetOUab1dYQjM.f1373s3fjYDxWOUexjjVgyA);
    }

    public int hashCode() {
        return HR5vAalpgOKVm2T0Gq.T9PhQIpGRhE4yZDm1C.s3fjYDxWOUexjjVgyA(this.f1373s3fjYDxWOUexjjVgyA, this.f1372lEeR5KfoEr4xU5yHH7);
    }

    public String husNiw3snxdgZPAGJm() {
        return this.f1371HJFh0TGMpafqLE9haL;
    }

    public String s3fjYDxWOUexjjVgyA() {
        return this.f1373s3fjYDxWOUexjjVgyA;
    }
}
