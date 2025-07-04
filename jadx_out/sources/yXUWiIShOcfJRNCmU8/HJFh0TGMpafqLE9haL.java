package yXUWiIShOcfJRNCmU8;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final ClassLoader f7331lEeR5KfoEr4xU5yHH7 = HJFh0TGMpafqLE9haL.class.getClassLoader();

    public static void HJFh0TGMpafqLE9haL(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    public static Parcelable lEeR5KfoEr4xU5yHH7(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void s3fjYDxWOUexjjVgyA(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + iDataAvail);
    }
}
