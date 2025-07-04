package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.zZKhbgvUfsK4AEX3r0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ;

/* loaded from: classes.dex */
public abstract class ExtendedFloatingActionButton extends MaterialButton {

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.s3fjYDxWOUexjjVgyA {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public boolean f5229lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public boolean f5230s3fjYDxWOUexjjVgyA;

        public ExtendedFloatingActionButtonBehavior() {
            this.f5229lEeR5KfoEr4xU5yHH7 = false;
            this.f5230s3fjYDxWOUexjjVgyA = true;
        }

        public static boolean tXWeW0sqVddf7ZBflq(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.husNiw3snxdgZPAGJm) {
                return ((CoordinatorLayout.husNiw3snxdgZPAGJm) layoutParams).husNiw3snxdgZPAGJm() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public final boolean DfpieXfdYs58yZAiXY(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (GyWRxpdt1T8mEJXPoD(view, extendedFloatingActionButton)) {
                throw null;
            }
            return false;
        }

        public final boolean GyWRxpdt1T8mEJXPoD(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ boolean IPyIQcaNa8aB7drBED(CoordinatorLayout coordinatorLayout, View view, View view2) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            return W3RZ2dTDKrKpS5Mxdk(coordinatorLayout, null, view2);
        }

        public boolean OqIo5QF00RDxUQb4qq(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List listZaq8hOURtfwbcX17cG = coordinatorLayout.zaq8hOURtfwbcX17cG(extendedFloatingActionButton);
            int size = listZaq8hOURtfwbcX17cG.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) listZaq8hOURtfwbcX17cG.get(i2);
                if (tXWeW0sqVddf7ZBflq(view) && DfpieXfdYs58yZAiXY(view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.W3RZ2dTDKrKpS5Mxdk(extendedFloatingActionButton, i);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public void TCyPEKSzIyweCN5yp1(CoordinatorLayout.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            if (husniw3snxdgzpagjm.f3226IPyIQcaNa8aB7drBED == 0) {
                husniw3snxdgzpagjm.f3226IPyIQcaNa8aB7drBED = 80;
            }
        }

        public boolean W3RZ2dTDKrKpS5Mxdk(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (!tXWeW0sqVddf7ZBflq(view)) {
                return false;
            }
            DfpieXfdYs58yZAiXY(view, extendedFloatingActionButton);
            return false;
        }

        public boolean XzJ1BS7H9Ilbkv4eVM(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.s3fjYDxWOUexjjVgyA(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ boolean e54J8UWNHWALQNixXM(CoordinatorLayout coordinatorLayout, View view, int i) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            return OqIo5QF00RDxUQb4qq(coordinatorLayout, null, i);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public /* bridge */ /* synthetic */ boolean s3fjYDxWOUexjjVgyA(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view);
            return XzJ1BS7H9Ilbkv4eVM(coordinatorLayout, null, rect);
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Acstmh57AKoSEkEFNJ.f6916ayaSAlBnO403UB0TMR);
            this.f5229lEeR5KfoEr4xU5yHH7 = typedArrayObtainStyledAttributes.getBoolean(Acstmh57AKoSEkEFNJ.f6882R6kEk3zZuOluTikhN3, false);
            this.f5230s3fjYDxWOUexjjVgyA = typedArrayObtainStyledAttributes.getBoolean(Acstmh57AKoSEkEFNJ.f6915auvQiDfBN48eRz3fFq, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
