package uAIIhSQWhOmxUb3Bqo;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 implements IInterface {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final IBinder f7186lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final String f7187s3fjYDxWOUexjjVgyA;

    public lEeR5KfoEr4xU5yHH7(IBinder iBinder, String str) {
        this.f7186lEeR5KfoEr4xU5yHH7 = iBinder;
        this.f7187s3fjYDxWOUexjjVgyA = str;
    }

    public final void HJFh0TGMpafqLE9haL(int i, Parcel parcel) {
        try {
            this.f7186lEeR5KfoEr4xU5yHH7.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7186lEeR5KfoEr4xU5yHH7;
    }

    public final Parcel lEeR5KfoEr4xU5yHH7() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f7187s3fjYDxWOUexjjVgyA);
        return parcelObtain;
    }

    public final void s3fjYDxWOUexjjVgyA(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f7186lEeR5KfoEr4xU5yHH7.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
