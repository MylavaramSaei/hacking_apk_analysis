package Tu4WCh2gEwj8E4oHbP;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class PPkm9uUfOJHHYveeLT {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static Field f1684lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static boolean f1685s3fjYDxWOUexjjVgyA;

    public abstract void HJFh0TGMpafqLE9haL(View view);

    public abstract void IPyIQcaNa8aB7drBED(View view, Matrix matrix);

    public void KYHag8HRDlnO3X9zmZ(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f1685s3fjYDxWOUexjjVgyA) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f1684lEeR5KfoEr4xU5yHH7 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f1685s3fjYDxWOUexjjVgyA = true;
        }
        Field field = f1684lEeR5KfoEr4xU5yHH7;
        if (field != null) {
            try {
                f1684lEeR5KfoEr4xU5yHH7.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void TCyPEKSzIyweCN5yp1(View view, Matrix matrix);

    public abstract void husNiw3snxdgZPAGJm(View view, float f);

    public abstract void lEeR5KfoEr4xU5yHH7(View view);

    public abstract float s3fjYDxWOUexjjVgyA(View view);

    public abstract void zZKhbgvUfsK4AEX3r0(View view, int i, int i2, int i3, int i4);
}
