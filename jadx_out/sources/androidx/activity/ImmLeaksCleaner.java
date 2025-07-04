package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.KYHag8HRDlnO3X9zmZ;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.pbVGzGjWvY2LDXC8vo {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static Field f2534HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static Field f2535husNiw3snxdgZPAGJm;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static int f2536s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static Field f2537zZKhbgvUfsK4AEX3r0;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public Activity f2538lEeR5KfoEr4xU5yHH7;

    public static void IPyIQcaNa8aB7drBED() throws NoSuchFieldException, SecurityException {
        try {
            f2536s3fjYDxWOUexjjVgyA = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f2537zZKhbgvUfsK4AEX3r0 = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f2535husNiw3snxdgZPAGJm = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f2534HJFh0TGMpafqLE9haL = declaredField3;
            declaredField3.setAccessible(true);
            f2536s3fjYDxWOUexjjVgyA = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.pbVGzGjWvY2LDXC8vo
    public void zZKhbgvUfsK4AEX3r0(androidx.lifecycle.Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (leer5kfoer4xu5yhh7 != KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_DESTROY) {
            return;
        }
        if (f2536s3fjYDxWOUexjjVgyA == 0) {
            IPyIQcaNa8aB7drBED();
        }
        if (f2536s3fjYDxWOUexjjVgyA == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f2538lEeR5KfoEr4xU5yHH7.getSystemService("input_method");
            try {
                Object obj = f2534HJFh0TGMpafqLE9haL.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            try {
                                View view = (View) f2537zZKhbgvUfsK4AEX3r0.get(inputMethodManager);
                                if (view == null) {
                                    return;
                                }
                                if (view.isAttachedToWindow()) {
                                    return;
                                }
                                try {
                                    f2535husNiw3snxdgZPAGJm.set(inputMethodManager, null);
                                    inputMethodManager.isActive();
                                } catch (IllegalAccessException unused) {
                                }
                            } catch (ClassCastException unused2) {
                            }
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
