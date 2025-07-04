package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import jsjSYEu4NPZjZxcfmI.zZKhbgvUfsK4AEX3r0;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final zZKhbgvUfsK4AEX3r0 f5505HJFh0TGMpafqLE9haL;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final zZKhbgvUfsK4AEX3r0 f5506s3fjYDxWOUexjjVgyA;

    public FabTransformationScrimBehavior() {
        this.f5506s3fjYDxWOUexjjVgyA = new zZKhbgvUfsK4AEX3r0(75L, 150L);
        this.f5505HJFh0TGMpafqLE9haL = new zZKhbgvUfsK4AEX3r0(0L, 150L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean husNiw3snxdgZPAGJm(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean jCtUeU2YI1poCxWcjm(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.jCtUeU2YI1poCxWcjm(coordinatorLayout, view, motionEvent);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5506s3fjYDxWOUexjjVgyA = new zZKhbgvUfsK4AEX3r0(75L, 150L);
        this.f5505HJFh0TGMpafqLE9haL = new zZKhbgvUfsK4AEX3r0(0L, 150L);
    }
}
