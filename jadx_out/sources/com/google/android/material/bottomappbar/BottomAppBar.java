package com.google.android.material.bottomappbar;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.zZKhbgvUfsK4AEX3r0;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;
import tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7;
import tmIBXGVvBsrJ7i63G2.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public abstract class BottomAppBar extends Toolbar {

    /* renamed from: YlLW4G6OV9TFyuw5ix, reason: collision with root package name */
    public static final int f4823YlLW4G6OV9TFyuw5ix = pbVGzGjWvY2LDXC8vo.f7162KYHag8HRDlnO3X9zmZ;

    /* renamed from: oocVJL811qFf0j0XXZ, reason: collision with root package name */
    public static final int f4824oocVJL811qFf0j0XXZ = lEeR5KfoEr4xU5yHH7.f7143Y43RdunnpKgpbny0lE;

    /* renamed from: udcVtCzLTM1Loe9KrX, reason: collision with root package name */
    public static final int f4825udcVtCzLTM1Loe9KrX = lEeR5KfoEr4xU5yHH7.f7141WWC27LAMFqFFBzfbNw;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
        public final View.OnLayoutChangeListener f4826OANkd3mP6AYvwbNLJM;

        /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
        public final Rect f4827T9PhQIpGRhE4yZDm1C;

        /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
        public int f4828aPyGSIylzVNKPT1Bls;

        /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
        public WeakReference f4829hoXrIDAFrSwfShk8da;

        public class lEeR5KfoEr4xU5yHH7 implements View.OnLayoutChangeListener {
            public lEeR5KfoEr4xU5yHH7() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(Behavior.this.f4829hoXrIDAFrSwfShk8da.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f4826OANkd3mP6AYvwbNLJM = new lEeR5KfoEr4xU5yHH7();
            this.f4827T9PhQIpGRhE4yZDm1C = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ boolean THTDvPxsHqMeGb512f(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            return ToH8yzk8U1nKT0PUfY(coordinatorLayout, null, view2, view3, i, i2);
        }

        public boolean ToH8yzk8U1nKT0PUfY(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ boolean e54J8UWNHWALQNixXM(CoordinatorLayout coordinatorLayout, View view, int i) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            return lLKzvdU99Iw80uVD5I(coordinatorLayout, null, i);
        }

        public boolean lLKzvdU99Iw80uVD5I(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f4829hoXrIDAFrSwfShk8da = new WeakReference(bottomAppBar);
            View viewAAp6BD79BhftLCnuvf = BottomAppBar.aAp6BD79BhftLCnuvf(bottomAppBar);
            if (viewAAp6BD79BhftLCnuvf != null && !lLKzvdU99Iw80uVD5I.lLKzvdU99Iw80uVD5I(viewAAp6BD79BhftLCnuvf)) {
                BottomAppBar.ToH8yzk8U1nKT0PUfY(bottomAppBar, viewAAp6BD79BhftLCnuvf);
                this.f4828aPyGSIylzVNKPT1Bls = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.husNiw3snxdgZPAGJm) viewAAp6BD79BhftLCnuvf.getLayoutParams())).bottomMargin;
                viewAAp6BD79BhftLCnuvf.addOnLayoutChangeListener(this.f4826OANkd3mP6AYvwbNLJM);
                BottomAppBar.PPkm9uUfOJHHYveeLT(bottomAppBar);
            }
            coordinatorLayout.W3RZ2dTDKrKpS5Mxdk(bottomAppBar, i);
            return super.e54J8UWNHWALQNixXM(coordinatorLayout, bottomAppBar, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4826OANkd3mP6AYvwbNLJM = new lEeR5KfoEr4xU5yHH7();
            this.f4827T9PhQIpGRhE4yZDm1C = new Rect();
        }
    }

    public static /* synthetic */ void PPkm9uUfOJHHYveeLT(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static void ToH8yzk8U1nKT0PUfY(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.husNiw3snxdgZPAGJm) view.getLayoutParams()).f3240zZKhbgvUfsK4AEX3r0 = 17;
        throw null;
    }

    public static /* synthetic */ View aAp6BD79BhftLCnuvf(BottomAppBar bottomAppBar) {
        throw null;
    }
}
