package HR5vAalpgOKVm2T0Gq;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class aAp6BD79BhftLCnuvf implements Z9WdNiOsPR0y54zHW4 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final IBinder f383lEeR5KfoEr4xU5yHH7;

    public aAp6BD79BhftLCnuvf(IBinder iBinder) {
        this.f383lEeR5KfoEr4xU5yHH7 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f383lEeR5KfoEr4xU5yHH7;
    }

    @Override // HR5vAalpgOKVm2T0Gq.Z9WdNiOsPR0y54zHW4
    public final void pbVGzGjWvY2LDXC8vo(Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ, KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(acstmh57AKoSEkEFNJ != null ? acstmh57AKoSEkEFNJ.asBinder() : null);
            if (kYHag8HRDlnO3X9zmZ != null) {
                parcelObtain.writeInt(1);
                CSih7GetOUab1dYQjM.lEeR5KfoEr4xU5yHH7(kYHag8HRDlnO3X9zmZ, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f383lEeR5KfoEr4xU5yHH7.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
