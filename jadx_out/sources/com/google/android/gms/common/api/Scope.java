package com.google.android.gms.common.api;

import HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da;
import HZ4bptRS9XIcK1CV95.pbVGzGjWvY2LDXC8vo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL;
import pgB7Gmjz55y9NQYnAD.lEeR5KfoEr4xU5yHH7;

/* loaded from: classes.dex */
public final class Scope extends lEeR5KfoEr4xU5yHH7 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new pbVGzGjWvY2LDXC8vo();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int f4762lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final String f4763s3fjYDxWOUexjjVgyA;

    public Scope(int i, String str) {
        hoXrIDAFrSwfShk8da.husNiw3snxdgZPAGJm(str, "scopeUri must not be null or empty");
        this.f4762lEeR5KfoEr4xU5yHH7 = i;
        this.f4763s3fjYDxWOUexjjVgyA = str;
    }

    public String HJFh0TGMpafqLE9haL() {
        return this.f4763s3fjYDxWOUexjjVgyA;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f4763s3fjYDxWOUexjjVgyA.equals(((Scope) obj).f4763s3fjYDxWOUexjjVgyA);
        }
        return false;
    }

    public int hashCode() {
        return this.f4763s3fjYDxWOUexjjVgyA.hashCode();
    }

    public String toString() {
        return this.f4763s3fjYDxWOUexjjVgyA;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f4762lEeR5KfoEr4xU5yHH7;
        int iLEeR5KfoEr4xU5yHH7 = HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(parcel);
        HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(parcel, 1, i2);
        HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ(parcel, 2, HJFh0TGMpafqLE9haL(), false);
        HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(parcel, iLEeR5KfoEr4xU5yHH7);
    }

    public Scope(String str) {
        this(1, str);
    }
}
