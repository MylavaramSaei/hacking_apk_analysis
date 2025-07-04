package com.google.android.material.timepicker;

import OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ;
import tmIBXGVvBsrJ7i63G2.TCyPEKSzIyweCN5yp1;
import tmIBXGVvBsrJ7i63G2.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
class ClockFaceView extends zZKhbgvUfsK4AEX3r0 implements ClockHandView.s3fjYDxWOUexjjVgyA {

    /* renamed from: DfpieXfdYs58yZAiXY, reason: collision with root package name */
    public final int f5438DfpieXfdYs58yZAiXY;

    /* renamed from: GyWRxpdt1T8mEJXPoD, reason: collision with root package name */
    public final int f5439GyWRxpdt1T8mEJXPoD;

    /* renamed from: KqgKJKIWne3kz1AdHk, reason: collision with root package name */
    public final int f5440KqgKJKIWne3kz1AdHk;

    /* renamed from: OUd9THiLjZndMj0qdF, reason: collision with root package name */
    public final RectF f5441OUd9THiLjZndMj0qdF;

    /* renamed from: OqIo5QF00RDxUQb4qq, reason: collision with root package name */
    public final float[] f5442OqIo5QF00RDxUQb4qq;

    /* renamed from: PPkm9uUfOJHHYveeLT, reason: collision with root package name */
    public String[] f5443PPkm9uUfOJHHYveeLT;

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public final ClockHandView f5444THTDvPxsHqMeGb512f;

    /* renamed from: W3RZ2dTDKrKpS5Mxdk, reason: collision with root package name */
    public final int[] f5445W3RZ2dTDKrKpS5Mxdk;

    /* renamed from: XzJ1BS7H9Ilbkv4eVM, reason: collision with root package name */
    public final SparseArray f5446XzJ1BS7H9Ilbkv4eVM;

    /* renamed from: aAp6BD79BhftLCnuvf, reason: collision with root package name */
    public float f5447aAp6BD79BhftLCnuvf;

    /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
    public final Rect f5448ao3wqKm5CXFuvC0q47;

    /* renamed from: e2F9F6h8YJxTHwLCa0, reason: collision with root package name */
    public final int f5449e2F9F6h8YJxTHwLCa0;

    /* renamed from: jCtUeU2YI1poCxWcjm, reason: collision with root package name */
    public final Rect f5450jCtUeU2YI1poCxWcjm;

    /* renamed from: lLKzvdU99Iw80uVD5I, reason: collision with root package name */
    public final ColorStateList f5451lLKzvdU99Iw80uVD5I;

    /* renamed from: tXWeW0sqVddf7ZBflq, reason: collision with root package name */
    public final W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 f5452tXWeW0sqVddf7ZBflq;

