package androidx.core.widget;

import OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP;
import OqIo5QF00RDxUQb4qq.WWC27LAMFqFFBzfbNw;
import W3RZ2dTDKrKpS5Mxdk.OANkd3mP6AYvwbNLJM;
import W3RZ2dTDKrKpS5Mxdk.THTDvPxsHqMeGb512f;
import W3RZ2dTDKrKpS5Mxdk.VItLRw50eXTZeEfGl0;
import W3RZ2dTDKrKpS5Mxdk.aPyGSIylzVNKPT1Bls;
import W3RZ2dTDKrKpS5Mxdk.ao3wqKm5CXFuvC0q47;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements THTDvPxsHqMeGb512f {

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public final ao3wqKm5CXFuvC0q47 f3264A49QRPHynYLCBN0SqP;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public View f3265Acstmh57AKoSEkEFNJ;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public int f3266G7AC3DWIx9i9fdanjk;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final Rect f3267HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public boolean f3268IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public EdgeEffect f3269KYHag8HRDlnO3X9zmZ;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public husNiw3snxdgZPAGJm f3270LIMtzhnLwQyigzK0KO;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public int f3271OANkd3mP6AYvwbNLJM;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public final int[] f3272R9SAhYMerGybF9OAjL;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public boolean f3273T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public int f3274TCyPEKSzIyweCN5yp1;

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public final HJFh0TGMpafqLE9haL f3275THTDvPxsHqMeGb512f;

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public final VItLRw50eXTZeEfGl0 f3276VItLRw50eXTZeEfGl0;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public float f3277WWC27LAMFqFFBzfbNw;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public final int[] f3278Y43RdunnpKgpbny0lE;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public boolean f3279Z9WdNiOsPR0y54zHW4;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public int f3280aPyGSIylzVNKPT1Bls;

    /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
    public aPyGSIylzVNKPT1Bls f3281ao3wqKm5CXFuvC0q47;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public VelocityTracker f3282e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public boolean f3283hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public EdgeEffect f3284husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final float f3285lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public boolean f3286pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public long f3287s3fjYDxWOUexjjVgyA;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public int f3288sTkWmhpZ5b1ArQIw4K;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public int f3289xHA29AmDt6y96AnB3t;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public OverScroller f3290zZKhbgvUfsK4AEX3r0;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public int f3291zaq8hOURtfwbcX17cG;

    /* renamed from: OUd9THiLjZndMj0qdF, reason: collision with root package name */
    public static final float f3261OUd9THiLjZndMj0qdF = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: jCtUeU2YI1poCxWcjm, reason: collision with root package name */
    public static final lEeR5KfoEr4xU5yHH7 f3263jCtUeU2YI1poCxWcjm = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: XzJ1BS7H9Ilbkv4eVM, reason: collision with root package name */
    public static final int[] f3262XzJ1BS7H9Ilbkv4eVM = {R.attr.fillViewport};

    public class HJFh0TGMpafqLE9haL implements OANkd3mP6AYvwbNLJM {
        public HJFh0TGMpafqLE9haL() {
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.OANkd3mP6AYvwbNLJM
        public void HJFh0TGMpafqLE9haL() {
            NestedScrollView.this.f3290zZKhbgvUfsK4AEX3r0.abortAnimation();
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.OANkd3mP6AYvwbNLJM
        public boolean lEeR5KfoEr4xU5yHH7(float f) {
            if (f == 0.0f) {
                return false;
            }
            HJFh0TGMpafqLE9haL();
            NestedScrollView.this.xHA29AmDt6y96AnB3t((int) f);
            return true;
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.OANkd3mP6AYvwbNLJM
        public float s3fjYDxWOUexjjVgyA() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }
    }

    public static class husNiw3snxdgZPAGJm extends View.BaseSavedState {
        public static final Parcelable.Creator<husNiw3snxdgZPAGJm> CREATOR = new lEeR5KfoEr4xU5yHH7();

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f3293lEeR5KfoEr4xU5yHH7;

        public class lEeR5KfoEr4xU5yHH7 implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
            public husNiw3snxdgZPAGJm createFromParcel(Parcel parcel) {
                return new husNiw3snxdgZPAGJm(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
            public husNiw3snxdgZPAGJm[] newArray(int i) {
                return new husNiw3snxdgZPAGJm[i];
            }
        }

        public husNiw3snxdgZPAGJm(Parcel parcel) {
            super(parcel);
            this.f3293lEeR5KfoEr4xU5yHH7 = parcel.readInt();
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3293lEeR5KfoEr4xU5yHH7 + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3293lEeR5KfoEr4xU5yHH7);
        }

        public husNiw3snxdgZPAGJm(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 extends W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 {
        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public boolean Acstmh57AKoSEkEFNJ(View view, int i, Bundle bundle) {
            if (super.Acstmh57AKoSEkEFNJ(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.cT5Hs3CQpLK8NvlZAw(0, iMax, true);
                    return true;
                }
                if (i != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.cT5Hs3CQpLK8NvlZAw(0, iMin, true);
            return true;
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public void KYHag8HRDlnO3X9zmZ(View view, AccessibilityEvent accessibilityEvent) {
            super.KYHag8HRDlnO3X9zmZ(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7(accessibilityEvent, nestedScrollView.getScrollX());
            WWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public void TCyPEKSzIyweCN5yp1(View view, A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
            int scrollRange;
            super.TCyPEKSzIyweCN5yp1(view, a49QRPHynYLCBN0SqP);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            a49QRPHynYLCBN0SqP.zXY7dgnTfw9Pd9RXel(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            a49QRPHynYLCBN0SqP.HZ4bptRS9XIcK1CV95(true);
            if (nestedScrollView.getScrollY() > 0) {
                a49QRPHynYLCBN0SqP.s3fjYDxWOUexjjVgyA(A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7.f1237sTkWmhpZ5b1ArQIw4K);
                a49QRPHynYLCBN0SqP.s3fjYDxWOUexjjVgyA(A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7.f1210OUd9THiLjZndMj0qdF);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                a49QRPHynYLCBN0SqP.s3fjYDxWOUexjjVgyA(A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7.f1241zaq8hOURtfwbcX17cG);
                a49QRPHynYLCBN0SqP.s3fjYDxWOUexjjVgyA(A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7.f1222XzJ1BS7H9Ilbkv4eVM);
            }
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public static boolean lEeR5KfoEr4xU5yHH7(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface zZKhbgvUfsK4AEX3r0 {
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, G7AC3DWIx9i9fdanjk.lEeR5KfoEr4xU5yHH7.f232HJFh0TGMpafqLE9haL);
    }

    public static int e54J8UWNHWALQNixXM(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    public static boolean tXWeW0sqVddf7ZBflq(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && tXWeW0sqVddf7ZBflq((View) parent, view2);
    }

    public final float A49QRPHynYLCBN0SqP(int i) {
        double dLog = Math.log((Math.abs(i) * 0.35f) / (this.f3285lEeR5KfoEr4xU5yHH7 * 0.015f));
        float f = f3261OUd9THiLjZndMj0qdF;
        return (float) (this.f3285lEeR5KfoEr4xU5yHH7 * 0.015f * Math.exp((f / (f - 1.0d)) * dLog));
    }

    public final boolean Acstmh57AKoSEkEFNJ() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    public boolean DfpieXfdYs58yZAiXY(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i9 = i3 + i;
        int i10 = !z6 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z7 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
            z2 = true;
        } else if (i9 < i13) {
            z2 = true;
            i9 = i13;
        } else {
            z2 = false;
        }
        if (i11 > i16) {
            i11 = i16;
            z3 = true;
        } else if (i11 < i15) {
            z3 = true;
            i11 = i15;
        } else {
            z3 = false;
        }
        if (z3 && !VItLRw50eXTZeEfGl0(1)) {
            this.f3290zZKhbgvUfsK4AEX3r0.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z2, z3);
        return z2 || z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View G7AC3DWIx9i9fdanjk(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            r9 = 1
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = r9
            goto L29
        L28:
            r10 = r3
        L29:
            if (r2 != 0) goto L2e
            r2 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r2.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r2.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = r9
            goto L41
        L40:
            r7 = r3
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r2 = r6
            r5 = r9
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r2 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.G7AC3DWIx9i9fdanjk(boolean, int, int):android.view.View");
    }

    public final void GyWRxpdt1T8mEJXPoD(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3288sTkWmhpZ5b1ArQIw4K) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3274TCyPEKSzIyweCN5yp1 = (int) motionEvent.getY(i);
            this.f3288sTkWmhpZ5b1ArQIw4K = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f3282e54J8UWNHWALQNixXM;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.WWC27LAMFqFFBzfbNw
    public void HJFh0TGMpafqLE9haL(View view, int i, int i2, int[] iArr, int i3) {
        aPyGSIylzVNKPT1Bls(i, i2, iArr, null, i3);
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.WWC27LAMFqFFBzfbNw
    public boolean KYHag8HRDlnO3X9zmZ(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public final void KqgKJKIWne3kz1AdHk() {
        VelocityTracker velocityTracker = this.f3282e54J8UWNHWALQNixXM;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3282e54J8UWNHWALQNixXM = null;
        }
    }

    public boolean LIMtzhnLwQyigzK0KO(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f3267HJFh0TGMpafqLE9haL;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f3267HJFh0TGMpafqLE9haL.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f3267HJFh0TGMpafqLE9haL;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f3267HJFh0TGMpafqLE9haL;
        return lLKzvdU99Iw80uVD5I(i, rect3.top, rect3.bottom);
    }

    public final boolean LU0fFDMACqnfIfA1AZ(Rect rect, boolean z) {
        int iT9PhQIpGRhE4yZDm1C = T9PhQIpGRhE4yZDm1C(rect);
        boolean z2 = iT9PhQIpGRhE4yZDm1C != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iT9PhQIpGRhE4yZDm1C);
            } else {
                YlLW4G6OV9TFyuw5ix(0, iT9PhQIpGRhE4yZDm1C);
            }
        }
        return z2;
    }

    public void OANkd3mP6AYvwbNLJM(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f3276VItLRw50eXTZeEfGl0.husNiw3snxdgZPAGJm(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void OUd9THiLjZndMj0qdF() {
        if (this.f3282e54J8UWNHWALQNixXM == null) {
            this.f3282e54J8UWNHWALQNixXM = VelocityTracker.obtain();
        }
    }

    public final void OqIo5QF00RDxUQb4qq(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3276VItLRw50eXTZeEfGl0.husNiw3snxdgZPAGJm(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    public final int PPkm9uUfOJHHYveeLT(int i, float f) {
        float fZZKhbgvUfsK4AEX3r0;
        EdgeEffect edgeEffect;
        float width = f / getWidth();
        float height = i / getHeight();
        float f2 = 0.0f;
        if (PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this.f3284husNiw3snxdgZPAGJm) != 0.0f) {
            fZZKhbgvUfsK4AEX3r0 = -PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(this.f3284husNiw3snxdgZPAGJm, -height, width);
            if (PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this.f3284husNiw3snxdgZPAGJm) == 0.0f) {
                edgeEffect = this.f3284husNiw3snxdgZPAGJm;
                edgeEffect.onRelease();
            }
            f2 = fZZKhbgvUfsK4AEX3r0;
        } else if (PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this.f3269KYHag8HRDlnO3X9zmZ) != 0.0f) {
            fZZKhbgvUfsK4AEX3r0 = PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(this.f3269KYHag8HRDlnO3X9zmZ, height, 1.0f - width);
            if (PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this.f3269KYHag8HRDlnO3X9zmZ) == 0.0f) {
                edgeEffect = this.f3269KYHag8HRDlnO3X9zmZ;
                edgeEffect.onRelease();
            }
            f2 = fZZKhbgvUfsK4AEX3r0;
        }
        int iRound = Math.round(f2 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    public boolean R9SAhYMerGybF9OAjL(KeyEvent keyEvent) {
        this.f3267HJFh0TGMpafqLE9haL.setEmpty();
        int i = 130;
        if (!Z9WdNiOsPR0y54zHW4()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19) {
            if (keyCode != 20) {
                if (keyCode != 62) {
                    if (keyCode != 92) {
                        if (keyCode != 93) {
                            if (keyCode == 122) {
                                e2F9F6h8YJxTHwLCa0(33);
                                return false;
                            }
                            if (keyCode != 123) {
                                return false;
                            }
                        }
                    }
                } else if (keyEvent.isShiftPressed()) {
                    i = 33;
                }
                e2F9F6h8YJxTHwLCa0(i);
                return false;
            }
            if (!keyEvent.isAltPressed()) {
                return pbVGzGjWvY2LDXC8vo(130);
            }
            return LIMtzhnLwQyigzK0KO(130);
        }
        if (!keyEvent.isAltPressed()) {
            return pbVGzGjWvY2LDXC8vo(33);
        }
        return LIMtzhnLwQyigzK0KO(33);
    }

    public int T9PhQIpGRhE4yZDm1C(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final void TCyPEKSzIyweCN5yp1() {
        this.f3290zZKhbgvUfsK4AEX3r0.abortAnimation();
        Uj8rPa1EWADtk6Oe0S(1);
    }

    public final void THTDvPxsHqMeGb512f() {
        VelocityTracker velocityTracker = this.f3282e54J8UWNHWALQNixXM;
        if (velocityTracker == null) {
            this.f3282e54J8UWNHWALQNixXM = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final int ToH8yzk8U1nKT0PUfY(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        EdgeEffect edgeEffect;
        VelocityTracker velocityTracker;
        if (i3 == 1) {
            hUNBy66ZO1wVLJGW3l(2, i3);
        }
        boolean z2 = false;
        if (aPyGSIylzVNKPT1Bls(0, i, this.f3272R9SAhYMerGybF9OAjL, this.f3278Y43RdunnpKgpbny0lE, i3)) {
            i4 = i - this.f3272R9SAhYMerGybF9OAjL[1];
            i5 = this.f3278Y43RdunnpKgpbny0lE[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z3 = Acstmh57AKoSEkEFNJ() && !z;
        boolean z4 = DfpieXfdYs58yZAiXY(0, i4, 0, scrollY, 0, scrollRange, 0, 0, true) && !VItLRw50eXTZeEfGl0(i3);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f3272R9SAhYMerGybF9OAjL;
        iArr[1] = 0;
        OANkd3mP6AYvwbNLJM(0, scrollY2, 0, i4 - scrollY2, this.f3278Y43RdunnpKgpbny0lE, i3, iArr);
        int i6 = i5 + this.f3278Y43RdunnpKgpbny0lE[1];
        int i7 = i4 - this.f3272R9SAhYMerGybF9OAjL[1];
        int i8 = scrollY + i7;
        if (i8 < 0) {
            if (z3) {
                PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(this.f3284husNiw3snxdgZPAGJm, (-i7) / getHeight(), i2 / getWidth());
                if (!this.f3269KYHag8HRDlnO3X9zmZ.isFinished()) {
                    edgeEffect = this.f3269KYHag8HRDlnO3X9zmZ;
                    edgeEffect.onRelease();
                }
            }
        } else if (i8 > scrollRange && z3) {
            PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(this.f3269KYHag8HRDlnO3X9zmZ, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!this.f3284husNiw3snxdgZPAGJm.isFinished()) {
                edgeEffect = this.f3284husNiw3snxdgZPAGJm;
                edgeEffect.onRelease();
            }
        }
        if (this.f3284husNiw3snxdgZPAGJm.isFinished() && this.f3269KYHag8HRDlnO3X9zmZ.isFinished()) {
            z2 = z4;
        } else {
            postInvalidateOnAnimation();
        }
        if (z2 && i3 == 0 && (velocityTracker = this.f3282e54J8UWNHWALQNixXM) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            Uj8rPa1EWADtk6Oe0S(i3);
            this.f3284husNiw3snxdgZPAGJm.onRelease();
            this.f3269KYHag8HRDlnO3X9zmZ.onRelease();
        }
        return i6;
    }

    public void Uj8rPa1EWADtk6Oe0S(int i) {
        this.f3276VItLRw50eXTZeEfGl0.sTkWmhpZ5b1ArQIw4K(i);
    }

    public boolean VItLRw50eXTZeEfGl0(int i) {
        return this.f3276VItLRw50eXTZeEfGl0.Z9WdNiOsPR0y54zHW4(i);
    }

    public final boolean W3RZ2dTDKrKpS5Mxdk(View view, int i, int i2) {
        view.getDrawingRect(this.f3267HJFh0TGMpafqLE9haL);
        offsetDescendantRectToMyCoords(view, this.f3267HJFh0TGMpafqLE9haL);
        return this.f3267HJFh0TGMpafqLE9haL.bottom + i >= getScrollY() && this.f3267HJFh0TGMpafqLE9haL.top - i <= getScrollY() + i2;
    }

    public final boolean WWC27LAMFqFFBzfbNw(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    public final void XdzLv4NdAtTYoEzVzB(View view) {
        view.getDrawingRect(this.f3267HJFh0TGMpafqLE9haL);
        offsetDescendantRectToMyCoords(view, this.f3267HJFh0TGMpafqLE9haL);
        int iT9PhQIpGRhE4yZDm1C = T9PhQIpGRhE4yZDm1C(this.f3267HJFh0TGMpafqLE9haL);
        if (iT9PhQIpGRhE4yZDm1C != 0) {
            scrollBy(0, iT9PhQIpGRhE4yZDm1C);
        }
    }

    public final boolean XzJ1BS7H9Ilbkv4eVM(View view) {
        return !W3RZ2dTDKrKpS5Mxdk(view, 0, getHeight());
    }

    public final void Y43RdunnpKgpbny0lE() {
        this.f3288sTkWmhpZ5b1ArQIw4K = -1;
        this.f3279Z9WdNiOsPR0y54zHW4 = false;
        KqgKJKIWne3kz1AdHk();
        Uj8rPa1EWADtk6Oe0S(0);
        this.f3284husNiw3snxdgZPAGJm.onRelease();
        this.f3269KYHag8HRDlnO3X9zmZ.onRelease();
    }

    public final void YlLW4G6OV9TFyuw5ix(int i, int i2) {
        oocVJL811qFf0j0XXZ(i, i2, 250, false);
    }

    public final boolean Z9WdNiOsPR0y54zHW4() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public final void aAp6BD79BhftLCnuvf(boolean z) {
        if (z) {
            hUNBy66ZO1wVLJGW3l(2, 1);
        } else {
            Uj8rPa1EWADtk6Oe0S(1);
        }
        this.f3289xHA29AmDt6y96AnB3t = getScrollY();
        postInvalidateOnAnimation();
    }

    public boolean aPyGSIylzVNKPT1Bls(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f3276VItLRw50eXTZeEfGl0.zZKhbgvUfsK4AEX3r0(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public final void ao3wqKm5CXFuvC0q47() {
        this.f3290zZKhbgvUfsK4AEX3r0 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3280aPyGSIylzVNKPT1Bls = viewConfiguration.getScaledTouchSlop();
        this.f3271OANkd3mP6AYvwbNLJM = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3291zaq8hOURtfwbcX17cG = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final boolean bMSdooljgH14Jgudph(MotionEvent motionEvent) {
        boolean z;
        if (PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this.f3284husNiw3snxdgZPAGJm) != 0.0f) {
            PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(this.f3284husNiw3snxdgZPAGJm, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this.f3269KYHag8HRDlnO3X9zmZ) == 0.0f) {
            return z;
        }
        PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(this.f3269KYHag8HRDlnO3X9zmZ, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public void cT5Hs3CQpLK8NvlZAw(int i, int i2, boolean z) {
        udcVtCzLTM1Loe9KrX(i, i2, 250, z);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f3290zZKhbgvUfsK4AEX3r0.isFinished()) {
            return;
        }
        this.f3290zZKhbgvUfsK4AEX3r0.computeScrollOffset();
        int currY = this.f3290zZKhbgvUfsK4AEX3r0.getCurrY();
        int iHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(currY - this.f3289xHA29AmDt6y96AnB3t);
        this.f3289xHA29AmDt6y96AnB3t = currY;
        int[] iArr = this.f3272R9SAhYMerGybF9OAjL;
        iArr[1] = 0;
        aPyGSIylzVNKPT1Bls(0, iHoXrIDAFrSwfShk8da, iArr, null, 1);
        int i = iHoXrIDAFrSwfShk8da - this.f3272R9SAhYMerGybF9OAjL[1];
        int scrollRange = getScrollRange();
        if (i != 0) {
            int scrollY = getScrollY();
            DfpieXfdYs58yZAiXY(0, i, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i2 = i - scrollY2;
            int[] iArr2 = this.f3272R9SAhYMerGybF9OAjL;
            iArr2[1] = 0;
            OANkd3mP6AYvwbNLJM(0, scrollY2, 0, i2, this.f3278Y43RdunnpKgpbny0lE, 1, iArr2);
            i = i2 - this.f3272R9SAhYMerGybF9OAjL[1];
        }
        if (i != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i < 0) {
                    if (this.f3284husNiw3snxdgZPAGJm.isFinished()) {
                        edgeEffect = this.f3284husNiw3snxdgZPAGJm;
                        edgeEffect.onAbsorb((int) this.f3290zZKhbgvUfsK4AEX3r0.getCurrVelocity());
                    }
                } else if (this.f3269KYHag8HRDlnO3X9zmZ.isFinished()) {
                    edgeEffect = this.f3269KYHag8HRDlnO3X9zmZ;
                    edgeEffect.onAbsorb((int) this.f3290zZKhbgvUfsK4AEX3r0.getCurrVelocity());
                }
            }
            TCyPEKSzIyweCN5yp1();
        }
        if (this.f3290zZKhbgvUfsK4AEX3r0.isFinished()) {
            Uj8rPa1EWADtk6Oe0S(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || R9SAhYMerGybF9OAjL(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f3276VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f3276VItLRw50eXTZeEfGl0.s3fjYDxWOUexjjVgyA(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return aPyGSIylzVNKPT1Bls(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f3276VItLRw50eXTZeEfGl0.KYHag8HRDlnO3X9zmZ(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f3284husNiw3snxdgZPAGJm.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f3284husNiw3snxdgZPAGJm.setSize(width, height);
            if (this.f3284husNiw3snxdgZPAGJm.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f3269KYHag8HRDlnO3X9zmZ.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f3269KYHag8HRDlnO3X9zmZ.setSize(width2, height2);
        if (this.f3269KYHag8HRDlnO3X9zmZ.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    public boolean e2F9F6h8YJxTHwLCa0(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f3267HJFh0TGMpafqLE9haL.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f3267HJFh0TGMpafqLE9haL;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f3267HJFh0TGMpafqLE9haL.top = getScrollY() - height;
            Rect rect2 = this.f3267HJFh0TGMpafqLE9haL;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f3267HJFh0TGMpafqLE9haL;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return lLKzvdU99Iw80uVD5I(i, i2, i3);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3264A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f3277WWC27LAMFqFFBzfbNw == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f3277WWC27LAMFqFFBzfbNw = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f3277WWC27LAMFqFFBzfbNw;
    }

    public boolean hUNBy66ZO1wVLJGW3l(int i, int i2) {
        return this.f3276VItLRw50eXTZeEfGl0.OANkd3mP6AYvwbNLJM(i, i2);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return VItLRw50eXTZeEfGl0(0);
    }

    public int hoXrIDAFrSwfShk8da(int i) {
        int height = getHeight();
        if (i > 0 && PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this.f3284husNiw3snxdgZPAGJm) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(this.f3284husNiw3snxdgZPAGJm, ((-i) * 4.0f) / height, 0.5f));
            if (iRound != i) {
                this.f3284husNiw3snxdgZPAGJm.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this.f3269KYHag8HRDlnO3X9zmZ) == 0.0f) {
            return i;
        }
        float f = height;
        int iRound2 = Math.round((f / 4.0f) * PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(this.f3269KYHag8HRDlnO3X9zmZ, (i * 4.0f) / f, 0.5f));
        if (iRound2 != i) {
            this.f3269KYHag8HRDlnO3X9zmZ.finish();
        }
        return i - iRound2;
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.WWC27LAMFqFFBzfbNw
    public void husNiw3snxdgZPAGJm(View view, int i, int i2, int i3, int i4, int i5) {
        OqIo5QF00RDxUQb4qq(i4, i5, null);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f3276VItLRw50eXTZeEfGl0.e54J8UWNHWALQNixXM();
    }

    public final void jCtUeU2YI1poCxWcjm(int i, int i2) {
        this.f3274TCyPEKSzIyweCN5yp1 = i;
        this.f3288sTkWmhpZ5b1ArQIw4K = i2;
        hUNBy66ZO1wVLJGW3l(2, 0);
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.WWC27LAMFqFFBzfbNw
    public void lEeR5KfoEr4xU5yHH7(View view, View view2, int i, int i2) {
        this.f3264A49QRPHynYLCBN0SqP.HJFh0TGMpafqLE9haL(view, view2, i, i2);
        hUNBy66ZO1wVLJGW3l(2, i2);
    }

    public final boolean lLKzvdU99Iw80uVD5I(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View viewG7AC3DWIx9i9fdanjk = G7AC3DWIx9i9fdanjk(z2, i2, i3);
        if (viewG7AC3DWIx9i9fdanjk == null) {
            viewG7AC3DWIx9i9fdanjk = this;
        }
        if (i2 < scrollY || i3 > i4) {
            ToH8yzk8U1nKT0PUfY(z2 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z = true;
        }
        if (viewG7AC3DWIx9i9fdanjk != findFocus()) {
            viewG7AC3DWIx9i9fdanjk.requestFocus(i);
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3286pbVGzGjWvY2LDXC8vo = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f3279Z9WdNiOsPR0y54zHW4) {
            if (W3RZ2dTDKrKpS5Mxdk.A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7(motionEvent, 2)) {
                i = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (W3RZ2dTDKrKpS5Mxdk.A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i = 26;
                axisValue = axisValue2;
            } else {
                i = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                ToH8yzk8U1nKT0PUfY(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, W3RZ2dTDKrKpS5Mxdk.A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7(motionEvent, 8194));
                if (i != 0) {
                    this.f3281ao3wqKm5CXFuvC0q47.TCyPEKSzIyweCN5yp1(motionEvent, i);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = 0;
        this.f3268IPyIQcaNa8aB7drBED = false;
        View view = this.f3265Acstmh57AKoSEkEFNJ;
        if (view != null && tXWeW0sqVddf7ZBflq(view, this)) {
            XdzLv4NdAtTYoEzVzB(this.f3265Acstmh57AKoSEkEFNJ);
        }
        this.f3265Acstmh57AKoSEkEFNJ = null;
        if (!this.f3286pbVGzGjWvY2LDXC8vo) {
            if (this.f3270LIMtzhnLwQyigzK0KO != null) {
                scrollTo(getScrollX(), this.f3270LIMtzhnLwQyigzK0KO.f3293lEeR5KfoEr4xU5yHH7);
                this.f3270LIMtzhnLwQyigzK0KO = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(scrollY, paddingTop, measuredHeight);
            if (iE54J8UWNHWALQNixXM != scrollY) {
                scrollTo(getScrollX(), iE54J8UWNHWALQNixXM);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3286pbVGzGjWvY2LDXC8vo = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3273T9PhQIpGRhE4yZDm1C && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        xHA29AmDt6y96AnB3t((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        HJFh0TGMpafqLE9haL(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        OqIo5QF00RDxUQb4qq(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        lEeR5KfoEr4xU5yHH7(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i) : focusFinder.findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || XzJ1BS7H9Ilbkv4eVM(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof husNiw3snxdgZPAGJm)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) parcelable;
        super.onRestoreInstanceState(husniw3snxdgzpagjm.getSuperState());
        this.f3270LIMtzhnLwQyigzK0KO = husniw3snxdgzpagjm;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = new husNiw3snxdgZPAGJm(super.onSaveInstanceState());
        husniw3snxdgzpagjm.f3293lEeR5KfoEr4xU5yHH7 = getScrollY();
        return husniw3snxdgzpagjm;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !W3RZ2dTDKrKpS5Mxdk(viewFindFocus, 0, i4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f3267HJFh0TGMpafqLE9haL);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f3267HJFh0TGMpafqLE9haL);
        zaq8hOURtfwbcX17cG(T9PhQIpGRhE4yZDm1C(this.f3267HJFh0TGMpafqLE9haL));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return KYHag8HRDlnO3X9zmZ(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        s3fjYDxWOUexjjVgyA(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void oocVJL811qFf0j0XXZ(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f3287s3fjYDxWOUexjjVgyA > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f3290zZKhbgvUfsK4AEX3r0.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, i3);
            aAp6BD79BhftLCnuvf(z);
        } else {
            if (!this.f3290zZKhbgvUfsK4AEX3r0.isFinished()) {
                TCyPEKSzIyweCN5yp1();
            }
            scrollBy(i, i2);
        }
        this.f3287s3fjYDxWOUexjjVgyA = AnimationUtils.currentAnimationTimeMillis();
    }

    public boolean pbVGzGjWvY2LDXC8vo(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !W3RZ2dTDKrKpS5Mxdk(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            ToH8yzk8U1nKT0PUfY(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f3267HJFh0TGMpafqLE9haL);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f3267HJFh0TGMpafqLE9haL);
            ToH8yzk8U1nKT0PUfY(T9PhQIpGRhE4yZDm1C(this.f3267HJFh0TGMpafqLE9haL), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && XzJ1BS7H9Ilbkv4eVM(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f3268IPyIQcaNa8aB7drBED) {
            this.f3265Acstmh57AKoSEkEFNJ = view2;
        } else {
            XdzLv4NdAtTYoEzVzB(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return LU0fFDMACqnfIfA1AZ(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            KqgKJKIWne3kz1AdHk();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f3268IPyIQcaNa8aB7drBED = true;
        super.requestLayout();
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.WWC27LAMFqFFBzfbNw
    public void s3fjYDxWOUexjjVgyA(View view, int i) {
        this.f3264A49QRPHynYLCBN0SqP.zZKhbgvUfsK4AEX3r0(view, i);
        Uj8rPa1EWADtk6Oe0S(i);
    }

    public final boolean sTkWmhpZ5b1ArQIw4K(int i) {
        EdgeEffect edgeEffect;
        if (PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this.f3284husNiw3snxdgZPAGJm) != 0.0f) {
            if (zcy2NNbtVXgoGQbfuq(this.f3284husNiw3snxdgZPAGJm, i)) {
                edgeEffect = this.f3284husNiw3snxdgZPAGJm;
                edgeEffect.onAbsorb(i);
            } else {
                i = -i;
                xHA29AmDt6y96AnB3t(i);
            }
        } else {
            if (PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this.f3269KYHag8HRDlnO3X9zmZ) == 0.0f) {
                return false;
            }
            i = -i;
            if (zcy2NNbtVXgoGQbfuq(this.f3269KYHag8HRDlnO3X9zmZ, i)) {
                edgeEffect = this.f3269KYHag8HRDlnO3X9zmZ;
                edgeEffect.onAbsorb(i);
            }
            xHA29AmDt6y96AnB3t(i);
        }
        return true;
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(i, width, width2);
            int iE54J8UWNHWALQNixXM2 = e54J8UWNHWALQNixXM(i2, height, height2);
            if (iE54J8UWNHWALQNixXM == getScrollX() && iE54J8UWNHWALQNixXM2 == getScrollY()) {
                return;
            }
            super.scrollTo(iE54J8UWNHWALQNixXM, iE54J8UWNHWALQNixXM2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f3273T9PhQIpGRhE4yZDm1C) {
            this.f3273T9PhQIpGRhE4yZDm1C = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f3276VItLRw50eXTZeEfGl0.T9PhQIpGRhE4yZDm1C(z);
    }

    public void setOnScrollChangeListener(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f3283hoXrIDAFrSwfShk8da = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return hUNBy66ZO1wVLJGW3l(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        Uj8rPa1EWADtk6Oe0S(0);
    }

    public void udcVtCzLTM1Loe9KrX(int i, int i2, int i3, boolean z) {
        oocVJL811qFf0j0XXZ(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    public void xHA29AmDt6y96AnB3t(int i) {
        if (getChildCount() > 0) {
            this.f3290zZKhbgvUfsK4AEX3r0.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            aAp6BD79BhftLCnuvf(true);
        }
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.THTDvPxsHqMeGb512f
    public void zZKhbgvUfsK4AEX3r0(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        OqIo5QF00RDxUQb4qq(i4, i5, iArr);
    }

    public final void zaq8hOURtfwbcX17cG(int i) {
        if (i != 0) {
            if (this.f3283hoXrIDAFrSwfShk8da) {
                YlLW4G6OV9TFyuw5ix(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    public final boolean zcy2NNbtVXgoGQbfuq(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        return A49QRPHynYLCBN0SqP(-i) < PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(edgeEffect) * ((float) getHeight());
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3267HJFh0TGMpafqLE9haL = new Rect();
        this.f3268IPyIQcaNa8aB7drBED = true;
        this.f3286pbVGzGjWvY2LDXC8vo = false;
        this.f3265Acstmh57AKoSEkEFNJ = null;
        this.f3279Z9WdNiOsPR0y54zHW4 = false;
        this.f3283hoXrIDAFrSwfShk8da = true;
        this.f3288sTkWmhpZ5b1ArQIw4K = -1;
        this.f3278Y43RdunnpKgpbny0lE = new int[2];
        this.f3272R9SAhYMerGybF9OAjL = new int[2];
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = new HJFh0TGMpafqLE9haL();
        this.f3275THTDvPxsHqMeGb512f = hJFh0TGMpafqLE9haL;
        this.f3281ao3wqKm5CXFuvC0q47 = new aPyGSIylzVNKPT1Bls(getContext(), hJFh0TGMpafqLE9haL);
        this.f3284husNiw3snxdgZPAGJm = PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(context, attributeSet);
        this.f3269KYHag8HRDlnO3X9zmZ = PPkm9uUfOJHHYveeLT.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(context, attributeSet);
        this.f3285lEeR5KfoEr4xU5yHH7 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        ao3wqKm5CXFuvC0q47();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3262XzJ1BS7H9Ilbkv4eVM, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f3264A49QRPHynYLCBN0SqP = new ao3wqKm5CXFuvC0q47(this);
        this.f3276VItLRw50eXTZeEfGl0 = new VItLRw50eXTZeEfGl0(this);
        setNestedScrollingEnabled(true);
        lLKzvdU99Iw80uVD5I.eWK41qw3g36LVd4UnS(this, f3263jCtUeU2YI1poCxWcjm);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }
}
