package yXUWiIShOcfJRNCmU8;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA extends Binder implements IInterface {
    public s3fjYDxWOUexjjVgyA(String str) {
        attachInterface(this, str);
    }

    public boolean lEeR5KfoEr4xU5yHH7(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return lEeR5KfoEr4xU5yHH7(i, parcel, parcel2, i2);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
