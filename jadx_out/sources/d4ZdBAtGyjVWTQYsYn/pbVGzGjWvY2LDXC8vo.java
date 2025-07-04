package d4ZdBAtGyjVWTQYsYn;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class pbVGzGjWvY2LDXC8vo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZaq8hOURtfwbcX17cG = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.zaq8hOURtfwbcX17cG(parcel);
        ArrayList arrayListHusNiw3snxdgZPAGJm = null;
        String strZZKhbgvUfsK4AEX3r0 = null;
        while (parcel.dataPosition() < iZaq8hOURtfwbcX17cG) {
            int iZ9WdNiOsPR0y54zHW4 = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.Z9WdNiOsPR0y54zHW4(parcel);
            int iPbVGzGjWvY2LDXC8vo = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.pbVGzGjWvY2LDXC8vo(iZ9WdNiOsPR0y54zHW4);
            if (iPbVGzGjWvY2LDXC8vo == 1) {
                arrayListHusNiw3snxdgZPAGJm = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm(parcel, iZ9WdNiOsPR0y54zHW4);
            } else if (iPbVGzGjWvY2LDXC8vo != 2) {
                pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.OANkd3mP6AYvwbNLJM(parcel, iZ9WdNiOsPR0y54zHW4);
            } else {
                strZZKhbgvUfsK4AEX3r0 = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(parcel, iZ9WdNiOsPR0y54zHW4);
            }
        }
        pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.IPyIQcaNa8aB7drBED(parcel, iZaq8hOURtfwbcX17cG);
        return new IPyIQcaNa8aB7drBED(arrayListHusNiw3snxdgZPAGJm, strZZKhbgvUfsK4AEX3r0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new IPyIQcaNa8aB7drBED[i];
    }
}
