package XdzLv4NdAtTYoEzVzB;

import android.text.Editable;
import androidx.emoji2.text.aPyGSIylzVNKPT1Bls;

/* loaded from: classes.dex */
public final class s3fjYDxWOUexjjVgyA extends Editable.Factory {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static Class f2112HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final Object f2113lEeR5KfoEr4xU5yHH7 = new Object();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static volatile Editable.Factory f2114s3fjYDxWOUexjjVgyA;

    public s3fjYDxWOUexjjVgyA() {
        try {
            f2112HJFh0TGMpafqLE9haL = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, s3fjYDxWOUexjjVgyA.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f2114s3fjYDxWOUexjjVgyA == null) {
            synchronized (f2113lEeR5KfoEr4xU5yHH7) {
                try {
                    if (f2114s3fjYDxWOUexjjVgyA == null) {
                        f2114s3fjYDxWOUexjjVgyA = new s3fjYDxWOUexjjVgyA();
                    }
                } finally {
                }
            }
        }
        return f2114s3fjYDxWOUexjjVgyA;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f2112HJFh0TGMpafqLE9haL;
        return cls != null ? aPyGSIylzVNKPT1Bls.HJFh0TGMpafqLE9haL(cls, charSequence) : super.newEditable(charSequence);
    }
}
