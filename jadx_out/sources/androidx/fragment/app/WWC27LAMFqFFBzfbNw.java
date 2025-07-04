package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class WWC27LAMFqFFBzfbNw {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final ao3wqKm5CXFuvC0q47 f3557lEeR5KfoEr4xU5yHH7 = new THTDvPxsHqMeGb512f();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final ao3wqKm5CXFuvC0q47 f3558s3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA();

    public static void HJFh0TGMpafqLE9haL(Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72) {
        for (int size = leer5kfoer4xu5yhh7.size() - 1; size >= 0; size--) {
            if (!leer5kfoer4xu5yhh72.containsKey((String) leer5kfoer4xu5yhh7.T9PhQIpGRhE4yZDm1C(size))) {
                leer5kfoer4xu5yhh7.Z9WdNiOsPR0y54zHW4(size);
            }
        }
    }

    public static void lEeR5KfoEr4xU5yHH7(Fragment fragment, Fragment fragment2, boolean z, Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, boolean z2) {
        if (z) {
            fragment2.sTkWmhpZ5b1ArQIw4K();
        } else {
            fragment.sTkWmhpZ5b1ArQIw4K();
        }
    }

    public static ao3wqKm5CXFuvC0q47 s3fjYDxWOUexjjVgyA() {
        try {
            return (ao3wqKm5CXFuvC0q47) Tu4WCh2gEwj8E4oHbP.husNiw3snxdgZPAGJm.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void zZKhbgvUfsK4AEX3r0(ArrayList arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i);
        }
    }
}
