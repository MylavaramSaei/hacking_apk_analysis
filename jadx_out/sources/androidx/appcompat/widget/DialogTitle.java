package androidx.appcompat.widget;

import IPyIQcaNa8aB7drBED.R9SAhYMerGybF9OAjL;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public class DialogTitle extends R9SAhYMerGybF9OAjL {
    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // IPyIQcaNa8aB7drBED.R9SAhYMerGybF9OAjL, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int lineCount;
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        setSingleLine(false);
        setMaxLines(2);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, pbVGzGjWvY2LDXC8vo.f6444zQjb36M22TWHJmh54i, R.attr.textAppearanceMedium, R.style.TextAppearance.Medium);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(pbVGzGjWvY2LDXC8vo.f6436wUKf1mNArSjssthGmN, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
        super.onMeasure(i, i2);
    }
}
