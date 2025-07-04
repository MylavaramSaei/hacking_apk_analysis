package HR5vAalpgOKVm2T0Gq;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class xHA29AmDt6y96AnB3t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZaq8hOURtfwbcX17cG = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.zaq8hOURtfwbcX17cG(parcel);
        int iT9PhQIpGRhE4yZDm1C = 0;
        ArrayList arrayListTCyPEKSzIyweCN5yp1 = null;
        while (parcel.dataPosition() < iZaq8hOURtfwbcX17cG) {
            int iZ9WdNiOsPR0y54zHW4 = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.Z9WdNiOsPR0y54zHW4(parcel);
            int iPbVGzGjWvY2LDXC8vo = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.pbVGzGjWvY2LDXC8vo(iZ9WdNiOsPR0y54zHW4);
            if (iPbVGzGjWvY2LDXC8vo == 1) {
                iT9PhQIpGRhE4yZDm1C = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.T9PhQIpGRhE4yZDm1C(parcel, iZ9WdNiOsPR0y54zHW4);
            } else if (iPbVGzGjWvY2LDXC8vo != 2) {
                pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.OANkd3mP6AYvwbNLJM(parcel, iZ9WdNiOsPR0y54zHW4);
            } else {
                arrayListTCyPEKSzIyweCN5yp1 = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.TCyPEKSzIyweCN5yp1(parcel, iZ9WdNiOsPR0y54zHW4, e54J8UWNHWALQNixXM.CREATOR);
            }
        }
        pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.IPyIQcaNa8aB7drBED(parcel, iZaq8hOURtfwbcX17cG);
        return new sTkWmhpZ5b1ArQIw4K(iT9PhQIpGRhE4yZDm1C, arrayListTCyPEKSzIyweCN5yp1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new sTkWmhpZ5b1ArQIw4K[i];
    }
}
