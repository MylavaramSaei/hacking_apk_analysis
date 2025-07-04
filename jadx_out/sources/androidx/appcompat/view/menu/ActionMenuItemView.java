package androidx.appcompat.view.menu;

import IPyIQcaNa8aB7drBED.R9SAhYMerGybF9OAjL;
import IPyIQcaNa8aB7drBED.XdzLv4NdAtTYoEzVzB;
import IPyIQcaNa8aB7drBED.ao3wqKm5CXFuvC0q47;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.IPyIQcaNa8aB7drBED;
import androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0;
import androidx.appcompat.widget.ActionMenuView;

/* loaded from: classes.dex */
public class ActionMenuItemView extends R9SAhYMerGybF9OAjL implements IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7, View.OnClickListener, ActionMenuView.lEeR5KfoEr4xU5yHH7 {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public Drawable f2579Acstmh57AKoSEkEFNJ;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public husNiw3snxdgZPAGJm f2580IPyIQcaNa8aB7drBED;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public int f2581OANkd3mP6AYvwbNLJM;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public s3fjYDxWOUexjjVgyA f2582T9PhQIpGRhE4yZDm1C;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA f2583Z9WdNiOsPR0y54zHW4;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public boolean f2584aPyGSIylzVNKPT1Bls;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public ao3wqKm5CXFuvC0q47 f2585e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public boolean f2586hoXrIDAFrSwfShk8da;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public CharSequence f2587pbVGzGjWvY2LDXC8vo;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public int f2588sTkWmhpZ5b1ArQIw4K;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public int f2589zaq8hOURtfwbcX17cG;

    public class lEeR5KfoEr4xU5yHH7 extends ao3wqKm5CXFuvC0q47 {
        public lEeR5KfoEr4xU5yHH7() {
            super(ActionMenuItemView.this);
        }

        @Override // IPyIQcaNa8aB7drBED.ao3wqKm5CXFuvC0q47
        public boolean HJFh0TGMpafqLE9haL() {
            TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haLS3fjYDxWOUexjjVgyA;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = actionMenuItemView.f2583Z9WdNiOsPR0y54zHW4;
            return s3fjydxwouexjjvgya != null && s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7(actionMenuItemView.f2580IPyIQcaNa8aB7drBED) && (hJFh0TGMpafqLE9haLS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA()) != null && hJFh0TGMpafqLE9haLS3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ();
        }

        @Override // IPyIQcaNa8aB7drBED.ao3wqKm5CXFuvC0q47
        public TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL s3fjYDxWOUexjjVgyA() {
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = ActionMenuItemView.this.f2582T9PhQIpGRhE4yZDm1C;
            if (s3fjydxwouexjjvgya != null) {
                return s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7();
            }
            return null;
        }
    }

