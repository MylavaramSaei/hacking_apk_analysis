package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public Path f5239lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public float f5240s3fjYDxWOUexjjVgyA;

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f5239lEeR5KfoEr4xU5yHH7 == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f5239lEeR5KfoEr4xU5yHH7);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public float getCornerRadius() {
        return this.f5240s3fjYDxWOUexjjVgyA;
    }
}
