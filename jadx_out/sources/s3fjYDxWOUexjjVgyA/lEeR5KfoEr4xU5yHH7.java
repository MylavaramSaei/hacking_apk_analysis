package s3fjYDxWOUexjjVgyA;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 extends ViewGroup.MarginLayoutParams {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int f6587lEeR5KfoEr4xU5yHH7;

    public lEeR5KfoEr4xU5yHH7(int i, int i2) {
        super(i, i2);
        this.f6587lEeR5KfoEr4xU5yHH7 = 8388627;
    }

    public lEeR5KfoEr4xU5yHH7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6587lEeR5KfoEr4xU5yHH7 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pbVGzGjWvY2LDXC8vo.f6424sTkWmhpZ5b1ArQIw4K);
        this.f6587lEeR5KfoEr4xU5yHH7 = typedArrayObtainStyledAttributes.getInt(pbVGzGjWvY2LDXC8vo.f6353Y43RdunnpKgpbny0lE, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public lEeR5KfoEr4xU5yHH7(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f6587lEeR5KfoEr4xU5yHH7 = 0;
    }

    public lEeR5KfoEr4xU5yHH7(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        super((ViewGroup.MarginLayoutParams) leer5kfoer4xu5yhh7);
        this.f6587lEeR5KfoEr4xU5yHH7 = 0;
        this.f6587lEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7.f6587lEeR5KfoEr4xU5yHH7;
    }
}
