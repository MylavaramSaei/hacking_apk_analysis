package HZ4bptRS9XIcK1CV95;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class Acstmh57AKoSEkEFNJ implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZaq8hOURtfwbcX17cG = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.zaq8hOURtfwbcX17cG(parcel);
        String strZZKhbgvUfsK4AEX3r0 = null;
        f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = null;
        int iT9PhQIpGRhE4yZDm1C = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iZaq8hOURtfwbcX17cG) {
            int iZ9WdNiOsPR0y54zHW4 = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.Z9WdNiOsPR0y54zHW4(parcel);
            int iPbVGzGjWvY2LDXC8vo = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.pbVGzGjWvY2LDXC8vo(iZ9WdNiOsPR0y54zHW4);
            if (iPbVGzGjWvY2LDXC8vo == 1) {
                iT9PhQIpGRhE4yZDm1C = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.T9PhQIpGRhE4yZDm1C(parcel, iZ9WdNiOsPR0y54zHW4);
            } else if (iPbVGzGjWvY2LDXC8vo == 2) {
                strZZKhbgvUfsK4AEX3r0 = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(parcel, iZ9WdNiOsPR0y54zHW4);
            } else if (iPbVGzGjWvY2LDXC8vo == 3) {
                pendingIntent = (PendingIntent) pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(parcel, iZ9WdNiOsPR0y54zHW4, PendingIntent.CREATOR);
            } else if (iPbVGzGjWvY2LDXC8vo != 4) {
                pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.OANkd3mP6AYvwbNLJM(parcel, iZ9WdNiOsPR0y54zHW4);
            } else {
                leer5kfoer4xu5yhh7 = (f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7) pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(parcel, iZ9WdNiOsPR0y54zHW4, f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7.CREATOR);
            }
        }
        pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.IPyIQcaNa8aB7drBED(parcel, iZaq8hOURtfwbcX17cG);
        return new Status(iT9PhQIpGRhE4yZDm1C, strZZKhbgvUfsK4AEX3r0, pendingIntent, leer5kfoer4xu5yhh7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
