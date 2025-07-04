package Tu4WCh2gEwj8E4oHbP;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class A49QRPHynYLCBN0SqP {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static boolean f1635lEeR5KfoEr4xU5yHH7 = true;

    public static void HJFh0TGMpafqLE9haL(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            s3fjYDxWOUexjjVgyA(viewGroup, z);
        }
    }

    public static xHA29AmDt6y96AnB3t lEeR5KfoEr4xU5yHH7(ViewGroup viewGroup) {
        return new G7AC3DWIx9i9fdanjk(viewGroup);
    }

    public static void s3fjYDxWOUexjjVgyA(ViewGroup viewGroup, boolean z) {
        if (f1635lEeR5KfoEr4xU5yHH7) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f1635lEeR5KfoEr4xU5yHH7 = false;
            }
        }
    }
}
