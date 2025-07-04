package HR5vAalpgOKVm2T0Gq;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class Pum9NZyDBKoCnecvlx extends IPyIQcaNa8aB7drBED {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final aUn6Hqsqw2PVM8685Z.s3fjYDxWOUexjjVgyA f348Acstmh57AKoSEkEFNJ;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public volatile Handler f349IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final HashMap f350KYHag8HRDlnO3X9zmZ = new HashMap();

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public volatile Executor f351T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final Context f352TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public final long f353Z9WdNiOsPR0y54zHW4;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public final long f354e54J8UWNHWALQNixXM;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final Kh0uC90qEEhuLdpgB9 f355pbVGzGjWvY2LDXC8vo;

    public Pum9NZyDBKoCnecvlx(Context context, Looper looper, Executor executor) {
        Kh0uC90qEEhuLdpgB9 kh0uC90qEEhuLdpgB9 = new Kh0uC90qEEhuLdpgB9(this, null);
        this.f355pbVGzGjWvY2LDXC8vo = kh0uC90qEEhuLdpgB9;
        this.f352TCyPEKSzIyweCN5yp1 = context.getApplicationContext();
        this.f349IPyIQcaNa8aB7drBED = new yXUWiIShOcfJRNCmU8.husNiw3snxdgZPAGJm(looper, kh0uC90qEEhuLdpgB9);
        this.f348Acstmh57AKoSEkEFNJ = aUn6Hqsqw2PVM8685Z.s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA();
        this.f353Z9WdNiOsPR0y54zHW4 = 5000L;
        this.f354e54J8UWNHWALQNixXM = 300000L;
        this.f351T9PhQIpGRhE4yZDm1C = executor;
    }

    @Override // HR5vAalpgOKVm2T0Gq.IPyIQcaNa8aB7drBED
    public final void HJFh0TGMpafqLE9haL(osrHU7fvDp2EgxZPfM osrhu7fvdp2egxzpfm, ServiceConnection serviceConnection, String str) {
        hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f350KYHag8HRDlnO3X9zmZ) {
            try {
                Tu4WCh2gEwj8E4oHbP tu4WCh2gEwj8E4oHbP = (Tu4WCh2gEwj8E4oHbP) this.f350KYHag8HRDlnO3X9zmZ.get(osrhu7fvdp2egxzpfm);
                if (tu4WCh2gEwj8E4oHbP == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + osrhu7fvdp2egxzpfm.toString());
                }
                if (!tu4WCh2gEwj8E4oHbP.IPyIQcaNa8aB7drBED(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + osrhu7fvdp2egxzpfm.toString());
                }
                tu4WCh2gEwj8E4oHbP.KYHag8HRDlnO3X9zmZ(serviceConnection, str);
                if (tu4WCh2gEwj8E4oHbP.pbVGzGjWvY2LDXC8vo()) {
                    this.f349IPyIQcaNa8aB7drBED.sendMessageDelayed(this.f349IPyIQcaNa8aB7drBED.obtainMessage(0, osrhu7fvdp2egxzpfm), this.f353Z9WdNiOsPR0y54zHW4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // HR5vAalpgOKVm2T0Gq.IPyIQcaNa8aB7drBED
    public final boolean husNiw3snxdgZPAGJm(osrHU7fvDp2EgxZPfM osrhu7fvdp2egxzpfm, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean zAcstmh57AKoSEkEFNJ;
        hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f350KYHag8HRDlnO3X9zmZ) {
            try {
                Tu4WCh2gEwj8E4oHbP tu4WCh2gEwj8E4oHbP = (Tu4WCh2gEwj8E4oHbP) this.f350KYHag8HRDlnO3X9zmZ.get(osrhu7fvdp2egxzpfm);
                if (executor == null) {
                    executor = this.f351T9PhQIpGRhE4yZDm1C;
                }
                if (tu4WCh2gEwj8E4oHbP == null) {
                    tu4WCh2gEwj8E4oHbP = new Tu4WCh2gEwj8E4oHbP(this, osrhu7fvdp2egxzpfm);
                    tu4WCh2gEwj8E4oHbP.zZKhbgvUfsK4AEX3r0(serviceConnection, serviceConnection, str);
                    tu4WCh2gEwj8E4oHbP.husNiw3snxdgZPAGJm(str, executor);
                    this.f350KYHag8HRDlnO3X9zmZ.put(osrhu7fvdp2egxzpfm, tu4WCh2gEwj8E4oHbP);
                } else {
                    this.f349IPyIQcaNa8aB7drBED.removeMessages(0, osrhu7fvdp2egxzpfm);
                    if (tu4WCh2gEwj8E4oHbP.IPyIQcaNa8aB7drBED(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + osrhu7fvdp2egxzpfm.toString());
                    }
                    tu4WCh2gEwj8E4oHbP.zZKhbgvUfsK4AEX3r0(serviceConnection, serviceConnection, str);
                    int iLEeR5KfoEr4xU5yHH7 = tu4WCh2gEwj8E4oHbP.lEeR5KfoEr4xU5yHH7();
                    if (iLEeR5KfoEr4xU5yHH7 == 1) {
                        serviceConnection.onServiceConnected(tu4WCh2gEwj8E4oHbP.s3fjYDxWOUexjjVgyA(), tu4WCh2gEwj8E4oHbP.HJFh0TGMpafqLE9haL());
                    } else if (iLEeR5KfoEr4xU5yHH7 == 2) {
                        tu4WCh2gEwj8E4oHbP.husNiw3snxdgZPAGJm(str, executor);
                    }
                }
                zAcstmh57AKoSEkEFNJ = tu4WCh2gEwj8E4oHbP.Acstmh57AKoSEkEFNJ();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zAcstmh57AKoSEkEFNJ;
    }
}
