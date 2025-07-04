package pgB7Gmjz55y9NQYnAD;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL {
    public static void Acstmh57AKoSEkEFNJ(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                OANkd3mP6AYvwbNLJM(parcel, i, 0);
            }
        } else {
            int iHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(parcel, i);
            parcel.writeString(str);
            aPyGSIylzVNKPT1Bls(parcel, iHoXrIDAFrSwfShk8da);
        }
    }

    public static void HJFh0TGMpafqLE9haL(Parcel parcel, int i, boolean z) {
        OANkd3mP6AYvwbNLJM(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void IPyIQcaNa8aB7drBED(Parcel parcel, int i, long j) {
        OANkd3mP6AYvwbNLJM(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void KYHag8HRDlnO3X9zmZ(Parcel parcel, int i, int i2) {
        OANkd3mP6AYvwbNLJM(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void OANkd3mP6AYvwbNLJM(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static void T9PhQIpGRhE4yZDm1C(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                OANkd3mP6AYvwbNLJM(parcel, i, 0);
                return;
            }
            return;
        }
        int iHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                zaq8hOURtfwbcX17cG(parcel, parcelable, 0);
            }
        }
        aPyGSIylzVNKPT1Bls(parcel, iHoXrIDAFrSwfShk8da);
    }

    public static void TCyPEKSzIyweCN5yp1(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                OANkd3mP6AYvwbNLJM(parcel, i, 0);
            }
        } else {
            int iHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(parcel, i);
            parcel.writeIntArray(iArr);
            aPyGSIylzVNKPT1Bls(parcel, iHoXrIDAFrSwfShk8da);
        }
    }

    public static void Z9WdNiOsPR0y54zHW4(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                OANkd3mP6AYvwbNLJM(parcel, i, 0);
            }
        } else {
            int iHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(parcel, i);
            parcel.writeStringList(list);
            aPyGSIylzVNKPT1Bls(parcel, iHoXrIDAFrSwfShk8da);
        }
    }

    public static void aPyGSIylzVNKPT1Bls(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void e54J8UWNHWALQNixXM(Parcel parcel, int i, Parcelable[] parcelableArr, int i2, boolean z) {
        if (parcelableArr == null) {
            if (z) {
                OANkd3mP6AYvwbNLJM(parcel, i, 0);
                return;
            }
            return;
        }
        int iHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                zaq8hOURtfwbcX17cG(parcel, parcelable, i2);
            }
        }
        aPyGSIylzVNKPT1Bls(parcel, iHoXrIDAFrSwfShk8da);
    }

    public static int hoXrIDAFrSwfShk8da(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void husNiw3snxdgZPAGJm(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                OANkd3mP6AYvwbNLJM(parcel, i, 0);
            }
        } else {
            int iHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(parcel, i);
            parcel.writeStrongBinder(iBinder);
            aPyGSIylzVNKPT1Bls(parcel, iHoXrIDAFrSwfShk8da);
        }
    }

    public static int lEeR5KfoEr4xU5yHH7(Parcel parcel) {
        return hoXrIDAFrSwfShk8da(parcel, 20293);
    }

    public static void pbVGzGjWvY2LDXC8vo(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                OANkd3mP6AYvwbNLJM(parcel, i, 0);
            }
        } else {
            int iHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            aPyGSIylzVNKPT1Bls(parcel, iHoXrIDAFrSwfShk8da);
        }
    }

    public static void s3fjYDxWOUexjjVgyA(Parcel parcel, int i) {
        aPyGSIylzVNKPT1Bls(parcel, i);
    }

    public static void zZKhbgvUfsK4AEX3r0(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                OANkd3mP6AYvwbNLJM(parcel, i, 0);
            }
        } else {
            int iHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(parcel, i);
            parcel.writeBundle(bundle);
            aPyGSIylzVNKPT1Bls(parcel, iHoXrIDAFrSwfShk8da);
        }
    }

    public static void zaq8hOURtfwbcX17cG(Parcel parcel, Parcelable parcelable, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
