package HR5vAalpgOKVm2T0Gq;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class PPkm9uUfOJHHYveeLT extends yXUWiIShOcfJRNCmU8.s3fjYDxWOUexjjVgyA implements Acstmh57AKoSEkEFNJ {
    public PPkm9uUfOJHHYveeLT() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // yXUWiIShOcfJRNCmU8.s3fjYDxWOUexjjVgyA
    public final boolean lEeR5KfoEr4xU5yHH7(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            int i3 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) yXUWiIShOcfJRNCmU8.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(parcel, Bundle.CREATOR);
            yXUWiIShOcfJRNCmU8.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(parcel);
            Z9WdNiOsPR0y54zHW4(i3, strongBinder, bundle);
        } else if (i == 2) {
            int i4 = parcel.readInt();
            Bundle bundle2 = (Bundle) yXUWiIShOcfJRNCmU8.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(parcel, Bundle.CREATOR);
            yXUWiIShOcfJRNCmU8.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(parcel);
            zZKhbgvUfsK4AEX3r0(i4, bundle2);
        } else {
            if (i != 3) {
                return false;
            }
            int i5 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            hUNBy66ZO1wVLJGW3l hunby66zo1wvljgw3l = (hUNBy66ZO1wVLJGW3l) yXUWiIShOcfJRNCmU8.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(parcel, hUNBy66ZO1wVLJGW3l.CREATOR);
            yXUWiIShOcfJRNCmU8.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(parcel);
            KYHag8HRDlnO3X9zmZ(i5, strongBinder2, hunby66zo1wvljgw3l);
        }
        parcel2.writeNoException();
        return true;
    }
}
