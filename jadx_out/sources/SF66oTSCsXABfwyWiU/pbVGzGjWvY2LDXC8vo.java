package SF66oTSCsXABfwyWiU;

import SF66oTSCsXABfwyWiU.jocVUfxESVhVJU8LoH;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public abstract class pbVGzGjWvY2LDXC8vo extends Service {

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public Binder f1514s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f1515zZKhbgvUfsK4AEX3r0;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final ExecutorService f1513lEeR5KfoEr4xU5yHH7 = aPyGSIylzVNKPT1Bls.zZKhbgvUfsK4AEX3r0();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final Object f1511HJFh0TGMpafqLE9haL = new Object();

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int f1512husNiw3snxdgZPAGJm = 0;

    public class lEeR5KfoEr4xU5yHH7 implements jocVUfxESVhVJU8LoH.lEeR5KfoEr4xU5yHH7 {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // SF66oTSCsXABfwyWiU.jocVUfxESVhVJU8LoH.lEeR5KfoEr4xU5yHH7
        public JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo lEeR5KfoEr4xU5yHH7(Intent intent) {
            return pbVGzGjWvY2LDXC8vo.this.Acstmh57AKoSEkEFNJ(intent);
        }
    }

    public final JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo Acstmh57AKoSEkEFNJ(final Intent intent) {
        if (TCyPEKSzIyweCN5yp1(intent)) {
            return JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM.husNiw3snxdgZPAGJm(null);
        }
        final JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ = new JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ();
        this.f1513lEeR5KfoEr4xU5yHH7.execute(new Runnable() { // from class: SF66oTSCsXABfwyWiU.IPyIQcaNa8aB7drBED
            @Override // java.lang.Runnable
            public final void run() {
                this.f1381lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(intent, acstmh57AKoSEkEFNJ);
            }
        });
        return acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7();
    }

    public final /* synthetic */ void IPyIQcaNa8aB7drBED(Intent intent, JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        zZKhbgvUfsK4AEX3r0(intent);
    }

    public abstract void KYHag8HRDlnO3X9zmZ(Intent intent);

    public boolean TCyPEKSzIyweCN5yp1(Intent intent) {
        return false;
    }

    public boolean Z9WdNiOsPR0y54zHW4(int i) {
        return stopSelfResult(i);
    }

    public abstract Intent husNiw3snxdgZPAGJm(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f1514s3fjYDxWOUexjjVgyA == null) {
                this.f1514s3fjYDxWOUexjjVgyA = new jocVUfxESVhVJU8LoH(new lEeR5KfoEr4xU5yHH7());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1514s3fjYDxWOUexjjVgyA;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f1513lEeR5KfoEr4xU5yHH7.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.f1511HJFh0TGMpafqLE9haL) {
            this.f1515zZKhbgvUfsK4AEX3r0 = i2;
            this.f1512husNiw3snxdgZPAGJm++;
        }
        Intent intentHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(intent);
        if (intentHusNiw3snxdgZPAGJm == null) {
            zZKhbgvUfsK4AEX3r0(intent);
            return 2;
        }
        JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8voAcstmh57AKoSEkEFNJ = Acstmh57AKoSEkEFNJ(intentHusNiw3snxdgZPAGJm);
        if (pbvgzgjwvy2ldxc8voAcstmh57AKoSEkEFNJ.hoXrIDAFrSwfShk8da()) {
            zZKhbgvUfsK4AEX3r0(intent);
            return 2;
        }
        pbvgzgjwvy2ldxc8voAcstmh57AKoSEkEFNJ.HJFh0TGMpafqLE9haL(new hUNBy66ZO1wVLJGW3l.husNiw3snxdgZPAGJm(), new JXsqbvi9UKxeF3HXpU.zZKhbgvUfsK4AEX3r0() { // from class: SF66oTSCsXABfwyWiU.TCyPEKSzIyweCN5yp1
            @Override // JXsqbvi9UKxeF3HXpU.zZKhbgvUfsK4AEX3r0
            public final void lEeR5KfoEr4xU5yHH7(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
                this.f1397lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(intent, pbvgzgjwvy2ldxc8vo);
            }
        });
        return 3;
    }

    public final /* synthetic */ void pbVGzGjWvY2LDXC8vo(Intent intent, JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ) {
        try {
            KYHag8HRDlnO3X9zmZ(intent);
        } finally {
            acstmh57AKoSEkEFNJ.HJFh0TGMpafqLE9haL(null);
        }
    }

    public final void zZKhbgvUfsK4AEX3r0(Intent intent) {
        if (intent != null) {
            Pum9NZyDBKoCnecvlx.HJFh0TGMpafqLE9haL(intent);
        }
        synchronized (this.f1511HJFh0TGMpafqLE9haL) {
            try {
                int i = this.f1512husNiw3snxdgZPAGJm - 1;
                this.f1512husNiw3snxdgZPAGJm = i;
                if (i == 0) {
                    Z9WdNiOsPR0y54zHW4(this.f1515zZKhbgvUfsK4AEX3r0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
