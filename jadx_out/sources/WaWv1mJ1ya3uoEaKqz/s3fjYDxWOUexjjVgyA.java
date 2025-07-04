package WaWv1mJ1ya3uoEaKqz;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final ThreadLocal f2076lEeR5KfoEr4xU5yHH7 = new ThreadLocal();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final ThreadLocal f2077s3fjYDxWOUexjjVgyA = new ThreadLocal();

    public static void HJFh0TGMpafqLE9haL(ViewGroup viewGroup, View view, Rect rect) {
        ThreadLocal threadLocal = f2076lEeR5KfoEr4xU5yHH7;
        Matrix matrix = (Matrix) threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        s3fjYDxWOUexjjVgyA(viewGroup, view, matrix);
        ThreadLocal threadLocal2 = f2077s3fjYDxWOUexjjVgyA;
        RectF rectF = (RectF) threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public static void lEeR5KfoEr4xU5yHH7(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        HJFh0TGMpafqLE9haL(viewGroup, view, rect);
    }

    public static void s3fjYDxWOUexjjVgyA(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            s3fjYDxWOUexjjVgyA(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
