package com.google.android.material.button;

import OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP;
import W3RZ2dTDKrKpS5Mxdk.R9SAhYMerGybF9OAjL;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import WaWv1mJ1ya3uoEaKqz.hoXrIDAFrSwfShk8da;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import ayaSAlBnO403UB0TMR.Z9WdNiOsPR0y54zHW4;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ;
import tmIBXGVvBsrJ7i63G2.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public static final int f4930Z9WdNiOsPR0y54zHW4 = pbVGzGjWvY2LDXC8vo.f7168pbVGzGjWvY2LDXC8vo;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public Set f4931Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final LinkedHashSet f4932HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public boolean f4933IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public boolean f4934KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public boolean f4935TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public Integer[] f4936husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final List f4937lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final int f4938pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final husNiw3snxdgZPAGJm f4939s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final Comparator f4940zZKhbgvUfsK4AEX3r0;

    public static class HJFh0TGMpafqLE9haL {

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public static final ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL f4941husNiw3snxdgZPAGJm = new ayaSAlBnO403UB0TMR.lEeR5KfoEr4xU5yHH7(0.0f);

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL f4942HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL f4943lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL f4944s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL f4945zZKhbgvUfsK4AEX3r0;

        public HJFh0TGMpafqLE9haL(ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2, ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL3, ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL4) {
            this.f4943lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL;
            this.f4944s3fjYDxWOUexjjVgyA = hJFh0TGMpafqLE9haL3;
            this.f4942HJFh0TGMpafqLE9haL = hJFh0TGMpafqLE9haL4;
            this.f4945zZKhbgvUfsK4AEX3r0 = hJFh0TGMpafqLE9haL2;
        }

        public static HJFh0TGMpafqLE9haL HJFh0TGMpafqLE9haL(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = hJFh0TGMpafqLE9haL.f4943lEeR5KfoEr4xU5yHH7;
            ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL3 = hJFh0TGMpafqLE9haL.f4945zZKhbgvUfsK4AEX3r0;
            ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL4 = f4941husNiw3snxdgZPAGJm;
            return new HJFh0TGMpafqLE9haL(hJFh0TGMpafqLE9haL2, hJFh0TGMpafqLE9haL3, hJFh0TGMpafqLE9haL4, hJFh0TGMpafqLE9haL4);
        }

        public static HJFh0TGMpafqLE9haL KYHag8HRDlnO3X9zmZ(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = hJFh0TGMpafqLE9haL.f4943lEeR5KfoEr4xU5yHH7;
            ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL3 = f4941husNiw3snxdgZPAGJm;
            return new HJFh0TGMpafqLE9haL(hJFh0TGMpafqLE9haL2, hJFh0TGMpafqLE9haL3, hJFh0TGMpafqLE9haL.f4944s3fjYDxWOUexjjVgyA, hJFh0TGMpafqLE9haL3);
        }

        public static HJFh0TGMpafqLE9haL husNiw3snxdgZPAGJm(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, View view) {
            return hoXrIDAFrSwfShk8da.TCyPEKSzIyweCN5yp1(view) ? zZKhbgvUfsK4AEX3r0(hJFh0TGMpafqLE9haL) : HJFh0TGMpafqLE9haL(hJFh0TGMpafqLE9haL);
        }

        public static HJFh0TGMpafqLE9haL lEeR5KfoEr4xU5yHH7(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = f4941husNiw3snxdgZPAGJm;
            return new HJFh0TGMpafqLE9haL(hJFh0TGMpafqLE9haL2, hJFh0TGMpafqLE9haL.f4945zZKhbgvUfsK4AEX3r0, hJFh0TGMpafqLE9haL2, hJFh0TGMpafqLE9haL.f4942HJFh0TGMpafqLE9haL);
        }

        public static HJFh0TGMpafqLE9haL s3fjYDxWOUexjjVgyA(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, View view) {
            return hoXrIDAFrSwfShk8da.TCyPEKSzIyweCN5yp1(view) ? HJFh0TGMpafqLE9haL(hJFh0TGMpafqLE9haL) : zZKhbgvUfsK4AEX3r0(hJFh0TGMpafqLE9haL);
        }

        public static HJFh0TGMpafqLE9haL zZKhbgvUfsK4AEX3r0(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            ayaSAlBnO403UB0TMR.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = f4941husNiw3snxdgZPAGJm;
            return new HJFh0TGMpafqLE9haL(hJFh0TGMpafqLE9haL2, hJFh0TGMpafqLE9haL2, hJFh0TGMpafqLE9haL.f4944s3fjYDxWOUexjjVgyA, hJFh0TGMpafqLE9haL.f4942HJFh0TGMpafqLE9haL);
        }
    }

    public class husNiw3snxdgZPAGJm implements MaterialButton.lEeR5KfoEr4xU5yHH7 {
        public husNiw3snxdgZPAGJm() {
        }

        @Override // com.google.android.material.button.MaterialButton.lEeR5KfoEr4xU5yHH7
        public void lEeR5KfoEr4xU5yHH7(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ husNiw3snxdgZPAGJm(MaterialButtonToggleGroup materialButtonToggleGroup, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            this();
        }
    }

    public class lEeR5KfoEr4xU5yHH7 implements Comparator {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // java.util.Comparator
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    public class s3fjYDxWOUexjjVgyA extends W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 {
        public s3fjYDxWOUexjjVgyA() {
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public void TCyPEKSzIyweCN5yp1(View view, A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
            super.TCyPEKSzIyweCN5yp1(view, a49QRPHynYLCBN0SqP);
            a49QRPHynYLCBN0SqP.DFYiVi7zXozAjRciKa(A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(0, 1, MaterialButtonToggleGroup.this.pbVGzGjWvY2LDXC8vo(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public interface zZKhbgvUfsK4AEX3r0 {
        void lEeR5KfoEr4xU5yHH7(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7145aPyGSIylzVNKPT1Bls);
    }

    public static void OANkd3mP6AYvwbNLJM(Z9WdNiOsPR0y54zHW4.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        if (hJFh0TGMpafqLE9haL == null) {
            s3fjydxwouexjjvgya.aPyGSIylzVNKPT1Bls(0.0f);
        } else {
            s3fjydxwouexjjvgya.ao3wqKm5CXFuvC0q47(hJFh0TGMpafqLE9haL.f4943lEeR5KfoEr4xU5yHH7).R9SAhYMerGybF9OAjL(hJFh0TGMpafqLE9haL.f4945zZKhbgvUfsK4AEX3r0).tXWeW0sqVddf7ZBflq(hJFh0TGMpafqLE9haL.f4944s3fjYDxWOUexjjVgyA).A49QRPHynYLCBN0SqP(hJFh0TGMpafqLE9haL.f4942HJFh0TGMpafqLE9haL);
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (Z9WdNiOsPR0y54zHW4(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (Z9WdNiOsPR0y54zHW4(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && Z9WdNiOsPR0y54zHW4(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(lLKzvdU99Iw80uVD5I.IPyIQcaNa8aB7drBED());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f4939s3fjYDxWOUexjjVgyA);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final HJFh0TGMpafqLE9haL Acstmh57AKoSEkEFNJ(int i, int i2, int i3) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = (HJFh0TGMpafqLE9haL) this.f4937lEeR5KfoEr4xU5yHH7.get(i);
        if (i2 == i3) {
            return hJFh0TGMpafqLE9haL;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            return z ? HJFh0TGMpafqLE9haL.husNiw3snxdgZPAGJm(hJFh0TGMpafqLE9haL, this) : HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(hJFh0TGMpafqLE9haL);
        }
        if (i == i3) {
            return z ? HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(hJFh0TGMpafqLE9haL, this) : HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(hJFh0TGMpafqLE9haL);
        }
        return null;
    }

    public final void HJFh0TGMpafqLE9haL() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButtonIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(i);
            int iMin = Math.min(materialButtonIPyIQcaNa8aB7drBED.getStrokeWidth(), IPyIQcaNa8aB7drBED(i - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(materialButtonIPyIQcaNa8aB7drBED);
            if (getOrientation() == 0) {
                R9SAhYMerGybF9OAjL.HJFh0TGMpafqLE9haL(layoutParamsZZKhbgvUfsK4AEX3r0, 0);
                R9SAhYMerGybF9OAjL.zZKhbgvUfsK4AEX3r0(layoutParamsZZKhbgvUfsK4AEX3r0, -iMin);
                layoutParamsZZKhbgvUfsK4AEX3r0.topMargin = 0;
            } else {
                layoutParamsZZKhbgvUfsK4AEX3r0.bottomMargin = 0;
                layoutParamsZZKhbgvUfsK4AEX3r0.topMargin = -iMin;
                R9SAhYMerGybF9OAjL.zZKhbgvUfsK4AEX3r0(layoutParamsZZKhbgvUfsK4AEX3r0, 0);
            }
            materialButtonIPyIQcaNa8aB7drBED.setLayoutParams(layoutParamsZZKhbgvUfsK4AEX3r0);
        }
        hoXrIDAFrSwfShk8da(firstVisibleChildIndex);
    }

    public final MaterialButton IPyIQcaNa8aB7drBED(int i) {
        return (MaterialButton) getChildAt(i);
    }

    public void KYHag8HRDlnO3X9zmZ() {
        zaq8hOURtfwbcX17cG(new HashSet());
    }

    public final void R9SAhYMerGybF9OAjL() {
        for (int i = 0; i < getChildCount(); i++) {
            IPyIQcaNa8aB7drBED(i).setA11yClassName((this.f4935TCyPEKSzIyweCN5yp1 ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void T9PhQIpGRhE4yZDm1C(MaterialButton materialButton, boolean z) {
        if (this.f4934KYHag8HRDlnO3X9zmZ) {
            return;
        }
        husNiw3snxdgZPAGJm(materialButton.getId(), z);
    }

    public final void TCyPEKSzIyweCN5yp1(int i, boolean z) {
        Iterator it = this.f4932HJFh0TGMpafqLE9haL.iterator();
        while (it.hasNext()) {
            ((zZKhbgvUfsK4AEX3r0) it.next()).lEeR5KfoEr4xU5yHH7(this, i, z);
        }
    }

    public void Y43RdunnpKgpbny0lE() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButtonIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(i);
            if (materialButtonIPyIQcaNa8aB7drBED.getVisibility() != 8) {
                Z9WdNiOsPR0y54zHW4.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaXHA29AmDt6y96AnB3t = materialButtonIPyIQcaNa8aB7drBED.getShapeAppearanceModel().xHA29AmDt6y96AnB3t();
                OANkd3mP6AYvwbNLJM(s3fjydxwouexjjvgyaXHA29AmDt6y96AnB3t, Acstmh57AKoSEkEFNJ(i, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonIPyIQcaNa8aB7drBED.setShapeAppearanceModel(s3fjydxwouexjjvgyaXHA29AmDt6y96AnB3t.T9PhQIpGRhE4yZDm1C());
            }
        }
    }

    public final boolean Z9WdNiOsPR0y54zHW4(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void aPyGSIylzVNKPT1Bls(int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof MaterialButton) {
            this.f4934KYHag8HRDlnO3X9zmZ = true;
            ((MaterialButton) viewFindViewById).setChecked(z);
            this.f4934KYHag8HRDlnO3X9zmZ = false;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        husNiw3snxdgZPAGJm(materialButton.getId(), materialButton.isChecked());
        Z9WdNiOsPR0y54zHW4 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f4937lEeR5KfoEr4xU5yHH7.add(new HJFh0TGMpafqLE9haL(shapeAppearanceModel.sTkWmhpZ5b1ArQIw4K(), shapeAppearanceModel.Acstmh57AKoSEkEFNJ(), shapeAppearanceModel.R9SAhYMerGybF9OAjL(), shapeAppearanceModel.e54J8UWNHWALQNixXM()));
        materialButton.setEnabled(isEnabled());
        lLKzvdU99Iw80uVD5I.eWK41qw3g36LVd4UnS(materialButton, new s3fjYDxWOUexjjVgyA());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        sTkWmhpZ5b1ArQIw4K();
        super.dispatchDraw(canvas);
    }

    public boolean e54J8UWNHWALQNixXM() {
        return this.f4935TCyPEKSzIyweCN5yp1;
    }

    public int getCheckedButtonId() {
        if (!this.f4935TCyPEKSzIyweCN5yp1 || this.f4931Acstmh57AKoSEkEFNJ.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f4931Acstmh57AKoSEkEFNJ.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = IPyIQcaNa8aB7drBED(i).getId();
            if (this.f4931Acstmh57AKoSEkEFNJ.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f4936husNiw3snxdgZPAGJm;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    public final void hoXrIDAFrSwfShk8da(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) IPyIQcaNa8aB7drBED(i).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            R9SAhYMerGybF9OAjL.HJFh0TGMpafqLE9haL(layoutParams, 0);
            R9SAhYMerGybF9OAjL.zZKhbgvUfsK4AEX3r0(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    public final void husNiw3snxdgZPAGJm(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f4931Acstmh57AKoSEkEFNJ);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f4935TCyPEKSzIyweCN5yp1 && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f4933IPyIQcaNa8aB7drBED || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        zaq8hOURtfwbcX17cG(hashSet);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f4938pbVGzGjWvY2LDXC8vo;
        if (i != -1) {
            zaq8hOURtfwbcX17cG(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        A49QRPHynYLCBN0SqP.i8aHOwH04efS6lZ3Oa(accessibilityNodeInfo).evSiTWao80SbJUZk9E(A49QRPHynYLCBN0SqP.husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(1, getVisibleButtonCount(), false, e54J8UWNHWALQNixXM() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Y43RdunnpKgpbny0lE();
        HJFh0TGMpafqLE9haL();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f4937lEeR5KfoEr4xU5yHH7.remove(iIndexOfChild);
        }
        Y43RdunnpKgpbny0lE();
        HJFh0TGMpafqLE9haL();
    }

    public final int pbVGzGjWvY2LDXC8vo(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && Z9WdNiOsPR0y54zHW4(i2)) {
                i++;
            }
        }
        return -1;
    }

    public void s3fjYDxWOUexjjVgyA(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        this.f4932HJFh0TGMpafqLE9haL.add(zzkhbgvufsk4aex3r0);
    }

    public final void sTkWmhpZ5b1ArQIw4K() {
        TreeMap treeMap = new TreeMap(this.f4940zZKhbgvUfsK4AEX3r0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(IPyIQcaNa8aB7drBED(i), Integer.valueOf(i));
        }
        this.f4936husNiw3snxdgZPAGJm = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            IPyIQcaNa8aB7drBED(i).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f4933IPyIQcaNa8aB7drBED = z;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public final LinearLayout.LayoutParams zZKhbgvUfsK4AEX3r0(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    public final void zaq8hOURtfwbcX17cG(Set set) {
        Set set2 = this.f4931Acstmh57AKoSEkEFNJ;
        this.f4931Acstmh57AKoSEkEFNJ = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = IPyIQcaNa8aB7drBED(i).getId();
            aPyGSIylzVNKPT1Bls(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                TCyPEKSzIyweCN5yp1(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        int i2 = f4930Z9WdNiOsPR0y54zHW4;
        super(gpnYwZkFpQwu7zi2gb.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(context, attributeSet, i, i2), attributeSet, i);
        this.f4937lEeR5KfoEr4xU5yHH7 = new ArrayList();
        this.f4939s3fjYDxWOUexjjVgyA = new husNiw3snxdgZPAGJm(this, null);
        this.f4932HJFh0TGMpafqLE9haL = new LinkedHashSet();
        this.f4940zZKhbgvUfsK4AEX3r0 = new lEeR5KfoEr4xU5yHH7();
        this.f4934KYHag8HRDlnO3X9zmZ = false;
        this.f4931Acstmh57AKoSEkEFNJ = new HashSet();
        TypedArray typedArrayIPyIQcaNa8aB7drBED = WaWv1mJ1ya3uoEaKqz.Z9WdNiOsPR0y54zHW4.IPyIQcaNa8aB7drBED(getContext(), attributeSet, Acstmh57AKoSEkEFNJ.qnb0B0kp1U5mzuoCqH, i, i2, new int[0]);
        setSingleSelection(typedArrayIPyIQcaNa8aB7drBED.getBoolean(Acstmh57AKoSEkEFNJ.DkHm7hVHmkyvDHXSjR, false));
        this.f4938pbVGzGjWvY2LDXC8vo = typedArrayIPyIQcaNa8aB7drBED.getResourceId(Acstmh57AKoSEkEFNJ.JIhXU7AcR3dXyMdSM6, -1);
        this.f4933IPyIQcaNa8aB7drBED = typedArrayIPyIQcaNa8aB7drBED.getBoolean(Acstmh57AKoSEkEFNJ.msljfiu2GA8S2iWtz0, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayIPyIQcaNa8aB7drBED.getBoolean(Acstmh57AKoSEkEFNJ.XfvA8xAblLUDzfjNL9, true));
        typedArrayIPyIQcaNa8aB7drBED.recycle();
        lLKzvdU99Iw80uVD5I.O1furmptfI76BGfN0d(this, 1);
    }

    public void setSingleSelection(boolean z) {
        if (this.f4935TCyPEKSzIyweCN5yp1 != z) {
            this.f4935TCyPEKSzIyweCN5yp1 = z;
            KYHag8HRDlnO3X9zmZ();
        }
        R9SAhYMerGybF9OAjL();
    }
}
