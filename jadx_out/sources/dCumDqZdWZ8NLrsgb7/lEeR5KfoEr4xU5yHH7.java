package dCumDqZdWZ8NLrsgb7;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1;
import ayaSAlBnO403UB0TMR.Z9WdNiOsPR0y54zHW4;
import ayaSAlBnO403UB0TMR.hoXrIDAFrSwfShk8da;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 extends Drawable implements hoXrIDAFrSwfShk8da {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public s3fjYDxWOUexjjVgyA f5609lEeR5KfoEr4xU5yHH7;

    public static final class s3fjYDxWOUexjjVgyA extends Drawable.ConstantState {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public TCyPEKSzIyweCN5yp1 f5610lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public boolean f5611s3fjYDxWOUexjjVgyA;

        public s3fjYDxWOUexjjVgyA(TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1) {
            this.f5610lEeR5KfoEr4xU5yHH7 = tCyPEKSzIyweCN5yp1;
            this.f5611s3fjYDxWOUexjjVgyA = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public lEeR5KfoEr4xU5yHH7 newDrawable() {
            return new lEeR5KfoEr4xU5yHH7(new s3fjYDxWOUexjjVgyA(this));
        }

        public s3fjYDxWOUexjjVgyA(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            this.f5610lEeR5KfoEr4xU5yHH7 = (TCyPEKSzIyweCN5yp1) s3fjydxwouexjjvgya.f5610lEeR5KfoEr4xU5yHH7.getConstantState().newDrawable();
            this.f5611s3fjYDxWOUexjjVgyA = s3fjydxwouexjjvgya.f5611s3fjYDxWOUexjjVgyA;
        }
    }

    public lEeR5KfoEr4xU5yHH7(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
        this(new s3fjYDxWOUexjjVgyA(new TCyPEKSzIyweCN5yp1(z9WdNiOsPR0y54zHW4)));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = this.f5609lEeR5KfoEr4xU5yHH7;
        if (s3fjydxwouexjjvgya.f5611s3fjYDxWOUexjjVgyA) {
            s3fjydxwouexjjvgya.f5610lEeR5KfoEr4xU5yHH7.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5609lEeR5KfoEr4xU5yHH7;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f5609lEeR5KfoEr4xU5yHH7.f5610lEeR5KfoEr4xU5yHH7.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
    public lEeR5KfoEr4xU5yHH7 mutate() {
        this.f5609lEeR5KfoEr4xU5yHH7 = new s3fjYDxWOUexjjVgyA(this.f5609lEeR5KfoEr4xU5yHH7);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5609lEeR5KfoEr4xU5yHH7.f5610lEeR5KfoEr4xU5yHH7.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f5609lEeR5KfoEr4xU5yHH7.f5610lEeR5KfoEr4xU5yHH7.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zS3fjYDxWOUexjjVgyA = dCumDqZdWZ8NLrsgb7.s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(iArr);
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = this.f5609lEeR5KfoEr4xU5yHH7;
        if (s3fjydxwouexjjvgya.f5611s3fjYDxWOUexjjVgyA == zS3fjYDxWOUexjjVgyA) {
            return zOnStateChange;
        }
        s3fjydxwouexjjvgya.f5611s3fjYDxWOUexjjVgyA = zS3fjYDxWOUexjjVgyA;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f5609lEeR5KfoEr4xU5yHH7.f5610lEeR5KfoEr4xU5yHH7.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5609lEeR5KfoEr4xU5yHH7.f5610lEeR5KfoEr4xU5yHH7.setColorFilter(colorFilter);
    }

    @Override // ayaSAlBnO403UB0TMR.hoXrIDAFrSwfShk8da
    public void setShapeAppearanceModel(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
        this.f5609lEeR5KfoEr4xU5yHH7.f5610lEeR5KfoEr4xU5yHH7.setShapeAppearanceModel(z9WdNiOsPR0y54zHW4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        this.f5609lEeR5KfoEr4xU5yHH7.f5610lEeR5KfoEr4xU5yHH7.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f5609lEeR5KfoEr4xU5yHH7.f5610lEeR5KfoEr4xU5yHH7.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f5609lEeR5KfoEr4xU5yHH7.f5610lEeR5KfoEr4xU5yHH7.setTintMode(mode);
    }

    public lEeR5KfoEr4xU5yHH7(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        this.f5609lEeR5KfoEr4xU5yHH7 = s3fjydxwouexjjvgya;
    }
}
