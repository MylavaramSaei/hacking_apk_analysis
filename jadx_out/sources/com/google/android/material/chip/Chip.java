package com.google.android.material.chip;

import IPyIQcaNa8aB7drBED.KYHag8HRDlnO3X9zmZ;
import OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import WaWv1mJ1ya3uoEaKqz.Z9WdNiOsPR0y54zHW4;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import ayaSAlBnO403UB0TMR.hoXrIDAFrSwfShk8da;
import com.google.android.material.chip.lEeR5KfoEr4xU5yHH7;
import hgxXdWVkE1CPHCTwpz.zZKhbgvUfsK4AEX3r0;
import java.util.List;
import tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ;
import tmIBXGVvBsrJ7i63G2.IPyIQcaNa8aB7drBED;
import tmIBXGVvBsrJ7i63G2.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public class Chip extends KYHag8HRDlnO3X9zmZ implements lEeR5KfoEr4xU5yHH7.InterfaceC0079lEeR5KfoEr4xU5yHH7, hoXrIDAFrSwfShk8da, Checkable {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public boolean f5003Acstmh57AKoSEkEFNJ;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public final RectF f5004G7AC3DWIx9i9fdanjk;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public View.OnClickListener f5005IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public InsetDrawable f5006KYHag8HRDlnO3X9zmZ;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public int f5007OANkd3mP6AYvwbNLJM;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public final Rect f5008R9SAhYMerGybF9OAjL;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public boolean f5009T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public RippleDrawable f5010TCyPEKSzIyweCN5yp1;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public boolean f5011Y43RdunnpKgpbny0lE;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public boolean f5012Z9WdNiOsPR0y54zHW4;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public int f5013aPyGSIylzVNKPT1Bls;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public boolean f5014e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public boolean f5015hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 f5016husNiw3snxdgZPAGJm;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f5017pbVGzGjWvY2LDXC8vo;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public final HJFh0TGMpafqLE9haL f5018sTkWmhpZ5b1ArQIw4K;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public final hgxXdWVkE1CPHCTwpz.KYHag8HRDlnO3X9zmZ f5019xHA29AmDt6y96AnB3t;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public CharSequence f5020zaq8hOURtfwbcX17cG;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public static final int f5000LIMtzhnLwQyigzK0KO = pbVGzGjWvY2LDXC8vo.f7161IPyIQcaNa8aB7drBED;

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public static final Rect f4999A49QRPHynYLCBN0SqP = new Rect();

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public static final int[] f5001VItLRw50eXTZeEfGl0 = {R.attr.state_selected};

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public static final int[] f5002WWC27LAMFqFFBzfbNw = {R.attr.state_checkable};

    public class HJFh0TGMpafqLE9haL extends lLKzvdU99Iw80uVD5I.lEeR5KfoEr4xU5yHH7 {
        public HJFh0TGMpafqLE9haL(Chip chip) {
            super(chip);
        }

        @Override // lLKzvdU99Iw80uVD5I.lEeR5KfoEr4xU5yHH7
        public boolean DfpieXfdYs58yZAiXY(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.G7AC3DWIx9i9fdanjk();
            }
            return false;
        }

        @Override // lLKzvdU99Iw80uVD5I.lEeR5KfoEr4xU5yHH7
        public void OUd9THiLjZndMj0qdF(List list) {
            list.add(0);
            if (Chip.this.hoXrIDAFrSwfShk8da() && Chip.this.Y43RdunnpKgpbny0lE() && Chip.this.f5005IPyIQcaNa8aB7drBED != null) {
                list.add(1);
            }
        }

        @Override // lLKzvdU99Iw80uVD5I.lEeR5KfoEr4xU5yHH7
        public void PPkm9uUfOJHHYveeLT(A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
            a49QRPHynYLCBN0SqP.ctWLFN70QQINH1kyYo(Chip.this.sTkWmhpZ5b1ArQIw4K());
            a49QRPHynYLCBN0SqP.eWK41qw3g36LVd4UnS(Chip.this.isClickable());
            a49QRPHynYLCBN0SqP.zXY7dgnTfw9Pd9RXel(Chip.this.getAccessibilityClassName());
            a49QRPHynYLCBN0SqP.Bc5OTyAfOKVCQb8CEz(Chip.this.getText());
        }

        @Override // lLKzvdU99Iw80uVD5I.lEeR5KfoEr4xU5yHH7
        public void aAp6BD79BhftLCnuvf(int i, A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
            if (i != 1) {
                a49QRPHynYLCBN0SqP.FtYx4GXtxwA8al5hBy("");
                a49QRPHynYLCBN0SqP.Kh0uC90qEEhuLdpgB9(Chip.f4999A49QRPHynYLCBN0SqP);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = Chip.this.getText();
                closeIconContentDescription = Chip.this.getContext().getString(IPyIQcaNa8aB7drBED.f7051IPyIQcaNa8aB7drBED, TextUtils.isEmpty(text) ? "" : text).trim();
            }
            a49QRPHynYLCBN0SqP.FtYx4GXtxwA8al5hBy(closeIconContentDescription);
            a49QRPHynYLCBN0SqP.Kh0uC90qEEhuLdpgB9(Chip.this.getCloseIconTouchBoundsInt());
            a49QRPHynYLCBN0SqP.s3fjYDxWOUexjjVgyA(A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7.f1236pbVGzGjWvY2LDXC8vo);
            a49QRPHynYLCBN0SqP.ayduHasC7VpxsVXE0T(Chip.this.isEnabled());
        }

        @Override // lLKzvdU99Iw80uVD5I.lEeR5KfoEr4xU5yHH7
        public int ao3wqKm5CXFuvC0q47(float f, float f2) {
            return (Chip.this.hoXrIDAFrSwfShk8da() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // lLKzvdU99Iw80uVD5I.lEeR5KfoEr4xU5yHH7
        public void lLKzvdU99Iw80uVD5I(int i, boolean z) {
            if (i == 1) {
                Chip.this.f5009T9PhQIpGRhE4yZDm1C = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public class lEeR5KfoEr4xU5yHH7 extends hgxXdWVkE1CPHCTwpz.KYHag8HRDlnO3X9zmZ {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // hgxXdWVkE1CPHCTwpz.KYHag8HRDlnO3X9zmZ
        public void lEeR5KfoEr4xU5yHH7(int i) {
        }

        @Override // hgxXdWVkE1CPHCTwpz.KYHag8HRDlnO3X9zmZ
        public void s3fjYDxWOUexjjVgyA(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f5016husNiw3snxdgZPAGJm.hNwHJdfN8Sg5H67aR5() ? Chip.this.f5016husNiw3snxdgZPAGJm.vExXQwwMm8C1aKdGdj() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class s3fjYDxWOUexjjVgyA extends ViewOutlineProvider {
        public s3fjYDxWOUexjjVgyA() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f5016husNiw3snxdgZPAGJm != null) {
                Chip.this.f5016husNiw3snxdgZPAGJm.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7153s3fjYDxWOUexjjVgyA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f5004G7AC3DWIx9i9fdanjk.setEmpty();
        if (hoXrIDAFrSwfShk8da() && this.f5005IPyIQcaNa8aB7drBED != null) {
            this.f5016husNiw3snxdgZPAGJm.e5tXAuLbtMC3XyEoX9(this.f5004G7AC3DWIx9i9fdanjk);
        }
        return this.f5004G7AC3DWIx9i9fdanjk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f5008R9SAhYMerGybF9OAjL.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f5008R9SAhYMerGybF9OAjL;
    }

    private zZKhbgvUfsK4AEX3r0 getTextAppearance() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.cr99CPXhoiknALiHbq();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f5014e54J8UWNHWALQNixXM != z) {
            this.f5014e54J8UWNHWALQNixXM = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f5012Z9WdNiOsPR0y54zHW4 != z) {
            this.f5012Z9WdNiOsPR0y54zHW4 = z;
            refreshDrawableState();
        }
    }

    public final void A49QRPHynYLCBN0SqP(com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.EgmJdc4h5OU4spuEKW(null);
        }
    }

    public final void Acstmh57AKoSEkEFNJ(com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        leer5kfoer4xu5yhh7.EgmJdc4h5OU4spuEKW(this);
    }

    public boolean G7AC3DWIx9i9fdanjk() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f5005IPyIQcaNa8aB7drBED;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.f5011Y43RdunnpKgpbny0lE) {
            this.f5018sTkWmhpZ5b1ArQIw4K.oocVJL811qFf0j0XXZ(1, 1);
        }
        return z;
    }

    public boolean LIMtzhnLwQyigzK0KO() {
        return this.f5015hoXrIDAFrSwfShk8da;
    }

    public final void OANkd3mP6AYvwbNLJM() {
        setOutlineProvider(new s3fjYDxWOUexjjVgyA());
    }

    public final void OUd9THiLjZndMj0qdF() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            paint.drawableState = leer5kfoer4xu5yhh7.getState();
        }
        zZKhbgvUfsK4AEX3r0 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.hoXrIDAFrSwfShk8da(getContext(), paint, this.f5019xHA29AmDt6y96AnB3t);
        }
    }

    public final /* synthetic */ void R9SAhYMerGybF9OAjL(CompoundButton compoundButton, boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f5017pbVGzGjWvY2LDXC8vo;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
        }
    }

    public final void T9PhQIpGRhE4yZDm1C() {
        if (getBackgroundDrawable() == this.f5006KYHag8HRDlnO3X9zmZ && this.f5016husNiw3snxdgZPAGJm.getCallback() == null) {
            this.f5016husNiw3snxdgZPAGJm.setCallback(this.f5006KYHag8HRDlnO3X9zmZ);
        }
    }

    public final void THTDvPxsHqMeGb512f() {
        this.f5010TCyPEKSzIyweCN5yp1 = new RippleDrawable(dCumDqZdWZ8NLrsgb7.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this.f5016husNiw3snxdgZPAGJm.h7m69eGbRk1hyaVt28()), getBackgroundDrawable(), null);
        this.f5016husNiw3snxdgZPAGJm.jLObTZifvCGJKb1uVO(false);
        lLKzvdU99Iw80uVD5I.ayduHasC7VpxsVXE0T(this, this.f5010TCyPEKSzIyweCN5yp1);
        ao3wqKm5CXFuvC0q47();
    }

    public final void VItLRw50eXTZeEfGl0() {
        boolean z;
        if (hoXrIDAFrSwfShk8da() && Y43RdunnpKgpbny0lE() && this.f5005IPyIQcaNa8aB7drBED != null) {
            lLKzvdU99Iw80uVD5I.eWK41qw3g36LVd4UnS(this, this.f5018sTkWmhpZ5b1ArQIw4K);
            z = true;
        } else {
            lLKzvdU99Iw80uVD5I.eWK41qw3g36LVd4UnS(this, null);
            z = false;
        }
        this.f5011Y43RdunnpKgpbny0lE = z;
    }

    public final void WWC27LAMFqFFBzfbNw() {
        if (dCumDqZdWZ8NLrsgb7.s3fjYDxWOUexjjVgyA.f5620lEeR5KfoEr4xU5yHH7) {
            THTDvPxsHqMeGb512f();
            return;
        }
        this.f5016husNiw3snxdgZPAGJm.jLObTZifvCGJKb1uVO(true);
        lLKzvdU99Iw80uVD5I.ayduHasC7VpxsVXE0T(this, getBackgroundDrawable());
        ao3wqKm5CXFuvC0q47();
        T9PhQIpGRhE4yZDm1C();
    }

    public boolean Y43RdunnpKgpbny0lE() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        return leer5kfoer4xu5yhh7 != null && leer5kfoer4xu5yhh7.hgxXdWVkE1CPHCTwpz();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int[] Z9WdNiOsPR0y54zHW4() {
        ?? IsEnabled = isEnabled();
        int i = IsEnabled;
        if (this.f5009T9PhQIpGRhE4yZDm1C) {
            i = IsEnabled + 1;
        }
        int i2 = i;
        if (this.f5014e54J8UWNHWALQNixXM) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (this.f5012Z9WdNiOsPR0y54zHW4) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (isChecked()) {
            i4 = i3 + 1;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i5 = 1;
        }
        if (this.f5009T9PhQIpGRhE4yZDm1C) {
            iArr[i5] = 16842908;
            i5++;
        }
        if (this.f5014e54J8UWNHWALQNixXM) {
            iArr[i5] = 16843623;
            i5++;
        }
        if (this.f5012Z9WdNiOsPR0y54zHW4) {
            iArr[i5] = 16842919;
            i5++;
        }
        if (isChecked()) {
            iArr[i5] = 16842913;
        }
        return iArr;
    }

    public final void aPyGSIylzVNKPT1Bls(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayIPyIQcaNa8aB7drBED = Z9WdNiOsPR0y54zHW4.IPyIQcaNa8aB7drBED(context, attributeSet, Acstmh57AKoSEkEFNJ.f6964osrHU7fvDp2EgxZPfM, i, f5000LIMtzhnLwQyigzK0KO, new int[0]);
        this.f5015hoXrIDAFrSwfShk8da = typedArrayIPyIQcaNa8aB7drBED.getBoolean(Acstmh57AKoSEkEFNJ.f6935fDXXEWvhMVO3O8mnuS, false);
        this.f5007OANkd3mP6AYvwbNLJM = (int) Math.ceil(typedArrayIPyIQcaNa8aB7drBED.getDimension(Acstmh57AKoSEkEFNJ.f6949iQCvttGuB7nx4r7kMP, (float) Math.ceil(WaWv1mJ1ya3uoEaKqz.hoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL(getContext(), 48))));
        typedArrayIPyIQcaNa8aB7drBED.recycle();
    }

    public final void ao3wqKm5CXFuvC0q47() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7;
        if (TextUtils.isEmpty(getText()) || (leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm) == null) {
            return;
        }
        int iHR5vAalpgOKVm2T0Gq = (int) (leer5kfoer4xu5yhh7.HR5vAalpgOKVm2T0Gq() + this.f5016husNiw3snxdgZPAGJm.FI7jQXEuEg1AdcOOw7() + this.f5016husNiw3snxdgZPAGJm.eWK41qw3g36LVd4UnS());
        int iVlBaBOcZ1q1ndWVoXn = (int) (this.f5016husNiw3snxdgZPAGJm.vlBaBOcZ1q1ndWVoXn() + this.f5016husNiw3snxdgZPAGJm.h6NrAcYSuIyiU1qV6F() + this.f5016husNiw3snxdgZPAGJm.Pum9NZyDBKoCnecvlx());
        if (this.f5006KYHag8HRDlnO3X9zmZ != null) {
            Rect rect = new Rect();
            this.f5006KYHag8HRDlnO3X9zmZ.getPadding(rect);
            iVlBaBOcZ1q1ndWVoXn += rect.left;
            iHR5vAalpgOKVm2T0Gq += rect.right;
        }
        lLKzvdU99Iw80uVD5I.Ywqw2A0s86HeuFkDt0(this, iVlBaBOcZ1q1ndWVoXn, getPaddingTop(), iHR5vAalpgOKVm2T0Gq, getPaddingBottom());
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f5011Y43RdunnpKgpbny0lE ? super.dispatchHoverEvent(motionEvent) : this.f5018sTkWmhpZ5b1ArQIw4K.xHA29AmDt6y96AnB3t(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f5011Y43RdunnpKgpbny0lE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f5018sTkWmhpZ5b1ArQIw4K.LIMtzhnLwQyigzK0KO(keyEvent) || this.f5018sTkWmhpZ5b1ArQIw4K.THTDvPxsHqMeGb512f() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // IPyIQcaNa8aB7drBED.KYHag8HRDlnO3X9zmZ, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if ((leer5kfoer4xu5yhh7 == null || !leer5kfoer4xu5yhh7.fBZDmBPlAHk1Liuf1T()) ? false : this.f5016husNiw3snxdgZPAGJm.pjij9fAFhRRn230kOs(Z9WdNiOsPR0y54zHW4())) {
            invalidate();
        }
    }

    public boolean e54J8UWNHWALQNixXM(int i) {
        this.f5007OANkd3mP6AYvwbNLJM = i;
        if (!LIMtzhnLwQyigzK0KO()) {
            if (this.f5006KYHag8HRDlnO3X9zmZ != null) {
                xHA29AmDt6y96AnB3t();
            } else {
                WWC27LAMFqFFBzfbNw();
            }
            return false;
        }
        int iMax = Math.max(0, i - this.f5016husNiw3snxdgZPAGJm.getIntrinsicHeight());
        int iMax2 = Math.max(0, i - this.f5016husNiw3snxdgZPAGJm.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f5006KYHag8HRDlnO3X9zmZ != null) {
                xHA29AmDt6y96AnB3t();
            } else {
                WWC27LAMFqFFBzfbNw();
            }
            return false;
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f5006KYHag8HRDlnO3X9zmZ != null) {
            Rect rect = new Rect();
            this.f5006KYHag8HRDlnO3X9zmZ.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                WWC27LAMFqFFBzfbNw();
                return true;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        zaq8hOURtfwbcX17cG(i2, i3, i2, i3);
        WWC27LAMFqFFBzfbNw();
        return true;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f5020zaq8hOURtfwbcX17cG)) {
            return this.f5020zaq8hOURtfwbcX17cG;
        }
        if (!sTkWmhpZ5b1ArQIw4K()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f5006KYHag8HRDlnO3X9zmZ;
        return insetDrawable == null ? this.f5016husNiw3snxdgZPAGJm : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.Ywqw2A0s86HeuFkDt0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.f2zPq7MOnQrtOlZ1Zg();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.HZ4bptRS9XIcK1CV95();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return Math.max(0.0f, leer5kfoer4xu5yhh7.aRQ2M7vtRaPDEyvpdv());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f5016husNiw3snxdgZPAGJm;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.HR5vAalpgOKVm2T0Gq();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.pgB7Gmjz55y9NQYnAD();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.Bc5OTyAfOKVCQb8CEz();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.aUn6Hqsqw2PVM8685Z();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.fDXXEWvhMVO3O8mnuS();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.vlBaBOcZ1q1ndWVoXn();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.i8aHOwH04efS6lZ3Oa();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.owCQzRKpGarpL4247z();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.uAIIhSQWhOmxUb3Bqo();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.oXIAAdret8ERrYfuyf();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.yXUWiIShOcfJRNCmU8();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.OWyIJu8lIXxQlvLhaC();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.oOMFI1Dcqcg1BSVNty();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.d4ZdBAtGyjVWTQYsYn();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.jsjSYEu4NPZjZxcfmI();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f5011Y43RdunnpKgpbny0lE && (this.f5018sTkWmhpZ5b1ArQIw4K.THTDvPxsHqMeGb512f() == 1 || this.f5018sTkWmhpZ5b1ArQIw4K.A49QRPHynYLCBN0SqP() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public jsjSYEu4NPZjZxcfmI.HJFh0TGMpafqLE9haL getHideMotionSpec() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.EscIOBqRhG6irG5q11();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.g0OBkYSIvp0JYnHPjC();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.PDw1hXOtArGjUqFgpT();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.h7m69eGbRk1hyaVt28();
        }
        return null;
    }

    public ayaSAlBnO403UB0TMR.Z9WdNiOsPR0y54zHW4 getShapeAppearanceModel() {
        return this.f5016husNiw3snxdgZPAGJm.THTDvPxsHqMeGb512f();
    }

    public jsjSYEu4NPZjZxcfmI.HJFh0TGMpafqLE9haL getShowMotionSpec() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.LFGi8lLul9XOP250o9();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.FI7jQXEuEg1AdcOOw7();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7.h6NrAcYSuIyiU1qV6F();
        }
        return 0.0f;
    }

    public final boolean hoXrIDAFrSwfShk8da() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        return (leer5kfoer4xu5yhh7 == null || leer5kfoer4xu5yhh7.uAIIhSQWhOmxUb3Bqo() == null) ? false : true;
    }

    public final void jCtUeU2YI1poCxWcjm(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    @Override // com.google.android.material.chip.lEeR5KfoEr4xU5yHH7.InterfaceC0079lEeR5KfoEr4xU5yHH7
    public void lEeR5KfoEr4xU5yHH7() {
        e54J8UWNHWALQNixXM(this.f5007OANkd3mP6AYvwbNLJM);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ayaSAlBnO403UB0TMR.IPyIQcaNa8aB7drBED.KYHag8HRDlnO3X9zmZ(this, this.f5016husNiw3snxdgZPAGJm);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5001VItLRw50eXTZeEfGl0);
        }
        if (sTkWmhpZ5b1ArQIw4K()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5002WWC27LAMFqFFBzfbNw);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f5011Y43RdunnpKgpbny0lE) {
            this.f5018sTkWmhpZ5b1ArQIw4K.GyWRxpdt1T8mEJXPoD(z, i, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean zContains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                zContains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(zContains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(sTkWmhpZ5b1ArQIw4K());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f5013aPyGSIylzVNKPT1Bls != i) {
            this.f5013aPyGSIylzVNKPT1Bls = i;
            ao3wqKm5CXFuvC0q47();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L35
            goto L40
        L21:
            boolean r0 = r5.f5012Z9WdNiOsPR0y54zHW4
            if (r0 == 0) goto L40
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L41
        L2c:
            boolean r0 = r5.f5012Z9WdNiOsPR0y54zHW4
            if (r0 == 0) goto L35
            r5.G7AC3DWIx9i9fdanjk()
            r0 = r2
            goto L36
        L35:
            r0 = r3
        L36:
            r5.setCloseIconPressed(r3)
            goto L41
        L3a:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
            goto L2a
        L40:
            r0 = r3
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            r2 = r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean sTkWmhpZ5b1ArQIw4K() {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        return leer5kfoer4xu5yhh7 != null && leer5kfoer4xu5yhh7.YIIWDMF3jHAs3E0PkN();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f5020zaq8hOURtfwbcX17cG = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f5010TCyPEKSzIyweCN5yp1) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // IPyIQcaNa8aB7drBED.KYHag8HRDlnO3X9zmZ, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f5010TCyPEKSzIyweCN5yp1) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // IPyIQcaNa8aB7drBED.KYHag8HRDlnO3X9zmZ, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.sKw6Jz5uGcQ479KwIW(z);
        }
    }

    public void setCheckableResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.FXtjrf53D5B1cLsLFG(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 == null) {
            this.f5003Acstmh57AKoSEkEFNJ = z;
        } else if (leer5kfoer4xu5yhh7.YIIWDMF3jHAs3E0PkN()) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.dvmHGYHwlE2ean7ktb(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.zWzrlx9vIdLp7FoEMD(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.TZ2u8Z18RnXun7OSW0(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.BGBL3rAlNaaPWRbRlF(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.LjVYrU4NjguFeQ2fwa(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.MecTLhJ95ynyqeEob1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.Nm04cZudeGY9NQf1y2(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.JRgQbcjdTfLJPT0BU7(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.tGGjvtdOhUewv2twsg(i);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh72 != leer5kfoer4xu5yhh7) {
            A49QRPHynYLCBN0SqP(leer5kfoer4xu5yhh72);
            this.f5016husNiw3snxdgZPAGJm = leer5kfoer4xu5yhh7;
            leer5kfoer4xu5yhh7.vzXHdKiCTh4zilt9z1(false);
            Acstmh57AKoSEkEFNJ(this.f5016husNiw3snxdgZPAGJm);
            e54J8UWNHWALQNixXM(this.f5007OANkd3mP6AYvwbNLJM);
        }
    }

    public void setChipEndPadding(float f) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.zQjb36M22TWHJmh54i(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.wUKf1mNArSjssthGmN(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.xt9LcS8xZRgoStfDrh(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.w859GrF8FXGM1qrYSH(i);
        }
    }

    public void setChipIconSize(float f) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.sKvjC8bExN3ISwwWsb(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.fB1XGht2x9XoIgekQ8(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.ZH7ZBRiZvcOTI9arA2(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.D3qEI0j1Bvj6FYKAih(i);
        }
    }

    public void setChipIconVisible(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.SF66oTSCsXABfwyWiU(i);
        }
    }

    public void setChipMinHeight(float f) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.X3J0rTi7qZISiATDQK(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.Tn7MuV14fPMb1UrB5h(i);
        }
    }

    public void setChipStartPadding(float f) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.yuvys90eVmNOCmVGXw(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.X3sgW3wH5gs9BRlOWB(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.w9kKjxxNBwNcD4xB6O(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.GraqRgO5nDZP94CSeH(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.F8je6vTkTMHm5WbjEC(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.KWpkmWKCm3jeG4AjIM(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.t1ob1jctq87uSyCpeM(drawable);
        }
        VItLRw50eXTZeEfGl0();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.pifLUtPYGKkyBx85TF(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.h3D8MhcyLuC2SOP1fB(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.vcruDMeiXYQeTlT3OI(i);
        }
    }

    public void setCloseIconResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.RkBK3rbmyPvWiHUrac(i);
        }
        VItLRw50eXTZeEfGl0();
    }

    public void setCloseIconSize(float f) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.jpEZy3U5wFkT2e9PKQ(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.cni9M1Tt0N7bwq7oSh(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.ndQwlXNek6Yo5ZBYrV(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.YUDx3zHgOZWWxq2Qgs(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.ADbagDwlO3sAb2p0ry(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.njV42vQJoqlfw05NNQ(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // IPyIQcaNa8aB7drBED.KYHag8HRDlnO3X9zmZ, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // IPyIQcaNa8aB7drBED.KYHag8HRDlnO3X9zmZ, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.zcy2NNbtVXgoGQbfuq(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f5016husNiw3snxdgZPAGJm == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.uWxB7TH05HzXzGqLIZ(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f5015hoXrIDAFrSwfShk8da = z;
        e54J8UWNHWALQNixXM(this.f5007OANkd3mP6AYvwbNLJM);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(jsjSYEu4NPZjZxcfmI.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.oyZAo7y5frVexNxTMd(hJFh0TGMpafqLE9haL);
        }
    }

    public void setHideMotionSpecResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.N1vPC7A5f7Unhsdkgr(i);
        }
    }

    public void setIconEndPadding(float f) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.xtQ8QaNqF3hKvhL94g(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.qnb0B0kp1U5mzuoCqH(i);
        }
    }

    public void setIconStartPadding(float f) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.XfvA8xAblLUDzfjNL9(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.JIhXU7AcR3dXyMdSM6(i);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f5016husNiw3snxdgZPAGJm == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.msljfiu2GA8S2iWtz0(i);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f5017pbVGzGjWvY2LDXC8vo = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f5005IPyIQcaNa8aB7drBED = onClickListener;
        VItLRw50eXTZeEfGl0();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.DkHm7hVHmkyvDHXSjR(colorStateList);
        }
        if (this.f5016husNiw3snxdgZPAGJm.GeBgWLiG3rAOvStVF8()) {
            return;
        }
        THTDvPxsHqMeGb512f();
    }

    public void setRippleColorResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.Qqql9aLAyQK9tLp8QF(i);
            if (this.f5016husNiw3snxdgZPAGJm.GeBgWLiG3rAOvStVF8()) {
                return;
            }
            THTDvPxsHqMeGb512f();
        }
    }

    @Override // ayaSAlBnO403UB0TMR.hoXrIDAFrSwfShk8da
    public void setShapeAppearanceModel(ayaSAlBnO403UB0TMR.Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
        this.f5016husNiw3snxdgZPAGJm.setShapeAppearanceModel(z9WdNiOsPR0y54zHW4);
    }

    public void setShowMotionSpec(jsjSYEu4NPZjZxcfmI.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.q0O8WPjPHflNoINQ2T(hJFh0TGMpafqLE9haL);
        }
    }

    public void setShowMotionSpecResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.nZURNaK44ts4XNCkYr(i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(leer5kfoer4xu5yhh7.hNwHJdfN8Sg5H67aR5() ? null : charSequence, bufferType);
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh72 != null) {
            leer5kfoer4xu5yhh72.suHivzALoCSfNps0XP(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.iiJlEZjcw2pMDvSjYw(i);
        }
        OUd9THiLjZndMj0qdF();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.UViYrxCuj6kEgG2Mva(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.FK1mYOUHT5iEQP3ZJ1(i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.CPvkPRvSu1JpqPqzvl(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
        }
        OUd9THiLjZndMj0qdF();
    }

    public void setTextStartPadding(float f) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.TToLdubKjN4ASlJwWv(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.YiiZd9BUnxc5tLzouk(i);
        }
    }

    public final void xHA29AmDt6y96AnB3t() {
        if (this.f5006KYHag8HRDlnO3X9zmZ != null) {
            this.f5006KYHag8HRDlnO3X9zmZ = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            WWC27LAMFqFFBzfbNw();
        }
    }

    public final void zaq8hOURtfwbcX17cG(int i, int i2, int i3, int i4) {
        this.f5006KYHag8HRDlnO3X9zmZ = new InsetDrawable((Drawable) this.f5016husNiw3snxdgZPAGJm, i, i2, i3, i4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        int i2 = f5000LIMtzhnLwQyigzK0KO;
        super(gpnYwZkFpQwu7zi2gb.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(context, attributeSet, i, i2), attributeSet, i);
        this.f5008R9SAhYMerGybF9OAjL = new Rect();
        this.f5004G7AC3DWIx9i9fdanjk = new RectF();
        this.f5019xHA29AmDt6y96AnB3t = new lEeR5KfoEr4xU5yHH7();
        Context context2 = getContext();
        jCtUeU2YI1poCxWcjm(attributeSet);
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7XMfAHy6F7qK0zhxhKG = com.google.android.material.chip.lEeR5KfoEr4xU5yHH7.xMfAHy6F7qK0zhxhKG(context2, attributeSet, i, i2);
        aPyGSIylzVNKPT1Bls(context2, attributeSet, i);
        setChipDrawable(leer5kfoer4xu5yhh7XMfAHy6F7qK0zhxhKG);
        leer5kfoer4xu5yhh7XMfAHy6F7qK0zhxhKG.zcy2NNbtVXgoGQbfuq(lLKzvdU99Iw80uVD5I.Y43RdunnpKgpbny0lE(this));
        TypedArray typedArrayIPyIQcaNa8aB7drBED = Z9WdNiOsPR0y54zHW4.IPyIQcaNa8aB7drBED(context2, attributeSet, Acstmh57AKoSEkEFNJ.f6964osrHU7fvDp2EgxZPfM, i, i2, new int[0]);
        boolean zHasValue = typedArrayIPyIQcaNa8aB7drBED.hasValue(Acstmh57AKoSEkEFNJ.f6962oXIAAdret8ERrYfuyf);
        typedArrayIPyIQcaNa8aB7drBED.recycle();
        this.f5018sTkWmhpZ5b1ArQIw4K = new HJFh0TGMpafqLE9haL(this);
        VItLRw50eXTZeEfGl0();
        if (!zHasValue) {
            OANkd3mP6AYvwbNLJM();
        }
        setChecked(this.f5003Acstmh57AKoSEkEFNJ);
        setText(leer5kfoer4xu5yhh7XMfAHy6F7qK0zhxhKG.vExXQwwMm8C1aKdGdj());
        setEllipsize(leer5kfoer4xu5yhh7XMfAHy6F7qK0zhxhKG.jsjSYEu4NPZjZxcfmI());
        OUd9THiLjZndMj0qdF();
        if (!this.f5016husNiw3snxdgZPAGJm.hNwHJdfN8Sg5H67aR5()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        ao3wqKm5CXFuvC0q47();
        if (LIMtzhnLwQyigzK0KO()) {
            setMinHeight(this.f5007OANkd3mP6AYvwbNLJM);
        }
        this.f5013aPyGSIylzVNKPT1Bls = lLKzvdU99Iw80uVD5I.A49QRPHynYLCBN0SqP(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vExXQwwMm8C1aKdGdj.lEeR5KfoEr4xU5yHH7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f7197lEeR5KfoEr4xU5yHH7.R9SAhYMerGybF9OAjL(compoundButton, z);
            }
        });
    }

    public void setCheckedIconVisible(boolean z) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.hUNDUI3oB5uci3ylnY(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.jguN4azZtOjukyvhIL(z);
        }
    }

    public void setCloseIconVisible(boolean z) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.mhQSzVvPFnByVGnwX9(z);
        }
        VItLRw50eXTZeEfGl0();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.iiJlEZjcw2pMDvSjYw(i);
        }
        OUd9THiLjZndMj0qdF();
    }

    public void setTextAppearance(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        com.google.android.material.chip.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5016husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.exhPLopOJ5QWEzRjTU(zzkhbgvufsk4aex3r0);
        }
        OUd9THiLjZndMj0qdF();
    }

    public void setInternalOnCheckedChangeListener(WaWv1mJ1ya3uoEaKqz.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
    }
}
