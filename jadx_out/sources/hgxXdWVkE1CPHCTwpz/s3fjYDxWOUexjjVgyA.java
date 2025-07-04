package hgxXdWVkE1CPHCTwpz;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA {
    public static int HJFh0TGMpafqLE9haL(Context context, int i, int i2) {
        TypedValue typedValueLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(context, i);
        return (typedValueLEeR5KfoEr4xU5yHH7 == null || typedValueLEeR5KfoEr4xU5yHH7.type != 16) ? i2 : typedValueLEeR5KfoEr4xU5yHH7.data;
    }

    public static TypedValue KYHag8HRDlnO3X9zmZ(View view, int i) {
        return husNiw3snxdgZPAGJm(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static TypedValue husNiw3snxdgZPAGJm(Context context, int i, String str) {
        TypedValue typedValueLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(context, i);
        if (typedValueLEeR5KfoEr4xU5yHH7 != null) {
            return typedValueLEeR5KfoEr4xU5yHH7;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static TypedValue lEeR5KfoEr4xU5yHH7(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean s3fjYDxWOUexjjVgyA(Context context, int i, boolean z) {
        TypedValue typedValueLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(context, i);
        return (typedValueLEeR5KfoEr4xU5yHH7 == null || typedValueLEeR5KfoEr4xU5yHH7.type != 18) ? z : typedValueLEeR5KfoEr4xU5yHH7.data != 0;
    }

    public static int zZKhbgvUfsK4AEX3r0(Context context, int i, String str) {
        return husNiw3snxdgZPAGJm(context, i, str).data;
    }
}
