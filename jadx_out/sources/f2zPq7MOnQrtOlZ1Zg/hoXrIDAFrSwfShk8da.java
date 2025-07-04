package f2zPq7MOnQrtOlZ1Zg;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class hoXrIDAFrSwfShk8da implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZaq8hOURtfwbcX17cG = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.zaq8hOURtfwbcX17cG(parcel);
        PendingIntent pendingIntent = null;
        int iT9PhQIpGRhE4yZDm1C = 0;
        int iT9PhQIpGRhE4yZDm1C2 = 0;
        String strZZKhbgvUfsK4AEX3r0 = null;
        while (parcel.dataPosition() < iZaq8hOURtfwbcX17cG) {
            int iZ9WdNiOsPR0y54zHW4 = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.Z9WdNiOsPR0y54zHW4(parcel);
            int iPbVGzGjWvY2LDXC8vo = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.pbVGzGjWvY2LDXC8vo(iZ9WdNiOsPR0y54zHW4);
            if (iPbVGzGjWvY2LDXC8vo == 1) {
                iT9PhQIpGRhE4yZDm1C = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.T9PhQIpGRhE4yZDm1C(parcel, iZ9WdNiOsPR0y54zHW4);
            } else if (iPbVGzGjWvY2LDXC8vo == 2) {
                iT9PhQIpGRhE4yZDm1C2 = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.T9PhQIpGRhE4yZDm1C(parcel, iZ9WdNiOsPR0y54zHW4);
            } else if (iPbVGzGjWvY2LDXC8vo == 3) {
                pendingIntent = (PendingIntent) pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(parcel, iZ9WdNiOsPR0y54zHW4, PendingIntent.CREATOR);
            } else if (iPbVGzGjWvY2LDXC8vo != 4) {
                pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.OANkd3mP6AYvwbNLJM(parcel, iZ9WdNiOsPR0y54zHW4);
            } else {
                strZZKhbgvUfsK4AEX3r0 = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(parcel, iZ9WdNiOsPR0y54zHW4);
            }
        }
        pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.IPyIQcaNa8aB7drBED(parcel, iZaq8hOURtfwbcX17cG);
        return new lEeR5KfoEr4xU5yHH7(iT9PhQIpGRhE4yZDm1C, iT9PhQIpGRhE4yZDm1C2, pendingIntent, strZZKhbgvUfsK4AEX3r0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new lEeR5KfoEr4xU5yHH7[i];
    }
}
