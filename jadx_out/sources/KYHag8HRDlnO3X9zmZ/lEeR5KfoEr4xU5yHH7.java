package KYHag8HRDlnO3X9zmZ;

import android.content.Context;
import android.content.res.Configuration;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public Context f879lEeR5KfoEr4xU5yHH7;

    public lEeR5KfoEr4xU5yHH7(Context context) {
        this.f879lEeR5KfoEr4xU5yHH7 = context;
    }

    public static lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH7(Context context) {
        return new lEeR5KfoEr4xU5yHH7(context);
    }

    public int HJFh0TGMpafqLE9haL() {
        Configuration configuration = this.f879lEeR5KfoEr4xU5yHH7.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int s3fjYDxWOUexjjVgyA() {
        return this.f879lEeR5KfoEr4xU5yHH7.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public boolean zZKhbgvUfsK4AEX3r0() {
        return true;
    }
}
