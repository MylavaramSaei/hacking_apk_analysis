package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.lEeR5KfoEr4xU5yHH7;
import java.util.Arrays;

/* loaded from: classes.dex */
public class KYHag8HRDlnO3X9zmZ implements lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL {
    public static final Parcelable.Creator<KYHag8HRDlnO3X9zmZ> CREATOR = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final long f5103lEeR5KfoEr4xU5yHH7;

    public class lEeR5KfoEr4xU5yHH7 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public KYHag8HRDlnO3X9zmZ createFromParcel(Parcel parcel) {
            return new KYHag8HRDlnO3X9zmZ(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
        public KYHag8HRDlnO3X9zmZ[] newArray(int i) {
            return new KYHag8HRDlnO3X9zmZ[i];
        }
    }

    public KYHag8HRDlnO3X9zmZ(long j) {
        this.f5103lEeR5KfoEr4xU5yHH7 = j;
    }

    public static KYHag8HRDlnO3X9zmZ HJFh0TGMpafqLE9haL(long j) {
        return new KYHag8HRDlnO3X9zmZ(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KYHag8HRDlnO3X9zmZ) && this.f5103lEeR5KfoEr4xU5yHH7 == ((KYHag8HRDlnO3X9zmZ) obj).f5103lEeR5KfoEr4xU5yHH7;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5103lEeR5KfoEr4xU5yHH7)});
    }

    @Override // com.google.android.material.datepicker.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL
    public boolean lEeR5KfoEr4xU5yHH7(long j) {
        return j >= this.f5103lEeR5KfoEr4xU5yHH7;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f5103lEeR5KfoEr4xU5yHH7);
    }

    public /* synthetic */ KYHag8HRDlnO3X9zmZ(long j, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this(j);
    }
}
