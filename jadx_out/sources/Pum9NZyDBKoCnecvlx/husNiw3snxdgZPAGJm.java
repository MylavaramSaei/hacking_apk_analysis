package Pum9NZyDBKoCnecvlx;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Locale;
import jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public final class husNiw3snxdgZPAGJm {

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public static final lEeR5KfoEr4xU5yHH7 f1324IPyIQcaNa8aB7drBED = new lEeR5KfoEr4xU5yHH7(null);

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public String f1325HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public String f1326KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public String f1327TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public String f1328husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public boolean f1329lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public String f1330s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public String f1331zZKhbgvUfsK4AEX3r0;

    public static final class lEeR5KfoEr4xU5yHH7 {
        public lEeR5KfoEr4xU5yHH7() {
        }

        public final husNiw3snxdgZPAGJm lEeR5KfoEr4xU5yHH7(Context context) throws PackageManager.NameNotFoundException {
            pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(context, "context");
            boolean z = (context.getApplicationInfo().flags & 2) != 0;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String str = packageInfo.versionName;
            String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
            String str2 = Build.MODEL;
            String str3 = Build.VERSION.RELEASE;
            String str4 = str3 == null ? "" : str3;
            String language = Locale.getDefault().getLanguage();
            pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(language, "getLanguage(...)");
            String str5 = str == null ? "" : str;
            pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(str2);
            return new husNiw3snxdgZPAGJm(z, "Android", str4, language, str5, strValueOf, str2);
        }

        public /* synthetic */ lEeR5KfoEr4xU5yHH7(jpEZy3U5wFkT2e9PKQ.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            this();
        }
    }

    public husNiw3snxdgZPAGJm(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str, "osName");
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str2, "osVersion");
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str3, "locale");
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str4, "appVersion");
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str5, "appBuildNumber");
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str6, "deviceModel");
        this.f1329lEeR5KfoEr4xU5yHH7 = z;
        this.f1330s3fjYDxWOUexjjVgyA = str;
        this.f1325HJFh0TGMpafqLE9haL = str2;
        this.f1331zZKhbgvUfsK4AEX3r0 = str3;
        this.f1328husNiw3snxdgZPAGJm = str4;
        this.f1326KYHag8HRDlnO3X9zmZ = str5;
        this.f1327TCyPEKSzIyweCN5yp1 = str6;
    }

    public final String HJFh0TGMpafqLE9haL() {
        return this.f1327TCyPEKSzIyweCN5yp1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof husNiw3snxdgZPAGJm)) {
            return false;
        }
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) obj;
        return this.f1329lEeR5KfoEr4xU5yHH7 == husniw3snxdgzpagjm.f1329lEeR5KfoEr4xU5yHH7 && pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(this.f1330s3fjYDxWOUexjjVgyA, husniw3snxdgzpagjm.f1330s3fjYDxWOUexjjVgyA) && pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(this.f1325HJFh0TGMpafqLE9haL, husniw3snxdgzpagjm.f1325HJFh0TGMpafqLE9haL) && pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(this.f1331zZKhbgvUfsK4AEX3r0, husniw3snxdgzpagjm.f1331zZKhbgvUfsK4AEX3r0) && pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(this.f1328husNiw3snxdgZPAGJm, husniw3snxdgzpagjm.f1328husNiw3snxdgZPAGJm) && pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(this.f1326KYHag8HRDlnO3X9zmZ, husniw3snxdgzpagjm.f1326KYHag8HRDlnO3X9zmZ) && pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(this.f1327TCyPEKSzIyweCN5yp1, husniw3snxdgzpagjm.f1327TCyPEKSzIyweCN5yp1);
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.f1329lEeR5KfoEr4xU5yHH7) * 31) + this.f1330s3fjYDxWOUexjjVgyA.hashCode()) * 31) + this.f1325HJFh0TGMpafqLE9haL.hashCode()) * 31) + this.f1331zZKhbgvUfsK4AEX3r0.hashCode()) * 31) + this.f1328husNiw3snxdgZPAGJm.hashCode()) * 31) + this.f1326KYHag8HRDlnO3X9zmZ.hashCode()) * 31) + this.f1327TCyPEKSzIyweCN5yp1.hashCode();
    }

    public final boolean husNiw3snxdgZPAGJm() {
        return this.f1329lEeR5KfoEr4xU5yHH7;
    }

    public final String lEeR5KfoEr4xU5yHH7() {
        return this.f1326KYHag8HRDlnO3X9zmZ;
    }

    public final String s3fjYDxWOUexjjVgyA() {
        return this.f1328husNiw3snxdgZPAGJm;
    }

    public String toString() {
        return "EnvironmentInfo(isDebug=" + this.f1329lEeR5KfoEr4xU5yHH7 + ", osName=" + this.f1330s3fjYDxWOUexjjVgyA + ", osVersion=" + this.f1325HJFh0TGMpafqLE9haL + ", locale=" + this.f1331zZKhbgvUfsK4AEX3r0 + ", appVersion=" + this.f1328husNiw3snxdgZPAGJm + ", appBuildNumber=" + this.f1326KYHag8HRDlnO3X9zmZ + ", deviceModel=" + this.f1327TCyPEKSzIyweCN5yp1 + ")";
    }

    public final String zZKhbgvUfsK4AEX3r0() {
        return this.f1331zZKhbgvUfsK4AEX3r0;
    }
}
