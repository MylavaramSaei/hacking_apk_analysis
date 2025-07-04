package androidx.appcompat.widget;

import IPyIQcaNa8aB7drBED.PPkm9uUfOJHHYveeLT;
import IPyIQcaNa8aB7drBED.cT5Hs3CQpLK8NvlZAw;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA extends ViewGroup {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public int[] f2936Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f2937HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public boolean f2938IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public int f2939KYHag8HRDlnO3X9zmZ;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public int f2940T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public float f2941TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public Drawable f2942Z9WdNiOsPR0y54zHW4;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public int f2943aPyGSIylzVNKPT1Bls;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public int f2944e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public int f2945hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int f2946husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public boolean f2947lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public int[] f2948pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f2949s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f2950zZKhbgvUfsK4AEX3r0;

    public static class lEeR5KfoEr4xU5yHH7 extends LinearLayout.LayoutParams {
        public lEeR5KfoEr4xU5yHH7(int i, int i2) {
            super(i, i2);
        }

        public lEeR5KfoEr4xU5yHH7(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public lEeR5KfoEr4xU5yHH7(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public lEeR5KfoEr4xU5yHH7(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public s3fjYDxWOUexjjVgyA(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void A49QRPHynYLCBN0SqP(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    private void pbVGzGjWvY2LDXC8vo(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View viewOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM(i3);
            if (viewOANkd3mP6AYvwbNLJM.getVisibility() != 8) {
                lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (lEeR5KfoEr4xU5yHH7) viewOANkd3mP6AYvwbNLJM.getLayoutParams();
                if (((LinearLayout.LayoutParams) leer5kfoer4xu5yhh7).width == -1) {
                    int i4 = ((LinearLayout.LayoutParams) leer5kfoer4xu5yhh7).height;
                    ((LinearLayout.LayoutParams) leer5kfoer4xu5yhh7).height = viewOANkd3mP6AYvwbNLJM.getMeasuredHeight();
                    measureChildWithMargins(viewOANkd3mP6AYvwbNLJM, iMakeMeasureSpec, 0, i2, 0);
                    ((LinearLayout.LayoutParams) leer5kfoer4xu5yhh7).height = i4;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: Acstmh57AKoSEkEFNJ, reason: merged with bridge method [inline-methods] */
    public lEeR5KfoEr4xU5yHH7 generateDefaultLayoutParams() {
        int i = this.f2950zZKhbgvUfsK4AEX3r0;
        if (i == 0) {
            return new lEeR5KfoEr4xU5yHH7(-2, -2);
        }
        if (i == 1) {
            return new lEeR5KfoEr4xU5yHH7(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x03b1 A[PHI: r3
      0x03b1: PHI (r3v31 int) = (r3v27 int), (r3v32 int) binds: [B:173:0x03c2, B:167:0x03ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G7AC3DWIx9i9fdanjk(int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s3fjYDxWOUexjjVgyA.G7AC3DWIx9i9fdanjk(int, int):void");
    }

    public final void IPyIQcaNa8aB7drBED(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View viewOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM(i3);
            if (viewOANkd3mP6AYvwbNLJM.getVisibility() != 8) {
                lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (lEeR5KfoEr4xU5yHH7) viewOANkd3mP6AYvwbNLJM.getLayoutParams();
                if (((LinearLayout.LayoutParams) leer5kfoer4xu5yhh7).height == -1) {
                    int i4 = ((LinearLayout.LayoutParams) leer5kfoer4xu5yhh7).width;
                    ((LinearLayout.LayoutParams) leer5kfoer4xu5yhh7).width = viewOANkd3mP6AYvwbNLJM.getMeasuredWidth();
                    measureChildWithMargins(viewOANkd3mP6AYvwbNLJM, i2, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) leer5kfoer4xu5yhh7).width = i4;
                }
            }
        }
    }

    public void KYHag8HRDlnO3X9zmZ(Canvas canvas, int i) {
        this.f2942Z9WdNiOsPR0y54zHW4.setBounds(getPaddingLeft() + this.f2943aPyGSIylzVNKPT1Bls, i, (getWidth() - getPaddingRight()) - this.f2943aPyGSIylzVNKPT1Bls, this.f2940T9PhQIpGRhE4yZDm1C + i);
        this.f2942Z9WdNiOsPR0y54zHW4.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x02d4 A[PHI: r10
      0x02d4: PHI (r10v21 int) = (r10v19 int), (r10v22 int) binds: [B:136:0x02e5, B:130:0x02d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0327  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIMtzhnLwQyigzK0KO(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s3fjYDxWOUexjjVgyA.LIMtzhnLwQyigzK0KO(int, int):void");
    }

    public View OANkd3mP6AYvwbNLJM(int i) {
        return getChildAt(i);
    }

    public void R9SAhYMerGybF9OAjL(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public int T9PhQIpGRhE4yZDm1C(View view, int i) {
        return 0;
    }

    public void TCyPEKSzIyweCN5yp1(Canvas canvas, int i) {
        this.f2942Z9WdNiOsPR0y54zHW4.setBounds(i, getPaddingTop() + this.f2943aPyGSIylzVNKPT1Bls, this.f2944e54J8UWNHWALQNixXM + i, (getHeight() - getPaddingBottom()) - this.f2943aPyGSIylzVNKPT1Bls);
        this.f2942Z9WdNiOsPR0y54zHW4.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Y43RdunnpKgpbny0lE(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f2946husNiw3snxdgZPAGJm
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f2939KYHag8HRDlnO3X9zmZ
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f2939KYHag8HRDlnO3X9zmZ
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = r1
        L49:
            if (r12 >= r10) goto Lc8
            android.view.View r13 = r6.OANkd3mP6AYvwbNLJM(r12)
            r14 = 1
            if (r13 != 0) goto L5a
            int r1 = r6.xHA29AmDt6y96AnB3t(r12)
            int r0 = r0 + r1
        L57:
            r1 = r14
            goto Lc6
        L5a:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto L57
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.s3fjYDxWOUexjjVgyA$lEeR5KfoEr4xU5yHH7 r5 = (androidx.appcompat.widget.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L76
            r1 = r11
        L76:
            int r2 = r17.getLayoutDirection()
            int r1 = W3RZ2dTDKrKpS5Mxdk.Y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L90
            r2 = 5
            if (r1 == r2) goto L8a
            int r1 = r5.leftMargin
            int r1 = r1 + r7
        L88:
            r2 = r1
            goto L99
        L8a:
            int r1 = r8 - r4
        L8c:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
            goto L88
        L90:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            goto L8c
        L99:
            boolean r1 = r6.zaq8hOURtfwbcX17cG(r12)
            if (r1 == 0) goto La2
            int r1 = r6.f2940T9PhQIpGRhE4yZDm1C
            int r0 = r0 + r1
        La2:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.hoXrIDAFrSwfShk8da(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.A49QRPHynYLCBN0SqP(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.aPyGSIylzVNKPT1Bls(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.T9PhQIpGRhE4yZDm1C(r13, r12)
            int r12 = r12 + r0
            r0 = r16
            r1 = 1
        Lc6:
            int r12 = r12 + r1
            goto L49
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s3fjYDxWOUexjjVgyA.Y43RdunnpKgpbny0lE(int, int, int, int):void");
    }

    @Override // android.view.ViewGroup
    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: merged with bridge method [inline-methods] */
    public lEeR5KfoEr4xU5yHH7 generateLayoutParams(AttributeSet attributeSet) {
        return new lEeR5KfoEr4xU5yHH7(getContext(), attributeSet);
    }

    public int aPyGSIylzVNKPT1Bls(View view) {
        return 0;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof lEeR5KfoEr4xU5yHH7;
    }

    @Override // android.view.ViewGroup
    /* renamed from: e54J8UWNHWALQNixXM, reason: merged with bridge method [inline-methods] */
    public lEeR5KfoEr4xU5yHH7 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof lEeR5KfoEr4xU5yHH7 ? new lEeR5KfoEr4xU5yHH7((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new lEeR5KfoEr4xU5yHH7((ViewGroup.MarginLayoutParams) layoutParams) : new lEeR5KfoEr4xU5yHH7(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f2949s3fjYDxWOUexjjVgyA < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f2949s3fjYDxWOUexjjVgyA;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f2949s3fjYDxWOUexjjVgyA == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f2937HJFh0TGMpafqLE9haL;
        if (this.f2950zZKhbgvUfsK4AEX3r0 == 1 && (i = this.f2946husNiw3snxdgZPAGJm & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2939KYHag8HRDlnO3X9zmZ) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2939KYHag8HRDlnO3X9zmZ;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((lEeR5KfoEr4xU5yHH7) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2949s3fjYDxWOUexjjVgyA;
    }

    public Drawable getDividerDrawable() {
        return this.f2942Z9WdNiOsPR0y54zHW4;
    }

    public int getDividerPadding() {
        return this.f2943aPyGSIylzVNKPT1Bls;
    }

    public int getDividerWidth() {
        return this.f2944e54J8UWNHWALQNixXM;
    }

    public int getGravity() {
        return this.f2946husNiw3snxdgZPAGJm;
    }

    public int getOrientation() {
        return this.f2950zZKhbgvUfsK4AEX3r0;
    }

    public int getShowDividers() {
        return this.f2945hoXrIDAFrSwfShk8da;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2941TCyPEKSzIyweCN5yp1;
    }

    public int hoXrIDAFrSwfShk8da(View view) {
        return 0;
    }

    public void husNiw3snxdgZPAGJm(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View viewOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM(i);
            if (viewOANkd3mP6AYvwbNLJM != null && viewOANkd3mP6AYvwbNLJM.getVisibility() != 8 && zaq8hOURtfwbcX17cG(i)) {
                KYHag8HRDlnO3X9zmZ(canvas, (viewOANkd3mP6AYvwbNLJM.getTop() - ((LinearLayout.LayoutParams) ((lEeR5KfoEr4xU5yHH7) viewOANkd3mP6AYvwbNLJM.getLayoutParams())).topMargin) - this.f2940T9PhQIpGRhE4yZDm1C);
            }
        }
        if (zaq8hOURtfwbcX17cG(virtualChildCount)) {
            View viewOANkd3mP6AYvwbNLJM2 = OANkd3mP6AYvwbNLJM(virtualChildCount - 1);
            KYHag8HRDlnO3X9zmZ(canvas, viewOANkd3mP6AYvwbNLJM2 == null ? (getHeight() - getPaddingBottom()) - this.f2940T9PhQIpGRhE4yZDm1C : viewOANkd3mP6AYvwbNLJM2.getBottom() + ((LinearLayout.LayoutParams) ((lEeR5KfoEr4xU5yHH7) viewOANkd3mP6AYvwbNLJM2.getLayoutParams())).bottomMargin);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f2942Z9WdNiOsPR0y54zHW4 == null) {
            return;
        }
        if (this.f2950zZKhbgvUfsK4AEX3r0 == 1) {
            husNiw3snxdgZPAGJm(canvas);
        } else {
            s3fjYDxWOUexjjVgyA(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f2950zZKhbgvUfsK4AEX3r0 == 1) {
            Y43RdunnpKgpbny0lE(i, i2, i3, i4);
        } else {
            sTkWmhpZ5b1ArQIw4K(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f2950zZKhbgvUfsK4AEX3r0 == 1) {
            LIMtzhnLwQyigzK0KO(i, i2);
        } else {
            G7AC3DWIx9i9fdanjk(i, i2);
        }
    }

    public void s3fjYDxWOUexjjVgyA(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        int virtualChildCount = getVirtualChildCount();
        boolean zLEeR5KfoEr4xU5yHH7 = cT5Hs3CQpLK8NvlZAw.lEeR5KfoEr4xU5yHH7(this);
        for (int i = 0; i < virtualChildCount; i++) {
            View viewOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM(i);
            if (viewOANkd3mP6AYvwbNLJM != null && viewOANkd3mP6AYvwbNLJM.getVisibility() != 8 && zaq8hOURtfwbcX17cG(i)) {
                lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (lEeR5KfoEr4xU5yHH7) viewOANkd3mP6AYvwbNLJM.getLayoutParams();
                TCyPEKSzIyweCN5yp1(canvas, zLEeR5KfoEr4xU5yHH7 ? viewOANkd3mP6AYvwbNLJM.getRight() + ((LinearLayout.LayoutParams) leer5kfoer4xu5yhh7).rightMargin : (viewOANkd3mP6AYvwbNLJM.getLeft() - ((LinearLayout.LayoutParams) leer5kfoer4xu5yhh7).leftMargin) - this.f2944e54J8UWNHWALQNixXM);
            }
        }
        if (zaq8hOURtfwbcX17cG(virtualChildCount)) {
            View viewOANkd3mP6AYvwbNLJM2 = OANkd3mP6AYvwbNLJM(virtualChildCount - 1);
            if (viewOANkd3mP6AYvwbNLJM2 != null) {
                lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = (lEeR5KfoEr4xU5yHH7) viewOANkd3mP6AYvwbNLJM2.getLayoutParams();
                if (zLEeR5KfoEr4xU5yHH7) {
                    left = viewOANkd3mP6AYvwbNLJM2.getLeft();
                    paddingRight = ((LinearLayout.LayoutParams) leer5kfoer4xu5yhh72).leftMargin;
                    right = (left - paddingRight) - this.f2944e54J8UWNHWALQNixXM;
                } else {
                    right = viewOANkd3mP6AYvwbNLJM2.getRight() + ((LinearLayout.LayoutParams) leer5kfoer4xu5yhh72).rightMargin;
                }
            } else if (zLEeR5KfoEr4xU5yHH7) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.f2944e54J8UWNHWALQNixXM;
            }
            TCyPEKSzIyweCN5yp1(canvas, right);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void sTkWmhpZ5b1ArQIw4K(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s3fjYDxWOUexjjVgyA.sTkWmhpZ5b1ArQIw4K(int, int, int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f2947lEeR5KfoEr4xU5yHH7 = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f2949s3fjYDxWOUexjjVgyA = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2942Z9WdNiOsPR0y54zHW4) {
            return;
        }
        this.f2942Z9WdNiOsPR0y54zHW4 = drawable;
        if (drawable != null) {
            this.f2944e54J8UWNHWALQNixXM = drawable.getIntrinsicWidth();
            this.f2940T9PhQIpGRhE4yZDm1C = drawable.getIntrinsicHeight();
        } else {
            this.f2944e54J8UWNHWALQNixXM = 0;
            this.f2940T9PhQIpGRhE4yZDm1C = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f2943aPyGSIylzVNKPT1Bls = i;
    }

    public void setGravity(int i) {
        if (this.f2946husNiw3snxdgZPAGJm != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f2946husNiw3snxdgZPAGJm = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f2946husNiw3snxdgZPAGJm;
        if ((8388615 & i3) != i2) {
            this.f2946husNiw3snxdgZPAGJm = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f2938IPyIQcaNa8aB7drBED = z;
    }

    public void setOrientation(int i) {
        if (this.f2950zZKhbgvUfsK4AEX3r0 != i) {
            this.f2950zZKhbgvUfsK4AEX3r0 = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f2945hoXrIDAFrSwfShk8da) {
            requestLayout();
        }
        this.f2945hoXrIDAFrSwfShk8da = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f2946husNiw3snxdgZPAGJm;
        if ((i3 & 112) != i2) {
            this.f2946husNiw3snxdgZPAGJm = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f2941TCyPEKSzIyweCN5yp1 = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int xHA29AmDt6y96AnB3t(int i) {
        return 0;
    }

    public boolean zaq8hOURtfwbcX17cG(int i) {
        if (i == 0) {
            return (this.f2945hoXrIDAFrSwfShk8da & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f2945hoXrIDAFrSwfShk8da & 4) != 0;
        }
        if ((this.f2945hoXrIDAFrSwfShk8da & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public s3fjYDxWOUexjjVgyA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2947lEeR5KfoEr4xU5yHH7 = true;
        this.f2949s3fjYDxWOUexjjVgyA = -1;
        this.f2937HJFh0TGMpafqLE9haL = 0;
        this.f2946husNiw3snxdgZPAGJm = 8388659;
        PPkm9uUfOJHHYveeLT pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL = PPkm9uUfOJHHYveeLT.R9SAhYMerGybF9OAjL(context, attributeSet, pbVGzGjWvY2LDXC8vo.f6400iQCvttGuB7nx4r7kMP, i, 0);
        lLKzvdU99Iw80uVD5I.jocVUfxESVhVJU8LoH(this, context, pbVGzGjWvY2LDXC8vo.f6400iQCvttGuB7nx4r7kMP, attributeSet, pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.OANkd3mP6AYvwbNLJM(), i, 0);
        int iAcstmh57AKoSEkEFNJ = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.Acstmh57AKoSEkEFNJ(pbVGzGjWvY2LDXC8vo.f6300Fo9071MN8vwEWamAUX, -1);
        if (iAcstmh57AKoSEkEFNJ >= 0) {
            setOrientation(iAcstmh57AKoSEkEFNJ);
        }
        int iAcstmh57AKoSEkEFNJ2 = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.Acstmh57AKoSEkEFNJ(pbVGzGjWvY2LDXC8vo.f6440yL2E9nlEZpg8ZZx8XE, -1);
        if (iAcstmh57AKoSEkEFNJ2 >= 0) {
            setGravity(iAcstmh57AKoSEkEFNJ2);
        }
        boolean zLEeR5KfoEr4xU5yHH7 = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.lEeR5KfoEr4xU5yHH7(pbVGzGjWvY2LDXC8vo.f6295Er40JrQbOM51vCQI8w, true);
        if (!zLEeR5KfoEr4xU5yHH7) {
            setBaselineAligned(zLEeR5KfoEr4xU5yHH7);
        }
        this.f2941TCyPEKSzIyweCN5yp1 = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.IPyIQcaNa8aB7drBED(pbVGzGjWvY2LDXC8vo.f6383f2zPq7MOnQrtOlZ1Zg, -1.0f);
        this.f2949s3fjYDxWOUexjjVgyA = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.Acstmh57AKoSEkEFNJ(pbVGzGjWvY2LDXC8vo.f6357Ywqw2A0s86HeuFkDt0, -1);
        this.f2938IPyIQcaNa8aB7drBED = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.lEeR5KfoEr4xU5yHH7(pbVGzGjWvY2LDXC8vo.f6307HR5vAalpgOKVm2T0Gq, false);
        setDividerDrawable(pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.TCyPEKSzIyweCN5yp1(pbVGzGjWvY2LDXC8vo.f6308HZ4bptRS9XIcK1CV95));
        this.f2945hoXrIDAFrSwfShk8da = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.Acstmh57AKoSEkEFNJ(pbVGzGjWvY2LDXC8vo.f6418pgB7Gmjz55y9NQYnAD, 0);
        this.f2943aPyGSIylzVNKPT1Bls = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.KYHag8HRDlnO3X9zmZ(pbVGzGjWvY2LDXC8vo.f6363aRQ2M7vtRaPDEyvpdv, 0);
        pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.xHA29AmDt6y96AnB3t();
    }
}
