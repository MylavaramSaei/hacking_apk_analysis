package W3RZ2dTDKrKpS5Mxdk;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class oocVJL811qFf0j0XXZ {

    public static class lEeR5KfoEr4xU5yHH7 {
        public static void HJFh0TGMpafqLE9haL(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        }

        public static boolean KYHag8HRDlnO3X9zmZ(ViewParent viewParent, View view, View view2, int i) {
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        public static void TCyPEKSzIyweCN5yp1(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }

        public static void husNiw3snxdgZPAGJm(ViewParent viewParent, View view, View view2, int i) {
            viewParent.onNestedScrollAccepted(view, view2, i);
        }

        public static boolean lEeR5KfoEr4xU5yHH7(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent.onNestedFling(view, f, f2, z);
        }

        public static boolean s3fjYDxWOUexjjVgyA(ViewParent viewParent, View view, float f, float f2) {
            return viewParent.onNestedPreFling(view, f, f2);
        }

        public static void zZKhbgvUfsK4AEX3r0(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public static void HJFh0TGMpafqLE9haL(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof WWC27LAMFqFFBzfbNw) {
            ((WWC27LAMFqFFBzfbNw) viewParent).HJFh0TGMpafqLE9haL(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            try {
                lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    public static boolean KYHag8HRDlnO3X9zmZ(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof WWC27LAMFqFFBzfbNw) {
            return ((WWC27LAMFqFFBzfbNw) viewParent).KYHag8HRDlnO3X9zmZ(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(viewParent, view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }

    public static void TCyPEKSzIyweCN5yp1(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof WWC27LAMFqFFBzfbNw) {
            ((WWC27LAMFqFFBzfbNw) viewParent).s3fjYDxWOUexjjVgyA(view, i);
            return;
        }
        if (i == 0) {
            try {
                lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(viewParent, view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    public static void husNiw3snxdgZPAGJm(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof WWC27LAMFqFFBzfbNw) {
            ((WWC27LAMFqFFBzfbNw) viewParent).lEeR5KfoEr4xU5yHH7(view, view2, i, i2);
            return;
        }
        if (i2 == 0) {
            try {
                lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    public static boolean lEeR5KfoEr4xU5yHH7(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(viewParent, view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public static boolean s3fjYDxWOUexjjVgyA(ViewParent viewParent, View view, float f, float f2) {
        try {
            return lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(viewParent, view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public static void zZKhbgvUfsK4AEX3r0(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof THTDvPxsHqMeGb512f) {
            ((THTDvPxsHqMeGb512f) viewParent).zZKhbgvUfsK4AEX3r0(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof WWC27LAMFqFFBzfbNw) {
            ((WWC27LAMFqFFBzfbNw) viewParent).husNiw3snxdgZPAGJm(view, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            try {
                lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }
}
