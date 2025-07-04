package HR5vAalpgOKVm2T0Gq;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class sTkWmhpZ5b1ArQIw4K extends pgB7Gmjz55y9NQYnAD.lEeR5KfoEr4xU5yHH7 {
    public static final Parcelable.Creator<sTkWmhpZ5b1ArQIw4K> CREATOR = new xHA29AmDt6y96AnB3t();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int f426lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public List f427s3fjYDxWOUexjjVgyA;

    public sTkWmhpZ5b1ArQIw4K(int i, List list) {
        this.f426lEeR5KfoEr4xU5yHH7 = i;
        this.f427s3fjYDxWOUexjjVgyA = list;
    }

    public final int HJFh0TGMpafqLE9haL() {
        return this.f426lEeR5KfoEr4xU5yHH7;
    }

    public final void husNiw3snxdgZPAGJm(e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm) {
        if (this.f427s3fjYDxWOUexjjVgyA == null) {
            this.f427s3fjYDxWOUexjjVgyA = new ArrayList();
        }
        this.f427s3fjYDxWOUexjjVgyA.add(e54j8uwnhwalqnixxm);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLEeR5KfoEr4xU5yHH7 = pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(parcel);
        pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(parcel, 1, this.f426lEeR5KfoEr4xU5yHH7);
        pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C(parcel, 2, this.f427s3fjYDxWOUexjjVgyA, false);
        pgB7Gmjz55y9NQYnAD.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(parcel, iLEeR5KfoEr4xU5yHH7);
    }

    public final List zZKhbgvUfsK4AEX3r0() {
        return this.f427s3fjYDxWOUexjjVgyA;
    }
}
