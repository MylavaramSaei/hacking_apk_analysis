package IPyIQcaNa8aB7drBED;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public class Z9WdNiOsPR0y54zHW4 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final TextView f655lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final XdzLv4NdAtTYoEzVzB.KYHag8HRDlnO3X9zmZ f656s3fjYDxWOUexjjVgyA;

    public Z9WdNiOsPR0y54zHW4(TextView textView) {
        this.f655lEeR5KfoEr4xU5yHH7 = textView;
        this.f656s3fjYDxWOUexjjVgyA = new XdzLv4NdAtTYoEzVzB.KYHag8HRDlnO3X9zmZ(textView, false);
    }

    public void HJFh0TGMpafqLE9haL(boolean z) {
        this.f656s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(z);
    }

    public InputFilter[] lEeR5KfoEr4xU5yHH7(InputFilter[] inputFilterArr) {
        return this.f656s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(inputFilterArr);
    }

    public void s3fjYDxWOUexjjVgyA(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f655lEeR5KfoEr4xU5yHH7.getContext().obtainStyledAttributes(attributeSet, lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6449zcy2NNbtVXgoGQbfuq, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6331Pum9NZyDBKoCnecvlx) ? typedArrayObtainStyledAttributes.getBoolean(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6331Pum9NZyDBKoCnecvlx, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            zZKhbgvUfsK4AEX3r0(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void zZKhbgvUfsK4AEX3r0(boolean z) {
        this.f656s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(z);
    }
}
