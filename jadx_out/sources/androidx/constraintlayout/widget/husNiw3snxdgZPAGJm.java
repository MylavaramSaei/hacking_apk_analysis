package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class husNiw3snxdgZPAGJm extends View {
    public husNiw3snxdgZPAGJm(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (ConstraintLayout.s3fjYDxWOUexjjVgyA) getLayoutParams();
        s3fjydxwouexjjvgya.f3054lEeR5KfoEr4xU5yHH7 = i;
        setLayoutParams(s3fjydxwouexjjvgya);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (ConstraintLayout.s3fjYDxWOUexjjVgyA) getLayoutParams();
        s3fjydxwouexjjvgya.f3059s3fjYDxWOUexjjVgyA = i;
        setLayoutParams(s3fjydxwouexjjvgya);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (ConstraintLayout.s3fjYDxWOUexjjVgyA) getLayoutParams();
        s3fjydxwouexjjvgya.f3009HJFh0TGMpafqLE9haL = f;
        setLayoutParams(s3fjydxwouexjjvgya);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
