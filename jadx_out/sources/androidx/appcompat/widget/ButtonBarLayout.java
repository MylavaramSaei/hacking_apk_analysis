package androidx.appcompat.widget;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm;
import lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f2834HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public boolean f2835lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public boolean f2836s3fjYDxWOUexjjVgyA;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2834HJFh0TGMpafqLE9haL = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pbVGzGjWvY2LDXC8vo.f6293DFYiVi7zXozAjRciKa);
        lLKzvdU99Iw80uVD5I.jocVUfxESVhVJU8LoH(this, context, pbVGzGjWvY2LDXC8vo.f6293DFYiVi7zXozAjRciKa, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f2835lEeR5KfoEr4xU5yHH7 = typedArrayObtainStyledAttributes.getBoolean(pbVGzGjWvY2LDXC8vo.f6301FtYx4GXtxwA8al5hBy, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f2835lEeR5KfoEr4xU5yHH7);
        }
    }

    private void setStacked(boolean z) {
        if (this.f2836s3fjYDxWOUexjjVgyA != z) {
            if (!z || this.f2835lEeR5KfoEr4xU5yHH7) {
                this.f2836s3fjYDxWOUexjjVgyA = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View viewFindViewById = findViewById(husNiw3snxdgZPAGJm.f6260hoXrIDAFrSwfShk8da);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    public final int lEeR5KfoEr4xU5yHH7(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = 0;
        if (this.f2835lEeR5KfoEr4xU5yHH7) {
            if (size > this.f2834HJFh0TGMpafqLE9haL && s3fjYDxWOUexjjVgyA()) {
                setStacked(false);
            }
            this.f2834HJFh0TGMpafqLE9haL = size;
        }
        if (s3fjYDxWOUexjjVgyA() || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (this.f2835lEeR5KfoEr4xU5yHH7 && !s3fjYDxWOUexjjVgyA() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int iLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(0);
        if (iLEeR5KfoEr4xU5yHH7 >= 0) {
            View childAt = getChildAt(iLEeR5KfoEr4xU5yHH7);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (s3fjYDxWOUexjjVgyA()) {
                int iLEeR5KfoEr4xU5yHH72 = lEeR5KfoEr4xU5yHH7(iLEeR5KfoEr4xU5yHH7 + 1);
                if (iLEeR5KfoEr4xU5yHH72 >= 0) {
                    paddingTop += getChildAt(iLEeR5KfoEr4xU5yHH72).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (lLKzvdU99Iw80uVD5I.VItLRw50eXTZeEfGl0(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public final boolean s3fjYDxWOUexjjVgyA() {
        return this.f2836s3fjYDxWOUexjjVgyA;
    }

    public void setAllowStacking(boolean z) {
        if (this.f2835lEeR5KfoEr4xU5yHH7 != z) {
            this.f2835lEeR5KfoEr4xU5yHH7 = z;
            if (!z && s3fjYDxWOUexjjVgyA()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
