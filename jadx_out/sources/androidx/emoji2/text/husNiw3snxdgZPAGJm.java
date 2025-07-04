package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.KYHag8HRDlnO3X9zmZ;

/* loaded from: classes.dex */
public class husNiw3snxdgZPAGJm implements KYHag8HRDlnO3X9zmZ.husNiw3snxdgZPAGJm {

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final ThreadLocal f3371s3fjYDxWOUexjjVgyA = new ThreadLocal();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final TextPaint f3372lEeR5KfoEr4xU5yHH7;

    public husNiw3snxdgZPAGJm() {
        TextPaint textPaint = new TextPaint();
        this.f3372lEeR5KfoEr4xU5yHH7 = textPaint;
        textPaint.setTextSize(10.0f);
    }

    public static StringBuilder s3fjYDxWOUexjjVgyA() {
        ThreadLocal threadLocal = f3371s3fjYDxWOUexjjVgyA;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.husNiw3snxdgZPAGJm
    public boolean lEeR5KfoEr4xU5yHH7(CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder sbS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA();
        sbS3fjYDxWOUexjjVgyA.setLength(0);
        while (i < i2) {
            sbS3fjYDxWOUexjjVgyA.append(charSequence.charAt(i));
            i++;
        }
        return VItLRw50eXTZeEfGl0.TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7(this.f3372lEeR5KfoEr4xU5yHH7, sbS3fjYDxWOUexjjVgyA.toString());
    }
}
