package com.google.android.material.internal;

import A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ;
import IPyIQcaNa8aB7drBED.XdzLv4NdAtTYoEzVzB;
import OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP;
import PPkm9uUfOJHHYveeLT.TCyPEKSzIyweCN5yp1;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import WaWv1mJ1ya3uoEaKqz.zZKhbgvUfsK4AEX3r0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.IPyIQcaNa8aB7drBED;
import androidx.appcompat.view.menu.husNiw3snxdgZPAGJm;
import androidx.appcompat.widget.s3fjYDxWOUexjjVgyA;
import tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends zZKhbgvUfsK4AEX3r0 implements IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7 {

    /* renamed from: W3RZ2dTDKrKpS5Mxdk, reason: collision with root package name */
    public static final int[] f5241W3RZ2dTDKrKpS5Mxdk = {R.attr.state_checked};

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public boolean f5242A49QRPHynYLCBN0SqP;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public boolean f5243LIMtzhnLwQyigzK0KO;

    /* renamed from: OUd9THiLjZndMj0qdF, reason: collision with root package name */
    public ColorStateList f5244OUd9THiLjZndMj0qdF;

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public FrameLayout f5245THTDvPxsHqMeGb512f;

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public boolean f5246VItLRw50eXTZeEfGl0;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public final CheckedTextView f5247WWC27LAMFqFFBzfbNw;

    /* renamed from: XzJ1BS7H9Ilbkv4eVM, reason: collision with root package name */
    public Drawable f5248XzJ1BS7H9Ilbkv4eVM;

    /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
    public husNiw3snxdgZPAGJm f5249ao3wqKm5CXFuvC0q47;

    /* renamed from: jCtUeU2YI1poCxWcjm, reason: collision with root package name */
    public boolean f5250jCtUeU2YI1poCxWcjm;

    /* renamed from: tXWeW0sqVddf7ZBflq, reason: collision with root package name */
    public final W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 f5251tXWeW0sqVddf7ZBflq;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public int f5252xHA29AmDt6y96AnB3t;

    public class lEeR5KfoEr4xU5yHH7 extends W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public void TCyPEKSzIyweCN5yp1(View view, A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
            super.TCyPEKSzIyweCN5yp1(view, a49QRPHynYLCBN0SqP);
            a49QRPHynYLCBN0SqP.ctWLFN70QQINH1kyYo(NavigationMenuItemView.this.f5242A49QRPHynYLCBN0SqP);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f5245THTDvPxsHqMeGb512f == null) {
                this.f5245THTDvPxsHqMeGb512f = (FrameLayout) ((ViewStub) findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7124zZKhbgvUfsK4AEX3r0)).inflate();
            }
            this.f5245THTDvPxsHqMeGb512f.removeAllViews();
            this.f5245THTDvPxsHqMeGb512f.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7
    public boolean HJFh0TGMpafqLE9haL() {
        return false;
    }

    public final boolean THTDvPxsHqMeGb512f() {
        return this.f5249ao3wqKm5CXFuvC0q47.getTitle() == null && this.f5249ao3wqKm5CXFuvC0q47.getIcon() == null && this.f5249ao3wqKm5CXFuvC0q47.getActionView() != null;
    }

    public final void VItLRw50eXTZeEfGl0() {
        s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7;
        int i;
        if (THTDvPxsHqMeGb512f()) {
            this.f5247WWC27LAMFqFFBzfbNw.setVisibility(8);
            FrameLayout frameLayout = this.f5245THTDvPxsHqMeGb512f;
            if (frameLayout == null) {
                return;
            }
            leer5kfoer4xu5yhh7 = (s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7) frameLayout.getLayoutParams();
            i = -1;
        } else {
            this.f5247WWC27LAMFqFFBzfbNw.setVisibility(0);
            FrameLayout frameLayout2 = this.f5245THTDvPxsHqMeGb512f;
            if (frameLayout2 == null) {
                return;
            }
            leer5kfoer4xu5yhh7 = (s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7) frameLayout2.getLayoutParams();
            i = -2;
        }
        ((LinearLayout.LayoutParams) leer5kfoer4xu5yhh7).width = i;
        this.f5245THTDvPxsHqMeGb512f.setLayoutParams(leer5kfoer4xu5yhh7);
    }

    public final StateListDrawable WWC27LAMFqFFBzfbNw() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7.f6275Z9WdNiOsPR0y54zHW4, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f5241W3RZ2dTDKrKpS5Mxdk, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    @Override // androidx.appcompat.view.menu.IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7
    public husNiw3snxdgZPAGJm getItemData() {
        return this.f5249ao3wqKm5CXFuvC0q47;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = this.f5249ao3wqKm5CXFuvC0q47;
        if (husniw3snxdgzpagjm != null && husniw3snxdgzpagjm.isCheckable() && this.f5249ao3wqKm5CXFuvC0q47.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5241W3RZ2dTDKrKpS5Mxdk);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f5242A49QRPHynYLCBN0SqP != z) {
            this.f5242A49QRPHynYLCBN0SqP = z;
            this.f5251tXWeW0sqVddf7ZBflq.e54J8UWNHWALQNixXM(this.f5247WWC27LAMFqFFBzfbNw, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f5247WWC27LAMFqFFBzfbNw.setChecked(z);
        CheckedTextView checkedTextView = this.f5247WWC27LAMFqFFBzfbNw;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.f5246VItLRw50eXTZeEfGl0) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f5250jCtUeU2YI1poCxWcjm) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(drawable).mutate();
                WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(drawable, this.f5244OUd9THiLjZndMj0qdF);
            }
            int i = this.f5252xHA29AmDt6y96AnB3t;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f5243LIMtzhnLwQyigzK0KO) {
            if (this.f5248XzJ1BS7H9Ilbkv4eVM == null) {
                Drawable drawableHusNiw3snxdgZPAGJm = KYHag8HRDlnO3X9zmZ.husNiw3snxdgZPAGJm(getResources(), tmIBXGVvBsrJ7i63G2.zZKhbgvUfsK4AEX3r0.f7179TCyPEKSzIyweCN5yp1, getContext().getTheme());
                this.f5248XzJ1BS7H9Ilbkv4eVM = drawableHusNiw3snxdgZPAGJm;
                if (drawableHusNiw3snxdgZPAGJm != null) {
                    int i2 = this.f5252xHA29AmDt6y96AnB3t;
                    drawableHusNiw3snxdgZPAGJm.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f5248XzJ1BS7H9Ilbkv4eVM;
        }
        TCyPEKSzIyweCN5yp1.pbVGzGjWvY2LDXC8vo(this.f5247WWC27LAMFqFFBzfbNw, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f5247WWC27LAMFqFFBzfbNw.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f5252xHA29AmDt6y96AnB3t = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f5244OUd9THiLjZndMj0qdF = colorStateList;
        this.f5250jCtUeU2YI1poCxWcjm = colorStateList != null;
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = this.f5249ao3wqKm5CXFuvC0q47;
        if (husniw3snxdgzpagjm != null) {
            setIcon(husniw3snxdgzpagjm.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f5247WWC27LAMFqFFBzfbNw.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f5243LIMtzhnLwQyigzK0KO = z;
    }

    public void setTextAppearance(int i) {
        TCyPEKSzIyweCN5yp1.aPyGSIylzVNKPT1Bls(this.f5247WWC27LAMFqFFBzfbNw, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f5247WWC27LAMFqFFBzfbNw.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f5247WWC27LAMFqFFBzfbNw.setText(charSequence);
    }

    @Override // androidx.appcompat.view.menu.IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7
    public void zZKhbgvUfsK4AEX3r0(husNiw3snxdgZPAGJm husniw3snxdgzpagjm, int i) {
        this.f5249ao3wqKm5CXFuvC0q47 = husniw3snxdgzpagjm;
        if (husniw3snxdgzpagjm.getItemId() > 0) {
            setId(husniw3snxdgzpagjm.getItemId());
        }
        setVisibility(husniw3snxdgzpagjm.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            lLKzvdU99Iw80uVD5I.ayduHasC7VpxsVXE0T(this, WWC27LAMFqFFBzfbNw());
        }
        setCheckable(husniw3snxdgzpagjm.isCheckable());
        setChecked(husniw3snxdgzpagjm.isChecked());
        setEnabled(husniw3snxdgzpagjm.isEnabled());
        setTitle(husniw3snxdgzpagjm.getTitle());
        setIcon(husniw3snxdgzpagjm.getIcon());
        setActionView(husniw3snxdgzpagjm.getActionView());
        setContentDescription(husniw3snxdgzpagjm.getContentDescription());
        XdzLv4NdAtTYoEzVzB.lEeR5KfoEr4xU5yHH7(this, husniw3snxdgzpagjm.getTooltipText());
        VItLRw50eXTZeEfGl0();
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5246VItLRw50eXTZeEfGl0 = true;
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new lEeR5KfoEr4xU5yHH7();
        this.f5251tXWeW0sqVddf7ZBflq = leer5kfoer4xu5yhh7;
        setOrientation(0);
        LayoutInflater.from(context).inflate(tmIBXGVvBsrJ7i63G2.TCyPEKSzIyweCN5yp1.f7082lEeR5KfoEr4xU5yHH7, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(HJFh0TGMpafqLE9haL.f7041s3fjYDxWOUexjjVgyA));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7116husNiw3snxdgZPAGJm);
        this.f5247WWC27LAMFqFFBzfbNw = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        lLKzvdU99Iw80uVD5I.eWK41qw3g36LVd4UnS(checkedTextView, leer5kfoer4xu5yhh7);
    }
}
