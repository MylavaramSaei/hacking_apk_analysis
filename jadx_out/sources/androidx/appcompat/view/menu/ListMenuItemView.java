package androidx.appcompat.view.menu;

import IPyIQcaNa8aB7drBED.PPkm9uUfOJHHYveeLT;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.IPyIQcaNa8aB7drBED;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public Drawable f2613Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public RadioButton f2614HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public ImageView f2615IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public TextView f2616KYHag8HRDlnO3X9zmZ;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public LayoutInflater f2617OANkd3mP6AYvwbNLJM;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public boolean f2618T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public ImageView f2619TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public int f2620Z9WdNiOsPR0y54zHW4;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public boolean f2621aPyGSIylzVNKPT1Bls;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public Context f2622e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public Drawable f2623hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public CheckBox f2624husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public husNiw3snxdgZPAGJm f2625lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public LinearLayout f2626pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public ImageView f2627s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public TextView f2628zZKhbgvUfsK4AEX3r0;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public boolean f2629zaq8hOURtfwbcX17cG;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7.f6272OANkd3mP6AYvwbNLJM);
    }

    private LayoutInflater getInflater() {
        if (this.f2617OANkd3mP6AYvwbNLJM == null) {
            this.f2617OANkd3mP6AYvwbNLJM = LayoutInflater.from(getContext());
        }
        return this.f2617OANkd3mP6AYvwbNLJM;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f2619TCyPEKSzIyweCN5yp1;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // androidx.appcompat.view.menu.IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7
    public boolean HJFh0TGMpafqLE9haL() {
        return false;
    }

    public void IPyIQcaNa8aB7drBED(boolean z, char c) {
        int i = (z && this.f2625lEeR5KfoEr4xU5yHH7.WWC27LAMFqFFBzfbNw()) ? 0 : 8;
        if (i == 0) {
            this.f2616KYHag8HRDlnO3X9zmZ.setText(this.f2625lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ());
        }
        if (this.f2616KYHag8HRDlnO3X9zmZ.getVisibility() != i) {
            this.f2616KYHag8HRDlnO3X9zmZ.setVisibility(i);
        }
    }

    public final void KYHag8HRDlnO3X9zmZ() {
        ImageView imageView = (ImageView) getInflater().inflate(lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ.f6232TCyPEKSzIyweCN5yp1, (ViewGroup) this, false);
        this.f2627s3fjYDxWOUexjjVgyA = imageView;
        s3fjYDxWOUexjjVgyA(imageView, 0);
    }

    public final void TCyPEKSzIyweCN5yp1() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ.f6230IPyIQcaNa8aB7drBED, (ViewGroup) this, false);
        this.f2614HJFh0TGMpafqLE9haL = radioButton;
        lEeR5KfoEr4xU5yHH7(radioButton);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f2615IPyIQcaNa8aB7drBED;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2615IPyIQcaNa8aB7drBED.getLayoutParams();
        rect.top += this.f2615IPyIQcaNa8aB7drBED.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7
    public husNiw3snxdgZPAGJm getItemData() {
        return this.f2625lEeR5KfoEr4xU5yHH7;
    }

    public final void husNiw3snxdgZPAGJm() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ.f6231KYHag8HRDlnO3X9zmZ, (ViewGroup) this, false);
        this.f2624husNiw3snxdgZPAGJm = checkBox;
        lEeR5KfoEr4xU5yHH7(checkBox);
    }

    public final void lEeR5KfoEr4xU5yHH7(View view) {
        s3fjYDxWOUexjjVgyA(view, -1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f2613Acstmh57AKoSEkEFNJ);
        TextView textView = (TextView) findViewById(lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm.f6267zaq8hOURtfwbcX17cG);
        this.f2628zZKhbgvUfsK4AEX3r0 = textView;
        int i = this.f2620Z9WdNiOsPR0y54zHW4;
        if (i != -1) {
            textView.setTextAppearance(this.f2622e54J8UWNHWALQNixXM, i);
        }
        this.f2616KYHag8HRDlnO3X9zmZ = (TextView) findViewById(lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm.f6255T9PhQIpGRhE4yZDm1C);
        ImageView imageView = (ImageView) findViewById(lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm.f6254OANkd3mP6AYvwbNLJM);
        this.f2619TCyPEKSzIyweCN5yp1 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2623hoXrIDAFrSwfShk8da);
        }
        this.f2615IPyIQcaNa8aB7drBED = (ImageView) findViewById(lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm.f6257Z9WdNiOsPR0y54zHW4);
        this.f2626pbVGzGjWvY2LDXC8vo = (LinearLayout) findViewById(lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm.f6252IPyIQcaNa8aB7drBED);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f2627s3fjYDxWOUexjjVgyA != null && this.f2618T9PhQIpGRhE4yZDm1C) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2627s3fjYDxWOUexjjVgyA.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public final void s3fjYDxWOUexjjVgyA(View view, int i) {
        LinearLayout linearLayout = this.f2626pbVGzGjWvY2LDXC8vo;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f2614HJFh0TGMpafqLE9haL == null && this.f2624husNiw3snxdgZPAGJm == null) {
            return;
        }
        if (this.f2625lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM()) {
            if (this.f2614HJFh0TGMpafqLE9haL == null) {
                TCyPEKSzIyweCN5yp1();
            }
            compoundButton = this.f2614HJFh0TGMpafqLE9haL;
            view = this.f2624husNiw3snxdgZPAGJm;
        } else {
            if (this.f2624husNiw3snxdgZPAGJm == null) {
                husNiw3snxdgZPAGJm();
            }
            compoundButton = this.f2624husNiw3snxdgZPAGJm;
            view = this.f2614HJFh0TGMpafqLE9haL;
        }
        if (z) {
            compoundButton.setChecked(this.f2625lEeR5KfoEr4xU5yHH7.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f2624husNiw3snxdgZPAGJm;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f2614HJFh0TGMpafqLE9haL;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f2625lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM()) {
            if (this.f2614HJFh0TGMpafqLE9haL == null) {
                TCyPEKSzIyweCN5yp1();
            }
            compoundButton = this.f2614HJFh0TGMpafqLE9haL;
        } else {
            if (this.f2624husNiw3snxdgZPAGJm == null) {
                husNiw3snxdgZPAGJm();
            }
            compoundButton = this.f2624husNiw3snxdgZPAGJm;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f2629zaq8hOURtfwbcX17cG = z;
        this.f2618T9PhQIpGRhE4yZDm1C = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f2615IPyIQcaNa8aB7drBED;
        if (imageView != null) {
            imageView.setVisibility((this.f2621aPyGSIylzVNKPT1Bls || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f2625lEeR5KfoEr4xU5yHH7.VItLRw50eXTZeEfGl0() || this.f2629zaq8hOURtfwbcX17cG;
        if (z || this.f2618T9PhQIpGRhE4yZDm1C) {
            ImageView imageView = this.f2627s3fjYDxWOUexjjVgyA;
            if (imageView == null && drawable == null && !this.f2618T9PhQIpGRhE4yZDm1C) {
                return;
            }
            if (imageView == null) {
                KYHag8HRDlnO3X9zmZ();
            }
            if (drawable == null && !this.f2618T9PhQIpGRhE4yZDm1C) {
                this.f2627s3fjYDxWOUexjjVgyA.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f2627s3fjYDxWOUexjjVgyA;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f2627s3fjYDxWOUexjjVgyA.getVisibility() != 0) {
                this.f2627s3fjYDxWOUexjjVgyA.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.f2628zZKhbgvUfsK4AEX3r0.setText(charSequence);
            if (this.f2628zZKhbgvUfsK4AEX3r0.getVisibility() == 0) {
                return;
            }
            textView = this.f2628zZKhbgvUfsK4AEX3r0;
            i = 0;
        } else {
            i = 8;
            if (this.f2628zZKhbgvUfsK4AEX3r0.getVisibility() == 8) {
                return;
            } else {
                textView = this.f2628zZKhbgvUfsK4AEX3r0;
            }
        }
        textView.setVisibility(i);
    }

    @Override // androidx.appcompat.view.menu.IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7
    public void zZKhbgvUfsK4AEX3r0(husNiw3snxdgZPAGJm husniw3snxdgzpagjm, int i) {
        this.f2625lEeR5KfoEr4xU5yHH7 = husniw3snxdgzpagjm;
        setVisibility(husniw3snxdgzpagjm.isVisible() ? 0 : 8);
        setTitle(husniw3snxdgzpagjm.IPyIQcaNa8aB7drBED(this));
        setCheckable(husniw3snxdgzpagjm.isCheckable());
        IPyIQcaNa8aB7drBED(husniw3snxdgzpagjm.WWC27LAMFqFFBzfbNw(), husniw3snxdgzpagjm.husNiw3snxdgZPAGJm());
        setIcon(husniw3snxdgzpagjm.getIcon());
        setEnabled(husniw3snxdgzpagjm.isEnabled());
        setSubMenuArrowVisible(husniw3snxdgzpagjm.hasSubMenu());
        setContentDescription(husniw3snxdgzpagjm.getContentDescription());
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        PPkm9uUfOJHHYveeLT pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL = PPkm9uUfOJHHYveeLT.R9SAhYMerGybF9OAjL(getContext(), attributeSet, lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6333R6kEk3zZuOluTikhN3, i, 0);
        this.f2613Acstmh57AKoSEkEFNJ = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.TCyPEKSzIyweCN5yp1(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6390gpnYwZkFpQwu7zi2gb);
        this.f2620Z9WdNiOsPR0y54zHW4 = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.T9PhQIpGRhE4yZDm1C(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6366auvQiDfBN48eRz3fFq, -1);
        this.f2618T9PhQIpGRhE4yZDm1C = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.lEeR5KfoEr4xU5yHH7(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6423sKw6Jz5uGcQ479KwIW, false);
        this.f2622e54J8UWNHWALQNixXM = context;
        this.f2623hoXrIDAFrSwfShk8da = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.TCyPEKSzIyweCN5yp1(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6299FXtjrf53D5B1cLsLFG);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7.f6278hoXrIDAFrSwfShk8da, 0);
        this.f2621aPyGSIylzVNKPT1Bls = typedArrayObtainStyledAttributes.hasValue(0);
        pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.xHA29AmDt6y96AnB3t();
        typedArrayObtainStyledAttributes.recycle();
    }
}
