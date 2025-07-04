package Tu4WCh2gEwj8E4oHbP;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class e2F9F6h8YJxTHwLCa0 extends GyWRxpdt1T8mEJXPoD {

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public static boolean f1717TCyPEKSzIyweCN5yp1 = true;

    @Override // Tu4WCh2gEwj8E4oHbP.PPkm9uUfOJHHYveeLT
    public void KYHag8HRDlnO3X9zmZ(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.KYHag8HRDlnO3X9zmZ(view, i);
        } else if (f1717TCyPEKSzIyweCN5yp1) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f1717TCyPEKSzIyweCN5yp1 = false;
            }
        }
    }
}
