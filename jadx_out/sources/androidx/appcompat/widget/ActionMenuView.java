package androidx.appcompat.widget;

import IPyIQcaNa8aB7drBED.cT5Hs3CQpLK8NvlZAw;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.IPyIQcaNa8aB7drBED;
import androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1;
import androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0;
import androidx.appcompat.widget.s3fjYDxWOUexjjVgyA;

/* loaded from: classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.s3fjYDxWOUexjjVgyA implements zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA, IPyIQcaNa8aB7drBED {

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public int f2814A49QRPHynYLCBN0SqP;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 f2815G7AC3DWIx9i9fdanjk;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public boolean f2816LIMtzhnLwQyigzK0KO;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 f2817OANkd3mP6AYvwbNLJM;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public androidx.appcompat.widget.lEeR5KfoEr4xU5yHH7 f2818R9SAhYMerGybF9OAjL;

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public husNiw3snxdgZPAGJm f2819THTDvPxsHqMeGb512f;

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public int f2820VItLRw50eXTZeEfGl0;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public int f2821WWC27LAMFqFFBzfbNw;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public boolean f2822Y43RdunnpKgpbny0lE;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public int f2823sTkWmhpZ5b1ArQIw4K;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 f2824xHA29AmDt6y96AnB3t;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public Context f2825zaq8hOURtfwbcX17cG;

    public static class HJFh0TGMpafqLE9haL extends s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int f2826HJFh0TGMpafqLE9haL;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public boolean f2827KYHag8HRDlnO3X9zmZ;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public boolean f2828husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public boolean f2829lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f2830s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public boolean f2831zZKhbgvUfsK4AEX3r0;

        public HJFh0TGMpafqLE9haL(int i, int i2) {
            super(i, i2);
            this.f2829lEeR5KfoEr4xU5yHH7 = false;
        }

        public HJFh0TGMpafqLE9haL(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public HJFh0TGMpafqLE9haL(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public HJFh0TGMpafqLE9haL(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            super((ViewGroup.LayoutParams) hJFh0TGMpafqLE9haL);
            this.f2829lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL.f2829lEeR5KfoEr4xU5yHH7;
        }
    }

    public interface husNiw3snxdgZPAGJm {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public interface lEeR5KfoEr4xU5yHH7 {
        boolean lEeR5KfoEr4xU5yHH7();

        boolean s3fjYDxWOUexjjVgyA();
    }

    public static class s3fjYDxWOUexjjVgyA implements TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 {
        @Override // androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7
        public void lEeR5KfoEr4xU5yHH7(androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7
        public boolean s3fjYDxWOUexjjVgyA(androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
            return false;
        }
    }

    public class zZKhbgvUfsK4AEX3r0 implements zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 {
        public zZKhbgvUfsK4AEX3r0() {
        }

        @Override // androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7
        public boolean lEeR5KfoEr4xU5yHH7(androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, MenuItem menuItem) {
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = ActionMenuView.this.f2819THTDvPxsHqMeGb512f;
            return husniw3snxdgzpagjm != null && husniw3snxdgzpagjm.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7
        public void s3fjYDxWOUexjjVgyA(androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = ActionMenuView.this.f2824xHA29AmDt6y96AnB3t;
            if (leer5kfoer4xu5yhh7 != null) {
                leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA(zzkhbgvufsk4aex3r0);
            }
        }
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int W3RZ2dTDKrKpS5Mxdk(android.view.View r5, int r6, int r7, int r8, int r9) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$HJFh0TGMpafqLE9haL r0 = (androidx.appcompat.widget.ActionMenuView.HJFh0TGMpafqLE9haL) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L28
            boolean r9 = r9.Y43RdunnpKgpbny0lE()
            if (r9 == 0) goto L28
            r9 = r2
            goto L29
        L28:
            r9 = r1
        L29:
            if (r7 <= 0) goto L4c
            r3 = 2
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4c
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L45
            int r4 = r4 + 1
        L45:
            if (r9 == 0) goto L4a
            if (r4 >= r3) goto L4a
            goto L4d
        L4a:
            r3 = r4
            goto L4d
        L4c:
            r3 = r1
        L4d:
            boolean r7 = r0.f2829lEeR5KfoEr4xU5yHH7
            if (r7 != 0) goto L54
            if (r9 == 0) goto L54
            r1 = r2
        L54:
            r0.f2831zZKhbgvUfsK4AEX3r0 = r1
            r0.f2830s3fjYDxWOUexjjVgyA = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.W3RZ2dTDKrKpS5Mxdk(android.view.View, int, int, int, int):int");
    }

    public void DfpieXfdYs58yZAiXY(TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72) {
        this.f2815G7AC3DWIx9i9fdanjk = leer5kfoer4xu5yhh7;
        this.f2824xHA29AmDt6y96AnB3t = leer5kfoer4xu5yhh72;
    }

    public androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 GyWRxpdt1T8mEJXPoD() {
        return this.f2817OANkd3mP6AYvwbNLJM;
    }

    public HJFh0TGMpafqLE9haL OUd9THiLjZndMj0qdF() {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haLGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        hJFh0TGMpafqLE9haLGenerateDefaultLayoutParams.f2829lEeR5KfoEr4xU5yHH7 = true;
        return hJFh0TGMpafqLE9haLGenerateDefaultLayoutParams;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    public final void OqIo5QF00RDxUQb4qq(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i8 = size - paddingLeft;
        int i9 = this.f2820VItLRw50eXTZeEfGl0;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = i9 + (i11 / i10);
        int childCount = getChildCount();
        int iMax = 0;
        int i13 = 0;
        boolean z4 = false;
        int i14 = 0;
        int iMax2 = 0;
        int i15 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i16 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i17 = i14 + 1;
                if (z5) {
                    int i18 = this.f2821WWC27LAMFqFFBzfbNw;
                    i7 = i17;
                    r14 = 0;
                    childAt.setPadding(i18, 0, i18, 0);
                } else {
                    i7 = i17;
                    r14 = 0;
                }
                HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = (HJFh0TGMpafqLE9haL) childAt.getLayoutParams();
                hJFh0TGMpafqLE9haL.f2827KYHag8HRDlnO3X9zmZ = r14;
                hJFh0TGMpafqLE9haL.f2826HJFh0TGMpafqLE9haL = r14;
                hJFh0TGMpafqLE9haL.f2830s3fjYDxWOUexjjVgyA = r14;
                hJFh0TGMpafqLE9haL.f2831zZKhbgvUfsK4AEX3r0 = r14;
                ((LinearLayout.LayoutParams) hJFh0TGMpafqLE9haL).leftMargin = r14;
                ((LinearLayout.LayoutParams) hJFh0TGMpafqLE9haL).rightMargin = r14;
                hJFh0TGMpafqLE9haL.f2828husNiw3snxdgZPAGJm = z5 && ((ActionMenuItemView) childAt).Y43RdunnpKgpbny0lE();
                int iW3RZ2dTDKrKpS5Mxdk = W3RZ2dTDKrKpS5Mxdk(childAt, i12, hJFh0TGMpafqLE9haL.f2829lEeR5KfoEr4xU5yHH7 ? 1 : i10, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iW3RZ2dTDKrKpS5Mxdk);
                if (hJFh0TGMpafqLE9haL.f2831zZKhbgvUfsK4AEX3r0) {
                    i15++;
                }
                if (hJFh0TGMpafqLE9haL.f2829lEeR5KfoEr4xU5yHH7) {
                    z4 = true;
                }
                i10 -= iW3RZ2dTDKrKpS5Mxdk;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iW3RZ2dTDKrKpS5Mxdk == 1) {
                    j |= 1 << i13;
                    iMax = iMax;
                }
                i14 = i7;
            }
            i13++;
            size2 = i16;
        }
        int i19 = size2;
        boolean z6 = z4 && i14 == 2;
        boolean z7 = false;
        while (i15 > 0 && i10 > 0) {
            int i20 = Integer.MAX_VALUE;
            int i21 = 0;
            int i22 = 0;
            long j2 = 0;
            while (i22 < childCount) {
                boolean z8 = z7;
                HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = (HJFh0TGMpafqLE9haL) getChildAt(i22).getLayoutParams();
                int i23 = iMax;
                if (hJFh0TGMpafqLE9haL2.f2831zZKhbgvUfsK4AEX3r0) {
                    int i24 = hJFh0TGMpafqLE9haL2.f2830s3fjYDxWOUexjjVgyA;
                    if (i24 < i20) {
                        j2 = 1 << i22;
                        i20 = i24;
                        i21 = 1;
                    } else if (i24 == i20) {
                        i21++;
                        j2 |= 1 << i22;
                    }
                }
                i22++;
                iMax = i23;
                z7 = z8;
            }
            z = z7;
            i5 = iMax;
            j |= j2;
            if (i21 > i10) {
                i3 = mode;
                i4 = i8;
                break;
            }
            int i25 = i20 + 1;
            int i26 = 0;
            while (i26 < childCount) {
                View childAt2 = getChildAt(i26);
                HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL3 = (HJFh0TGMpafqLE9haL) childAt2.getLayoutParams();
                int i27 = i8;
                int i28 = mode;
                long j3 = 1 << i26;
                if ((j2 & j3) == 0) {
                    if (hJFh0TGMpafqLE9haL3.f2830s3fjYDxWOUexjjVgyA == i25) {
                        j |= j3;
                    }
                    z3 = z6;
                } else {
                    if (z6 && hJFh0TGMpafqLE9haL3.f2828husNiw3snxdgZPAGJm && i10 == 1) {
                        int i29 = this.f2821WWC27LAMFqFFBzfbNw;
                        z3 = z6;
                        childAt2.setPadding(i29 + i12, 0, i29, 0);
                    } else {
                        z3 = z6;
                    }
                    hJFh0TGMpafqLE9haL3.f2830s3fjYDxWOUexjjVgyA++;
                    hJFh0TGMpafqLE9haL3.f2827KYHag8HRDlnO3X9zmZ = true;
                    i10--;
                }
                i26++;
                mode = i28;
                i8 = i27;
                z6 = z3;
            }
            iMax = i5;
            z7 = true;
        }
        i3 = mode;
        i4 = i8;
        z = z7;
        i5 = iMax;
        boolean z9 = !z4 && i14 == 1;
        if (i10 <= 0 || j == 0 || (i10 >= i14 - 1 && !z9 && iMax2 <= 1)) {
            i6 = 0;
            z2 = z;
        } else {
            float fBitCount = Long.bitCount(j);
            if (z9) {
                i6 = 0;
            } else {
                i6 = 0;
                if ((j & 1) != 0 && !((HJFh0TGMpafqLE9haL) getChildAt(0).getLayoutParams()).f2828husNiw3snxdgZPAGJm) {
                    fBitCount -= 0.5f;
                }
                int i30 = childCount - 1;
                if ((j & (1 << i30)) != 0 && !((HJFh0TGMpafqLE9haL) getChildAt(i30).getLayoutParams()).f2828husNiw3snxdgZPAGJm) {
                    fBitCount -= 0.5f;
                }
            }
            int i31 = fBitCount > 0.0f ? (int) ((i10 * i12) / fBitCount) : i6;
            z2 = z;
            for (int i32 = i6; i32 < childCount; i32++) {
                if ((j & (1 << i32)) != 0) {
                    View childAt3 = getChildAt(i32);
                    HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL4 = (HJFh0TGMpafqLE9haL) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        hJFh0TGMpafqLE9haL4.f2826HJFh0TGMpafqLE9haL = i31;
                        hJFh0TGMpafqLE9haL4.f2827KYHag8HRDlnO3X9zmZ = true;
                        if (i32 == 0 && !hJFh0TGMpafqLE9haL4.f2828husNiw3snxdgZPAGJm) {
                            ((LinearLayout.LayoutParams) hJFh0TGMpafqLE9haL4).leftMargin = (-i31) / 2;
                        }
                        z2 = true;
                    } else if (hJFh0TGMpafqLE9haL4.f2829lEeR5KfoEr4xU5yHH7) {
                        hJFh0TGMpafqLE9haL4.f2826HJFh0TGMpafqLE9haL = i31;
                        hJFh0TGMpafqLE9haL4.f2827KYHag8HRDlnO3X9zmZ = true;
                        ((LinearLayout.LayoutParams) hJFh0TGMpafqLE9haL4).rightMargin = (-i31) / 2;
                        z2 = true;
                    } else {
                        if (i32 != 0) {
                            ((LinearLayout.LayoutParams) hJFh0TGMpafqLE9haL4).leftMargin = i31 / 2;
                        }
                        if (i32 != childCount - 1) {
                            ((LinearLayout.LayoutParams) hJFh0TGMpafqLE9haL4).rightMargin = i31 / 2;
                        }
                    }
                }
            }
        }
        if (z2) {
            for (int i33 = i6; i33 < childCount; i33++) {
                View childAt4 = getChildAt(i33);
                HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL5 = (HJFh0TGMpafqLE9haL) childAt4.getLayoutParams();
                if (hJFh0TGMpafqLE9haL5.f2827KYHag8HRDlnO3X9zmZ) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((hJFh0TGMpafqLE9haL5.f2830s3fjYDxWOUexjjVgyA * i12) + hJFh0TGMpafqLE9haL5.f2826HJFh0TGMpafqLE9haL, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i4, i3 != 1073741824 ? i5 : i19);
    }

    @Override // androidx.appcompat.widget.s3fjYDxWOUexjjVgyA, android.view.ViewGroup
    /* renamed from: THTDvPxsHqMeGb512f, reason: merged with bridge method [inline-methods] */
    public HJFh0TGMpafqLE9haL generateLayoutParams(AttributeSet attributeSet) {
        return new HJFh0TGMpafqLE9haL(getContext(), attributeSet);
    }

    public void VItLRw50eXTZeEfGl0() {
        androidx.appcompat.widget.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f2818R9SAhYMerGybF9OAjL;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.LIMtzhnLwQyigzK0KO();
        }
    }

    @Override // androidx.appcompat.widget.s3fjYDxWOUexjjVgyA, android.view.ViewGroup
    /* renamed from: WWC27LAMFqFFBzfbNw, reason: merged with bridge method [inline-methods] */
    public HJFh0TGMpafqLE9haL generateDefaultLayoutParams() {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = new HJFh0TGMpafqLE9haL(-2, -2);
        ((LinearLayout.LayoutParams) hJFh0TGMpafqLE9haL).gravity = 16;
        return hJFh0TGMpafqLE9haL;
    }

    public void XzJ1BS7H9Ilbkv4eVM(androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        this.f2817OANkd3mP6AYvwbNLJM = zzkhbgvufsk4aex3r0;
    }

    @Override // androidx.appcompat.widget.s3fjYDxWOUexjjVgyA, android.view.ViewGroup
    /* renamed from: ao3wqKm5CXFuvC0q47, reason: merged with bridge method [inline-methods] */
    public HJFh0TGMpafqLE9haL generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = layoutParams instanceof HJFh0TGMpafqLE9haL ? new HJFh0TGMpafqLE9haL((HJFh0TGMpafqLE9haL) layoutParams) : new HJFh0TGMpafqLE9haL(layoutParams);
        if (((LinearLayout.LayoutParams) hJFh0TGMpafqLE9haL).gravity <= 0) {
            ((LinearLayout.LayoutParams) hJFh0TGMpafqLE9haL).gravity = 16;
        }
        return hJFh0TGMpafqLE9haL;
    }

    @Override // androidx.appcompat.widget.s3fjYDxWOUexjjVgyA, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof HJFh0TGMpafqLE9haL;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public boolean e2F9F6h8YJxTHwLCa0() {
        androidx.appcompat.widget.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f2818R9SAhYMerGybF9OAjL;
        return leer5kfoer4xu5yhh7 != null && leer5kfoer4xu5yhh7.OqIo5QF00RDxUQb4qq();
    }

    public Menu getMenu() {
        if (this.f2817OANkd3mP6AYvwbNLJM == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = new androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0(context);
            this.f2817OANkd3mP6AYvwbNLJM = zzkhbgvufsk4aex3r0;
            zzkhbgvufsk4aex3r0.PPkm9uUfOJHHYveeLT(new zZKhbgvUfsK4AEX3r0());
            androidx.appcompat.widget.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new androidx.appcompat.widget.lEeR5KfoEr4xU5yHH7(context);
            this.f2818R9SAhYMerGybF9OAjL = leer5kfoer4xu5yhh7;
            leer5kfoer4xu5yhh7.W3RZ2dTDKrKpS5Mxdk(true);
            androidx.appcompat.widget.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = this.f2818R9SAhYMerGybF9OAjL;
            TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 s3fjydxwouexjjvgya = this.f2815G7AC3DWIx9i9fdanjk;
            if (s3fjydxwouexjjvgya == null) {
                s3fjydxwouexjjvgya = new s3fjYDxWOUexjjVgyA();
            }
            leer5kfoer4xu5yhh72.pbVGzGjWvY2LDXC8vo(s3fjydxwouexjjvgya);
            this.f2817OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA(this.f2818R9SAhYMerGybF9OAjL, this.f2825zaq8hOURtfwbcX17cG);
            this.f2818R9SAhYMerGybF9OAjL.XzJ1BS7H9Ilbkv4eVM(this);
        }
        return this.f2817OANkd3mP6AYvwbNLJM;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f2818R9SAhYMerGybF9OAjL.VItLRw50eXTZeEfGl0();
    }

    public int getPopupTheme() {
        return this.f2823sTkWmhpZ5b1ArQIw4K;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public boolean jCtUeU2YI1poCxWcjm(int i) {
        boolean zLEeR5KfoEr4xU5yHH7 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof lEeR5KfoEr4xU5yHH7)) {
            zLEeR5KfoEr4xU5yHH7 = ((lEeR5KfoEr4xU5yHH7) childAt).lEeR5KfoEr4xU5yHH7();
        }
        return (i <= 0 || !(childAt2 instanceof lEeR5KfoEr4xU5yHH7)) ? zLEeR5KfoEr4xU5yHH7 : zLEeR5KfoEr4xU5yHH7 | ((lEeR5KfoEr4xU5yHH7) childAt2).s3fjYDxWOUexjjVgyA();
    }

    @Override // androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA
    public boolean lEeR5KfoEr4xU5yHH7(androidx.appcompat.view.menu.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        return this.f2817OANkd3mP6AYvwbNLJM.GyWRxpdt1T8mEJXPoD(husniw3snxdgzpagjm, 0);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f2818R9SAhYMerGybF9OAjL;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.Z9WdNiOsPR0y54zHW4(false);
            if (this.f2818R9SAhYMerGybF9OAjL.ao3wqKm5CXFuvC0q47()) {
                this.f2818R9SAhYMerGybF9OAjL.WWC27LAMFqFFBzfbNw();
                this.f2818R9SAhYMerGybF9OAjL.OqIo5QF00RDxUQb4qq();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VItLRw50eXTZeEfGl0();
    }

    @Override // androidx.appcompat.widget.s3fjYDxWOUexjjVgyA, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f2816LIMtzhnLwQyigzK0KO) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zLEeR5KfoEr4xU5yHH7 = cT5Hs3CQpLK8NvlZAw.lEeR5KfoEr4xU5yHH7(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = (HJFh0TGMpafqLE9haL) childAt.getLayoutParams();
                if (hJFh0TGMpafqLE9haL.f2829lEeR5KfoEr4xU5yHH7) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (jCtUeU2YI1poCxWcjm(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zLEeR5KfoEr4xU5yHH7) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) hJFh0TGMpafqLE9haL).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) hJFh0TGMpafqLE9haL).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) hJFh0TGMpafqLE9haL).leftMargin) + ((LinearLayout.LayoutParams) hJFh0TGMpafqLE9haL).rightMargin;
                    jCtUeU2YI1poCxWcjm(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (zLEeR5KfoEr4xU5yHH7) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = (HJFh0TGMpafqLE9haL) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !hJFh0TGMpafqLE9haL2.f2829lEeR5KfoEr4xU5yHH7) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) hJFh0TGMpafqLE9haL2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) hJFh0TGMpafqLE9haL2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL3 = (HJFh0TGMpafqLE9haL) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !hJFh0TGMpafqLE9haL3.f2829lEeR5KfoEr4xU5yHH7) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) hJFh0TGMpafqLE9haL3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = i18 + measuredWidth4 + ((LinearLayout.LayoutParams) hJFh0TGMpafqLE9haL3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.s3fjYDxWOUexjjVgyA, android.view.View
    public void onMeasure(int i, int i2) {
        androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0;
        boolean z = this.f2816LIMtzhnLwQyigzK0KO;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f2816LIMtzhnLwQyigzK0KO = z2;
        if (z != z2) {
            this.f2814A49QRPHynYLCBN0SqP = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f2816LIMtzhnLwQyigzK0KO && (zzkhbgvufsk4aex3r0 = this.f2817OANkd3mP6AYvwbNLJM) != null && size != this.f2814A49QRPHynYLCBN0SqP) {
            this.f2814A49QRPHynYLCBN0SqP = size;
            zzkhbgvufsk4aex3r0.OqIo5QF00RDxUQb4qq(true);
        }
        int childCount = getChildCount();
        if (this.f2816LIMtzhnLwQyigzK0KO && childCount > 0) {
            OqIo5QF00RDxUQb4qq(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = (HJFh0TGMpafqLE9haL) getChildAt(i3).getLayoutParams();
            ((LinearLayout.LayoutParams) hJFh0TGMpafqLE9haL).rightMargin = 0;
            ((LinearLayout.LayoutParams) hJFh0TGMpafqLE9haL).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f2818R9SAhYMerGybF9OAjL.jCtUeU2YI1poCxWcjm(z);
    }

    public void setOnMenuItemClickListener(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        this.f2819THTDvPxsHqMeGb512f = husniw3snxdgzpagjm;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f2818R9SAhYMerGybF9OAjL.tXWeW0sqVddf7ZBflq(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f2822Y43RdunnpKgpbny0lE = z;
    }

    public void setPopupTheme(int i) {
        if (this.f2823sTkWmhpZ5b1ArQIw4K != i) {
            this.f2823sTkWmhpZ5b1ArQIw4K = i;
            if (i == 0) {
                this.f2825zaq8hOURtfwbcX17cG = getContext();
            } else {
                this.f2825zaq8hOURtfwbcX17cG = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f2818R9SAhYMerGybF9OAjL = leer5kfoer4xu5yhh7;
        leer5kfoer4xu5yhh7.XzJ1BS7H9Ilbkv4eVM(this);
    }

    public boolean tXWeW0sqVddf7ZBflq() {
        androidx.appcompat.widget.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f2818R9SAhYMerGybF9OAjL;
        return leer5kfoer4xu5yhh7 != null && leer5kfoer4xu5yhh7.ao3wqKm5CXFuvC0q47();
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f2820VItLRw50eXTZeEfGl0 = (int) (56.0f * f);
        this.f2821WWC27LAMFqFFBzfbNw = (int) (f * 4.0f);
        this.f2825zaq8hOURtfwbcX17cG = context;
        this.f2823sTkWmhpZ5b1ArQIw4K = 0;
    }
}
