package com.google.android.material.internal;

import IPyIQcaNa8aB7drBED.T9PhQIpGRhE4yZDm1C;
import OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;

/* loaded from: classes.dex */
public class CheckableImageButton extends T9PhQIpGRhE4yZDm1C implements Checkable {

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public static final int[] f5233TCyPEKSzIyweCN5yp1 = {R.attr.state_checked};

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public boolean f5234KYHag8HRDlnO3X9zmZ;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public boolean f5235husNiw3snxdgZPAGJm;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public boolean f5236zZKhbgvUfsK4AEX3r0;

    public class lEeR5KfoEr4xU5yHH7 extends W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public void KYHag8HRDlnO3X9zmZ(View view, AccessibilityEvent accessibilityEvent) {
            super.KYHag8HRDlnO3X9zmZ(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public void TCyPEKSzIyweCN5yp1(View view, A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
            super.TCyPEKSzIyweCN5yp1(view, a49QRPHynYLCBN0SqP);
            a49QRPHynYLCBN0SqP.ctWLFN70QQINH1kyYo(CheckableImageButton.this.lEeR5KfoEr4xU5yHH7());
            a49QRPHynYLCBN0SqP.jocVUfxESVhVJU8LoH(CheckableImageButton.this.isChecked());
        }
    }

    public static class s3fjYDxWOUexjjVgyA extends aAp6BD79BhftLCnuvf.lEeR5KfoEr4xU5yHH7 {
        public static final Parcelable.Creator<s3fjYDxWOUexjjVgyA> CREATOR = new lEeR5KfoEr4xU5yHH7();

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public boolean f5238HJFh0TGMpafqLE9haL;

        public class lEeR5KfoEr4xU5yHH7 implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
            public s3fjYDxWOUexjjVgyA[] newArray(int i) {
                return new s3fjYDxWOUexjjVgyA[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
            public s3fjYDxWOUexjjVgyA createFromParcel(Parcel parcel) {
                return new s3fjYDxWOUexjjVgyA(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
            public s3fjYDxWOUexjjVgyA createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new s3fjYDxWOUexjjVgyA(parcel, classLoader);
            }
        }

        public s3fjYDxWOUexjjVgyA(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            zZKhbgvUfsK4AEX3r0(parcel);
        }

        private void zZKhbgvUfsK4AEX3r0(Parcel parcel) {
            this.f5238HJFh0TGMpafqLE9haL = parcel.readInt() == 1;
        }

        @Override // aAp6BD79BhftLCnuvf.lEeR5KfoEr4xU5yHH7, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5238HJFh0TGMpafqLE9haL ? 1 : 0);
        }

        public s3fjYDxWOUexjjVgyA(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7.f6276aPyGSIylzVNKPT1Bls);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f5236zZKhbgvUfsK4AEX3r0;
    }

    public boolean lEeR5KfoEr4xU5yHH7() {
        return this.f5235husNiw3snxdgZPAGJm;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (!this.f5236zZKhbgvUfsK4AEX3r0) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f5233TCyPEKSzIyweCN5yp1;
        return View.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof s3fjYDxWOUexjjVgyA)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) parcelable;
        super.onRestoreInstanceState(s3fjydxwouexjjvgya.HJFh0TGMpafqLE9haL());
        setChecked(s3fjydxwouexjjvgya.f5238HJFh0TGMpafqLE9haL);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = new s3fjYDxWOUexjjVgyA(super.onSaveInstanceState());
        s3fjydxwouexjjvgya.f5238HJFh0TGMpafqLE9haL = this.f5236zZKhbgvUfsK4AEX3r0;
        return s3fjydxwouexjjvgya;
    }

    public void setCheckable(boolean z) {
        if (this.f5235husNiw3snxdgZPAGJm != z) {
            this.f5235husNiw3snxdgZPAGJm = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f5235husNiw3snxdgZPAGJm || this.f5236zZKhbgvUfsK4AEX3r0 == z) {
            return;
        }
        this.f5236zZKhbgvUfsK4AEX3r0 = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f5234KYHag8HRDlnO3X9zmZ = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f5234KYHag8HRDlnO3X9zmZ) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f5236zZKhbgvUfsK4AEX3r0);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5235husNiw3snxdgZPAGJm = true;
        this.f5234KYHag8HRDlnO3X9zmZ = true;
        lLKzvdU99Iw80uVD5I.eWK41qw3g36LVd4UnS(this, new lEeR5KfoEr4xU5yHH7());
    }
}
