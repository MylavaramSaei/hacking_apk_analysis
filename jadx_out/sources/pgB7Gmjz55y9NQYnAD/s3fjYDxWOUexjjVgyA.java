package pgB7Gmjz55y9NQYnAD;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA {

    public static class lEeR5KfoEr4xU5yHH7 extends RuntimeException {
        public lEeR5KfoEr4xU5yHH7(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static boolean Acstmh57AKoSEkEFNJ(Parcel parcel, int i) {
        sTkWmhpZ5b1ArQIw4K(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Parcelable HJFh0TGMpafqLE9haL(Parcel parcel, int i, Parcelable.Creator creator) {
        int iAPyGSIylzVNKPT1Bls = aPyGSIylzVNKPT1Bls(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAPyGSIylzVNKPT1Bls == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iAPyGSIylzVNKPT1Bls);
        return parcelable;
    }

    public static void IPyIQcaNa8aB7drBED(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        throw new lEeR5KfoEr4xU5yHH7("Overread allowed size end=" + i, parcel);
    }

    public static Object[] KYHag8HRDlnO3X9zmZ(Parcel parcel, int i, Parcelable.Creator creator) {
        int iAPyGSIylzVNKPT1Bls = aPyGSIylzVNKPT1Bls(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAPyGSIylzVNKPT1Bls == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iAPyGSIylzVNKPT1Bls);
        return objArrCreateTypedArray;
    }

    public static void OANkd3mP6AYvwbNLJM(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + aPyGSIylzVNKPT1Bls(parcel, i));
    }

    public static int T9PhQIpGRhE4yZDm1C(Parcel parcel, int i) {
        sTkWmhpZ5b1ArQIw4K(parcel, i, 4);
        return parcel.readInt();
    }

    public static ArrayList TCyPEKSzIyweCN5yp1(Parcel parcel, int i, Parcelable.Creator creator) {
        int iAPyGSIylzVNKPT1Bls = aPyGSIylzVNKPT1Bls(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAPyGSIylzVNKPT1Bls == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iAPyGSIylzVNKPT1Bls);
        return arrayListCreateTypedArrayList;
    }

    public static int Z9WdNiOsPR0y54zHW4(Parcel parcel) {
        return parcel.readInt();
    }

    public static int aPyGSIylzVNKPT1Bls(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static IBinder e54J8UWNHWALQNixXM(Parcel parcel, int i) {
        int iAPyGSIylzVNKPT1Bls = aPyGSIylzVNKPT1Bls(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAPyGSIylzVNKPT1Bls == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iAPyGSIylzVNKPT1Bls);
        return strongBinder;
    }

    public static long hoXrIDAFrSwfShk8da(Parcel parcel, int i) {
        sTkWmhpZ5b1ArQIw4K(parcel, i, 8);
        return parcel.readLong();
    }

    public static ArrayList husNiw3snxdgZPAGJm(Parcel parcel, int i) {
        int iAPyGSIylzVNKPT1Bls = aPyGSIylzVNKPT1Bls(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAPyGSIylzVNKPT1Bls == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iAPyGSIylzVNKPT1Bls);
        return arrayListCreateStringArrayList;
    }

    public static Bundle lEeR5KfoEr4xU5yHH7(Parcel parcel, int i) {
        int iAPyGSIylzVNKPT1Bls = aPyGSIylzVNKPT1Bls(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAPyGSIylzVNKPT1Bls == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iAPyGSIylzVNKPT1Bls);
        return bundle;
    }

    public static int pbVGzGjWvY2LDXC8vo(int i) {
        return (char) i;
    }

    public static int[] s3fjYDxWOUexjjVgyA(Parcel parcel, int i) {
        int iAPyGSIylzVNKPT1Bls = aPyGSIylzVNKPT1Bls(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAPyGSIylzVNKPT1Bls == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iAPyGSIylzVNKPT1Bls);
        return iArrCreateIntArray;
    }

    public static void sTkWmhpZ5b1ArQIw4K(Parcel parcel, int i, int i2) {
        int iAPyGSIylzVNKPT1Bls = aPyGSIylzVNKPT1Bls(parcel, i);
        if (iAPyGSIylzVNKPT1Bls == i2) {
            return;
        }
        throw new lEeR5KfoEr4xU5yHH7("Expected size " + i2 + " got " + iAPyGSIylzVNKPT1Bls + " (0x" + Integer.toHexString(iAPyGSIylzVNKPT1Bls) + ")", parcel);
    }

    public static String zZKhbgvUfsK4AEX3r0(Parcel parcel, int i) {
        int iAPyGSIylzVNKPT1Bls = aPyGSIylzVNKPT1Bls(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAPyGSIylzVNKPT1Bls == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iAPyGSIylzVNKPT1Bls);
        return string;
    }

    public static int zaq8hOURtfwbcX17cG(Parcel parcel) {
        int iZ9WdNiOsPR0y54zHW4 = Z9WdNiOsPR0y54zHW4(parcel);
        int iAPyGSIylzVNKPT1Bls = aPyGSIylzVNKPT1Bls(parcel, iZ9WdNiOsPR0y54zHW4);
        int iPbVGzGjWvY2LDXC8vo = pbVGzGjWvY2LDXC8vo(iZ9WdNiOsPR0y54zHW4);
        int iDataPosition = parcel.dataPosition();
        if (iPbVGzGjWvY2LDXC8vo != 20293) {
            throw new lEeR5KfoEr4xU5yHH7("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iZ9WdNiOsPR0y54zHW4))), parcel);
        }
        int i = iAPyGSIylzVNKPT1Bls + iDataPosition;
        if (i >= iDataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new lEeR5KfoEr4xU5yHH7("Size read is invalid start=" + iDataPosition + " end=" + i, parcel);
    }
}
