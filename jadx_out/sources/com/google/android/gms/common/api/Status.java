package com.google.android.gms.common.api;

import HR5vAalpgOKVm2T0Gq.T9PhQIpGRhE4yZDm1C;
import HZ4bptRS9XIcK1CV95.Acstmh57AKoSEkEFNJ;
import HZ4bptRS9XIcK1CV95.HJFh0TGMpafqLE9haL;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import pgB7Gmjz55y9NQYnAD.lEeR5KfoEr4xU5yHH7;

/* loaded from: classes.dex */
public final class Status extends lEeR5KfoEr4xU5yHH7 implements ReflectedParcelable {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final PendingIntent f4772HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int f4773lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final String f4774s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 f4775zZKhbgvUfsK4AEX3r0;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final Status f4770husNiw3snxdgZPAGJm = new Status(-1);

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static final Status f4766KYHag8HRDlnO3X9zmZ = new Status(0);

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public static final Status f4767TCyPEKSzIyweCN5yp1 = new Status(14);

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public static final Status f4765IPyIQcaNa8aB7drBED = new Status(8);

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public static final Status f4771pbVGzGjWvY2LDXC8vo = new Status(15);

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public static final Status f4764Acstmh57AKoSEkEFNJ = new Status(16);

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public static final Status f4769e54J8UWNHWALQNixXM = new Status(17);

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public static final Status f4768Z9WdNiOsPR0y54zHW4 = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new Acstmh57AKoSEkEFNJ();

    public Status(int i) {
        this(i, (String) null);
    }

    public f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 HJFh0TGMpafqLE9haL() {
        return this.f4775zZKhbgvUfsK4AEX3r0;
    }

    public boolean KYHag8HRDlnO3X9zmZ() {
        return this.f4772HJFh0TGMpafqLE9haL != null;
    }

    public final String TCyPEKSzIyweCN5yp1() {
        String str = this.f4774s3fjYDxWOUexjjVgyA;
        return str != null ? str : HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(this.f4773lEeR5KfoEr4xU5yHH7);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f4773lEeR5KfoEr4xU5yHH7 == status.f4773lEeR5KfoEr4xU5yHH7 && T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7(this.f4774s3fjYDxWOUexjjVgyA, status.f4774s3fjYDxWOUexjjVgyA) && T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7(this.f4772HJFh0TGMpafqLE9haL, status.f4772HJFh0TGMpafqLE9haL) && T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7(this.f4775zZKhbgvUfsK4AEX3r0, status.f4775zZKhbgvUfsK4AEX3r0);
    }

    public int hashCode() {
        return T9PhQIpGRhE4yZDm1C.s3fjYDxWOUexjjVgyA(Integer.valueOf(this.f4773lEeR5KfoEr4xU5yHH7), this.f4774s3fjYDxWOUexjjVgyA, this.f4772HJFh0TGMpafqLE9haL, this.f4775zZKhbgvUfsK4AEX3r0);
    }

    public String husNiw3snxdgZPAGJm() {
        return this.f4774s3fjYDxWOUexjjVgyA;
    }

    public String toString() {
        T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL = T9PhQIpGRhE4yZDm1C.HJFh0TGMpafqLE9haL(this);
        leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7("statusCode", TCyPEKSzIyweCN5yp1());
        leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7("resolution", this.f4772HJFh0TGMpafqLE9haL);
        return leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iLEeR5KfoEr4xU5yHH7 = pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(parcel);
        pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(parcel, 1, zZKhbgvUfsK4AEX3r0());
        pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ(parcel, 2, husNiw3snxdgZPAGJm(), false);
        pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(parcel, 3, this.f4772HJFh0TGMpafqLE9haL, i, false);
        pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(parcel, 4, HJFh0TGMpafqLE9haL(), i, false);
        pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(parcel, iLEeR5KfoEr4xU5yHH7);
    }

    public int zZKhbgvUfsK4AEX3r0() {
        return this.f4773lEeR5KfoEr4xU5yHH7;
    }

    public Status(int i, String str) {
        this(i, str, (PendingIntent) null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(i, str, pendingIntent, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent, f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f4773lEeR5KfoEr4xU5yHH7 = i;
        this.f4774s3fjYDxWOUexjjVgyA = str;
        this.f4772HJFh0TGMpafqLE9haL = pendingIntent;
        this.f4775zZKhbgvUfsK4AEX3r0 = leer5kfoer4xu5yhh7;
    }

    public Status(f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, String str) {
        this(leer5kfoer4xu5yhh7, str, 17);
    }

    public Status(f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, String str, int i) {
        this(i, str, leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm(), leer5kfoer4xu5yhh7);
    }
}
