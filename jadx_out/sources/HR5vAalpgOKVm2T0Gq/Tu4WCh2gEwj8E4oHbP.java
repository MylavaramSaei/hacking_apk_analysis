package HR5vAalpgOKVm2T0Gq;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class Tu4WCh2gEwj8E4oHbP implements ServiceConnection, ctWLFN70QQINH1kyYo {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public boolean f363HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public ComponentName f364KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final /* synthetic */ Pum9NZyDBKoCnecvlx f365TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final osrHU7fvDp2EgxZPfM f366husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Map f367lEeR5KfoEr4xU5yHH7 = new HashMap();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f368s3fjYDxWOUexjjVgyA = 2;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public IBinder f369zZKhbgvUfsK4AEX3r0;

    public Tu4WCh2gEwj8E4oHbP(Pum9NZyDBKoCnecvlx pum9NZyDBKoCnecvlx, osrHU7fvDp2EgxZPfM osrhu7fvdp2egxzpfm) {
        this.f365TCyPEKSzIyweCN5yp1 = pum9NZyDBKoCnecvlx;
        this.f366husNiw3snxdgZPAGJm = osrhu7fvdp2egxzpfm;
    }

    public final boolean Acstmh57AKoSEkEFNJ() {
        return this.f363HJFh0TGMpafqLE9haL;
    }

    public final IBinder HJFh0TGMpafqLE9haL() {
        return this.f369zZKhbgvUfsK4AEX3r0;
    }

    public final boolean IPyIQcaNa8aB7drBED(ServiceConnection serviceConnection) {
        return this.f367lEeR5KfoEr4xU5yHH7.containsKey(serviceConnection);
    }

    public final void KYHag8HRDlnO3X9zmZ(ServiceConnection serviceConnection, String str) {
        this.f367lEeR5KfoEr4xU5yHH7.remove(serviceConnection);
    }

    public final void TCyPEKSzIyweCN5yp1(String str) {
        this.f365TCyPEKSzIyweCN5yp1.f349IPyIQcaNa8aB7drBED.removeMessages(1, this.f366husNiw3snxdgZPAGJm);
        Pum9NZyDBKoCnecvlx pum9NZyDBKoCnecvlx = this.f365TCyPEKSzIyweCN5yp1;
        pum9NZyDBKoCnecvlx.f348Acstmh57AKoSEkEFNJ.HJFh0TGMpafqLE9haL(pum9NZyDBKoCnecvlx.f352TCyPEKSzIyweCN5yp1, this);
        this.f363HJFh0TGMpafqLE9haL = false;
        this.f368s3fjYDxWOUexjjVgyA = 2;
    }

    public final void husNiw3snxdgZPAGJm(String str, Executor executor) {
        this.f368s3fjYDxWOUexjjVgyA = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo.Z9WdNiOsPR0y54zHW4()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            Pum9NZyDBKoCnecvlx pum9NZyDBKoCnecvlx = this.f365TCyPEKSzIyweCN5yp1;
            boolean zZZKhbgvUfsK4AEX3r0 = pum9NZyDBKoCnecvlx.f348Acstmh57AKoSEkEFNJ.zZKhbgvUfsK4AEX3r0(pum9NZyDBKoCnecvlx.f352TCyPEKSzIyweCN5yp1, str, this.f366husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA(pum9NZyDBKoCnecvlx.f352TCyPEKSzIyweCN5yp1), this, 4225, executor);
            this.f363HJFh0TGMpafqLE9haL = zZZKhbgvUfsK4AEX3r0;
            if (zZZKhbgvUfsK4AEX3r0) {
                this.f365TCyPEKSzIyweCN5yp1.f349IPyIQcaNa8aB7drBED.sendMessageDelayed(this.f365TCyPEKSzIyweCN5yp1.f349IPyIQcaNa8aB7drBED.obtainMessage(1, this.f366husNiw3snxdgZPAGJm), this.f365TCyPEKSzIyweCN5yp1.f354e54J8UWNHWALQNixXM);
            } else {
                this.f368s3fjYDxWOUexjjVgyA = 2;
                try {
                    Pum9NZyDBKoCnecvlx pum9NZyDBKoCnecvlx2 = this.f365TCyPEKSzIyweCN5yp1;
                    pum9NZyDBKoCnecvlx2.f348Acstmh57AKoSEkEFNJ.HJFh0TGMpafqLE9haL(pum9NZyDBKoCnecvlx2.f352TCyPEKSzIyweCN5yp1, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    public final int lEeR5KfoEr4xU5yHH7() {
        return this.f368s3fjYDxWOUexjjVgyA;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f365TCyPEKSzIyweCN5yp1.f350KYHag8HRDlnO3X9zmZ) {
            try {
                this.f365TCyPEKSzIyweCN5yp1.f349IPyIQcaNa8aB7drBED.removeMessages(1, this.f366husNiw3snxdgZPAGJm);
                this.f369zZKhbgvUfsK4AEX3r0 = iBinder;
                this.f364KYHag8HRDlnO3X9zmZ = componentName;
                Iterator it = this.f367lEeR5KfoEr4xU5yHH7.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f368s3fjYDxWOUexjjVgyA = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f365TCyPEKSzIyweCN5yp1.f350KYHag8HRDlnO3X9zmZ) {
            try {
                this.f365TCyPEKSzIyweCN5yp1.f349IPyIQcaNa8aB7drBED.removeMessages(1, this.f366husNiw3snxdgZPAGJm);
                this.f369zZKhbgvUfsK4AEX3r0 = null;
                this.f364KYHag8HRDlnO3X9zmZ = componentName;
                Iterator it = this.f367lEeR5KfoEr4xU5yHH7.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f368s3fjYDxWOUexjjVgyA = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean pbVGzGjWvY2LDXC8vo() {
        return this.f367lEeR5KfoEr4xU5yHH7.isEmpty();
    }

    public final ComponentName s3fjYDxWOUexjjVgyA() {
        return this.f364KYHag8HRDlnO3X9zmZ;
    }

    public final void zZKhbgvUfsK4AEX3r0(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f367lEeR5KfoEr4xU5yHH7.put(serviceConnection, serviceConnection2);
    }
}
