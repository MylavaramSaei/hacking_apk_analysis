package Ywqw2A0s86HeuFkDt0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class HJFh0TGMpafqLE9haL {

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public static int f2189IPyIQcaNa8aB7drBED;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public static PendingIntent f2191pbVGzGjWvY2LDXC8vo;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final XzJ1BS7H9Ilbkv4eVM f2192HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public Messenger f2193KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public e54J8UWNHWALQNixXM f2194TCyPEKSzIyweCN5yp1;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Context f2197s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final ScheduledExecutorService f2198zZKhbgvUfsK4AEX3r0;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public static final Executor f2188Acstmh57AKoSEkEFNJ = new Executor() { // from class: Ywqw2A0s86HeuFkDt0.W3RZ2dTDKrKpS5Mxdk
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public static final Pattern f2190Z9WdNiOsPR0y54zHW4 = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1 f2196lEeR5KfoEr4xU5yHH7 = new Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1();

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final Messenger f2195husNiw3snxdgZPAGJm = new Messenger(new pbVGzGjWvY2LDXC8vo(this, Looper.getMainLooper()));

    public HJFh0TGMpafqLE9haL(Context context) {
        this.f2197s3fjYDxWOUexjjVgyA = context;
        this.f2192HJFh0TGMpafqLE9haL = new XzJ1BS7H9Ilbkv4eVM(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f2198zZKhbgvUfsK4AEX3r0 = scheduledThreadPoolExecutor;
    }

    public static synchronized String Acstmh57AKoSEkEFNJ() {
        int i;
        i = f2189IPyIQcaNa8aB7drBED;
        f2189IPyIQcaNa8aB7drBED = i + 1;
        return Integer.toString(i);
    }

    public static boolean T9PhQIpGRhE4yZDm1C(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public static /* bridge */ /* synthetic */ void TCyPEKSzIyweCN5yp1(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new Z9WdNiOsPR0y54zHW4());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof e54J8UWNHWALQNixXM) {
                        hJFh0TGMpafqLE9haL.f2194TCyPEKSzIyweCN5yp1 = (e54J8UWNHWALQNixXM) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        hJFh0TGMpafqLE9haL.f2193KYHag8HRDlnO3X9zmZ = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f2190Z9WdNiOsPR0y54zHW4.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        hJFh0TGMpafqLE9haL.e54J8UWNHWALQNixXM(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (hJFh0TGMpafqLE9haL.f2196lEeR5KfoEr4xU5yHH7) {
                        for (int i = 0; i < hJFh0TGMpafqLE9haL.f2196lEeR5KfoEr4xU5yHH7.size(); i++) {
                            try {
                                hJFh0TGMpafqLE9haL.e54J8UWNHWALQNixXM((String) hJFh0TGMpafqLE9haL.f2196lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(i), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                hJFh0TGMpafqLE9haL.e54J8UWNHWALQNixXM(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    public static synchronized void Z9WdNiOsPR0y54zHW4(Context context, Intent intent) {
        try {
            if (f2191pbVGzGjWvY2LDXC8vo == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f2191pbVGzGjWvY2LDXC8vo = PendingIntent.getBroadcast(context, 0, intent2, oXIAAdret8ERrYfuyf.lEeR5KfoEr4xU5yHH7.f6549lEeR5KfoEr4xU5yHH7);
            }
            intent.putExtra("app", f2191pbVGzGjWvY2LDXC8vo);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo husNiw3snxdgZPAGJm(Bundle bundle) {
        return T9PhQIpGRhE4yZDm1C(bundle) ? JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM.husNiw3snxdgZPAGJm(null) : JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM.husNiw3snxdgZPAGJm(bundle);
    }

    public JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo HJFh0TGMpafqLE9haL(final Bundle bundle) {
        return this.f2192HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7() < 12000000 ? this.f2192HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA() != 0 ? pbVGzGjWvY2LDXC8vo(bundle).pbVGzGjWvY2LDXC8vo(f2188Acstmh57AKoSEkEFNJ, new JXsqbvi9UKxeF3HXpU.lEeR5KfoEr4xU5yHH7() { // from class: Ywqw2A0s86HeuFkDt0.OqIo5QF00RDxUQb4qq
            @Override // JXsqbvi9UKxeF3HXpU.lEeR5KfoEr4xU5yHH7
            public final Object lEeR5KfoEr4xU5yHH7(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
                return this.f2208lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(bundle, pbvgzgjwvy2ldxc8vo);
            }
        }) : JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM.zZKhbgvUfsK4AEX3r0(new IOException("MISSING_INSTANCEID_SERVICE")) : jCtUeU2YI1poCxWcjm.s3fjYDxWOUexjjVgyA(this.f2197s3fjYDxWOUexjjVgyA).zZKhbgvUfsK4AEX3r0(1, bundle).IPyIQcaNa8aB7drBED(f2188Acstmh57AKoSEkEFNJ, new JXsqbvi9UKxeF3HXpU.lEeR5KfoEr4xU5yHH7() { // from class: Ywqw2A0s86HeuFkDt0.husNiw3snxdgZPAGJm
            @Override // JXsqbvi9UKxeF3HXpU.lEeR5KfoEr4xU5yHH7
            public final Object lEeR5KfoEr4xU5yHH7(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) throws IOException {
                if (pbvgzgjwvy2ldxc8vo.aPyGSIylzVNKPT1Bls()) {
                    return (Bundle) pbvgzgjwvy2ldxc8vo.Z9WdNiOsPR0y54zHW4();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(pbvgzgjwvy2ldxc8vo.Acstmh57AKoSEkEFNJ())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", pbvgzgjwvy2ldxc8vo.Acstmh57AKoSEkEFNJ());
            }
        });
    }

    public final /* synthetic */ void IPyIQcaNa8aB7drBED(String str, ScheduledFuture scheduledFuture, JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        synchronized (this.f2196lEeR5KfoEr4xU5yHH7) {
            this.f2196lEeR5KfoEr4xU5yHH7.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public final /* synthetic */ JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo KYHag8HRDlnO3X9zmZ(Bundle bundle, JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        return (pbvgzgjwvy2ldxc8vo.aPyGSIylzVNKPT1Bls() && T9PhQIpGRhE4yZDm1C((Bundle) pbvgzgjwvy2ldxc8vo.Z9WdNiOsPR0y54zHW4())) ? pbVGzGjWvY2LDXC8vo(bundle).zaq8hOURtfwbcX17cG(f2188Acstmh57AKoSEkEFNJ, new JXsqbvi9UKxeF3HXpU.IPyIQcaNa8aB7drBED() { // from class: Ywqw2A0s86HeuFkDt0.tXWeW0sqVddf7ZBflq
            @Override // JXsqbvi9UKxeF3HXpU.IPyIQcaNa8aB7drBED
            public final JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo lEeR5KfoEr4xU5yHH7(Object obj) {
                return HJFh0TGMpafqLE9haL.husNiw3snxdgZPAGJm((Bundle) obj);
            }
        }) : pbvgzgjwvy2ldxc8vo;
    }

    public final void e54J8UWNHWALQNixXM(String str, Bundle bundle) {
        synchronized (this.f2196lEeR5KfoEr4xU5yHH7) {
            try {
                JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ = (JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ) this.f2196lEeR5KfoEr4xU5yHH7.remove(str);
                if (acstmh57AKoSEkEFNJ != null) {
                    acstmh57AKoSEkEFNJ.HJFh0TGMpafqLE9haL(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo lEeR5KfoEr4xU5yHH7() {
        return this.f2192HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7() >= 241100000 ? jCtUeU2YI1poCxWcjm.s3fjYDxWOUexjjVgyA(this.f2197s3fjYDxWOUexjjVgyA).zZKhbgvUfsK4AEX3r0(5, Bundle.EMPTY).IPyIQcaNa8aB7drBED(f2188Acstmh57AKoSEkEFNJ, new JXsqbvi9UKxeF3HXpU.lEeR5KfoEr4xU5yHH7() { // from class: Ywqw2A0s86HeuFkDt0.KYHag8HRDlnO3X9zmZ
            @Override // JXsqbvi9UKxeF3HXpU.lEeR5KfoEr4xU5yHH7
            public final Object lEeR5KfoEr4xU5yHH7(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
                Intent intent = (Intent) ((Bundle) pbvgzgjwvy2ldxc8vo.Z9WdNiOsPR0y54zHW4()).getParcelable("notification_data");
                if (intent != null) {
                    return new lEeR5KfoEr4xU5yHH7(intent);
                }
                return null;
            }
        }) : JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM.zZKhbgvUfsK4AEX3r0(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public final JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbVGzGjWvY2LDXC8vo(Bundle bundle) throws RemoteException {
        final String strAcstmh57AKoSEkEFNJ = Acstmh57AKoSEkEFNJ();
        final JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ = new JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ();
        synchronized (this.f2196lEeR5KfoEr4xU5yHH7) {
            this.f2196lEeR5KfoEr4xU5yHH7.put(strAcstmh57AKoSEkEFNJ, acstmh57AKoSEkEFNJ);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.f2192HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        Z9WdNiOsPR0y54zHW4(this.f2197s3fjYDxWOUexjjVgyA, intent);
        intent.putExtra("kid", "|ID|" + strAcstmh57AKoSEkEFNJ + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f2195husNiw3snxdgZPAGJm);
        if (this.f2193KYHag8HRDlnO3X9zmZ != null || this.f2194TCyPEKSzIyweCN5yp1 != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f2193KYHag8HRDlnO3X9zmZ;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f2194TCyPEKSzIyweCN5yp1.zZKhbgvUfsK4AEX3r0(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
        } else if (this.f2192HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA() == 2) {
            this.f2197s3fjYDxWOUexjjVgyA.sendBroadcast(intent);
        } else {
            this.f2197s3fjYDxWOUexjjVgyA.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f2198zZKhbgvUfsK4AEX3r0.schedule(new Runnable() { // from class: Ywqw2A0s86HeuFkDt0.TCyPEKSzIyweCN5yp1
            @Override // java.lang.Runnable
            public final void run() {
                if (acstmh57AKoSEkEFNJ.zZKhbgvUfsK4AEX3r0(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7().HJFh0TGMpafqLE9haL(f2188Acstmh57AKoSEkEFNJ, new JXsqbvi9UKxeF3HXpU.zZKhbgvUfsK4AEX3r0() { // from class: Ywqw2A0s86HeuFkDt0.IPyIQcaNa8aB7drBED
            @Override // JXsqbvi9UKxeF3HXpU.zZKhbgvUfsK4AEX3r0
            public final void lEeR5KfoEr4xU5yHH7(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
                this.f2200lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(strAcstmh57AKoSEkEFNJ, scheduledFutureSchedule, pbvgzgjwvy2ldxc8vo);
            }
        });
        return acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7();
    }

    public JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo s3fjYDxWOUexjjVgyA(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        if (this.f2192HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7() < 233700000) {
            return JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM.zZKhbgvUfsK4AEX3r0(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", leer5kfoer4xu5yhh7.zZKhbgvUfsK4AEX3r0());
        Integer numHusNiw3snxdgZPAGJm = leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm();
        if (numHusNiw3snxdgZPAGJm != null) {
            bundle.putInt("google.product_id", numHusNiw3snxdgZPAGJm.intValue());
        }
        return jCtUeU2YI1poCxWcjm.s3fjYDxWOUexjjVgyA(this.f2197s3fjYDxWOUexjjVgyA).HJFh0TGMpafqLE9haL(3, bundle);
    }

    public JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo zZKhbgvUfsK4AEX3r0(boolean z) {
        if (this.f2192HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7() < 241100000) {
            return JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM.zZKhbgvUfsK4AEX3r0(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z);
        return jCtUeU2YI1poCxWcjm.s3fjYDxWOUexjjVgyA(this.f2197s3fjYDxWOUexjjVgyA).HJFh0TGMpafqLE9haL(4, bundle);
    }
}
