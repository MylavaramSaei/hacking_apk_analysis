package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class husNiw3snxdgZPAGJm implements Parcelable {
    public static final Parcelable.Creator<husNiw3snxdgZPAGJm> CREATOR = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f5488HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public int f5489KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public int f5490TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int f5491husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final s3fjYDxWOUexjjVgyA f5492lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final s3fjYDxWOUexjjVgyA f5493s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f5494zZKhbgvUfsK4AEX3r0;

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

    public husNiw3snxdgZPAGJm(int i, int i2, int i3, int i4) {
        this.f5494zZKhbgvUfsK4AEX3r0 = i;
        this.f5491husNiw3snxdgZPAGJm = i2;
        this.f5489KYHag8HRDlnO3X9zmZ = i3;
        this.f5488HJFh0TGMpafqLE9haL = i4;
        this.f5490TCyPEKSzIyweCN5yp1 = husNiw3snxdgZPAGJm(i);
        this.f5492lEeR5KfoEr4xU5yHH7 = new s3fjYDxWOUexjjVgyA(59);
        this.f5493s3fjYDxWOUexjjVgyA = new s3fjYDxWOUexjjVgyA(i4 == 1 ? 23 : 12);
    }

    public static String HJFh0TGMpafqLE9haL(Resources resources, CharSequence charSequence) {
        return zZKhbgvUfsK4AEX3r0(resources, charSequence, "%02d");
    }

    public static int husNiw3snxdgZPAGJm(int i) {
        return i >= 12 ? 1 : 0;
    }

    public static String zZKhbgvUfsK4AEX3r0(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof husNiw3snxdgZPAGJm)) {
            return false;
        }
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) obj;
        return this.f5494zZKhbgvUfsK4AEX3r0 == husniw3snxdgzpagjm.f5494zZKhbgvUfsK4AEX3r0 && this.f5491husNiw3snxdgZPAGJm == husniw3snxdgzpagjm.f5491husNiw3snxdgZPAGJm && this.f5488HJFh0TGMpafqLE9haL == husniw3snxdgzpagjm.f5488HJFh0TGMpafqLE9haL && this.f5489KYHag8HRDlnO3X9zmZ == husniw3snxdgzpagjm.f5489KYHag8HRDlnO3X9zmZ;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5488HJFh0TGMpafqLE9haL), Integer.valueOf(this.f5494zZKhbgvUfsK4AEX3r0), Integer.valueOf(this.f5491husNiw3snxdgZPAGJm), Integer.valueOf(this.f5489KYHag8HRDlnO3X9zmZ)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5494zZKhbgvUfsK4AEX3r0);
        parcel.writeInt(this.f5491husNiw3snxdgZPAGJm);
        parcel.writeInt(this.f5489KYHag8HRDlnO3X9zmZ);
        parcel.writeInt(this.f5488HJFh0TGMpafqLE9haL);
    }

    public husNiw3snxdgZPAGJm(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
