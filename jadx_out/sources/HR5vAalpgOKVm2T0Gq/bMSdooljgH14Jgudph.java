package HR5vAalpgOKVm2T0Gq;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class bMSdooljgH14Jgudph implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZaq8hOURtfwbcX17cG = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.zaq8hOURtfwbcX17cG(parcel);
        Bundle bundleLEeR5KfoEr4xU5yHH7 = null;
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = null;
        int iT9PhQIpGRhE4yZDm1C = 0;
        f2zPq7MOnQrtOlZ1Zg.HJFh0TGMpafqLE9haL[] hJFh0TGMpafqLE9haLArr = null;
        while (parcel.dataPosition() < iZaq8hOURtfwbcX17cG) {
            int iZ9WdNiOsPR0y54zHW4 = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.Z9WdNiOsPR0y54zHW4(parcel);
            int iPbVGzGjWvY2LDXC8vo = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.pbVGzGjWvY2LDXC8vo(iZ9WdNiOsPR0y54zHW4);
            if (iPbVGzGjWvY2LDXC8vo == 1) {
                bundleLEeR5KfoEr4xU5yHH7 = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(parcel, iZ9WdNiOsPR0y54zHW4);
            } else if (iPbVGzGjWvY2LDXC8vo == 2) {
                hJFh0TGMpafqLE9haLArr = (f2zPq7MOnQrtOlZ1Zg.HJFh0TGMpafqLE9haL[]) pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ(parcel, iZ9WdNiOsPR0y54zHW4, f2zPq7MOnQrtOlZ1Zg.HJFh0TGMpafqLE9haL.CREATOR);
            } else if (iPbVGzGjWvY2LDXC8vo == 3) {
                iT9PhQIpGRhE4yZDm1C = pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.T9PhQIpGRhE4yZDm1C(parcel, iZ9WdNiOsPR0y54zHW4);
            } else if (iPbVGzGjWvY2LDXC8vo != 4) {
                pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.OANkd3mP6AYvwbNLJM(parcel, iZ9WdNiOsPR0y54zHW4);
            } else {
                husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(parcel, iZ9WdNiOsPR0y54zHW4, husNiw3snxdgZPAGJm.CREATOR);
            }
        }
        pgB7Gmjz55y9NQYnAD.s3fjYDxWOUexjjVgyA.IPyIQcaNa8aB7drBED(parcel, iZaq8hOURtfwbcX17cG);
        return new hUNBy66ZO1wVLJGW3l(bundleLEeR5KfoEr4xU5yHH7, hJFh0TGMpafqLE9haLArr, iT9PhQIpGRhE4yZDm1C, husniw3snxdgzpagjm);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new hUNBy66ZO1wVLJGW3l[i];
    }
}
