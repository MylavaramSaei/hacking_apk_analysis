package W3RZ2dTDKrKpS5Mxdk;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class zcy2NNbtVXgoGQbfuq {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static Method f1968lEeR5KfoEr4xU5yHH7;

    public static class HJFh0TGMpafqLE9haL {
        public static int lEeR5KfoEr4xU5yHH7(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
        }

        public static int s3fjYDxWOUexjjVgyA(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 {
        public static float lEeR5KfoEr4xU5yHH7(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        public static float s3fjYDxWOUexjjVgyA(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public static int lEeR5KfoEr4xU5yHH7(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        public static boolean s3fjYDxWOUexjjVgyA(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f1968lEeR5KfoEr4xU5yHH7 = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    public static float Acstmh57AKoSEkEFNJ(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(viewConfiguration) : s3fjYDxWOUexjjVgyA(viewConfiguration, context);
    }

    public static int HJFh0TGMpafqLE9haL(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    public static int IPyIQcaNa8aB7drBED(Context context, final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(viewConfiguration, i, i2, i3);
        }
        if (!Z9WdNiOsPR0y54zHW4(i, i2, i3)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int iZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return lEeR5KfoEr4xU5yHH7(resources, iZZKhbgvUfsK4AEX3r0, new tXWeW0sqVddf7ZBflq.IPyIQcaNa8aB7drBED() { // from class: W3RZ2dTDKrKpS5Mxdk.XdzLv4NdAtTYoEzVzB
            @Override // tXWeW0sqVddf7ZBflq.IPyIQcaNa8aB7drBED
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    public static float KYHag8HRDlnO3X9zmZ(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(viewConfiguration) : s3fjYDxWOUexjjVgyA(viewConfiguration, context);
    }

    public static int TCyPEKSzIyweCN5yp1(ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static boolean Z9WdNiOsPR0y54zHW4(int i, int i2, int i3) {
        InputDevice device = InputDevice.getDevice(i);
        return (device == null || device.getMotionRange(i2, i3) == null) ? false : true;
    }

    public static boolean e54J8UWNHWALQNixXM(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(viewConfiguration);
        }
        Resources resources = context.getResources();
        int iHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return iHJFh0TGMpafqLE9haL != 0 && resources.getBoolean(iHJFh0TGMpafqLE9haL);
    }

    public static int husNiw3snxdgZPAGJm(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return HJFh0TGMpafqLE9haL(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static int lEeR5KfoEr4xU5yHH7(Resources resources, int i, tXWeW0sqVddf7ZBflq.IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED, int i2) {
        int dimensionPixelSize;
        return i != -1 ? (i == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i)) < 0) ? i2 : dimensionPixelSize : ((Integer) iPyIQcaNa8aB7drBED.get()).intValue();
    }

    public static int pbVGzGjWvY2LDXC8vo(Context context, final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(viewConfiguration, i, i2, i3);
        }
        if (!Z9WdNiOsPR0y54zHW4(i, i2, i3)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int iHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return lEeR5KfoEr4xU5yHH7(resources, iHusNiw3snxdgZPAGJm, new tXWeW0sqVddf7ZBflq.IPyIQcaNa8aB7drBED() { // from class: W3RZ2dTDKrKpS5Mxdk.LU0fFDMACqnfIfA1AZ
            @Override // tXWeW0sqVddf7ZBflq.IPyIQcaNa8aB7drBED
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    public static float s3fjYDxWOUexjjVgyA(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f1968lEeR5KfoEr4xU5yHH7) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    public static int zZKhbgvUfsK4AEX3r0(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return HJFh0TGMpafqLE9haL(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }
}