    public class lEeR5KfoEr4xU5yHH7 implements ViewTreeObserver.OnPreDrawListener {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.A49QRPHynYLCBN0SqP(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f5444THTDvPxsHqMeGb512f.pbVGzGjWvY2LDXC8vo()) - ClockFaceView.this.f5439GyWRxpdt1T8mEJXPoD);
            return true;
        }
    }

    public class s3fjYDxWOUexjjVgyA extends W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 {
        public s3fjYDxWOUexjjVgyA() {
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public boolean Acstmh57AKoSEkEFNJ(View view, int i, Bundle bundle) {
            if (i != 16) {
                return super.Acstmh57AKoSEkEFNJ(view, i, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f5448ao3wqKm5CXFuvC0q47);
            float fCenterX = ClockFaceView.this.f5448ao3wqKm5CXFuvC0q47.centerX();
            float fCenterY = ClockFaceView.this.f5448ao3wqKm5CXFuvC0q47.centerY();
            ClockFaceView.this.f5444THTDvPxsHqMeGb512f.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.f5444THTDvPxsHqMeGb512f.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public void TCyPEKSzIyweCN5yp1(View view, A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
            super.TCyPEKSzIyweCN5yp1(view, a49QRPHynYLCBN0SqP);
            int iIntValue = ((Integer) view.getTag(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7115hoXrIDAFrSwfShk8da)).intValue();
            if (iIntValue > 0) {
                a49QRPHynYLCBN0SqP.aUn6Hqsqw2PVM8685Z((View) ClockFaceView.this.f5446XzJ1BS7H9Ilbkv4eVM.get(iIntValue - 1));
            }
            a49QRPHynYLCBN0SqP.DFYiVi7zXozAjRciKa(A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(0, 1, iIntValue, 1, false, view.isSelected()));
            a49QRPHynYLCBN0SqP.eWK41qw3g36LVd4UnS(true);
            a49QRPHynYLCBN0SqP.s3fjYDxWOUexjjVgyA(A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7.f1236pbVGzGjWvY2LDXC8vo);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7158zaq8hOURtfwbcX17cG);
    }

    public static float GyWRxpdt1T8mEJXPoD(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    @Override // com.google.android.material.timepicker.zZKhbgvUfsK4AEX3r0
    public void A49QRPHynYLCBN0SqP(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (i != LIMtzhnLwQyigzK0KO()) {
            super.A49QRPHynYLCBN0SqP(i);
            this.f5444THTDvPxsHqMeGb512f.T9PhQIpGRhE4yZDm1C(LIMtzhnLwQyigzK0KO());
        }
    }

    public void DfpieXfdYs58yZAiXY(String[] strArr, int i) {
        this.f5443PPkm9uUfOJHHYveeLT = strArr;
        e2F9F6h8YJxTHwLCa0(i);
    }

    public final TextView OqIo5QF00RDxUQb4qq(RectF rectF) {
        float f = Float.MAX_VALUE;
        TextView textView = null;
        for (int i = 0; i < this.f5446XzJ1BS7H9Ilbkv4eVM.size(); i++) {
            TextView textView2 = (TextView) this.f5446XzJ1BS7H9Ilbkv4eVM.get(i);
            if (textView2 != null) {
                textView2.getHitRect(this.f5448ao3wqKm5CXFuvC0q47);
                this.f5441OUd9THiLjZndMj0qdF.set(this.f5448ao3wqKm5CXFuvC0q47);
                this.f5441OUd9THiLjZndMj0qdF.union(rectF);
                float fWidth = this.f5441OUd9THiLjZndMj0qdF.width() * this.f5441OUd9THiLjZndMj0qdF.height();
                if (fWidth < f) {
                    textView = textView2;
                    f = fWidth;
                }
            }
        }
        return textView;
    }

    public final RadialGradient W3RZ2dTDKrKpS5Mxdk(RectF rectF, TextView textView) {
        textView.getHitRect(this.f5448ao3wqKm5CXFuvC0q47);
        this.f5441OUd9THiLjZndMj0qdF.set(this.f5448ao3wqKm5CXFuvC0q47);
        textView.getLineBounds(0, this.f5450jCtUeU2YI1poCxWcjm);
        RectF rectF2 = this.f5441OUd9THiLjZndMj0qdF;
        Rect rect = this.f5450jCtUeU2YI1poCxWcjm;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f5441OUd9THiLjZndMj0qdF)) {
            return new RadialGradient(rectF.centerX() - this.f5441OUd9THiLjZndMj0qdF.left, rectF.centerY() - this.f5441OUd9THiLjZndMj0qdF.top, rectF.width() * 0.5f, this.f5445W3RZ2dTDKrKpS5Mxdk, this.f5442OqIo5QF00RDxUQb4qq, Shader.TileMode.CLAMP);
        }
        return null;
    }

    @Override // com.google.android.material.timepicker.zZKhbgvUfsK4AEX3r0
    public void WWC27LAMFqFFBzfbNw() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.WWC27LAMFqFFBzfbNw();
        for (int i = 0; i < this.f5446XzJ1BS7H9Ilbkv4eVM.size(); i++) {
            ((TextView) this.f5446XzJ1BS7H9Ilbkv4eVM.get(i)).setVisibility(0);
        }
    }

    public final void e2F9F6h8YJxTHwLCa0(int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.f5446XzJ1BS7H9Ilbkv4eVM.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.f5443PPkm9uUfOJHHYveeLT.length, size); i2++) {
            TextView textView = (TextView) this.f5446XzJ1BS7H9Ilbkv4eVM.get(i2);
            if (i2 >= this.f5443PPkm9uUfOJHHYveeLT.length) {
                removeView(textView);
                this.f5446XzJ1BS7H9Ilbkv4eVM.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(TCyPEKSzIyweCN5yp1.f7085zZKhbgvUfsK4AEX3r0, (ViewGroup) this, false);
                    this.f5446XzJ1BS7H9Ilbkv4eVM.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.f5443PPkm9uUfOJHHYveeLT[i2]);
                textView.setTag(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7115hoXrIDAFrSwfShk8da, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7119pbVGzGjWvY2LDXC8vo, Integer.valueOf(i3));
                if (i3 > 1) {
                    z = true;
                }
                lLKzvdU99Iw80uVD5I.eWK41qw3g36LVd4UnS(textView, this.f5452tXWeW0sqVddf7ZBflq);
                textView.setTextColor(this.f5451lLKzvdU99Iw80uVD5I);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.f5443PPkm9uUfOJHHYveeLT[i2]));
                }
            }
        }
        this.f5444THTDvPxsHqMeGb512f.zaq8hOURtfwbcX17cG(z);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.s3fjYDxWOUexjjVgyA
    public void lEeR5KfoEr4xU5yHH7(float f, boolean z) {
        if (Math.abs(this.f5447aAp6BD79BhftLCnuvf - f) > 0.001f) {
            this.f5447aAp6BD79BhftLCnuvf = f;
            tXWeW0sqVddf7ZBflq();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        A49QRPHynYLCBN0SqP.i8aHOwH04efS6lZ3Oa(accessibilityNodeInfo).evSiTWao80SbJUZk9E(A49QRPHynYLCBN0SqP.husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(1, this.f5443PPkm9uUfOJHHYveeLT.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        tXWeW0sqVddf7ZBflq();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iGyWRxpdt1T8mEJXPoD = (int) (this.f5440KqgKJKIWne3kz1AdHk / GyWRxpdt1T8mEJXPoD(this.f5438DfpieXfdYs58yZAiXY / displayMetrics.heightPixels, this.f5449e2F9F6h8YJxTHwLCa0 / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iGyWRxpdt1T8mEJXPoD, 1073741824);
        setMeasuredDimension(iGyWRxpdt1T8mEJXPoD, iGyWRxpdt1T8mEJXPoD);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public final void tXWeW0sqVddf7ZBflq() {
        RectF rectFHusNiw3snxdgZPAGJm = this.f5444THTDvPxsHqMeGb512f.husNiw3snxdgZPAGJm();
        TextView textViewOqIo5QF00RDxUQb4qq = OqIo5QF00RDxUQb4qq(rectFHusNiw3snxdgZPAGJm);
        for (int i = 0; i < this.f5446XzJ1BS7H9Ilbkv4eVM.size(); i++) {
            TextView textView = (TextView) this.f5446XzJ1BS7H9Ilbkv4eVM.get(i);
            if (textView != null) {
                textView.setSelected(textView == textViewOqIo5QF00RDxUQb4qq);
                textView.getPaint().setShader(W3RZ2dTDKrKpS5Mxdk(rectFHusNiw3snxdgZPAGJm, textView));
                textView.invalidate();
            }
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5448ao3wqKm5CXFuvC0q47 = new Rect();
        this.f5441OUd9THiLjZndMj0qdF = new RectF();
        this.f5450jCtUeU2YI1poCxWcjm = new Rect();
        this.f5446XzJ1BS7H9Ilbkv4eVM = new SparseArray();
        this.f5442OqIo5QF00RDxUQb4qq = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Acstmh57AKoSEkEFNJ.f6929e5tXAuLbtMC3XyEoX9, i, pbVGzGjWvY2LDXC8vo.f7164Z9WdNiOsPR0y54zHW4);
        Resources resources = getResources();
        ColorStateList colorStateListS3fjYDxWOUexjjVgyA = hgxXdWVkE1CPHCTwpz.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(context, typedArrayObtainStyledAttributes, Acstmh57AKoSEkEFNJ.f6977tmIBXGVvBsrJ7i63G2);
        this.f5451lLKzvdU99Iw80uVD5I = colorStateListS3fjYDxWOUexjjVgyA;
        LayoutInflater.from(context).inflate(TCyPEKSzIyweCN5yp1.f7081husNiw3snxdgZPAGJm, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7093IPyIQcaNa8aB7drBED);
        this.f5444THTDvPxsHqMeGb512f = clockHandView;
        this.f5439GyWRxpdt1T8mEJXPoD = resources.getDimensionPixelSize(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7047zaq8hOURtfwbcX17cG);
        int colorForState = colorStateListS3fjYDxWOUexjjVgyA.getColorForState(new int[]{R.attr.state_selected}, colorStateListS3fjYDxWOUexjjVgyA.getDefaultColor());
        this.f5445W3RZ2dTDKrKpS5Mxdk = new int[]{colorForState, colorForState, colorStateListS3fjYDxWOUexjjVgyA.getDefaultColor()};
        clockHandView.s3fjYDxWOUexjjVgyA(this);
        int defaultColor = HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(context, tmIBXGVvBsrJ7i63G2.s3fjYDxWOUexjjVgyA.f7175s3fjYDxWOUexjjVgyA).getDefaultColor();
        ColorStateList colorStateListS3fjYDxWOUexjjVgyA2 = hgxXdWVkE1CPHCTwpz.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(context, typedArrayObtainStyledAttributes, Acstmh57AKoSEkEFNJ.f6860JXsqbvi9UKxeF3HXpU);
        setBackgroundColor(colorStateListS3fjYDxWOUexjjVgyA2 != null ? colorStateListS3fjYDxWOUexjjVgyA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new lEeR5KfoEr4xU5yHH7());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f5452tXWeW0sqVddf7ZBflq = new s3fjYDxWOUexjjVgyA();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        DfpieXfdYs58yZAiXY(strArr, 0);
        this.f5438DfpieXfdYs58yZAiXY = resources.getDimensionPixelSize(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7036jCtUeU2YI1poCxWcjm);
        this.f5449e2F9F6h8YJxTHwLCa0 = resources.getDimensionPixelSize(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7023XzJ1BS7H9Ilbkv4eVM);
        this.f5440KqgKJKIWne3kz1AdHk = resources.getDimensionPixelSize(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7024Y43RdunnpKgpbny0lE);
    }
}
