package Ywqw2A0s86HeuFkDt0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class A49QRPHynYLCBN0SqP implements ServiceConnection {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public VItLRw50eXTZeEfGl0 f2181HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final /* synthetic */ jCtUeU2YI1poCxWcjm f2182KYHag8HRDlnO3X9zmZ;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int f2184lEeR5KfoEr4xU5yHH7 = 0;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Messenger f2185s3fjYDxWOUexjjVgyA = new Messenger(new oXIAAdret8ERrYfuyf.KYHag8HRDlnO3X9zmZ(Looper.getMainLooper(), new Handler.Callback() { // from class: Ywqw2A0s86HeuFkDt0.G7AC3DWIx9i9fdanjk
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i);
            }
            A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP = this.f2187lEeR5KfoEr4xU5yHH7;
            synchronized (a49QRPHynYLCBN0SqP) {
                try {
                    THTDvPxsHqMeGb512f tHTDvPxsHqMeGb512f = (THTDvPxsHqMeGb512f) a49QRPHynYLCBN0SqP.f2183husNiw3snxdgZPAGJm.get(i);
                    if (tHTDvPxsHqMeGb512f == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                        return true;
                    }
                    a49QRPHynYLCBN0SqP.f2183husNiw3snxdgZPAGJm.remove(i);
                    a49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        tHTDvPxsHqMeGb512f.HJFh0TGMpafqLE9haL(new ao3wqKm5CXFuvC0q47(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    tHTDvPxsHqMeGb512f.lEeR5KfoEr4xU5yHH7(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final Queue f2186zZKhbgvUfsK4AEX3r0 = new ArrayDeque();

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final SparseArray f2183husNiw3snxdgZPAGJm = new SparseArray();

    public /* synthetic */ A49QRPHynYLCBN0SqP(jCtUeU2YI1poCxWcjm jctueu2yi1pocxwcjm, LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO) {
        this.f2182KYHag8HRDlnO3X9zmZ = jctueu2yi1pocxwcjm;
    }

    public final void HJFh0TGMpafqLE9haL() {
        this.f2182KYHag8HRDlnO3X9zmZ.f2233s3fjYDxWOUexjjVgyA.execute(new Runnable() { // from class: Ywqw2A0s86HeuFkDt0.sTkWmhpZ5b1ArQIw4K
            @Override // java.lang.Runnable
            public final void run() {
                final THTDvPxsHqMeGb512f tHTDvPxsHqMeGb512f;
                while (true) {
                    final A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP = this.f2239lEeR5KfoEr4xU5yHH7;
                    synchronized (a49QRPHynYLCBN0SqP) {
                        try {
                            if (a49QRPHynYLCBN0SqP.f2184lEeR5KfoEr4xU5yHH7 != 2) {
                                return;
                            }
                            if (a49QRPHynYLCBN0SqP.f2186zZKhbgvUfsK4AEX3r0.isEmpty()) {
                                a49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ();
                                return;
                            } else {
                                tHTDvPxsHqMeGb512f = (THTDvPxsHqMeGb512f) a49QRPHynYLCBN0SqP.f2186zZKhbgvUfsK4AEX3r0.poll();
                                a49QRPHynYLCBN0SqP.f2183husNiw3snxdgZPAGJm.put(tHTDvPxsHqMeGb512f.f2214lEeR5KfoEr4xU5yHH7, tHTDvPxsHqMeGb512f);
                                a49QRPHynYLCBN0SqP.f2182KYHag8HRDlnO3X9zmZ.f2233s3fjYDxWOUexjjVgyA.schedule(new Runnable() { // from class: Ywqw2A0s86HeuFkDt0.xHA29AmDt6y96AnB3t
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        a49QRPHynYLCBN0SqP.husNiw3snxdgZPAGJm(tHTDvPxsHqMeGb512f.f2214lEeR5KfoEr4xU5yHH7);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(tHTDvPxsHqMeGb512f)));
                    }
                    jCtUeU2YI1poCxWcjm jctueu2yi1pocxwcjm = a49QRPHynYLCBN0SqP.f2182KYHag8HRDlnO3X9zmZ;
                    Messenger messenger = a49QRPHynYLCBN0SqP.f2185s3fjYDxWOUexjjVgyA;
                    int i = tHTDvPxsHqMeGb512f.f2213HJFh0TGMpafqLE9haL;
                    Context context = jctueu2yi1pocxwcjm.f2232lEeR5KfoEr4xU5yHH7;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = tHTDvPxsHqMeGb512f.f2214lEeR5KfoEr4xU5yHH7;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", tHTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", tHTDvPxsHqMeGb512f.f2216zZKhbgvUfsK4AEX3r0);
                    messageObtain.setData(bundle);
                    try {
                        a49QRPHynYLCBN0SqP.f2181HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(messageObtain);
                    } catch (RemoteException e) {
                        a49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7(2, e.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void KYHag8HRDlnO3X9zmZ() {
        try {
            if (this.f2184lEeR5KfoEr4xU5yHH7 == 2 && this.f2186zZKhbgvUfsK4AEX3r0.isEmpty() && this.f2183husNiw3snxdgZPAGJm.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f2184lEeR5KfoEr4xU5yHH7 = 3;
                aUn6Hqsqw2PVM8685Z.s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA().HJFh0TGMpafqLE9haL(this.f2182KYHag8HRDlnO3X9zmZ.f2232lEeR5KfoEr4xU5yHH7, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean TCyPEKSzIyweCN5yp1(THTDvPxsHqMeGb512f tHTDvPxsHqMeGb512f) {
        int i = this.f2184lEeR5KfoEr4xU5yHH7;
        if (i != 0) {
            if (i == 1) {
                this.f2186zZKhbgvUfsK4AEX3r0.add(tHTDvPxsHqMeGb512f);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.f2186zZKhbgvUfsK4AEX3r0.add(tHTDvPxsHqMeGb512f);
            HJFh0TGMpafqLE9haL();
            return true;
        }
        this.f2186zZKhbgvUfsK4AEX3r0.add(tHTDvPxsHqMeGb512f);
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.e54J8UWNHWALQNixXM(this.f2184lEeR5KfoEr4xU5yHH7 == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f2184lEeR5KfoEr4xU5yHH7 = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (aUn6Hqsqw2PVM8685Z.s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA().lEeR5KfoEr4xU5yHH7(this.f2182KYHag8HRDlnO3X9zmZ.f2232lEeR5KfoEr4xU5yHH7, intent, this, 1)) {
                this.f2182KYHag8HRDlnO3X9zmZ.f2233s3fjYDxWOUexjjVgyA.schedule(new Runnable() { // from class: Ywqw2A0s86HeuFkDt0.Y43RdunnpKgpbny0lE
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2223lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                lEeR5KfoEr4xU5yHH7(0, "Unable to bind to service");
            }
        } catch (SecurityException e) {
            s3fjYDxWOUexjjVgyA(0, "Unable to bind to service", e);
        }
        return true;
    }

    public final synchronized void husNiw3snxdgZPAGJm(int i) {
        THTDvPxsHqMeGb512f tHTDvPxsHqMeGb512f = (THTDvPxsHqMeGb512f) this.f2183husNiw3snxdgZPAGJm.get(i);
        if (tHTDvPxsHqMeGb512f != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i);
            this.f2183husNiw3snxdgZPAGJm.remove(i);
            tHTDvPxsHqMeGb512f.HJFh0TGMpafqLE9haL(new ao3wqKm5CXFuvC0q47(3, "Timed out waiting for response", null));
            KYHag8HRDlnO3X9zmZ();
        }
    }

    public final synchronized void lEeR5KfoEr4xU5yHH7(int i, String str) {
        s3fjYDxWOUexjjVgyA(i, str, null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f2182KYHag8HRDlnO3X9zmZ.f2233s3fjYDxWOUexjjVgyA.execute(new Runnable() { // from class: Ywqw2A0s86HeuFkDt0.zaq8hOURtfwbcX17cG
            @Override // java.lang.Runnable
            public final void run() {
                A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP = this.f2243lEeR5KfoEr4xU5yHH7;
                IBinder iBinder2 = iBinder;
                synchronized (a49QRPHynYLCBN0SqP) {
                    if (iBinder2 == null) {
                        a49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7(0, "Null service connection");
                        return;
                    }
                    try {
                        a49QRPHynYLCBN0SqP.f2181HJFh0TGMpafqLE9haL = new VItLRw50eXTZeEfGl0(iBinder2);
                        a49QRPHynYLCBN0SqP.f2184lEeR5KfoEr4xU5yHH7 = 2;
                        a49QRPHynYLCBN0SqP.HJFh0TGMpafqLE9haL();
                    } catch (RemoteException e) {
                        a49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7(0, e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f2182KYHag8HRDlnO3X9zmZ.f2233s3fjYDxWOUexjjVgyA.execute(new Runnable() { // from class: Ywqw2A0s86HeuFkDt0.R9SAhYMerGybF9OAjL
            @Override // java.lang.Runnable
            public final void run() {
                this.f2210lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(2, "Service disconnected");
            }
        });
    }

    public final synchronized void s3fjYDxWOUexjjVgyA(int i, String str, Throwable th) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i2 = this.f2184lEeR5KfoEr4xU5yHH7;
            if (i2 == 0) {
                throw new IllegalStateException();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.f2184lEeR5KfoEr4xU5yHH7 = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f2184lEeR5KfoEr4xU5yHH7 = 4;
            aUn6Hqsqw2PVM8685Z.s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA().HJFh0TGMpafqLE9haL(this.f2182KYHag8HRDlnO3X9zmZ.f2232lEeR5KfoEr4xU5yHH7, this);
            ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q47 = new ao3wqKm5CXFuvC0q47(i, str, th);
            Iterator it = this.f2186zZKhbgvUfsK4AEX3r0.iterator();
            while (it.hasNext()) {
                ((THTDvPxsHqMeGb512f) it.next()).HJFh0TGMpafqLE9haL(ao3wqkm5cxfuvc0q47);
            }
            this.f2186zZKhbgvUfsK4AEX3r0.clear();
            for (int i3 = 0; i3 < this.f2183husNiw3snxdgZPAGJm.size(); i3++) {
                ((THTDvPxsHqMeGb512f) this.f2183husNiw3snxdgZPAGJm.valueAt(i3)).HJFh0TGMpafqLE9haL(ao3wqkm5cxfuvc0q47);
            }
            this.f2183husNiw3snxdgZPAGJm.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zZKhbgvUfsK4AEX3r0() {
        if (this.f2184lEeR5KfoEr4xU5yHH7 == 1) {
            lEeR5KfoEr4xU5yHH7(1, "Timed out while binding");
        }
    }
}
