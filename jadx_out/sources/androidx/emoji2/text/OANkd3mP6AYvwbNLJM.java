package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public class OANkd3mP6AYvwbNLJM {

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final ThreadLocal f3339zZKhbgvUfsK4AEX3r0 = new ThreadLocal();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public volatile int f3340HJFh0TGMpafqLE9haL = 0;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int f3341lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final hoXrIDAFrSwfShk8da f3342s3fjYDxWOUexjjVgyA;

    public OANkd3mP6AYvwbNLJM(hoXrIDAFrSwfShk8da hoxridafrswfshk8da, int i) {
        this.f3342s3fjYDxWOUexjjVgyA = hoxridafrswfshk8da;
        this.f3341lEeR5KfoEr4xU5yHH7 = i;
    }

    public boolean Acstmh57AKoSEkEFNJ() {
        return TCyPEKSzIyweCN5yp1().Acstmh57AKoSEkEFNJ();
    }

    public int HJFh0TGMpafqLE9haL() {
        return TCyPEKSzIyweCN5yp1().pbVGzGjWvY2LDXC8vo();
    }

    public short IPyIQcaNa8aB7drBED() {
        return TCyPEKSzIyweCN5yp1().T9PhQIpGRhE4yZDm1C();
    }

    public int KYHag8HRDlnO3X9zmZ() {
        return TCyPEKSzIyweCN5yp1().e54J8UWNHWALQNixXM();
    }

    public void T9PhQIpGRhE4yZDm1C(boolean z) {
        int i = this.f3340HJFh0TGMpafqLE9haL & 4;
        this.f3340HJFh0TGMpafqLE9haL = z ? i | 2 : i | 1;
    }

    public final ToH8yzk8U1nKT0PUfY.lEeR5KfoEr4xU5yHH7 TCyPEKSzIyweCN5yp1() {
        ThreadLocal threadLocal = f3339zZKhbgvUfsK4AEX3r0;
        ToH8yzk8U1nKT0PUfY.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (ToH8yzk8U1nKT0PUfY.lEeR5KfoEr4xU5yHH7) threadLocal.get();
        if (leer5kfoer4xu5yhh7 == null) {
            leer5kfoer4xu5yhh7 = new ToH8yzk8U1nKT0PUfY.lEeR5KfoEr4xU5yHH7();
            threadLocal.set(leer5kfoer4xu5yhh7);
        }
        this.f3342s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0().Acstmh57AKoSEkEFNJ(leer5kfoer4xu5yhh7, this.f3341lEeR5KfoEr4xU5yHH7);
        return leer5kfoer4xu5yhh7;
    }

    public boolean Z9WdNiOsPR0y54zHW4() {
        return (this.f3340HJFh0TGMpafqLE9haL & 4) > 0;
    }

    public void e54J8UWNHWALQNixXM(boolean z) {
        int iZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0();
        if (z) {
            this.f3340HJFh0TGMpafqLE9haL = iZZKhbgvUfsK4AEX3r0 | 4;
        } else {
            this.f3340HJFh0TGMpafqLE9haL = iZZKhbgvUfsK4AEX3r0;
        }
    }

    public int husNiw3snxdgZPAGJm() {
        return TCyPEKSzIyweCN5yp1().Z9WdNiOsPR0y54zHW4();
    }

    public void lEeR5KfoEr4xU5yHH7(Canvas canvas, float f, float f2, Paint paint) {
        Typeface typefaceTCyPEKSzIyweCN5yp1 = this.f3342s3fjYDxWOUexjjVgyA.TCyPEKSzIyweCN5yp1();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceTCyPEKSzIyweCN5yp1);
        canvas.drawText(this.f3342s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(), this.f3341lEeR5KfoEr4xU5yHH7 * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    public int pbVGzGjWvY2LDXC8vo() {
        return TCyPEKSzIyweCN5yp1().hoXrIDAFrSwfShk8da();
    }

    public int s3fjYDxWOUexjjVgyA(int i) {
        return TCyPEKSzIyweCN5yp1().IPyIQcaNa8aB7drBED(i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(KYHag8HRDlnO3X9zmZ()));
        sb.append(", codepoints:");
        int iHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL();
        for (int i = 0; i < iHJFh0TGMpafqLE9haL; i++) {
            sb.append(Integer.toHexString(s3fjYDxWOUexjjVgyA(i)));
            sb.append(" ");
        }
        return sb.toString();
    }

    public int zZKhbgvUfsK4AEX3r0() {
        return this.f3340HJFh0TGMpafqLE9haL & 3;
    }
}
