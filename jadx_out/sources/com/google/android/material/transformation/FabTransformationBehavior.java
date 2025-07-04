package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final RectF f5501HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final int[] f5502husNiw3snxdgZPAGJm;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Rect f5503s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final RectF f5504zZKhbgvUfsK4AEX3r0;

    public FabTransformationBehavior() {
        this.f5503s3fjYDxWOUexjjVgyA = new Rect();
        this.f5501HJFh0TGMpafqLE9haL = new RectF();
        this.f5504zZKhbgvUfsK4AEX3r0 = new RectF();
        this.f5502husNiw3snxdgZPAGJm = new int[2];
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public void TCyPEKSzIyweCN5yp1(CoordinatorLayout.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        if (husniw3snxdgzpagjm.f3226IPyIQcaNa8aB7drBED == 0) {
            husniw3snxdgzpagjm.f3226IPyIQcaNa8aB7drBED = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean husNiw3snxdgZPAGJm(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5503s3fjYDxWOUexjjVgyA = new Rect();
        this.f5501HJFh0TGMpafqLE9haL = new RectF();
        this.f5504zZKhbgvUfsK4AEX3r0 = new RectF();
        this.f5502husNiw3snxdgZPAGJm = new int[2];
    }
}
