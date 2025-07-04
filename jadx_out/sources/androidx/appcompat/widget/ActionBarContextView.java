package androidx.appcompat.widget;

import IPyIQcaNa8aB7drBED.PPkm9uUfOJHHYveeLT;
import IPyIQcaNa8aB7drBED.cT5Hs3CQpLK8NvlZAw;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ;
import lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm;
import lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public class ActionBarContextView extends IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7 {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public View f2766Acstmh57AKoSEkEFNJ;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public CharSequence f2767IPyIQcaNa8aB7drBED;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public int f2768OANkd3mP6AYvwbNLJM;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public TextView f2769T9PhQIpGRhE4yZDm1C;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public View f2770Z9WdNiOsPR0y54zHW4;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public int f2771aPyGSIylzVNKPT1Bls;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public LinearLayout f2772e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public TextView f2773hoXrIDAFrSwfShk8da;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public CharSequence f2774pbVGzGjWvY2LDXC8vo;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public int f2775sTkWmhpZ5b1ArQIw4K;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public boolean f2776zaq8hOURtfwbcX17cG;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7.f6284zZKhbgvUfsK4AEX3r0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f2774pbVGzGjWvY2LDXC8vo;
    }

    public CharSequence getTitle() {
        return this.f2767IPyIQcaNa8aB7drBED;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f691zZKhbgvUfsK4AEX3r0;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.WWC27LAMFqFFBzfbNw();
            this.f691zZKhbgvUfsK4AEX3r0.THTDvPxsHqMeGb512f();
        }
    }

    @Override // IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zLEeR5KfoEr4xU5yHH7 = cT5Hs3CQpLK8NvlZAw.lEeR5KfoEr4xU5yHH7(this);
        int paddingRight = zLEeR5KfoEr4xU5yHH7 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f2766Acstmh57AKoSEkEFNJ;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2766Acstmh57AKoSEkEFNJ.getLayoutParams();
            int i5 = zLEeR5KfoEr4xU5yHH7 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zLEeR5KfoEr4xU5yHH7 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iS3fjYDxWOUexjjVgyA = IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(paddingRight, i5, zLEeR5KfoEr4xU5yHH7);
            paddingRight = IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(iS3fjYDxWOUexjjVgyA + HJFh0TGMpafqLE9haL(this.f2766Acstmh57AKoSEkEFNJ, iS3fjYDxWOUexjjVgyA, paddingTop, paddingTop2, zLEeR5KfoEr4xU5yHH7), i6, zLEeR5KfoEr4xU5yHH7);
        }
        int iHJFh0TGMpafqLE9haL = paddingRight;
        LinearLayout linearLayout = this.f2772e54J8UWNHWALQNixXM;
        if (linearLayout != null && this.f2770Z9WdNiOsPR0y54zHW4 == null && linearLayout.getVisibility() != 8) {
            iHJFh0TGMpafqLE9haL += HJFh0TGMpafqLE9haL(this.f2772e54J8UWNHWALQNixXM, iHJFh0TGMpafqLE9haL, paddingTop, paddingTop2, zLEeR5KfoEr4xU5yHH7);
        }
        int i7 = iHJFh0TGMpafqLE9haL;
        View view2 = this.f2770Z9WdNiOsPR0y54zHW4;
        if (view2 != null) {
            HJFh0TGMpafqLE9haL(view2, i7, paddingTop, paddingTop2, zLEeR5KfoEr4xU5yHH7);
        }
        int paddingLeft = zLEeR5KfoEr4xU5yHH7 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f685HJFh0TGMpafqLE9haL;
        if (actionMenuView != null) {
            HJFh0TGMpafqLE9haL(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zLEeR5KfoEr4xU5yHH7);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f688husNiw3snxdgZPAGJm;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f2766Acstmh57AKoSEkEFNJ;
        if (view != null) {
            int iLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2766Acstmh57AKoSEkEFNJ.getLayoutParams();
            paddingLeft = iLEeR5KfoEr4xU5yHH7 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f685HJFh0TGMpafqLE9haL;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = lEeR5KfoEr4xU5yHH7(this.f685HJFh0TGMpafqLE9haL, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f2772e54J8UWNHWALQNixXM;
        if (linearLayout != null && this.f2770Z9WdNiOsPR0y54zHW4 == null) {
            if (this.f2776zaq8hOURtfwbcX17cG) {
                this.f2772e54J8UWNHWALQNixXM.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f2772e54J8UWNHWALQNixXM.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f2772e54J8UWNHWALQNixXM.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = lEeR5KfoEr4xU5yHH7(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f2770Z9WdNiOsPR0y54zHW4;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f2770Z9WdNiOsPR0y54zHW4.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f688husNiw3snxdgZPAGJm > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7
    public void setContentHeight(int i) {
        this.f688husNiw3snxdgZPAGJm = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2770Z9WdNiOsPR0y54zHW4;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2770Z9WdNiOsPR0y54zHW4 = view;
        if (view != null && (linearLayout = this.f2772e54J8UWNHWALQNixXM) != null) {
            removeView(linearLayout);
            this.f2772e54J8UWNHWALQNixXM = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2774pbVGzGjWvY2LDXC8vo = charSequence;
        zZKhbgvUfsK4AEX3r0();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2767IPyIQcaNa8aB7drBED = charSequence;
        zZKhbgvUfsK4AEX3r0();
        lLKzvdU99Iw80uVD5I.FtYx4GXtxwA8al5hBy(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f2776zaq8hOURtfwbcX17cG) {
            requestLayout();
        }
        this.f2776zaq8hOURtfwbcX17cG = z;
    }

    @Override // IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void zZKhbgvUfsK4AEX3r0() {
        if (this.f2772e54J8UWNHWALQNixXM == null) {
            LayoutInflater.from(getContext()).inflate(KYHag8HRDlnO3X9zmZ.f6235lEeR5KfoEr4xU5yHH7, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2772e54J8UWNHWALQNixXM = linearLayout;
            this.f2769T9PhQIpGRhE4yZDm1C = (TextView) linearLayout.findViewById(husNiw3snxdgZPAGJm.f6261husNiw3snxdgZPAGJm);
            this.f2773hoXrIDAFrSwfShk8da = (TextView) this.f2772e54J8UWNHWALQNixXM.findViewById(husNiw3snxdgZPAGJm.f6266zZKhbgvUfsK4AEX3r0);
            if (this.f2771aPyGSIylzVNKPT1Bls != 0) {
                this.f2769T9PhQIpGRhE4yZDm1C.setTextAppearance(getContext(), this.f2771aPyGSIylzVNKPT1Bls);
            }
            if (this.f2768OANkd3mP6AYvwbNLJM != 0) {
                this.f2773hoXrIDAFrSwfShk8da.setTextAppearance(getContext(), this.f2768OANkd3mP6AYvwbNLJM);
            }
        }
        this.f2769T9PhQIpGRhE4yZDm1C.setText(this.f2767IPyIQcaNa8aB7drBED);
        this.f2773hoXrIDAFrSwfShk8da.setText(this.f2774pbVGzGjWvY2LDXC8vo);
        boolean z = !TextUtils.isEmpty(this.f2767IPyIQcaNa8aB7drBED);
        boolean z2 = !TextUtils.isEmpty(this.f2774pbVGzGjWvY2LDXC8vo);
        this.f2773hoXrIDAFrSwfShk8da.setVisibility(z2 ? 0 : 8);
        this.f2772e54J8UWNHWALQNixXM.setVisibility((z || z2) ? 0 : 8);
        if (this.f2772e54J8UWNHWALQNixXM.getParent() == null) {
            addView(this.f2772e54J8UWNHWALQNixXM);
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        PPkm9uUfOJHHYveeLT pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL = PPkm9uUfOJHHYveeLT.R9SAhYMerGybF9OAjL(context, attributeSet, pbVGzGjWvY2LDXC8vo.f6318LIMtzhnLwQyigzK0KO, i, 0);
        setBackground(pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.TCyPEKSzIyweCN5yp1(pbVGzGjWvY2LDXC8vo.f6286A49QRPHynYLCBN0SqP));
        this.f2771aPyGSIylzVNKPT1Bls = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.T9PhQIpGRhE4yZDm1C(pbVGzGjWvY2LDXC8vo.f6365ao3wqKm5CXFuvC0q47, 0);
        this.f2768OANkd3mP6AYvwbNLJM = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.T9PhQIpGRhE4yZDm1C(pbVGzGjWvY2LDXC8vo.f6339THTDvPxsHqMeGb512f, 0);
        this.f688husNiw3snxdgZPAGJm = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.e54J8UWNHWALQNixXM(pbVGzGjWvY2LDXC8vo.f6347WWC27LAMFqFFBzfbNw, 0);
        this.f2775sTkWmhpZ5b1ArQIw4K = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.T9PhQIpGRhE4yZDm1C(pbVGzGjWvY2LDXC8vo.f6345VItLRw50eXTZeEfGl0, KYHag8HRDlnO3X9zmZ.f6238zZKhbgvUfsK4AEX3r0);
        pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.xHA29AmDt6y96AnB3t();
    }
}
