package XzJ1BS7H9Ilbkv4eVM;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class e54J8UWNHWALQNixXM implements Spannable {

    public static final class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final int f2119HJFh0TGMpafqLE9haL;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public final PrecomputedText.Params f2120husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final TextPaint f2121lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final TextDirectionHeuristic f2122s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final int f2123zZKhbgvUfsK4AEX3r0;

        /* renamed from: XzJ1BS7H9Ilbkv4eVM.e54J8UWNHWALQNixXM$lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
        public static class C0028lEeR5KfoEr4xU5yHH7 {

            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
            public final TextPaint f2125lEeR5KfoEr4xU5yHH7;

            /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
            public int f2124HJFh0TGMpafqLE9haL = 1;

            /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
            public int f2127zZKhbgvUfsK4AEX3r0 = 1;

            /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
            public TextDirectionHeuristic f2126s3fjYDxWOUexjjVgyA = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0028lEeR5KfoEr4xU5yHH7(TextPaint textPaint) {
                this.f2125lEeR5KfoEr4xU5yHH7 = textPaint;
            }

            public C0028lEeR5KfoEr4xU5yHH7 HJFh0TGMpafqLE9haL(int i) {
                this.f2127zZKhbgvUfsK4AEX3r0 = i;
                return this;
            }

            public lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH7() {
                return new lEeR5KfoEr4xU5yHH7(this.f2125lEeR5KfoEr4xU5yHH7, this.f2126s3fjYDxWOUexjjVgyA, this.f2124HJFh0TGMpafqLE9haL, this.f2127zZKhbgvUfsK4AEX3r0);
            }

            public C0028lEeR5KfoEr4xU5yHH7 s3fjYDxWOUexjjVgyA(int i) {
                this.f2124HJFh0TGMpafqLE9haL = i;
                return this;
            }

            public C0028lEeR5KfoEr4xU5yHH7 zZKhbgvUfsK4AEX3r0(TextDirectionHeuristic textDirectionHeuristic) {
                this.f2126s3fjYDxWOUexjjVgyA = textDirectionHeuristic;
                return this;
            }
        }

        public lEeR5KfoEr4xU5yHH7(PrecomputedText.Params params) {
            this.f2121lEeR5KfoEr4xU5yHH7 = params.getTextPaint();
            this.f2122s3fjYDxWOUexjjVgyA = params.getTextDirection();
            this.f2119HJFh0TGMpafqLE9haL = params.getBreakStrategy();
            this.f2123zZKhbgvUfsK4AEX3r0 = params.getHyphenationFrequency();
            this.f2120husNiw3snxdgZPAGJm = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public int HJFh0TGMpafqLE9haL() {
            return this.f2123zZKhbgvUfsK4AEX3r0;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof lEeR5KfoEr4xU5yHH7)) {
                return false;
            }
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (lEeR5KfoEr4xU5yHH7) obj;
            return lEeR5KfoEr4xU5yHH7(leer5kfoer4xu5yhh7) && this.f2122s3fjYDxWOUexjjVgyA == leer5kfoer4xu5yhh7.zZKhbgvUfsK4AEX3r0();
        }

        public int hashCode() {
            return tXWeW0sqVddf7ZBflq.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(Float.valueOf(this.f2121lEeR5KfoEr4xU5yHH7.getTextSize()), Float.valueOf(this.f2121lEeR5KfoEr4xU5yHH7.getTextScaleX()), Float.valueOf(this.f2121lEeR5KfoEr4xU5yHH7.getTextSkewX()), Float.valueOf(this.f2121lEeR5KfoEr4xU5yHH7.getLetterSpacing()), Integer.valueOf(this.f2121lEeR5KfoEr4xU5yHH7.getFlags()), this.f2121lEeR5KfoEr4xU5yHH7.getTextLocales(), this.f2121lEeR5KfoEr4xU5yHH7.getTypeface(), Boolean.valueOf(this.f2121lEeR5KfoEr4xU5yHH7.isElegantTextHeight()), this.f2122s3fjYDxWOUexjjVgyA, Integer.valueOf(this.f2119HJFh0TGMpafqLE9haL), Integer.valueOf(this.f2123zZKhbgvUfsK4AEX3r0));
        }

        public TextPaint husNiw3snxdgZPAGJm() {
            return this.f2121lEeR5KfoEr4xU5yHH7;
        }

        public boolean lEeR5KfoEr4xU5yHH7(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            if (this.f2119HJFh0TGMpafqLE9haL == leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA() && this.f2123zZKhbgvUfsK4AEX3r0 == leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL() && this.f2121lEeR5KfoEr4xU5yHH7.getTextSize() == leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm().getTextSize() && this.f2121lEeR5KfoEr4xU5yHH7.getTextScaleX() == leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm().getTextScaleX() && this.f2121lEeR5KfoEr4xU5yHH7.getTextSkewX() == leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm().getTextSkewX() && this.f2121lEeR5KfoEr4xU5yHH7.getLetterSpacing() == leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm().getLetterSpacing() && TextUtils.equals(this.f2121lEeR5KfoEr4xU5yHH7.getFontFeatureSettings(), leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm().getFontFeatureSettings()) && this.f2121lEeR5KfoEr4xU5yHH7.getFlags() == leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm().getFlags() && this.f2121lEeR5KfoEr4xU5yHH7.getTextLocales().equals(leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm().getTextLocales())) {
                return this.f2121lEeR5KfoEr4xU5yHH7.getTypeface() == null ? leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm().getTypeface() == null : this.f2121lEeR5KfoEr4xU5yHH7.getTypeface().equals(leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm().getTypeface());
            }
            return false;
        }

        public int s3fjYDxWOUexjjVgyA() {
            return this.f2119HJFh0TGMpafqLE9haL;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f2121lEeR5KfoEr4xU5yHH7.getTextSize());
            sb.append(", textScaleX=" + this.f2121lEeR5KfoEr4xU5yHH7.getTextScaleX());
            sb.append(", textSkewX=" + this.f2121lEeR5KfoEr4xU5yHH7.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f2121lEeR5KfoEr4xU5yHH7.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f2121lEeR5KfoEr4xU5yHH7.isElegantTextHeight());
            sb.append(", textLocale=" + this.f2121lEeR5KfoEr4xU5yHH7.getTextLocales());
            sb.append(", typeface=" + this.f2121lEeR5KfoEr4xU5yHH7.getTypeface());
            if (i >= 26) {
                sb.append(", variationSettings=" + this.f2121lEeR5KfoEr4xU5yHH7.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f2122s3fjYDxWOUexjjVgyA);
            sb.append(", breakStrategy=" + this.f2119HJFh0TGMpafqLE9haL);
            sb.append(", hyphenationFrequency=" + this.f2123zZKhbgvUfsK4AEX3r0);
            sb.append("}");
            return sb.toString();
        }

        public TextDirectionHeuristic zZKhbgvUfsK4AEX3r0() {
            return this.f2122s3fjYDxWOUexjjVgyA;
        }

        public lEeR5KfoEr4xU5yHH7(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f2120husNiw3snxdgZPAGJm = Build.VERSION.SDK_INT >= 29 ? Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build() : null;
            this.f2121lEeR5KfoEr4xU5yHH7 = textPaint;
            this.f2122s3fjYDxWOUexjjVgyA = textDirectionHeuristic;
            this.f2119HJFh0TGMpafqLE9haL = i;
            this.f2123zZKhbgvUfsK4AEX3r0 = i2;
        }
    }
}
