package Tu4WCh2gEwj8E4oHbP;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public abstract class W3RZ2dTDKrKpS5Mxdk extends jCtUeU2YI1poCxWcjm {

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static boolean f1694husNiw3snxdgZPAGJm = true;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static boolean f1695zZKhbgvUfsK4AEX3r0 = true;

    @Override // Tu4WCh2gEwj8E4oHbP.PPkm9uUfOJHHYveeLT
    public void IPyIQcaNa8aB7drBED(View view, Matrix matrix) {
        if (f1694husNiw3snxdgZPAGJm) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f1694husNiw3snxdgZPAGJm = false;
            }
        }
    }

    @Override // Tu4WCh2gEwj8E4oHbP.PPkm9uUfOJHHYveeLT
    public void TCyPEKSzIyweCN5yp1(View view, Matrix matrix) {
        if (f1695zZKhbgvUfsK4AEX3r0) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f1695zZKhbgvUfsK4AEX3r0 = false;
            }
        }
    }
}
