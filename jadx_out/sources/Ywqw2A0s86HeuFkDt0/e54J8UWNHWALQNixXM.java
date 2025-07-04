package Ywqw2A0s86HeuFkDt0;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class e54J8UWNHWALQNixXM implements Parcelable {
    public static final Parcelable.Creator<e54J8UWNHWALQNixXM> CREATOR = new Acstmh57AKoSEkEFNJ();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public Messenger f2227lEeR5KfoEr4xU5yHH7;

    public e54J8UWNHWALQNixXM(IBinder iBinder) {
        this.f2227lEeR5KfoEr4xU5yHH7 = new Messenger(iBinder);
    }

    public final IBinder HJFh0TGMpafqLE9haL() {
        Messenger messenger = this.f2227lEeR5KfoEr4xU5yHH7;
        messenger.getClass();
        return messenger.getBinder();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return HJFh0TGMpafqLE9haL().equals(((e54J8UWNHWALQNixXM) obj).HJFh0TGMpafqLE9haL());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return HJFh0TGMpafqLE9haL().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f2227lEeR5KfoEr4xU5yHH7;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }

    public final void zZKhbgvUfsK4AEX3r0(Message message) throws RemoteException {
        Messenger messenger = this.f2227lEeR5KfoEr4xU5yHH7;
        messenger.getClass();
        messenger.send(message);
    }
}
