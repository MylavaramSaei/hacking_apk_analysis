package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class Acstmh57AKoSEkEFNJ extends ReplacementSpan {

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final OANkd3mP6AYvwbNLJM f3297s3fjYDxWOUexjjVgyA;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Paint.FontMetricsInt f3296lEeR5KfoEr4xU5yHH7 = new Paint.FontMetricsInt();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public short f3294HJFh0TGMpafqLE9haL = -1;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public short f3298zZKhbgvUfsK4AEX3r0 = -1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public float f3295husNiw3snxdgZPAGJm = 1.0f;

    public Acstmh57AKoSEkEFNJ(OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM) {
        tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.IPyIQcaNa8aB7drBED(oANkd3mP6AYvwbNLJM, "rasterizer cannot be null");
        this.f3297s3fjYDxWOUexjjVgyA = oANkd3mP6AYvwbNLJM;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f3296lEeR5KfoEr4xU5yHH7);
        Paint.FontMetricsInt fontMetricsInt2 = this.f3296lEeR5KfoEr4xU5yHH7;
        this.f3295husNiw3snxdgZPAGJm = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f3297s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm();
        this.f3298zZKhbgvUfsK4AEX3r0 = (short) (this.f3297s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm() * this.f3295husNiw3snxdgZPAGJm);
        short sPbVGzGjWvY2LDXC8vo = (short) (this.f3297s3fjYDxWOUexjjVgyA.pbVGzGjWvY2LDXC8vo() * this.f3295husNiw3snxdgZPAGJm);
        this.f3294HJFh0TGMpafqLE9haL = sPbVGzGjWvY2LDXC8vo;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f3296lEeR5KfoEr4xU5yHH7;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sPbVGzGjWvY2LDXC8vo;
    }

    public final OANkd3mP6AYvwbNLJM lEeR5KfoEr4xU5yHH7() {
        return this.f3297s3fjYDxWOUexjjVgyA;
    }

    public final int s3fjYDxWOUexjjVgyA() {
        return this.f3294HJFh0TGMpafqLE9haL;
    }
}
