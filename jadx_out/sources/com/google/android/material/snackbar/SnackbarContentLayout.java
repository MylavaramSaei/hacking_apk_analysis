package com.google.android.material.snackbar;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import fBZDmBPlAHk1Liuf1T.zZKhbgvUfsK4AEX3r0;
import tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL;
import tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final TimeInterpolator f5308HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public TextView f5309lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public Button f5310s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f5311zZKhbgvUfsK4AEX3r0;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5308HJFh0TGMpafqLE9haL = zZKhbgvUfsK4AEX3r0.TCyPEKSzIyweCN5yp1(context, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7141WWC27LAMFqFFBzfbNw, jsjSYEu4NPZjZxcfmI.lEeR5KfoEr4xU5yHH7.f6198s3fjYDxWOUexjjVgyA);
    }

    public static void lEeR5KfoEr4xU5yHH7(View view, int i, int i2) {
        if (lLKzvdU99Iw80uVD5I.XdzLv4NdAtTYoEzVzB(view)) {
            lLKzvdU99Iw80uVD5I.Ywqw2A0s86HeuFkDt0(view, lLKzvdU99Iw80uVD5I.OUd9THiLjZndMj0qdF(view), i, lLKzvdU99Iw80uVD5I.ao3wqKm5CXFuvC0q47(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    public Button getActionView() {
        return this.f5310s3fjYDxWOUexjjVgyA;
    }

    public TextView getMessageView() {
        return this.f5309lEeR5KfoEr4xU5yHH7;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f5309lEeR5KfoEr4xU5yHH7 = (TextView) findViewById(husNiw3snxdgZPAGJm.f7108XzJ1BS7H9Ilbkv4eVM);
        this.f5310s3fjYDxWOUexjjVgyA = (Button) findViewById(husNiw3snxdgZPAGJm.f7117jCtUeU2YI1poCxWcjm);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) throws Resources.NotFoundException {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(HJFh0TGMpafqLE9haL.f7046zZKhbgvUfsK4AEX3r0);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(HJFh0TGMpafqLE9haL.f7004HJFh0TGMpafqLE9haL);
        Layout layout = this.f5309lEeR5KfoEr4xU5yHH7.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.f5311zZKhbgvUfsK4AEX3r0 <= 0 || this.f5310s3fjYDxWOUexjjVgyA.getMeasuredWidth() <= this.f5311zZKhbgvUfsK4AEX3r0) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!s3fjYDxWOUexjjVgyA(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!s3fjYDxWOUexjjVgyA(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public final boolean s3fjYDxWOUexjjVgyA(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f5309lEeR5KfoEr4xU5yHH7.getPaddingTop() == i2 && this.f5309lEeR5KfoEr4xU5yHH7.getPaddingBottom() == i3) {
            return z;
        }
        lEeR5KfoEr4xU5yHH7(this.f5309lEeR5KfoEr4xU5yHH7, i2, i3);
        return true;
    }

    public void setMaxInlineActionWidth(int i) {
        this.f5311zZKhbgvUfsK4AEX3r0 = i;
    }
}
