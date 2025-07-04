package com.google.android.material.floatingactionbutton;

import GeBgWLiG3rAOvStVF8.lEeR5KfoEr4xU5yHH7;
import WaWv1mJ1ya3uoEaKqz.aPyGSIylzVNKPT1Bls;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.zZKhbgvUfsK4AEX3r0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ayaSAlBnO403UB0TMR.hoXrIDAFrSwfShk8da;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ;

/* loaded from: classes.dex */
public abstract class FloatingActionButton extends aPyGSIylzVNKPT1Bls implements lEeR5KfoEr4xU5yHH7, hoXrIDAFrSwfShk8da {

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.s3fjYDxWOUexjjVgyA {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public boolean f5231lEeR5KfoEr4xU5yHH7;

        public BaseBehavior() {
            this.f5231lEeR5KfoEr4xU5yHH7 = true;
        }

        private static boolean tXWeW0sqVddf7ZBflq(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.husNiw3snxdgZPAGJm) {
                return ((CoordinatorLayout.husNiw3snxdgZPAGJm) layoutParams).husNiw3snxdgZPAGJm() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public final boolean DfpieXfdYs58yZAiXY(View view, FloatingActionButton floatingActionButton) {
            throw null;
        }

        public boolean GyWRxpdt1T8mEJXPoD(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List listZaq8hOURtfwbcX17cG = coordinatorLayout.zaq8hOURtfwbcX17cG(floatingActionButton);
            int size = listZaq8hOURtfwbcX17cG.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) listZaq8hOURtfwbcX17cG.get(i2);
                if (tXWeW0sqVddf7ZBflq(view) && e2F9F6h8YJxTHwLCa0(view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.W3RZ2dTDKrKpS5Mxdk(floatingActionButton, i);
            W3RZ2dTDKrKpS5Mxdk(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ boolean IPyIQcaNa8aB7drBED(CoordinatorLayout coordinatorLayout, View view, View view2) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            return OqIo5QF00RDxUQb4qq(coordinatorLayout, null, view2);
        }

        public boolean OqIo5QF00RDxUQb4qq(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (!tXWeW0sqVddf7ZBflq(view)) {
                return false;
            }
            e2F9F6h8YJxTHwLCa0(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public void TCyPEKSzIyweCN5yp1(CoordinatorLayout.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            if (husniw3snxdgzpagjm.f3226IPyIQcaNa8aB7drBED == 0) {
                husniw3snxdgzpagjm.f3226IPyIQcaNa8aB7drBED = 80;
            }
        }

        public final void W3RZ2dTDKrKpS5Mxdk(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            throw null;
        }

        public boolean XzJ1BS7H9Ilbkv4eVM(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            throw null;
        }

        public final boolean e2F9F6h8YJxTHwLCa0(View view, FloatingActionButton floatingActionButton) {
            if (DfpieXfdYs58yZAiXY(view, floatingActionButton)) {
                throw null;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ boolean e54J8UWNHWALQNixXM(CoordinatorLayout coordinatorLayout, View view, int i) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            return GyWRxpdt1T8mEJXPoD(coordinatorLayout, null, i);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ boolean s3fjYDxWOUexjjVgyA(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            return XzJ1BS7H9Ilbkv4eVM(coordinatorLayout, null, rect);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Acstmh57AKoSEkEFNJ.f6972sKw6Jz5uGcQ479KwIW);
            this.f5231lEeR5KfoEr4xU5yHH7 = typedArrayObtainStyledAttributes.getBoolean(Acstmh57AKoSEkEFNJ.f6848FXtjrf53D5B1cLsLFG, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean GyWRxpdt1T8mEJXPoD(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.GyWRxpdt1T8mEJXPoD(coordinatorLayout, floatingActionButton, i);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean OqIo5QF00RDxUQb4qq(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.OqIo5QF00RDxUQb4qq(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ void TCyPEKSzIyweCN5yp1(CoordinatorLayout.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            super.TCyPEKSzIyweCN5yp1(husniw3snxdgzpagjm);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean XzJ1BS7H9Ilbkv4eVM(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.XzJ1BS7H9Ilbkv4eVM(coordinatorLayout, floatingActionButton, rect);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
