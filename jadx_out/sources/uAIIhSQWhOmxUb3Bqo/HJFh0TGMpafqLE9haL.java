package uAIIhSQWhOmxUb3Bqo;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final ClassLoader f7184lEeR5KfoEr4xU5yHH7 = HJFh0TGMpafqLE9haL.class.getClassLoader();

    public static void HJFh0TGMpafqLE9haL(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    public static Parcelable lEeR5KfoEr4xU5yHH7(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void s3fjYDxWOUexjjVgyA(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
