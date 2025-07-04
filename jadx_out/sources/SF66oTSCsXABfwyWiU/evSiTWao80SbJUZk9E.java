package SF66oTSCsXABfwyWiU;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class evSiTWao80SbJUZk9E implements ServiceConnection {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final ScheduledExecutorService f1455HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public boolean f1456KYHag8HRDlnO3X9zmZ;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public jocVUfxESVhVJU8LoH f1457husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f1458lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Intent f1459s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final Queue f1460zZKhbgvUfsK4AEX3r0;

    public static class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Intent f1461lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ f1462s3fjYDxWOUexjjVgyA = new JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ();

        public lEeR5KfoEr4xU5yHH7(Intent intent) {
            this.f1461lEeR5KfoEr4xU5yHH7 = intent;
        }

        public void HJFh0TGMpafqLE9haL(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: SF66oTSCsXABfwyWiU.zXY7dgnTfw9Pd9RXel
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1523lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ();
                }
            }, 20L, TimeUnit.SECONDS);
            husNiw3snxdgZPAGJm().HJFh0TGMpafqLE9haL(scheduledExecutorService, new JXsqbvi9UKxeF3HXpU.zZKhbgvUfsK4AEX3r0() { // from class: SF66oTSCsXABfwyWiU.eWK41qw3g36LVd4UnS
                @Override // JXsqbvi9UKxeF3HXpU.zZKhbgvUfsK4AEX3r0
                public final void lEeR5KfoEr4xU5yHH7(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        public final /* synthetic */ void KYHag8HRDlnO3X9zmZ() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f1461lEeR5KfoEr4xU5yHH7.getAction() + " finishing.");
            zZKhbgvUfsK4AEX3r0();
        }

        public JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo husNiw3snxdgZPAGJm() {
            return this.f1462s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7();
        }

        public void zZKhbgvUfsK4AEX3r0() {
            this.f1462s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm(null);
        }
    }

    public evSiTWao80SbJUZk9E(Context context, String str) {
        this(context, str, lEeR5KfoEr4xU5yHH7());
    }

    public static ScheduledThreadPoolExecutor lEeR5KfoEr4xU5yHH7() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    public final synchronized void HJFh0TGMpafqLE9haL() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f1460zZKhbgvUfsK4AEX3r0.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                jocVUfxESVhVJU8LoH jocvufxesvhvju8loh = this.f1457husNiw3snxdgZPAGJm;
                if (jocvufxesvhvju8loh == null || !jocvufxesvhvju8loh.isBinderAlive()) {
                    husNiw3snxdgZPAGJm();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f1457husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL((lEeR5KfoEr4xU5yHH7) this.f1460zZKhbgvUfsK4AEX3r0.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void husNiw3snxdgZPAGJm() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f1456KYHag8HRDlnO3X9zmZ);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f1456KYHag8HRDlnO3X9zmZ) {
            return;
        }
        this.f1456KYHag8HRDlnO3X9zmZ = true;
        try {
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        if (aUn6Hqsqw2PVM8685Z.s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA().lEeR5KfoEr4xU5yHH7(this.f1458lEeR5KfoEr4xU5yHH7, this.f1459s3fjYDxWOUexjjVgyA, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f1456KYHag8HRDlnO3X9zmZ = false;
        s3fjYDxWOUexjjVgyA();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f1456KYHag8HRDlnO3X9zmZ = false;
            if (iBinder instanceof jocVUfxESVhVJU8LoH) {
                this.f1457husNiw3snxdgZPAGJm = (jocVUfxESVhVJU8LoH) iBinder;
                HJFh0TGMpafqLE9haL();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            s3fjYDxWOUexjjVgyA();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        HJFh0TGMpafqLE9haL();
    }

    public final void s3fjYDxWOUexjjVgyA() {
        while (!this.f1460zZKhbgvUfsK4AEX3r0.isEmpty()) {
            ((lEeR5KfoEr4xU5yHH7) this.f1460zZKhbgvUfsK4AEX3r0.poll()).zZKhbgvUfsK4AEX3r0();
        }
    }

    public synchronized JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo zZKhbgvUfsK4AEX3r0(Intent intent) {
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            leer5kfoer4xu5yhh7 = new lEeR5KfoEr4xU5yHH7(intent);
            leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL(this.f1455HJFh0TGMpafqLE9haL);
            this.f1460zZKhbgvUfsK4AEX3r0.add(leer5kfoer4xu5yhh7);
            HJFh0TGMpafqLE9haL();
        } catch (Throwable th) {
            throw th;
        }
        return leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm();
    }

    public evSiTWao80SbJUZk9E(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f1460zZKhbgvUfsK4AEX3r0 = new ArrayDeque();
        this.f1456KYHag8HRDlnO3X9zmZ = false;
        Context applicationContext = context.getApplicationContext();
        this.f1458lEeR5KfoEr4xU5yHH7 = applicationContext;
        this.f1459s3fjYDxWOUexjjVgyA = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f1455HJFh0TGMpafqLE9haL = scheduledExecutorService;
    }
}
