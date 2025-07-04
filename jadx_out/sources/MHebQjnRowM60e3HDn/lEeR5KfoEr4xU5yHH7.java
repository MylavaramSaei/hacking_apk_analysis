package MHebQjnRowM60e3HDn;

import android.content.Context;
import android.graphics.Color;
import hgxXdWVkE1CPHCTwpz.s3fjYDxWOUexjjVgyA;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static final int f939KYHag8HRDlnO3X9zmZ = (int) Math.round(5.1000000000000005d);

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f940HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final float f941husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final boolean f942lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final int f943s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final int f944zZKhbgvUfsK4AEX3r0;

    public lEeR5KfoEr4xU5yHH7(Context context) {
        this(s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(context, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7147e54J8UWNHWALQNixXM, false), cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(context, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7144Z9WdNiOsPR0y54zHW4, 0), cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(context, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7127Acstmh57AKoSEkEFNJ, 0), cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(context, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7130IPyIQcaNa8aB7drBED, 0), context.getResources().getDisplayMetrics().density);
    }

    public int HJFh0TGMpafqLE9haL(int i, float f) {
        return (this.f942lEeR5KfoEr4xU5yHH7 && husNiw3snxdgZPAGJm(i)) ? s3fjYDxWOUexjjVgyA(i, f) : i;
    }

    public final boolean husNiw3snxdgZPAGJm(int i) {
        return VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(i, 255) == this.f944zZKhbgvUfsK4AEX3r0;
    }

    public float lEeR5KfoEr4xU5yHH7(float f) {
        if (this.f941husNiw3snxdgZPAGJm <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int s3fjYDxWOUexjjVgyA(int i, float f) {
        int i2;
        float fLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(f);
        int iAlpha = Color.alpha(i);
        int iAcstmh57AKoSEkEFNJ = cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(i, 255), this.f943s3fjYDxWOUexjjVgyA, fLEeR5KfoEr4xU5yHH7);
        if (fLEeR5KfoEr4xU5yHH7 > 0.0f && (i2 = this.f940HJFh0TGMpafqLE9haL) != 0) {
            iAcstmh57AKoSEkEFNJ = cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(iAcstmh57AKoSEkEFNJ, VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(i2, f939KYHag8HRDlnO3X9zmZ));
        }
        return VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(iAcstmh57AKoSEkEFNJ, iAlpha);
    }

    public boolean zZKhbgvUfsK4AEX3r0() {
        return this.f942lEeR5KfoEr4xU5yHH7;
    }

    public lEeR5KfoEr4xU5yHH7(boolean z, int i, int i2, int i3, float f) {
        this.f942lEeR5KfoEr4xU5yHH7 = z;
        this.f943s3fjYDxWOUexjjVgyA = i;
        this.f940HJFh0TGMpafqLE9haL = i2;
        this.f944zZKhbgvUfsK4AEX3r0 = i3;
        this.f941husNiw3snxdgZPAGJm = f;
    }
}
