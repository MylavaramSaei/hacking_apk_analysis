package zZKhbgvUfsK4AEX3r0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 extends Drawable implements Drawable.Callback {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public Drawable f7590lEeR5KfoEr4xU5yHH7;

    public lEeR5KfoEr4xU5yHH7(Drawable drawable) {
        lEeR5KfoEr4xU5yHH7(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f7590lEeR5KfoEr4xU5yHH7.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f7590lEeR5KfoEr4xU5yHH7.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f7590lEeR5KfoEr4xU5yHH7.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f7590lEeR5KfoEr4xU5yHH7.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f7590lEeR5KfoEr4xU5yHH7.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f7590lEeR5KfoEr4xU5yHH7.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f7590lEeR5KfoEr4xU5yHH7.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f7590lEeR5KfoEr4xU5yHH7.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f7590lEeR5KfoEr4xU5yHH7.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f7590lEeR5KfoEr4xU5yHH7.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f7590lEeR5KfoEr4xU5yHH7.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(this.f7590lEeR5KfoEr4xU5yHH7);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f7590lEeR5KfoEr4xU5yHH7.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f7590lEeR5KfoEr4xU5yHH7.jumpToCurrentState();
    }

    public void lEeR5KfoEr4xU5yHH7(Drawable drawable) {
        Drawable drawable2 = this.f7590lEeR5KfoEr4xU5yHH7;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f7590lEeR5KfoEr4xU5yHH7 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f7590lEeR5KfoEr4xU5yHH7.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.f7590lEeR5KfoEr4xU5yHH7.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f7590lEeR5KfoEr4xU5yHH7.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(this.f7590lEeR5KfoEr4xU5yHH7, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f7590lEeR5KfoEr4xU5yHH7.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7590lEeR5KfoEr4xU5yHH7.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f7590lEeR5KfoEr4xU5yHH7.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f7590lEeR5KfoEr4xU5yHH7.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(this.f7590lEeR5KfoEr4xU5yHH7, f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(this.f7590lEeR5KfoEr4xU5yHH7, i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f7590lEeR5KfoEr4xU5yHH7.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(this.f7590lEeR5KfoEr4xU5yHH7, i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(this.f7590lEeR5KfoEr4xU5yHH7, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(this.f7590lEeR5KfoEr4xU5yHH7, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f7590lEeR5KfoEr4xU5yHH7.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
