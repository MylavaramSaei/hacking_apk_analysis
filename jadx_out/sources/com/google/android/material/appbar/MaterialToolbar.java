package com.google.android.material.appbar;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import WaWv1mJ1ya3uoEaKqz.Z9WdNiOsPR0y54zHW4;
import WaWv1mJ1ya3uoEaKqz.e54J8UWNHWALQNixXM;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0;
import androidx.appcompat.widget.Toolbar;
import ayaSAlBnO403UB0TMR.IPyIQcaNa8aB7drBED;
import ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1;
import h6NrAcYSuIyiU1qV6F.husNiw3snxdgZPAGJm;
import tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ;
import tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7;
import tmIBXGVvBsrJ7i63G2.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: YlLW4G6OV9TFyuw5ix, reason: collision with root package name */
    public Integer f4788YlLW4G6OV9TFyuw5ix;

    /* renamed from: cT5Hs3CQpLK8NvlZAw, reason: collision with root package name */
    public ImageView.ScaleType f4789cT5Hs3CQpLK8NvlZAw;

    /* renamed from: hUNBy66ZO1wVLJGW3l, reason: collision with root package name */
    public Boolean f4790hUNBy66ZO1wVLJGW3l;

    /* renamed from: oocVJL811qFf0j0XXZ, reason: collision with root package name */
    public boolean f4791oocVJL811qFf0j0XXZ;

    /* renamed from: udcVtCzLTM1Loe9KrX, reason: collision with root package name */
    public boolean f4792udcVtCzLTM1Loe9KrX;

    /* renamed from: bMSdooljgH14Jgudph, reason: collision with root package name */
    public static final int f4787bMSdooljgH14Jgudph = pbVGzGjWvY2LDXC8vo.f7165e54J8UWNHWALQNixXM;

    /* renamed from: Uj8rPa1EWADtk6Oe0S, reason: collision with root package name */
    public static final ImageView.ScaleType[] f4786Uj8rPa1EWADtk6Oe0S = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lEeR5KfoEr4xU5yHH7.f7140W3RZ2dTDKrKpS5Mxdk);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void G7AC3DWIx9i9fdanjk(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof zZKhbgvUfsK4AEX3r0;
        if (z) {
            ((zZKhbgvUfsK4AEX3r0) menu).cT5Hs3CQpLK8NvlZAw();
        }
        super.G7AC3DWIx9i9fdanjk(i);
        if (z) {
            ((zZKhbgvUfsK4AEX3r0) menu).udcVtCzLTM1Loe9KrX();
        }
    }

    public final void LU0fFDMACqnfIfA1AZ() {
        ImageView imageViewS3fjYDxWOUexjjVgyA = e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA(this);
        if (imageViewS3fjYDxWOUexjjVgyA != null) {
            Boolean bool = this.f4790hUNBy66ZO1wVLJGW3l;
            if (bool != null) {
                imageViewS3fjYDxWOUexjjVgyA.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f4789cT5Hs3CQpLK8NvlZAw;
            if (scaleType != null) {
                imageViewS3fjYDxWOUexjjVgyA.setScaleType(scaleType);
            }
        }
    }

    public final Pair PPkm9uUfOJHHYveeLT(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    public final void ToH8yzk8U1nKT0PUfY() {
        if (this.f4791oocVJL811qFf0j0XXZ || this.f4792udcVtCzLTM1Loe9KrX) {
            TextView textViewHusNiw3snxdgZPAGJm = e54J8UWNHWALQNixXM.husNiw3snxdgZPAGJm(this);
            TextView textViewHJFh0TGMpafqLE9haL = e54J8UWNHWALQNixXM.HJFh0TGMpafqLE9haL(this);
            if (textViewHusNiw3snxdgZPAGJm == null && textViewHJFh0TGMpafqLE9haL == null) {
                return;
            }
            Pair pairPPkm9uUfOJHHYveeLT = PPkm9uUfOJHHYveeLT(textViewHusNiw3snxdgZPAGJm, textViewHJFh0TGMpafqLE9haL);
            if (this.f4791oocVJL811qFf0j0XXZ && textViewHusNiw3snxdgZPAGJm != null) {
                lLKzvdU99Iw80uVD5I(textViewHusNiw3snxdgZPAGJm, pairPPkm9uUfOJHHYveeLT);
            }
            if (!this.f4792udcVtCzLTM1Loe9KrX || textViewHJFh0TGMpafqLE9haL == null) {
                return;
            }
            lLKzvdU99Iw80uVD5I(textViewHJFh0TGMpafqLE9haL, pairPPkm9uUfOJHHYveeLT);
        }
    }

    public final Drawable XdzLv4NdAtTYoEzVzB(Drawable drawable) {
        if (drawable == null || this.f4788YlLW4G6OV9TFyuw5ix == null) {
            return drawable;
        }
        Drawable drawableE54J8UWNHWALQNixXM = WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(drawable.mutate());
        WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(drawableE54J8UWNHWALQNixXM, this.f4788YlLW4G6OV9TFyuw5ix.intValue());
        return drawableE54J8UWNHWALQNixXM;
    }

    public final void aAp6BD79BhftLCnuvf(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(background);
        if (colorStateListValueOf != null) {
            TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = new TCyPEKSzIyweCN5yp1();
            tCyPEKSzIyweCN5yp1.YlLW4G6OV9TFyuw5ix(colorStateListValueOf);
            tCyPEKSzIyweCN5yp1.DfpieXfdYs58yZAiXY(context);
            tCyPEKSzIyweCN5yp1.zcy2NNbtVXgoGQbfuq(lLKzvdU99Iw80uVD5I.Y43RdunnpKgpbny0lE(this));
            lLKzvdU99Iw80uVD5I.ayduHasC7VpxsVXE0T(this, tCyPEKSzIyweCN5yp1);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f4789cT5Hs3CQpLK8NvlZAw;
    }

    public Integer getNavigationIconTint() {
        return this.f4788YlLW4G6OV9TFyuw5ix;
    }

    public final void lLKzvdU99Iw80uVD5I(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        IPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ToH8yzk8U1nKT0PUfY();
        LU0fFDMACqnfIfA1AZ();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        IPyIQcaNa8aB7drBED.zZKhbgvUfsK4AEX3r0(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f4790hUNBy66ZO1wVLJGW3l;
        if (bool == null || bool.booleanValue() != z) {
            this.f4790hUNBy66ZO1wVLJGW3l = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f4789cT5Hs3CQpLK8NvlZAw != scaleType) {
            this.f4789cT5Hs3CQpLK8NvlZAw = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(XdzLv4NdAtTYoEzVzB(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.f4788YlLW4G6OV9TFyuw5ix = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f4792udcVtCzLTM1Loe9KrX != z) {
            this.f4792udcVtCzLTM1Loe9KrX = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f4791oocVJL811qFf0j0XXZ != z) {
            this.f4791oocVJL811qFf0j0XXZ = z;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        int i2 = f4787bMSdooljgH14Jgudph;
        super(gpnYwZkFpQwu7zi2gb.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayIPyIQcaNa8aB7drBED = Z9WdNiOsPR0y54zHW4.IPyIQcaNa8aB7drBED(context2, attributeSet, Acstmh57AKoSEkEFNJ.tZWbH1G760JdqEQ2Q5, i, i2, new int[0]);
        if (typedArrayIPyIQcaNa8aB7drBED.hasValue(Acstmh57AKoSEkEFNJ.ZAfxdc0isDwDy8tX48)) {
            setNavigationIconTint(typedArrayIPyIQcaNa8aB7drBED.getColor(Acstmh57AKoSEkEFNJ.ZAfxdc0isDwDy8tX48, -1));
        }
        this.f4791oocVJL811qFf0j0XXZ = typedArrayIPyIQcaNa8aB7drBED.getBoolean(Acstmh57AKoSEkEFNJ.Gnb8bi4OxTs9mCdjrR, false);
        this.f4792udcVtCzLTM1Loe9KrX = typedArrayIPyIQcaNa8aB7drBED.getBoolean(Acstmh57AKoSEkEFNJ.OqMDEsH1NXmNdC67iZ, false);
        int i3 = typedArrayIPyIQcaNa8aB7drBED.getInt(Acstmh57AKoSEkEFNJ.kzG5RrnKOV1EP7vx2N, -1);
        if (i3 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f4786Uj8rPa1EWADtk6Oe0S;
            if (i3 < scaleTypeArr.length) {
                this.f4789cT5Hs3CQpLK8NvlZAw = scaleTypeArr[i3];
            }
        }
        if (typedArrayIPyIQcaNa8aB7drBED.hasValue(Acstmh57AKoSEkEFNJ.mE1LtznhpIx0fyYau1)) {
            this.f4790hUNBy66ZO1wVLJGW3l = Boolean.valueOf(typedArrayIPyIQcaNa8aB7drBED.getBoolean(Acstmh57AKoSEkEFNJ.mE1LtznhpIx0fyYau1, false));
        }
        typedArrayIPyIQcaNa8aB7drBED.recycle();
        aAp6BD79BhftLCnuvf(context2);
    }
}
