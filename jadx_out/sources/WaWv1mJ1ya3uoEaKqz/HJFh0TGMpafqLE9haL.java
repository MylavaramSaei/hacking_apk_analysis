package WaWv1mJ1ya3uoEaKqz;

import W3RZ2dTDKrKpS5Mxdk.udcVtCzLTM1Loe9KrX;
import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL {
    public static int HJFh0TGMpafqLE9haL(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(context, R.attr.statusBarColor, -16777216);
    }

    public static void KYHag8HRDlnO3X9zmZ(Window window, boolean z) {
        udcVtCzLTM1Loe9KrX.lEeR5KfoEr4xU5yHH7(window, window.getDecorView()).s3fjYDxWOUexjjVgyA(z);
    }

    public static void husNiw3snxdgZPAGJm(Window window, boolean z) {
        udcVtCzLTM1Loe9KrX.lEeR5KfoEr4xU5yHH7(window, window.getDecorView()).lEeR5KfoEr4xU5yHH7(z);
    }

    public static void lEeR5KfoEr4xU5yHH7(Window window, boolean z, Integer num, Integer num2) {
        boolean z2 = num == null || num.intValue() == 0;
        boolean z3 = num2 == null || num2.intValue() == 0;
        if (z2 || z3) {
            int iS3fjYDxWOUexjjVgyA = cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(window.getContext(), R.attr.colorBackground, -16777216);
            if (z2) {
                num = Integer.valueOf(iS3fjYDxWOUexjjVgyA);
            }
            if (z3) {
                num2 = Integer.valueOf(iS3fjYDxWOUexjjVgyA);
            }
        }
        udcVtCzLTM1Loe9KrX.s3fjYDxWOUexjjVgyA(window, !z);
        int iHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(window.getContext(), z);
        int iS3fjYDxWOUexjjVgyA2 = s3fjYDxWOUexjjVgyA(window.getContext(), z);
        window.setStatusBarColor(iHJFh0TGMpafqLE9haL);
        window.setNavigationBarColor(iS3fjYDxWOUexjjVgyA2);
        KYHag8HRDlnO3X9zmZ(window, zZKhbgvUfsK4AEX3r0(iHJFh0TGMpafqLE9haL, cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(num.intValue())));
        husNiw3snxdgZPAGJm(window, zZKhbgvUfsK4AEX3r0(iS3fjYDxWOUexjjVgyA2, cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(num2.intValue())));
    }

    public static int s3fjYDxWOUexjjVgyA(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(context, R.attr.navigationBarColor, -16777216);
    }

    public static boolean zZKhbgvUfsK4AEX3r0(int i, boolean z) {
        return cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(i) || (i == 0 && z);
    }
}
