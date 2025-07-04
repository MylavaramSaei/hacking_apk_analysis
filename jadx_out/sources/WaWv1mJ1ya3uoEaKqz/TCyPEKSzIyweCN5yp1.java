package WaWv1mJ1ya3uoEaKqz;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class TCyPEKSzIyweCN5yp1 {

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public static final int f1971hoXrIDAFrSwfShk8da = 1;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f1973HJFh0TGMpafqLE9haL;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public boolean f1979e54J8UWNHWALQNixXM;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int f1980husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public CharSequence f1981lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final TextPaint f1983s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f1984zZKhbgvUfsK4AEX3r0 = 0;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public Layout.Alignment f1975KYHag8HRDlnO3X9zmZ = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public int f1977TCyPEKSzIyweCN5yp1 = Integer.MAX_VALUE;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public float f1974IPyIQcaNa8aB7drBED = 0.0f;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public float f1982pbVGzGjWvY2LDXC8vo = 1.0f;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public int f1972Acstmh57AKoSEkEFNJ = f1971hoXrIDAFrSwfShk8da;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public boolean f1978Z9WdNiOsPR0y54zHW4 = true;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public TextUtils.TruncateAt f1976T9PhQIpGRhE4yZDm1C = null;

    public static class lEeR5KfoEr4xU5yHH7 extends Exception {
    }

    public TCyPEKSzIyweCN5yp1(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f1981lEeR5KfoEr4xU5yHH7 = charSequence;
        this.f1983s3fjYDxWOUexjjVgyA = textPaint;
        this.f1973HJFh0TGMpafqLE9haL = i;
        this.f1980husNiw3snxdgZPAGJm = charSequence.length();
    }

    public static TCyPEKSzIyweCN5yp1 s3fjYDxWOUexjjVgyA(CharSequence charSequence, TextPaint textPaint, int i) {
        return new TCyPEKSzIyweCN5yp1(charSequence, textPaint, i);
    }

    public TCyPEKSzIyweCN5yp1 HJFh0TGMpafqLE9haL(Layout.Alignment alignment) {
        this.f1975KYHag8HRDlnO3X9zmZ = alignment;
        return this;
    }

    public TCyPEKSzIyweCN5yp1 IPyIQcaNa8aB7drBED(float f, float f2) {
        this.f1974IPyIQcaNa8aB7drBED = f;
        this.f1982pbVGzGjWvY2LDXC8vo = f2;
        return this;
    }

    public TCyPEKSzIyweCN5yp1 KYHag8HRDlnO3X9zmZ(boolean z) {
        this.f1978Z9WdNiOsPR0y54zHW4 = z;
        return this;
    }

    public TCyPEKSzIyweCN5yp1 TCyPEKSzIyweCN5yp1(boolean z) {
        this.f1979e54J8UWNHWALQNixXM = z;
        return this;
    }

    public TCyPEKSzIyweCN5yp1 husNiw3snxdgZPAGJm(int i) {
        this.f1972Acstmh57AKoSEkEFNJ = i;
        return this;
    }

    public StaticLayout lEeR5KfoEr4xU5yHH7() {
        if (this.f1981lEeR5KfoEr4xU5yHH7 == null) {
            this.f1981lEeR5KfoEr4xU5yHH7 = "";
        }
        int iMax = Math.max(0, this.f1973HJFh0TGMpafqLE9haL);
        CharSequence charSequenceEllipsize = this.f1981lEeR5KfoEr4xU5yHH7;
        if (this.f1977TCyPEKSzIyweCN5yp1 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f1983s3fjYDxWOUexjjVgyA, iMax, this.f1976T9PhQIpGRhE4yZDm1C);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f1980husNiw3snxdgZPAGJm);
        this.f1980husNiw3snxdgZPAGJm = iMin;
        if (this.f1979e54J8UWNHWALQNixXM && this.f1977TCyPEKSzIyweCN5yp1 == 1) {
            this.f1975KYHag8HRDlnO3X9zmZ = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f1984zZKhbgvUfsK4AEX3r0, iMin, this.f1983s3fjYDxWOUexjjVgyA, iMax);
        builderObtain.setAlignment(this.f1975KYHag8HRDlnO3X9zmZ);
        builderObtain.setIncludePad(this.f1978Z9WdNiOsPR0y54zHW4);
        builderObtain.setTextDirection(this.f1979e54J8UWNHWALQNixXM ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f1976T9PhQIpGRhE4yZDm1C;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f1977TCyPEKSzIyweCN5yp1);
        float f = this.f1974IPyIQcaNa8aB7drBED;
        if (f != 0.0f || this.f1982pbVGzGjWvY2LDXC8vo != 1.0f) {
            builderObtain.setLineSpacing(f, this.f1982pbVGzGjWvY2LDXC8vo);
        }
        if (this.f1977TCyPEKSzIyweCN5yp1 > 1) {
            builderObtain.setHyphenationFrequency(this.f1972Acstmh57AKoSEkEFNJ);
        }
        return builderObtain.build();
    }

    public TCyPEKSzIyweCN5yp1 pbVGzGjWvY2LDXC8vo(int i) {
        this.f1977TCyPEKSzIyweCN5yp1 = i;
        return this;
    }

    public TCyPEKSzIyweCN5yp1 zZKhbgvUfsK4AEX3r0(TextUtils.TruncateAt truncateAt) {
        this.f1976T9PhQIpGRhE4yZDm1C = truncateAt;
        return this;
    }

    public TCyPEKSzIyweCN5yp1 Acstmh57AKoSEkEFNJ(IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED) {
        return this;
    }
}
