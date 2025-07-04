package auvQiDfBN48eRz3fFq;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1;

/* loaded from: classes.dex */
public abstract class IPyIQcaNa8aB7drBED extends ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 {

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public s3fjYDxWOUexjjVgyA f4421WWC27LAMFqFFBzfbNw;

    public static class HJFh0TGMpafqLE9haL extends IPyIQcaNa8aB7drBED {
        public HJFh0TGMpafqLE9haL(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            super(s3fjydxwouexjjvgya);
        }

        @Override // ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1
        public void sTkWmhpZ5b1ArQIw4K(Canvas canvas) {
            if (this.f4421WWC27LAMFqFFBzfbNw.f4422LIMtzhnLwQyigzK0KO.isEmpty()) {
                super.sTkWmhpZ5b1ArQIw4K(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f4421WWC27LAMFqFFBzfbNw.f4422LIMtzhnLwQyigzK0KO);
            } else {
                canvas.clipRect(this.f4421WWC27LAMFqFFBzfbNw.f4422LIMtzhnLwQyigzK0KO, Region.Op.DIFFERENCE);
            }
            super.sTkWmhpZ5b1ArQIw4K(canvas);
            canvas.restore();
        }
    }

    public IPyIQcaNa8aB7drBED(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        super(s3fjydxwouexjjvgya);
        this.f4421WWC27LAMFqFFBzfbNw = s3fjydxwouexjjvgya;
    }

    public static IPyIQcaNa8aB7drBED Kh0uC90qEEhuLdpgB9(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        return new HJFh0TGMpafqLE9haL(s3fjydxwouexjjvgya);
    }

    public static IPyIQcaNa8aB7drBED Pum9NZyDBKoCnecvlx(ayaSAlBnO403UB0TMR.Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
        if (z9WdNiOsPR0y54zHW4 == null) {
            z9WdNiOsPR0y54zHW4 = new ayaSAlBnO403UB0TMR.Z9WdNiOsPR0y54zHW4();
        }
        return Kh0uC90qEEhuLdpgB9(new s3fjYDxWOUexjjVgyA(z9WdNiOsPR0y54zHW4, new RectF()));
    }

    public boolean ctWLFN70QQINH1kyYo() {
        return !this.f4421WWC27LAMFqFFBzfbNw.f4422LIMtzhnLwQyigzK0KO.isEmpty();
    }

    public void eWK41qw3g36LVd4UnS(RectF rectF) {
        zXY7dgnTfw9Pd9RXel(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public void jocVUfxESVhVJU8LoH() {
        zXY7dgnTfw9Pd9RXel(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f4421WWC27LAMFqFFBzfbNw = new s3fjYDxWOUexjjVgyA(this.f4421WWC27LAMFqFFBzfbNw);
        return this;
    }

    public void zXY7dgnTfw9Pd9RXel(float f, float f2, float f3, float f4) {
        if (f == this.f4421WWC27LAMFqFFBzfbNw.f4422LIMtzhnLwQyigzK0KO.left && f2 == this.f4421WWC27LAMFqFFBzfbNw.f4422LIMtzhnLwQyigzK0KO.top && f3 == this.f4421WWC27LAMFqFFBzfbNw.f4422LIMtzhnLwQyigzK0KO.right && f4 == this.f4421WWC27LAMFqFFBzfbNw.f4422LIMtzhnLwQyigzK0KO.bottom) {
            return;
        }
        this.f4421WWC27LAMFqFFBzfbNw.f4422LIMtzhnLwQyigzK0KO.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public static final class s3fjYDxWOUexjjVgyA extends TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL {

        /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
        public final RectF f4422LIMtzhnLwQyigzK0KO;

        public s3fjYDxWOUexjjVgyA(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            super(s3fjydxwouexjjvgya);
            this.f4422LIMtzhnLwQyigzK0KO = s3fjydxwouexjjvgya.f4422LIMtzhnLwQyigzK0KO;
        }

        @Override // ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBEDKh0uC90qEEhuLdpgB9 = IPyIQcaNa8aB7drBED.Kh0uC90qEEhuLdpgB9(this);
            iPyIQcaNa8aB7drBEDKh0uC90qEEhuLdpgB9.invalidateSelf();
            return iPyIQcaNa8aB7drBEDKh0uC90qEEhuLdpgB9;
        }

        public s3fjYDxWOUexjjVgyA(ayaSAlBnO403UB0TMR.Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, RectF rectF) {
            super(z9WdNiOsPR0y54zHW4, null);
            this.f4422LIMtzhnLwQyigzK0KO = rectF;
        }
    }
}