    public static abstract class s3fjYDxWOUexjjVgyA {
        public abstract TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL lEeR5KfoEr4xU5yHH7();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void G7AC3DWIx9i9fdanjk() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2587pbVGzGjWvY2LDXC8vo);
        if (this.f2579Acstmh57AKoSEkEFNJ != null && (!this.f2580IPyIQcaNa8aB7drBED.THTDvPxsHqMeGb512f() || (!this.f2586hoXrIDAFrSwfShk8da && !this.f2584aPyGSIylzVNKPT1Bls))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f2587pbVGzGjWvY2LDXC8vo : null);
        CharSequence contentDescription = this.f2580IPyIQcaNa8aB7drBED.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f2580IPyIQcaNa8aB7drBED.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f2580IPyIQcaNa8aB7drBED.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            XdzLv4NdAtTYoEzVzB.lEeR5KfoEr4xU5yHH7(this, z3 ? null : this.f2580IPyIQcaNa8aB7drBED.getTitle());
        } else {
            XdzLv4NdAtTYoEzVzB.lEeR5KfoEr4xU5yHH7(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.view.menu.IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7
    public boolean HJFh0TGMpafqLE9haL() {
        return true;
    }

    public final boolean R9SAhYMerGybF9OAjL() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public boolean Y43RdunnpKgpbny0lE() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7
    public husNiw3snxdgZPAGJm getItemData() {
        return this.f2580IPyIQcaNa8aB7drBED;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.lEeR5KfoEr4xU5yHH7
    public boolean lEeR5KfoEr4xU5yHH7() {
        return Y43RdunnpKgpbny0lE();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = this.f2583Z9WdNiOsPR0y54zHW4;
        if (s3fjydxwouexjjvgya != null) {
            s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7(this.f2580IPyIQcaNa8aB7drBED);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2586hoXrIDAFrSwfShk8da = R9SAhYMerGybF9OAjL();
        G7AC3DWIx9i9fdanjk();
    }

    @Override // IPyIQcaNa8aB7drBED.R9SAhYMerGybF9OAjL, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean zY43RdunnpKgpbny0lE = Y43RdunnpKgpbny0lE();
        if (zY43RdunnpKgpbny0lE && (i3 = this.f2589zaq8hOURtfwbcX17cG) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f2581OANkd3mP6AYvwbNLJM) : this.f2581OANkd3mP6AYvwbNLJM;
        if (mode != 1073741824 && this.f2581OANkd3mP6AYvwbNLJM > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zY43RdunnpKgpbny0lE || this.f2579Acstmh57AKoSEkEFNJ == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f2579Acstmh57AKoSEkEFNJ.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q47;
        if (this.f2580IPyIQcaNa8aB7drBED.hasSubMenu() && (ao3wqkm5cxfuvc0q47 = this.f2585e54J8UWNHWALQNixXM) != null && ao3wqkm5cxfuvc0q47.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.lEeR5KfoEr4xU5yHH7
    public boolean s3fjYDxWOUexjjVgyA() {
        return Y43RdunnpKgpbny0lE() && this.f2580IPyIQcaNa8aB7drBED.getIcon() == null;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f2584aPyGSIylzVNKPT1Bls != z) {
            this.f2584aPyGSIylzVNKPT1Bls = z;
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = this.f2580IPyIQcaNa8aB7drBED;
            if (husniw3snxdgzpagjm != null) {
                husniw3snxdgzpagjm.lEeR5KfoEr4xU5yHH7();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2579Acstmh57AKoSEkEFNJ = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f2588sTkWmhpZ5b1ArQIw4K;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        G7AC3DWIx9i9fdanjk();
    }

    public void setItemInvoker(zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        this.f2583Z9WdNiOsPR0y54zHW4 = s3fjydxwouexjjvgya;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f2589zaq8hOURtfwbcX17cG = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        this.f2582T9PhQIpGRhE4yZDm1C = s3fjydxwouexjjvgya;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2587pbVGzGjWvY2LDXC8vo = charSequence;
        G7AC3DWIx9i9fdanjk();
    }

    @Override // androidx.appcompat.view.menu.IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7
    public void zZKhbgvUfsK4AEX3r0(husNiw3snxdgZPAGJm husniw3snxdgzpagjm, int i) {
        this.f2580IPyIQcaNa8aB7drBED = husniw3snxdgzpagjm;
        setIcon(husniw3snxdgzpagjm.getIcon());
        setTitle(husniw3snxdgzpagjm.IPyIQcaNa8aB7drBED(this));
        setId(husniw3snxdgzpagjm.getItemId());
        setVisibility(husniw3snxdgzpagjm.isVisible() ? 0 : 8);
        setEnabled(husniw3snxdgzpagjm.isEnabled());
        if (husniw3snxdgzpagjm.hasSubMenu() && this.f2585e54J8UWNHWALQNixXM == null) {
            this.f2585e54J8UWNHWALQNixXM = new lEeR5KfoEr4xU5yHH7();
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f2586hoXrIDAFrSwfShk8da = R9SAhYMerGybF9OAjL();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6334R9SAhYMerGybF9OAjL, i, 0);
        this.f2581OANkd3mP6AYvwbNLJM = typedArrayObtainStyledAttributes.getDimensionPixelSize(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6302G7AC3DWIx9i9fdanjk, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f2588sTkWmhpZ5b1ArQIw4K = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2589zaq8hOURtfwbcX17cG = -1;
        setSaveEnabled(false);
    }
}
