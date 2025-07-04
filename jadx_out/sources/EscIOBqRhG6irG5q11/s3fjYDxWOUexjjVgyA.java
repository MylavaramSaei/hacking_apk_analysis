package EscIOBqRhG6irG5q11;

import W3RZ2dTDKrKpS5Mxdk.Y43RdunnpKgpbny0lE;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import W3RZ2dTDKrKpS5Mxdk.zXY7dgnTfw9Pd9RXel;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA extends HJFh0TGMpafqLE9haL {

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public int f118KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public int f119TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final Rect f120husNiw3snxdgZPAGJm;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final Rect f121zZKhbgvUfsK4AEX3r0;

    public s3fjYDxWOUexjjVgyA() {
        this.f121zZKhbgvUfsK4AEX3r0 = new Rect();
        this.f120husNiw3snxdgZPAGJm = new Rect();
        this.f118KYHag8HRDlnO3X9zmZ = 0;
    }

    public static int KqgKJKIWne3kz1AdHk(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    public int DfpieXfdYs58yZAiXY(View view) {
        return view.getMeasuredHeight();
    }

    public abstract float GyWRxpdt1T8mEJXPoD(View view);

    public final int OqIo5QF00RDxUQb4qq(View view) {
        if (this.f119TCyPEKSzIyweCN5yp1 == 0) {
            return 0;
        }
        float fGyWRxpdt1T8mEJXPoD = GyWRxpdt1T8mEJXPoD(view);
        int i = this.f119TCyPEKSzIyweCN5yp1;
        return ao3wqKm5CXFuvC0q47.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA((int) (fGyWRxpdt1T8mEJXPoD * i), 0, i);
    }

    public final void PPkm9uUfOJHHYveeLT(int i) {
        this.f119TCyPEKSzIyweCN5yp1 = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean T9PhQIpGRhE4yZDm1C(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View viewW3RZ2dTDKrKpS5Mxdk;
        zXY7dgnTfw9Pd9RXel lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (viewW3RZ2dTDKrKpS5Mxdk = W3RZ2dTDKrKpS5Mxdk(coordinatorLayout.zaq8hOURtfwbcX17cG(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (lLKzvdU99Iw80uVD5I.G7AC3DWIx9i9fdanjk(viewW3RZ2dTDKrKpS5Mxdk) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.Z9WdNiOsPR0y54zHW4() + lastWindowInsets.IPyIQcaNa8aB7drBED();
        }
        int iDfpieXfdYs58yZAiXY = size + DfpieXfdYs58yZAiXY(viewW3RZ2dTDKrKpS5Mxdk);
        int measuredHeight = viewW3RZ2dTDKrKpS5Mxdk.getMeasuredHeight();
        if (aAp6BD79BhftLCnuvf()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iDfpieXfdYs58yZAiXY -= measuredHeight;
        }
        coordinatorLayout.OqIo5QF00RDxUQb4qq(view, i, i2, View.MeasureSpec.makeMeasureSpec(iDfpieXfdYs58yZAiXY, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    public abstract View W3RZ2dTDKrKpS5Mxdk(List list);

    public boolean aAp6BD79BhftLCnuvf() {
        return false;
    }

    public final int e2F9F6h8YJxTHwLCa0() {
        return this.f118KYHag8HRDlnO3X9zmZ;
    }

    @Override // EscIOBqRhG6irG5q11.HJFh0TGMpafqLE9haL
    public void tXWeW0sqVddf7ZBflq(CoordinatorLayout coordinatorLayout, View view, int i) {
        int bottom;
        View viewW3RZ2dTDKrKpS5Mxdk = W3RZ2dTDKrKpS5Mxdk(coordinatorLayout.zaq8hOURtfwbcX17cG(view));
        if (viewW3RZ2dTDKrKpS5Mxdk != null) {
            CoordinatorLayout.husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (CoordinatorLayout.husNiw3snxdgZPAGJm) view.getLayoutParams();
            Rect rect = this.f121zZKhbgvUfsK4AEX3r0;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).leftMargin, viewW3RZ2dTDKrKpS5Mxdk.getBottom() + ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).rightMargin, ((coordinatorLayout.getHeight() + viewW3RZ2dTDKrKpS5Mxdk.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) husniw3snxdgzpagjm).bottomMargin);
            zXY7dgnTfw9Pd9RXel lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && lLKzvdU99Iw80uVD5I.G7AC3DWIx9i9fdanjk(coordinatorLayout) && !lLKzvdU99Iw80uVD5I.G7AC3DWIx9i9fdanjk(view)) {
                rect.left += lastWindowInsets.pbVGzGjWvY2LDXC8vo();
                rect.right -= lastWindowInsets.Acstmh57AKoSEkEFNJ();
            }
            Rect rect2 = this.f120husNiw3snxdgZPAGJm;
            Y43RdunnpKgpbny0lE.lEeR5KfoEr4xU5yHH7(KqgKJKIWne3kz1AdHk(husniw3snxdgzpagjm.f3225HJFh0TGMpafqLE9haL), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int iOqIo5QF00RDxUQb4qq = OqIo5QF00RDxUQb4qq(viewW3RZ2dTDKrKpS5Mxdk);
            view.layout(rect2.left, rect2.top - iOqIo5QF00RDxUQb4qq, rect2.right, rect2.bottom - iOqIo5QF00RDxUQb4qq);
            bottom = rect2.top - viewW3RZ2dTDKrKpS5Mxdk.getBottom();
        } else {
            super.tXWeW0sqVddf7ZBflq(coordinatorLayout, view, i);
            bottom = 0;
        }
        this.f118KYHag8HRDlnO3X9zmZ = bottom;
    }

    public s3fjYDxWOUexjjVgyA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f121zZKhbgvUfsK4AEX3r0 = new Rect();
        this.f120husNiw3snxdgZPAGJm = new Rect();
        this.f118KYHag8HRDlnO3X9zmZ = 0;
    }
}
