package uAIIhSQWhOmxUb3Bqo;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA extends Binder implements IInterface {
    public s3fjYDxWOUexjjVgyA(String str) {
        attachInterface(this, str);
    }

    public abstract boolean e54J8UWNHWALQNixXM(int i, Parcel parcel, Parcel parcel2, int i2);

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return e54J8UWNHWALQNixXM(i, parcel, parcel2, i2);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
