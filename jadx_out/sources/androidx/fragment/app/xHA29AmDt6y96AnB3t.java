package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class xHA29AmDt6y96AnB3t implements Parcelable {
    public static final Parcelable.Creator<xHA29AmDt6y96AnB3t> CREATOR = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final Bundle f3650Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final boolean f3651HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final boolean f3652IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final String f3653KYHag8HRDlnO3X9zmZ;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public Bundle f3654T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final boolean f3655TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public final boolean f3656Z9WdNiOsPR0y54zHW4;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public final int f3657e54J8UWNHWALQNixXM;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final int f3658husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final String f3659lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final boolean f3660pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final String f3661s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final int f3662zZKhbgvUfsK4AEX3r0;

    public class lEeR5KfoEr4xU5yHH7 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public xHA29AmDt6y96AnB3t createFromParcel(Parcel parcel) {
            return new xHA29AmDt6y96AnB3t(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
        public xHA29AmDt6y96AnB3t[] newArray(int i) {
            return new xHA29AmDt6y96AnB3t[i];
        }
    }

    public xHA29AmDt6y96AnB3t(Parcel parcel) {
        this.f3659lEeR5KfoEr4xU5yHH7 = parcel.readString();
        this.f3661s3fjYDxWOUexjjVgyA = parcel.readString();
        this.f3651HJFh0TGMpafqLE9haL = parcel.readInt() != 0;
        this.f3662zZKhbgvUfsK4AEX3r0 = parcel.readInt();
        this.f3658husNiw3snxdgZPAGJm = parcel.readInt();
        this.f3653KYHag8HRDlnO3X9zmZ = parcel.readString();
        this.f3655TCyPEKSzIyweCN5yp1 = parcel.readInt() != 0;
        this.f3652IPyIQcaNa8aB7drBED = parcel.readInt() != 0;
        this.f3660pbVGzGjWvY2LDXC8vo = parcel.readInt() != 0;
        this.f3650Acstmh57AKoSEkEFNJ = parcel.readBundle();
        this.f3656Z9WdNiOsPR0y54zHW4 = parcel.readInt() != 0;
        this.f3654T9PhQIpGRhE4yZDm1C = parcel.readBundle();
        this.f3657e54J8UWNHWALQNixXM = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3659lEeR5KfoEr4xU5yHH7);
        sb.append(" (");
        sb.append(this.f3661s3fjYDxWOUexjjVgyA);
        sb.append(")}:");
        if (this.f3651HJFh0TGMpafqLE9haL) {
            sb.append(" fromLayout");
        }
        if (this.f3658husNiw3snxdgZPAGJm != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3658husNiw3snxdgZPAGJm));
        }
        String str = this.f3653KYHag8HRDlnO3X9zmZ;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3653KYHag8HRDlnO3X9zmZ);
        }
        if (this.f3655TCyPEKSzIyweCN5yp1) {
            sb.append(" retainInstance");
        }
        if (this.f3652IPyIQcaNa8aB7drBED) {
            sb.append(" removing");
        }
        if (this.f3660pbVGzGjWvY2LDXC8vo) {
            sb.append(" detached");
        }
        if (this.f3656Z9WdNiOsPR0y54zHW4) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3659lEeR5KfoEr4xU5yHH7);
        parcel.writeString(this.f3661s3fjYDxWOUexjjVgyA);
        parcel.writeInt(this.f3651HJFh0TGMpafqLE9haL ? 1 : 0);
        parcel.writeInt(this.f3662zZKhbgvUfsK4AEX3r0);
        parcel.writeInt(this.f3658husNiw3snxdgZPAGJm);
        parcel.writeString(this.f3653KYHag8HRDlnO3X9zmZ);
        parcel.writeInt(this.f3655TCyPEKSzIyweCN5yp1 ? 1 : 0);
        parcel.writeInt(this.f3652IPyIQcaNa8aB7drBED ? 1 : 0);
        parcel.writeInt(this.f3660pbVGzGjWvY2LDXC8vo ? 1 : 0);
        parcel.writeBundle(this.f3650Acstmh57AKoSEkEFNJ);
        parcel.writeInt(this.f3656Z9WdNiOsPR0y54zHW4 ? 1 : 0);
        parcel.writeBundle(this.f3654T9PhQIpGRhE4yZDm1C);
        parcel.writeInt(this.f3657e54J8UWNHWALQNixXM);
    }

    public xHA29AmDt6y96AnB3t(Fragment fragment) {
        this.f3659lEeR5KfoEr4xU5yHH7 = fragment.getClass().getName();
        this.f3661s3fjYDxWOUexjjVgyA = fragment.f3437husNiw3snxdgZPAGJm;
        this.f3651HJFh0TGMpafqLE9haL = fragment.f3436hoXrIDAFrSwfShk8da;
        this.f3662zZKhbgvUfsK4AEX3r0 = fragment.f3447xHA29AmDt6y96AnB3t;
        this.f3658husNiw3snxdgZPAGJm = fragment.f3409LIMtzhnLwQyigzK0KO;
        this.f3653KYHag8HRDlnO3X9zmZ = fragment.f3400A49QRPHynYLCBN0SqP;
        this.f3655TCyPEKSzIyweCN5yp1 = fragment.f3418THTDvPxsHqMeGb512f;
        this.f3652IPyIQcaNa8aB7drBED = fragment.f3434e54J8UWNHWALQNixXM;
        this.f3660pbVGzGjWvY2LDXC8vo = fragment.f3422WWC27LAMFqFFBzfbNw;
        this.f3650Acstmh57AKoSEkEFNJ = fragment.f3407KYHag8HRDlnO3X9zmZ;
        this.f3656Z9WdNiOsPR0y54zHW4 = fragment.f3420VItLRw50eXTZeEfGl0;
        this.f3657e54J8UWNHWALQNixXM = fragment.f3419ToH8yzk8U1nKT0PUfY.ordinal();
    }
}
