package com.google.android.material.transformation;

import GeBgWLiG3rAOvStVF8.lEeR5KfoEr4xU5yHH7;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.activity.zZKhbgvUfsK4AEX3r0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.s3fjYDxWOUexjjVgyA {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int f5500lEeR5KfoEr4xU5yHH7;

    public ExpandableBehavior() {
        this.f5500lEeR5KfoEr4xU5yHH7 = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean IPyIQcaNa8aB7drBED(CoordinatorLayout coordinatorLayout, View view, View view2) {
        zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view2);
        throw null;
    }

    public lEeR5KfoEr4xU5yHH7 XzJ1BS7H9Ilbkv4eVM(CoordinatorLayout coordinatorLayout, View view) {
        List listZaq8hOURtfwbcX17cG = coordinatorLayout.zaq8hOURtfwbcX17cG(view);
        int size = listZaq8hOURtfwbcX17cG.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) listZaq8hOURtfwbcX17cG.get(i);
            if (husNiw3snxdgZPAGJm(coordinatorLayout, view, view2)) {
                zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view2);
                return null;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean e54J8UWNHWALQNixXM(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (lLKzvdU99Iw80uVD5I.lLKzvdU99Iw80uVD5I(view)) {
            return false;
        }
        XzJ1BS7H9Ilbkv4eVM(coordinatorLayout, view);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public abstract boolean husNiw3snxdgZPAGJm(CoordinatorLayout coordinatorLayout, View view, View view2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5500lEeR5KfoEr4xU5yHH7 = 0;
    }
}
