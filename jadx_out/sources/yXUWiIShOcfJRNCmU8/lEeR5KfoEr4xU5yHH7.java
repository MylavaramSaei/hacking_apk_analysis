package yXUWiIShOcfJRNCmU8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 implements IInterface {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final IBinder f7333lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final String f7334s3fjYDxWOUexjjVgyA;

    public lEeR5KfoEr4xU5yHH7(IBinder iBinder, String str) {
        this.f7333lEeR5KfoEr4xU5yHH7 = iBinder;
        this.f7334s3fjYDxWOUexjjVgyA = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7333lEeR5KfoEr4xU5yHH7;
    }

    public final Parcel lEeR5KfoEr4xU5yHH7(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f7333lEeR5KfoEr4xU5yHH7.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel s3fjYDxWOUexjjVgyA() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f7334s3fjYDxWOUexjjVgyA);
        return parcelObtain;
    }
}
