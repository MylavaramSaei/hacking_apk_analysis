package Ywqw2A0s86HeuFkDt0;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA extends BroadcastReceiver {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static SoftReference f2237lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static SoftReference f2238s3fjYDxWOUexjjVgyA;

    public abstract void HJFh0TGMpafqLE9haL(Context context, Bundle bundle);

    public final int husNiw3snxdgZPAGJm(Context context, Intent intent) throws PendingIntent.CanceledException {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            HJFh0TGMpafqLE9haL(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    public Executor lEeR5KfoEr4xU5yHH7() {
        ExecutorService executorServiceUnconfigurableExecutorService;
        synchronized (s3fjYDxWOUexjjVgyA.class) {
            try {
                SoftReference softReference = f2237lEeR5KfoEr4xU5yHH7;
                executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    oXIAAdret8ERrYfuyf.husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7();
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new vlBaBOcZ1q1ndWVoXn.lEeR5KfoEr4xU5yHH7("firebase-iid-executor")));
                    f2237lEeR5KfoEr4xU5yHH7 = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorServiceUnconfigurableExecutorService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        lEeR5KfoEr4xU5yHH7().execute(new Runnable() { // from class: Ywqw2A0s86HeuFkDt0.OANkd3mP6AYvwbNLJM
            @Override // java.lang.Runnable
            public final void run() {
                this.f2205lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(intent, context, zIsOrderedBroadcast, pendingResultGoAsync);
            }
        });
    }

    public abstract int s3fjYDxWOUexjjVgyA(Context context, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7);

    public final /* synthetic */ void zZKhbgvUfsK4AEX3r0(Intent intent, final Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        Executor executorUnconfigurableExecutorService;
        int iHusNiw3snxdgZPAGJm;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                iHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(context, intent2);
            } else if (intent.getExtras() == null) {
                iHusNiw3snxdgZPAGJm = 500;
            } else {
                final lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new lEeR5KfoEr4xU5yHH7(intent);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (s3fjYDxWOUexjjVgyA.class) {
                    try {
                        SoftReference softReference = f2238s3fjYDxWOUexjjVgyA;
                        executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                        if (executorUnconfigurableExecutorService == null) {
                            oXIAAdret8ERrYfuyf.husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7();
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new vlBaBOcZ1q1ndWVoXn.lEeR5KfoEr4xU5yHH7("pscm-ack-executor"));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            f2238s3fjYDxWOUexjjVgyA = new SoftReference(executorUnconfigurableExecutorService);
                        }
                    } finally {
                    }
                }
                executorUnconfigurableExecutorService.execute(new Runnable() { // from class: Ywqw2A0s86HeuFkDt0.aPyGSIylzVNKPT1Bls
                    @Override // java.lang.Runnable
                    public final void run() {
                        JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8voHJFh0TGMpafqLE9haL;
                        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = leer5kfoer4xu5yhh7;
                        if (TextUtils.isEmpty(leer5kfoer4xu5yhh72.zZKhbgvUfsK4AEX3r0())) {
                            pbvgzgjwvy2ldxc8voHJFh0TGMpafqLE9haL = JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM.husNiw3snxdgZPAGJm(null);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString("google.message_id", leer5kfoer4xu5yhh72.zZKhbgvUfsK4AEX3r0());
                            Integer numHusNiw3snxdgZPAGJm = leer5kfoer4xu5yhh72.husNiw3snxdgZPAGJm();
                            if (numHusNiw3snxdgZPAGJm != null) {
                                bundle.putInt("google.product_id", numHusNiw3snxdgZPAGJm.intValue());
                            }
                            Context context2 = context;
                            bundle.putBoolean("supports_message_handled", true);
                            pbvgzgjwvy2ldxc8voHJFh0TGMpafqLE9haL = jCtUeU2YI1poCxWcjm.s3fjYDxWOUexjjVgyA(context2).HJFh0TGMpafqLE9haL(2, bundle);
                        }
                        final CountDownLatch countDownLatch2 = countDownLatch;
                        pbvgzgjwvy2ldxc8voHJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(new Executor() { // from class: Ywqw2A0s86HeuFkDt0.T9PhQIpGRhE4yZDm1C
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new JXsqbvi9UKxeF3HXpU.zZKhbgvUfsK4AEX3r0() { // from class: Ywqw2A0s86HeuFkDt0.hoXrIDAFrSwfShk8da
                            @Override // JXsqbvi9UKxeF3HXpU.zZKhbgvUfsK4AEX3r0
                            public final void lEeR5KfoEr4xU5yHH7(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
                                countDownLatch2.countDown();
                            }
                        });
                    }
                });
                int iS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(context, leer5kfoer4xu5yhh7);
                try {
                    if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                        Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e) {
                    Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e.toString()));
                }
                iHusNiw3snxdgZPAGJm = iS3fjYDxWOUexjjVgyA;
            }
            if (z && pendingResult != null) {
                pendingResult.setResultCode(iHusNiw3snxdgZPAGJm);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th;
        }
    }
}
