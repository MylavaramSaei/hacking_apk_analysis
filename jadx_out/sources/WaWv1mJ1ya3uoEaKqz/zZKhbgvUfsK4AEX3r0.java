package WaWv1mJ1ya3uoEaKqz;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* loaded from: classes.dex */
public abstract class zZKhbgvUfsK4AEX3r0 extends androidx.appcompat.widget.s3fjYDxWOUexjjVgyA {

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public boolean f2078G7AC3DWIx9i9fdanjk;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public Drawable f2079OANkd3mP6AYvwbNLJM;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public boolean f2080R9SAhYMerGybF9OAjL;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public int f2081Y43RdunnpKgpbny0lE;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public final Rect f2082sTkWmhpZ5b1ArQIw4K;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public final Rect f2083zaq8hOURtfwbcX17cG;

    public zZKhbgvUfsK4AEX3r0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2083zaq8hOURtfwbcX17cG = new Rect();
        this.f2082sTkWmhpZ5b1ArQIw4K = new Rect();
        this.f2081Y43RdunnpKgpbny0lE = 119;
        this.f2080R9SAhYMerGybF9OAjL = true;
        this.f2078G7AC3DWIx9i9fdanjk = false;
        TypedArray typedArrayIPyIQcaNa8aB7drBED = Z9WdNiOsPR0y54zHW4.IPyIQcaNa8aB7drBED(context, attributeSet, tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ.f6838BGBL3rAlNaaPWRbRlF, i, 0, new int[0]);
        this.f2081Y43RdunnpKgpbny0lE = typedArrayIPyIQcaNa8aB7drBED.getInt(tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ.f6944hUNDUI3oB5uci3ylnY, this.f2081Y43RdunnpKgpbny0lE);
        Drawable drawable = typedArrayIPyIQcaNa8aB7drBED.getDrawable(tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ.f6869LjVYrU4NjguFeQ2fwa);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f2080R9SAhYMerGybF9OAjL = typedArrayIPyIQcaNa8aB7drBED.getBoolean(tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ.f6871MecTLhJ95ynyqeEob1, true);
        typedArrayIPyIQcaNa8aB7drBED.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f2079OANkd3mP6AYvwbNLJM;
        if (drawable != null) {
            if (this.f2078G7AC3DWIx9i9fdanjk) {
                this.f2078G7AC3DWIx9i9fdanjk = false;
                Rect rect = this.f2083zaq8hOURtfwbcX17cG;
                Rect rect2 = this.f2082sTkWmhpZ5b1ArQIw4K;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f2080R9SAhYMerGybF9OAjL) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f2081Y43RdunnpKgpbny0lE, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f2079OANkd3mP6AYvwbNLJM;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2079OANkd3mP6AYvwbNLJM;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f2079OANkd3mP6AYvwbNLJM.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f2079OANkd3mP6AYvwbNLJM;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f2081Y43RdunnpKgpbny0lE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2079OANkd3mP6AYvwbNLJM;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.s3fjYDxWOUexjjVgyA, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f2078G7AC3DWIx9i9fdanjk = z | this.f2078G7AC3DWIx9i9fdanjk;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f2078G7AC3DWIx9i9fdanjk = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f2079OANkd3mP6AYvwbNLJM;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f2079OANkd3mP6AYvwbNLJM);
            }
            this.f2079OANkd3mP6AYvwbNLJM = drawable;
            this.f2078G7AC3DWIx9i9fdanjk = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f2081Y43RdunnpKgpbny0lE == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f2081Y43RdunnpKgpbny0lE != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f2081Y43RdunnpKgpbny0lE = i;
            if (i == 119 && this.f2079OANkd3mP6AYvwbNLJM != null) {
                this.f2079OANkd3mP6AYvwbNLJM.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2079OANkd3mP6AYvwbNLJM;
    }
}
