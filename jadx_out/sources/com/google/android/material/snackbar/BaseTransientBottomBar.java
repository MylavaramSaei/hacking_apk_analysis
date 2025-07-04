package com.google.android.material.snackbar;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import WaWv1mJ1ya3uoEaKqz.hoXrIDAFrSwfShk8da;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.zZKhbgvUfsK4AEX3r0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1;
import ayaSAlBnO403UB0TMR.Z9WdNiOsPR0y54zHW4;
import com.google.android.material.behavior.SwipeDismissBehavior;
import tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ;

/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final TimeInterpolator f5293lEeR5KfoEr4xU5yHH7 = jsjSYEu4NPZjZxcfmI.lEeR5KfoEr4xU5yHH7.f6198s3fjYDxWOUexjjVgyA;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final TimeInterpolator f5294s3fjYDxWOUexjjVgyA = jsjSYEu4NPZjZxcfmI.lEeR5KfoEr4xU5yHH7.f6197lEeR5KfoEr4xU5yHH7;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final TimeInterpolator f5289HJFh0TGMpafqLE9haL = jsjSYEu4NPZjZxcfmI.lEeR5KfoEr4xU5yHH7.f6199zZKhbgvUfsK4AEX3r0;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final boolean f5292husNiw3snxdgZPAGJm = false;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static final int[] f5290KYHag8HRDlnO3X9zmZ = {tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7150jCtUeU2YI1poCxWcjm};

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public static final String f5291TCyPEKSzIyweCN5yp1 = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final Handler f5295zZKhbgvUfsK4AEX3r0 = new Handler(Looper.getMainLooper(), new lEeR5KfoEr4xU5yHH7());

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
        public final s3fjYDxWOUexjjVgyA f5296Z9WdNiOsPR0y54zHW4 = new s3fjYDxWOUexjjVgyA(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
        public boolean Z9WdNiOsPR0y54zHW4(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f5296Z9WdNiOsPR0y54zHW4.s3fjYDxWOUexjjVgyA(coordinatorLayout, view, motionEvent);
            return super.Z9WdNiOsPR0y54zHW4(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean tXWeW0sqVddf7ZBflq(View view) {
            return this.f5296Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7(view);
        }
    }

    public static class HJFh0TGMpafqLE9haL extends FrameLayout {

        /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
        public static final View.OnTouchListener f5297Z9WdNiOsPR0y54zHW4 = new lEeR5KfoEr4xU5yHH7();

        /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
        public boolean f5298Acstmh57AKoSEkEFNJ;

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final float f5299HJFh0TGMpafqLE9haL;

        /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
        public PorterDuff.Mode f5300IPyIQcaNa8aB7drBED;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public final int f5301KYHag8HRDlnO3X9zmZ;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public ColorStateList f5302TCyPEKSzIyweCN5yp1;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public final int f5303husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public Z9WdNiOsPR0y54zHW4 f5304lEeR5KfoEr4xU5yHH7;

        /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
        public Rect f5305pbVGzGjWvY2LDXC8vo;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f5306s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final float f5307zZKhbgvUfsK4AEX3r0;

        public class lEeR5KfoEr4xU5yHH7 implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public HJFh0TGMpafqLE9haL(Context context, AttributeSet attributeSet) {
            super(gpnYwZkFpQwu7zi2gb.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, Acstmh57AKoSEkEFNJ.vR6sX3HsPiyBxQxdoE);
            if (typedArrayObtainStyledAttributes.hasValue(Acstmh57AKoSEkEFNJ.vZYwlguE9k8LYEQe57)) {
                lLKzvdU99Iw80uVD5I.bBVlTkqEpHW053CjWL(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(Acstmh57AKoSEkEFNJ.vZYwlguE9k8LYEQe57, 0));
            }
            this.f5306s3fjYDxWOUexjjVgyA = typedArrayObtainStyledAttributes.getInt(Acstmh57AKoSEkEFNJ.P1E7I4nOQeDcWKS2NX, 0);
            if (typedArrayObtainStyledAttributes.hasValue(Acstmh57AKoSEkEFNJ.gv9vmNfrE2p4XNPMVB) || typedArrayObtainStyledAttributes.hasValue(Acstmh57AKoSEkEFNJ.vlbmeGlI27L4g71TKV)) {
                this.f5304lEeR5KfoEr4xU5yHH7 = Z9WdNiOsPR0y54zHW4.husNiw3snxdgZPAGJm(context2, attributeSet, 0, 0).T9PhQIpGRhE4yZDm1C();
            }
            this.f5299HJFh0TGMpafqLE9haL = typedArrayObtainStyledAttributes.getFloat(Acstmh57AKoSEkEFNJ.z4aA1rXTkPixJu8v2O, 1.0f);
            setBackgroundTintList(hgxXdWVkE1CPHCTwpz.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(context2, typedArrayObtainStyledAttributes, Acstmh57AKoSEkEFNJ.M122clhHHPnQOj0qXt));
            setBackgroundTintMode(hoXrIDAFrSwfShk8da.pbVGzGjWvY2LDXC8vo(typedArrayObtainStyledAttributes.getInt(Acstmh57AKoSEkEFNJ.nzYKxGFJdgl3XdkAMV, -1), PorterDuff.Mode.SRC_IN));
            this.f5307zZKhbgvUfsK4AEX3r0 = typedArrayObtainStyledAttributes.getFloat(Acstmh57AKoSEkEFNJ.qifGOwUJU8M2kUsoSx, 1.0f);
            this.f5303husNiw3snxdgZPAGJm = typedArrayObtainStyledAttributes.getDimensionPixelSize(Acstmh57AKoSEkEFNJ.nol4yHeVanXke5f5p9, -1);
            this.f5301KYHag8HRDlnO3X9zmZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(Acstmh57AKoSEkEFNJ.L7R3AptECEyKtiwihP, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f5297Z9WdNiOsPR0y54zHW4);
            setFocusable(true);
            if (getBackground() == null) {
                lLKzvdU99Iw80uVD5I.ayduHasC7VpxsVXE0T(this, lEeR5KfoEr4xU5yHH7());
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }

        public float getActionTextColorAlpha() {
            return this.f5307zZKhbgvUfsK4AEX3r0;
        }

        public int getAnimationMode() {
            return this.f5306s3fjYDxWOUexjjVgyA;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f5299HJFh0TGMpafqLE9haL;
        }

        public int getMaxInlineActionWidth() {
            return this.f5301KYHag8HRDlnO3X9zmZ;
        }

        public int getMaxWidth() {
            return this.f5303husNiw3snxdgZPAGJm;
        }

        public final Drawable lEeR5KfoEr4xU5yHH7() {
            int iZ9WdNiOsPR0y54zHW4 = cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(this, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7130IPyIQcaNa8aB7drBED, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7149husNiw3snxdgZPAGJm, getBackgroundOverlayColorAlpha());
            Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4 = this.f5304lEeR5KfoEr4xU5yHH7;
            Drawable drawableZZKhbgvUfsK4AEX3r0 = z9WdNiOsPR0y54zHW4 != null ? BaseTransientBottomBar.zZKhbgvUfsK4AEX3r0(iZ9WdNiOsPR0y54zHW4, z9WdNiOsPR0y54zHW4) : BaseTransientBottomBar.HJFh0TGMpafqLE9haL(iZ9WdNiOsPR0y54zHW4, getResources());
            ColorStateList colorStateList = this.f5302TCyPEKSzIyweCN5yp1;
            Drawable drawableE54J8UWNHWALQNixXM = WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(drawableZZKhbgvUfsK4AEX3r0);
            if (colorStateList != null) {
                WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(drawableE54J8UWNHWALQNixXM, this.f5302TCyPEKSzIyweCN5yp1);
            }
            return drawableE54J8UWNHWALQNixXM;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            lLKzvdU99Iw80uVD5I.ctWLFN70QQINH1kyYo(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f5303husNiw3snxdgZPAGJm > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.f5303husNiw3snxdgZPAGJm;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        public final void s3fjYDxWOUexjjVgyA(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f5305pbVGzGjWvY2LDXC8vo = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public void setAnimationMode(int i) {
            this.f5306s3fjYDxWOUexjjVgyA = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f5302TCyPEKSzIyweCN5yp1 != null) {
                drawable = WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(drawable.mutate());
                WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(drawable, this.f5302TCyPEKSzIyweCN5yp1);
                WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(drawable, this.f5300IPyIQcaNa8aB7drBED);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f5302TCyPEKSzIyweCN5yp1 = colorStateList;
            if (getBackground() != null) {
                Drawable drawableE54J8UWNHWALQNixXM = WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(getBackground().mutate());
                WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(drawableE54J8UWNHWALQNixXM, colorStateList);
                WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(drawableE54J8UWNHWALQNixXM, this.f5300IPyIQcaNa8aB7drBED);
                if (drawableE54J8UWNHWALQNixXM != getBackground()) {
                    super.setBackgroundDrawable(drawableE54J8UWNHWALQNixXM);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f5300IPyIQcaNa8aB7drBED = mode;
            if (getBackground() != null) {
                Drawable drawableE54J8UWNHWALQNixXM = WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(getBackground().mutate());
                WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(drawableE54J8UWNHWALQNixXM, mode);
                if (drawableE54J8UWNHWALQNixXM != getBackground()) {
                    super.setBackgroundDrawable(drawableE54J8UWNHWALQNixXM);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f5298Acstmh57AKoSEkEFNJ || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            s3fjYDxWOUexjjVgyA((ViewGroup.MarginLayoutParams) layoutParams);
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f5297Z9WdNiOsPR0y54zHW4);
            super.setOnClickListener(onClickListener);
        }
    }

    public class lEeR5KfoEr4xU5yHH7 implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(message.obj);
                throw null;
            }
            if (i != 1) {
                return false;
            }
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(message.obj);
            throw null;
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public s3fjYDxWOUexjjVgyA(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.KqgKJKIWne3kz1AdHk(0.1f);
            swipeDismissBehavior.e2F9F6h8YJxTHwLCa0(0.6f);
            swipeDismissBehavior.PPkm9uUfOJHHYveeLT(0);
        }

        public boolean lEeR5KfoEr4xU5yHH7(View view) {
            return view instanceof HJFh0TGMpafqLE9haL;
        }

        public void s3fjYDxWOUexjjVgyA(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.WWC27LAMFqFFBzfbNw(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA().husNiw3snxdgZPAGJm(null);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA().KYHag8HRDlnO3X9zmZ(null);
            }
        }
    }

    public static GradientDrawable HJFh0TGMpafqLE9haL(int i, Resources resources) throws Resources.NotFoundException {
        float dimension = resources.getDimension(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7025YlLW4G6OV9TFyuw5ix);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    public static TCyPEKSzIyweCN5yp1 zZKhbgvUfsK4AEX3r0(int i, Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
        TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = new TCyPEKSzIyweCN5yp1(z9WdNiOsPR0y54zHW4);
        tCyPEKSzIyweCN5yp1.YlLW4G6OV9TFyuw5ix(ColorStateList.valueOf(i));
        return tCyPEKSzIyweCN5yp1;
    }
}
