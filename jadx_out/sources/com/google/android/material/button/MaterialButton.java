package com.google.android.material.button;

import IPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm;
import PPkm9uUfOJHHYveeLT.TCyPEKSzIyweCN5yp1;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.activity.zZKhbgvUfsK4AEX3r0;
import ayaSAlBnO403UB0TMR.IPyIQcaNa8aB7drBED;
import ayaSAlBnO403UB0TMR.Z9WdNiOsPR0y54zHW4;
import ayaSAlBnO403UB0TMR.hoXrIDAFrSwfShk8da;
import hgxXdWVkE1CPHCTwpz.HJFh0TGMpafqLE9haL;
import java.util.Iterator;
import java.util.LinkedHashSet;
import tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ;
import tmIBXGVvBsrJ7i63G2.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public class MaterialButton extends husNiw3snxdgZPAGJm implements Checkable, hoXrIDAFrSwfShk8da {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public String f4915Acstmh57AKoSEkEFNJ;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public ColorStateList f4916IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public lEeR5KfoEr4xU5yHH7 f4917KYHag8HRDlnO3X9zmZ;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public boolean f4918OANkd3mP6AYvwbNLJM;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public int f4919T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public PorterDuff.Mode f4920TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public int f4921Z9WdNiOsPR0y54zHW4;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public boolean f4922aPyGSIylzVNKPT1Bls;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public int f4923e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public int f4924hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final LinkedHashSet f4925husNiw3snxdgZPAGJm;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public Drawable f4926pbVGzGjWvY2LDXC8vo;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final PDw1hXOtArGjUqFgpT.lEeR5KfoEr4xU5yHH7 f4927zZKhbgvUfsK4AEX3r0;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public int f4928zaq8hOURtfwbcX17cG;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public static final int[] f4914sTkWmhpZ5b1ArQIw4K = {R.attr.state_checkable};

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public static final int[] f4913Y43RdunnpKgpbny0lE = {R.attr.state_checked};

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public static final int f4912R9SAhYMerGybF9OAjL = pbVGzGjWvY2LDXC8vo.f7163TCyPEKSzIyweCN5yp1;

    public interface lEeR5KfoEr4xU5yHH7 {
        void lEeR5KfoEr4xU5yHH7(MaterialButton materialButton, boolean z);
    }

    public static class s3fjYDxWOUexjjVgyA extends aAp6BD79BhftLCnuvf.lEeR5KfoEr4xU5yHH7 {
        public static final Parcelable.Creator<s3fjYDxWOUexjjVgyA> CREATOR = new lEeR5KfoEr4xU5yHH7();

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public boolean f4929HJFh0TGMpafqLE9haL;

        public class lEeR5KfoEr4xU5yHH7 implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
            public s3fjYDxWOUexjjVgyA[] newArray(int i) {
                return new s3fjYDxWOUexjjVgyA[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
            public s3fjYDxWOUexjjVgyA createFromParcel(Parcel parcel) {
                return new s3fjYDxWOUexjjVgyA(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
            public s3fjYDxWOUexjjVgyA createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new s3fjYDxWOUexjjVgyA(parcel, classLoader);
            }
        }

        public s3fjYDxWOUexjjVgyA(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            zZKhbgvUfsK4AEX3r0(parcel);
        }

        @Override // aAp6BD79BhftLCnuvf.lEeR5KfoEr4xU5yHH7, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4929HJFh0TGMpafqLE9haL ? 1 : 0);
        }

        public final void zZKhbgvUfsK4AEX3r0(Parcel parcel) {
            this.f4929HJFh0TGMpafqLE9haL = parcel.readInt() == 1;
        }

        public s3fjYDxWOUexjjVgyA(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7148hoXrIDAFrSwfShk8da);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean HJFh0TGMpafqLE9haL() {
        int i = this.f4928zaq8hOURtfwbcX17cG;
        return i == 1 || i == 2;
    }

    public final void IPyIQcaNa8aB7drBED(boolean z) {
        Drawable drawable = this.f4926pbVGzGjWvY2LDXC8vo;
        if (drawable != null) {
            Drawable drawableMutate = WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(drawable).mutate();
            this.f4926pbVGzGjWvY2LDXC8vo = drawableMutate;
            WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(drawableMutate, this.f4916IPyIQcaNa8aB7drBED);
            PorterDuff.Mode mode = this.f4920TCyPEKSzIyweCN5yp1;
            if (mode != null) {
                WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(this.f4926pbVGzGjWvY2LDXC8vo, mode);
            }
            int intrinsicWidth = this.f4921Z9WdNiOsPR0y54zHW4;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f4926pbVGzGjWvY2LDXC8vo.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f4921Z9WdNiOsPR0y54zHW4;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f4926pbVGzGjWvY2LDXC8vo.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f4926pbVGzGjWvY2LDXC8vo;
            int i = this.f4923e54J8UWNHWALQNixXM;
            int i2 = this.f4919T9PhQIpGRhE4yZDm1C;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f4926pbVGzGjWvY2LDXC8vo.setVisible(true, z);
        }
        if (z) {
            TCyPEKSzIyweCN5yp1();
            return;
        }
        Drawable[] drawableArrLEeR5KfoEr4xU5yHH7 = TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7(this);
        Drawable drawable3 = drawableArrLEeR5KfoEr4xU5yHH7[0];
        Drawable drawable4 = drawableArrLEeR5KfoEr4xU5yHH7[1];
        Drawable drawable5 = drawableArrLEeR5KfoEr4xU5yHH7[2];
        if ((!HJFh0TGMpafqLE9haL() || drawable3 == this.f4926pbVGzGjWvY2LDXC8vo) && ((!s3fjYDxWOUexjjVgyA() || drawable5 == this.f4926pbVGzGjWvY2LDXC8vo) && (!zZKhbgvUfsK4AEX3r0() || drawable4 == this.f4926pbVGzGjWvY2LDXC8vo))) {
            return;
        }
        TCyPEKSzIyweCN5yp1();
    }

    public final boolean KYHag8HRDlnO3X9zmZ() {
        PDw1hXOtArGjUqFgpT.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f4927zZKhbgvUfsK4AEX3r0;
        return (leer5kfoer4xu5yhh7 == null || leer5kfoer4xu5yhh7.aPyGSIylzVNKPT1Bls()) ? false : true;
    }

    public final void TCyPEKSzIyweCN5yp1() {
        if (HJFh0TGMpafqLE9haL()) {
            TCyPEKSzIyweCN5yp1.pbVGzGjWvY2LDXC8vo(this, this.f4926pbVGzGjWvY2LDXC8vo, null, null, null);
        } else if (s3fjYDxWOUexjjVgyA()) {
            TCyPEKSzIyweCN5yp1.pbVGzGjWvY2LDXC8vo(this, null, null, this.f4926pbVGzGjWvY2LDXC8vo, null);
        } else if (zZKhbgvUfsK4AEX3r0()) {
            TCyPEKSzIyweCN5yp1.pbVGzGjWvY2LDXC8vo(this, null, this.f4926pbVGzGjWvY2LDXC8vo, null, null);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f4915Acstmh57AKoSEkEFNJ)) {
            return (lEeR5KfoEr4xU5yHH7() ? CompoundButton.class : Button.class).getName();
        }
        return this.f4915Acstmh57AKoSEkEFNJ;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (KYHag8HRDlnO3X9zmZ()) {
            return this.f4927zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f4926pbVGzGjWvY2LDXC8vo;
    }

    public int getIconGravity() {
        return this.f4928zaq8hOURtfwbcX17cG;
    }

    public int getIconPadding() {
        return this.f4924hoXrIDAFrSwfShk8da;
    }

    public int getIconSize() {
        return this.f4921Z9WdNiOsPR0y54zHW4;
    }

    public ColorStateList getIconTint() {
        return this.f4916IPyIQcaNa8aB7drBED;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f4920TCyPEKSzIyweCN5yp1;
    }

    public int getInsetBottom() {
        return this.f4927zZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL();
    }

    public int getInsetTop() {
        return this.f4927zZKhbgvUfsK4AEX3r0.zZKhbgvUfsK4AEX3r0();
    }

    public ColorStateList getRippleColor() {
        if (KYHag8HRDlnO3X9zmZ()) {
            return this.f4927zZKhbgvUfsK4AEX3r0.IPyIQcaNa8aB7drBED();
        }
        return null;
    }

    public Z9WdNiOsPR0y54zHW4 getShapeAppearanceModel() {
        if (KYHag8HRDlnO3X9zmZ()) {
            return this.f4927zZKhbgvUfsK4AEX3r0.pbVGzGjWvY2LDXC8vo();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (KYHag8HRDlnO3X9zmZ()) {
            return this.f4927zZKhbgvUfsK4AEX3r0.Acstmh57AKoSEkEFNJ();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (KYHag8HRDlnO3X9zmZ()) {
            return this.f4927zZKhbgvUfsK4AEX3r0.Z9WdNiOsPR0y54zHW4();
        }
        return 0;
    }

    @Override // IPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm
    public ColorStateList getSupportBackgroundTintList() {
        return KYHag8HRDlnO3X9zmZ() ? this.f4927zZKhbgvUfsK4AEX3r0.e54J8UWNHWALQNixXM() : super.getSupportBackgroundTintList();
    }

    @Override // IPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return KYHag8HRDlnO3X9zmZ() ? this.f4927zZKhbgvUfsK4AEX3r0.T9PhQIpGRhE4yZDm1C() : super.getSupportBackgroundTintMode();
    }

    public final boolean husNiw3snxdgZPAGJm() {
        return lLKzvdU99Iw80uVD5I.A49QRPHynYLCBN0SqP(this) == 1;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f4922aPyGSIylzVNKPT1Bls;
    }

    public boolean lEeR5KfoEr4xU5yHH7() {
        PDw1hXOtArGjUqFgpT.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f4927zZKhbgvUfsK4AEX3r0;
        return leer5kfoer4xu5yhh7 != null && leer5kfoer4xu5yhh7.OANkd3mP6AYvwbNLJM();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (KYHag8HRDlnO3X9zmZ()) {
            IPyIQcaNa8aB7drBED.KYHag8HRDlnO3X9zmZ(this, this.f4927zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (lEeR5KfoEr4xU5yHH7()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4914sTkWmhpZ5b1ArQIw4K);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4913Y43RdunnpKgpbny0lE);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // IPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // IPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(lEeR5KfoEr4xU5yHH7());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // IPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        pbVGzGjWvY2LDXC8vo(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof s3fjYDxWOUexjjVgyA)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) parcelable;
        super.onRestoreInstanceState(s3fjydxwouexjjvgya.HJFh0TGMpafqLE9haL());
        setChecked(s3fjydxwouexjjvgya.f4929HJFh0TGMpafqLE9haL);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = new s3fjYDxWOUexjjVgyA(super.onSaveInstanceState());
        s3fjydxwouexjjvgya.f4929HJFh0TGMpafqLE9haL = this.f4922aPyGSIylzVNKPT1Bls;
        return s3fjydxwouexjjvgya;
    }

    @Override // IPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        pbVGzGjWvY2LDXC8vo(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void pbVGzGjWvY2LDXC8vo(int i, int i2) {
        if (this.f4926pbVGzGjWvY2LDXC8vo == null || getLayout() == null) {
            return;
        }
        if (!HJFh0TGMpafqLE9haL() && !s3fjYDxWOUexjjVgyA()) {
            if (zZKhbgvUfsK4AEX3r0()) {
                this.f4923e54J8UWNHWALQNixXM = 0;
                if (this.f4928zaq8hOURtfwbcX17cG == 16) {
                    this.f4919T9PhQIpGRhE4yZDm1C = 0;
                    IPyIQcaNa8aB7drBED(false);
                    return;
                }
                int intrinsicHeight = this.f4921Z9WdNiOsPR0y54zHW4;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f4926pbVGzGjWvY2LDXC8vo.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f4924hoXrIDAFrSwfShk8da) - getPaddingBottom()) / 2);
                if (this.f4919T9PhQIpGRhE4yZDm1C != iMax) {
                    this.f4919T9PhQIpGRhE4yZDm1C = iMax;
                    IPyIQcaNa8aB7drBED(false);
                }
                return;
            }
            return;
        }
        this.f4919T9PhQIpGRhE4yZDm1C = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i3 = this.f4928zaq8hOURtfwbcX17cG;
        if (i3 == 1 || i3 == 3 || ((i3 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i3 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f4923e54J8UWNHWALQNixXM = 0;
            IPyIQcaNa8aB7drBED(false);
            return;
        }
        int intrinsicWidth = this.f4921Z9WdNiOsPR0y54zHW4;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f4926pbVGzGjWvY2LDXC8vo.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - lLKzvdU99Iw80uVD5I.ao3wqKm5CXFuvC0q47(this)) - intrinsicWidth) - this.f4924hoXrIDAFrSwfShk8da) - lLKzvdU99Iw80uVD5I.OUd9THiLjZndMj0qdF(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (husNiw3snxdgZPAGJm() != (this.f4928zaq8hOURtfwbcX17cG == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f4923e54J8UWNHWALQNixXM != textLayoutWidth) {
            this.f4923e54J8UWNHWALQNixXM = textLayoutWidth;
            IPyIQcaNa8aB7drBED(false);
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f4927zZKhbgvUfsK4AEX3r0.zaq8hOURtfwbcX17cG()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f4926pbVGzGjWvY2LDXC8vo != null) {
            if (this.f4926pbVGzGjWvY2LDXC8vo.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public final boolean s3fjYDxWOUexjjVgyA() {
        int i = this.f4928zaq8hOURtfwbcX17cG;
        return i == 3 || i == 4;
    }

    public void setA11yClassName(String str) {
        this.f4915Acstmh57AKoSEkEFNJ = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (KYHag8HRDlnO3X9zmZ()) {
            this.f4927zZKhbgvUfsK4AEX3r0.Y43RdunnpKgpbny0lE(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // IPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (KYHag8HRDlnO3X9zmZ()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            } else {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f4927zZKhbgvUfsK4AEX3r0.R9SAhYMerGybF9OAjL();
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // IPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (KYHag8HRDlnO3X9zmZ()) {
            this.f4927zZKhbgvUfsK4AEX3r0.G7AC3DWIx9i9fdanjk(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (lEeR5KfoEr4xU5yHH7() && isEnabled() && this.f4922aPyGSIylzVNKPT1Bls != z) {
            this.f4922aPyGSIylzVNKPT1Bls = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).T9PhQIpGRhE4yZDm1C(this, this.f4922aPyGSIylzVNKPT1Bls);
            }
            if (this.f4918OANkd3mP6AYvwbNLJM) {
                return;
            }
            this.f4918OANkd3mP6AYvwbNLJM = true;
            Iterator it = this.f4925husNiw3snxdgZPAGJm.iterator();
            if (it.hasNext()) {
                zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(it.next());
                throw null;
            }
            this.f4918OANkd3mP6AYvwbNLJM = false;
        }
    }

    public void setCornerRadius(int i) {
        if (KYHag8HRDlnO3X9zmZ()) {
            this.f4927zZKhbgvUfsK4AEX3r0.xHA29AmDt6y96AnB3t(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (KYHag8HRDlnO3X9zmZ()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (KYHag8HRDlnO3X9zmZ()) {
            this.f4927zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ().zcy2NNbtVXgoGQbfuq(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f4926pbVGzGjWvY2LDXC8vo != drawable) {
            this.f4926pbVGzGjWvY2LDXC8vo = drawable;
            IPyIQcaNa8aB7drBED(true);
            pbVGzGjWvY2LDXC8vo(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f4928zaq8hOURtfwbcX17cG != i) {
            this.f4928zaq8hOURtfwbcX17cG = i;
            pbVGzGjWvY2LDXC8vo(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f4924hoXrIDAFrSwfShk8da != i) {
            this.f4924hoXrIDAFrSwfShk8da = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f4921Z9WdNiOsPR0y54zHW4 != i) {
            this.f4921Z9WdNiOsPR0y54zHW4 = i;
            IPyIQcaNa8aB7drBED(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f4916IPyIQcaNa8aB7drBED != colorStateList) {
            this.f4916IPyIQcaNa8aB7drBED = colorStateList;
            IPyIQcaNa8aB7drBED(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f4920TCyPEKSzIyweCN5yp1 != mode) {
            this.f4920TCyPEKSzIyweCN5yp1 = mode;
            IPyIQcaNa8aB7drBED(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.f4927zZKhbgvUfsK4AEX3r0.LIMtzhnLwQyigzK0KO(i);
    }

    public void setInsetTop(int i) {
        this.f4927zZKhbgvUfsK4AEX3r0.A49QRPHynYLCBN0SqP(i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f4917KYHag8HRDlnO3X9zmZ = leer5kfoer4xu5yhh7;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f4917KYHag8HRDlnO3X9zmZ;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (KYHag8HRDlnO3X9zmZ()) {
            this.f4927zZKhbgvUfsK4AEX3r0.VItLRw50eXTZeEfGl0(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (KYHag8HRDlnO3X9zmZ()) {
            setRippleColor(HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(getContext(), i));
        }
    }

    @Override // ayaSAlBnO403UB0TMR.hoXrIDAFrSwfShk8da
    public void setShapeAppearanceModel(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
        if (!KYHag8HRDlnO3X9zmZ()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f4927zZKhbgvUfsK4AEX3r0.WWC27LAMFqFFBzfbNw(z9WdNiOsPR0y54zHW4);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (KYHag8HRDlnO3X9zmZ()) {
            this.f4927zZKhbgvUfsK4AEX3r0.THTDvPxsHqMeGb512f(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (KYHag8HRDlnO3X9zmZ()) {
            this.f4927zZKhbgvUfsK4AEX3r0.ao3wqKm5CXFuvC0q47(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (KYHag8HRDlnO3X9zmZ()) {
            setStrokeColor(HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (KYHag8HRDlnO3X9zmZ()) {
            this.f4927zZKhbgvUfsK4AEX3r0.OUd9THiLjZndMj0qdF(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (KYHag8HRDlnO3X9zmZ()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // IPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (KYHag8HRDlnO3X9zmZ()) {
            this.f4927zZKhbgvUfsK4AEX3r0.jCtUeU2YI1poCxWcjm(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // IPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (KYHag8HRDlnO3X9zmZ()) {
            this.f4927zZKhbgvUfsK4AEX3r0.XzJ1BS7H9Ilbkv4eVM(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        pbVGzGjWvY2LDXC8vo(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f4927zZKhbgvUfsK4AEX3r0.tXWeW0sqVddf7ZBflq(z);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f4922aPyGSIylzVNKPT1Bls);
    }

    public final boolean zZKhbgvUfsK4AEX3r0() {
        int i = this.f4928zaq8hOURtfwbcX17cG;
        return i == 16 || i == 32;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = f4912R9SAhYMerGybF9OAjL;
        super(gpnYwZkFpQwu7zi2gb.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(context, attributeSet, i, i2), attributeSet, i);
        this.f4925husNiw3snxdgZPAGJm = new LinkedHashSet();
        this.f4922aPyGSIylzVNKPT1Bls = false;
        this.f4918OANkd3mP6AYvwbNLJM = false;
        Context context2 = getContext();
        TypedArray typedArrayIPyIQcaNa8aB7drBED = WaWv1mJ1ya3uoEaKqz.Z9WdNiOsPR0y54zHW4.IPyIQcaNa8aB7drBED(context2, attributeSet, Acstmh57AKoSEkEFNJ.f6846F8je6vTkTMHm5WbjEC, i, i2, new int[0]);
        this.f4924hoXrIDAFrSwfShk8da = typedArrayIPyIQcaNa8aB7drBED.getDimensionPixelSize(Acstmh57AKoSEkEFNJ.f6836ADbagDwlO3sAb2p0ry, 0);
        this.f4920TCyPEKSzIyweCN5yp1 = WaWv1mJ1ya3uoEaKqz.hoXrIDAFrSwfShk8da.pbVGzGjWvY2LDXC8vo(typedArrayIPyIQcaNa8aB7drBED.getInt(Acstmh57AKoSEkEFNJ.EgmJdc4h5OU4spuEKW, -1), PorterDuff.Mode.SRC_IN);
        this.f4916IPyIQcaNa8aB7drBED = HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(getContext(), typedArrayIPyIQcaNa8aB7drBED, Acstmh57AKoSEkEFNJ.mhQSzVvPFnByVGnwX9);
        this.f4926pbVGzGjWvY2LDXC8vo = HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(getContext(), typedArrayIPyIQcaNa8aB7drBED, Acstmh57AKoSEkEFNJ.f6904YUDx3zHgOZWWxq2Qgs);
        this.f4928zaq8hOURtfwbcX17cG = typedArrayIPyIQcaNa8aB7drBED.getInteger(Acstmh57AKoSEkEFNJ.f6969pjij9fAFhRRn230kOs, 1);
        this.f4921Z9WdNiOsPR0y54zHW4 = typedArrayIPyIQcaNa8aB7drBED.getDimensionPixelSize(Acstmh57AKoSEkEFNJ.f6960njV42vQJoqlfw05NNQ, 0);
        PDw1hXOtArGjUqFgpT.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new PDw1hXOtArGjUqFgpT.lEeR5KfoEr4xU5yHH7(this, Z9WdNiOsPR0y54zHW4.husNiw3snxdgZPAGJm(context2, attributeSet, i, i2).T9PhQIpGRhE4yZDm1C());
        this.f4927zZKhbgvUfsK4AEX3r0 = leer5kfoer4xu5yhh7;
        leer5kfoer4xu5yhh7.sTkWmhpZ5b1ArQIw4K(typedArrayIPyIQcaNa8aB7drBED);
        typedArrayIPyIQcaNa8aB7drBED.recycle();
        setCompoundDrawablePadding(this.f4924hoXrIDAFrSwfShk8da);
        IPyIQcaNa8aB7drBED(this.f4926pbVGzGjWvY2LDXC8vo != null);
    }
}
