package Ywqw2A0s86HeuFkDt0;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public final class VItLRw50eXTZeEfGl0 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Messenger f2217lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final e54J8UWNHWALQNixXM f2218s3fjYDxWOUexjjVgyA;

    public VItLRw50eXTZeEfGl0(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f2217lEeR5KfoEr4xU5yHH7 = new Messenger(iBinder);
            this.f2218s3fjYDxWOUexjjVgyA = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f2218s3fjYDxWOUexjjVgyA = new e54J8UWNHWALQNixXM(iBinder);
            this.f2217lEeR5KfoEr4xU5yHH7 = null;
        }
    }

    public final void lEeR5KfoEr4xU5yHH7(Message message) throws RemoteException {
        Messenger messenger = this.f2217lEeR5KfoEr4xU5yHH7;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = this.f2218s3fjYDxWOUexjjVgyA;
        if (e54j8uwnhwalqnixxm == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        e54j8uwnhwalqnixxm.zZKhbgvUfsK4AEX3r0(message);
    }
}
