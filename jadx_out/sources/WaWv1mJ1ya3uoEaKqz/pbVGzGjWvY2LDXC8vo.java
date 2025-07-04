package WaWv1mJ1ya3uoEaKqz;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class pbVGzGjWvY2LDXC8vo {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public float f2068HJFh0TGMpafqLE9haL;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public hgxXdWVkE1CPHCTwpz.zZKhbgvUfsK4AEX3r0 f2070TCyPEKSzIyweCN5yp1;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public float f2074zZKhbgvUfsK4AEX3r0;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final TextPaint f2072lEeR5KfoEr4xU5yHH7 = new TextPaint(1);

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final hgxXdWVkE1CPHCTwpz.KYHag8HRDlnO3X9zmZ f2073s3fjYDxWOUexjjVgyA = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public boolean f2071husNiw3snxdgZPAGJm = true;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public WeakReference f2069KYHag8HRDlnO3X9zmZ = new WeakReference(null);

    public class lEeR5KfoEr4xU5yHH7 extends hgxXdWVkE1CPHCTwpz.KYHag8HRDlnO3X9zmZ {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // hgxXdWVkE1CPHCTwpz.KYHag8HRDlnO3X9zmZ
        public void lEeR5KfoEr4xU5yHH7(int i) {
            pbVGzGjWvY2LDXC8vo.this.f2071husNiw3snxdgZPAGJm = true;
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) pbVGzGjWvY2LDXC8vo.this.f2069KYHag8HRDlnO3X9zmZ.get();
            if (s3fjydxwouexjjvgya != null) {
                s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7();
            }
        }

        @Override // hgxXdWVkE1CPHCTwpz.KYHag8HRDlnO3X9zmZ
        public void s3fjYDxWOUexjjVgyA(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            pbVGzGjWvY2LDXC8vo.this.f2071husNiw3snxdgZPAGJm = true;
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) pbVGzGjWvY2LDXC8vo.this.f2069KYHag8HRDlnO3X9zmZ.get();
            if (s3fjydxwouexjjvgya != null) {
                s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7();
            }
        }
    }

    public interface s3fjYDxWOUexjjVgyA {
        int[] getState();

        void lEeR5KfoEr4xU5yHH7();

        boolean onStateChange(int[] iArr);
    }

    public pbVGzGjWvY2LDXC8vo(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        pbVGzGjWvY2LDXC8vo(s3fjydxwouexjjvgya);
    }

    public void Acstmh57AKoSEkEFNJ(hgxXdWVkE1CPHCTwpz.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, Context context) {
        if (this.f2070TCyPEKSzIyweCN5yp1 != zzkhbgvufsk4aex3r0) {
            this.f2070TCyPEKSzIyweCN5yp1 = zzkhbgvufsk4aex3r0;
            if (zzkhbgvufsk4aex3r0 != null) {
                zzkhbgvufsk4aex3r0.aPyGSIylzVNKPT1Bls(context, this.f2072lEeR5KfoEr4xU5yHH7, this.f2073s3fjYDxWOUexjjVgyA);
                s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) this.f2069KYHag8HRDlnO3X9zmZ.get();
                if (s3fjydxwouexjjvgya != null) {
                    this.f2072lEeR5KfoEr4xU5yHH7.drawableState = s3fjydxwouexjjvgya.getState();
                }
                zzkhbgvufsk4aex3r0.hoXrIDAFrSwfShk8da(context, this.f2072lEeR5KfoEr4xU5yHH7, this.f2073s3fjYDxWOUexjjVgyA);
                this.f2071husNiw3snxdgZPAGJm = true;
            }
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2 = (s3fjYDxWOUexjjVgyA) this.f2069KYHag8HRDlnO3X9zmZ.get();
            if (s3fjydxwouexjjvgya2 != null) {
                s3fjydxwouexjjvgya2.lEeR5KfoEr4xU5yHH7();
                s3fjydxwouexjjvgya2.onStateChange(s3fjydxwouexjjvgya2.getState());
            }
        }
    }

    public final float HJFh0TGMpafqLE9haL(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f2072lEeR5KfoEr4xU5yHH7.getFontMetrics().ascent);
    }

    public final void IPyIQcaNa8aB7drBED(String str) {
        this.f2068HJFh0TGMpafqLE9haL = zZKhbgvUfsK4AEX3r0(str);
        this.f2074zZKhbgvUfsK4AEX3r0 = HJFh0TGMpafqLE9haL(str);
        this.f2071husNiw3snxdgZPAGJm = false;
    }

    public TextPaint KYHag8HRDlnO3X9zmZ() {
        return this.f2072lEeR5KfoEr4xU5yHH7;
    }

    public float TCyPEKSzIyweCN5yp1(String str) {
        if (!this.f2071husNiw3snxdgZPAGJm) {
            return this.f2068HJFh0TGMpafqLE9haL;
        }
        IPyIQcaNa8aB7drBED(str);
        return this.f2068HJFh0TGMpafqLE9haL;
    }

    public void Z9WdNiOsPR0y54zHW4(boolean z) {
        this.f2071husNiw3snxdgZPAGJm = z;
    }

    public void e54J8UWNHWALQNixXM(Context context) {
        this.f2070TCyPEKSzIyweCN5yp1.hoXrIDAFrSwfShk8da(context, this.f2072lEeR5KfoEr4xU5yHH7, this.f2073s3fjYDxWOUexjjVgyA);
    }

    public hgxXdWVkE1CPHCTwpz.zZKhbgvUfsK4AEX3r0 husNiw3snxdgZPAGJm() {
        return this.f2070TCyPEKSzIyweCN5yp1;
    }

    public void pbVGzGjWvY2LDXC8vo(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        this.f2069KYHag8HRDlnO3X9zmZ = new WeakReference(s3fjydxwouexjjvgya);
    }

    public final float zZKhbgvUfsK4AEX3r0(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f2072lEeR5KfoEr4xU5yHH7.measureText(charSequence, 0, charSequence.length());
    }
}
