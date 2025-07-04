package W3RZ2dTDKrKpS5Mxdk;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public abstract class udcVtCzLTM1Loe9KrX {

    public static class lEeR5KfoEr4xU5yHH7 {
        public static void lEeR5KfoEr4xU5yHH7(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public static void lEeR5KfoEr4xU5yHH7(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    public static vlBaBOcZ1q1ndWVoXn lEeR5KfoEr4xU5yHH7(Window window, View view) {
        return new vlBaBOcZ1q1ndWVoXn(window, view);
    }

    public static void s3fjYDxWOUexjjVgyA(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(window, z);
        } else {
            lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(window, z);
        }
    }
}
