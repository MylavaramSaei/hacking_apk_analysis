package com.google.firebase.messaging;

import HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da;
import JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ;
import JXsqbvi9UKxeF3HXpU.IPyIQcaNa8aB7drBED;
import JXsqbvi9UKxeF3HXpU.KYHag8HRDlnO3X9zmZ;
import JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM;
import JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo;
import SF66oTSCsXABfwyWiU.DfpieXfdYs58yZAiXY;
import SF66oTSCsXABfwyWiU.GyWRxpdt1T8mEJXPoD;
import SF66oTSCsXABfwyWiU.LU0fFDMACqnfIfA1AZ;
import SF66oTSCsXABfwyWiU.ToH8yzk8U1nKT0PUfY;
import SF66oTSCsXABfwyWiU.Tu4WCh2gEwj8E4oHbP;
import SF66oTSCsXABfwyWiU.Uj8rPa1EWADtk6Oe0S;
import SF66oTSCsXABfwyWiU.XzJ1BS7H9Ilbkv4eVM;
import SF66oTSCsXABfwyWiU.aPyGSIylzVNKPT1Bls;
import SF66oTSCsXABfwyWiU.zaq8hOURtfwbcX17cG;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.lEeR5KfoEr4xU5yHH7;
import com.google.firebase.messaging.s3fjYDxWOUexjjVgyA;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm;
import tGGjvtdOhUewv2twsg.zZKhbgvUfsK4AEX3r0;
import wUKf1mNArSjssthGmN.lEeR5KfoEr4xU5yHH7;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public static s3fjYDxWOUexjjVgyA f5519T9PhQIpGRhE4yZDm1C;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public static ScheduledExecutorService f5520aPyGSIylzVNKPT1Bls;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public static final long f5521e54J8UWNHWALQNixXM = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public static xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA f5522hoXrIDAFrSwfShk8da = new xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA() { // from class: SF66oTSCsXABfwyWiU.sTkWmhpZ5b1ArQIw4K
        @Override // xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA
        public final Object get() {
            return FirebaseMessaging.W3RZ2dTDKrKpS5Mxdk();
        }
    };

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public boolean f5523Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final XzJ1BS7H9Ilbkv4eVM f5524HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final pbVGzGjWvY2LDXC8vo f5525IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final Executor f5526KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final Executor f5527TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public final Application.ActivityLifecycleCallbacks f5528Z9WdNiOsPR0y54zHW4;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final lEeR5KfoEr4xU5yHH7 f5529husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final husNiw3snxdgZPAGJm f5530lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final DfpieXfdYs58yZAiXY f5531pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Context f5532s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final com.google.firebase.messaging.lEeR5KfoEr4xU5yHH7 f5533zZKhbgvUfsK4AEX3r0;

    public class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public tGGjvtdOhUewv2twsg.s3fjYDxWOUexjjVgyA f5534HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final zZKhbgvUfsK4AEX3r0 f5536lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public boolean f5537s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public Boolean f5538zZKhbgvUfsK4AEX3r0;

        public lEeR5KfoEr4xU5yHH7(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
            this.f5536lEeR5KfoEr4xU5yHH7 = zzkhbgvufsk4aex3r0;
        }

        public synchronized boolean HJFh0TGMpafqLE9haL() {
            Boolean bool;
            try {
                s3fjYDxWOUexjjVgyA();
                bool = this.f5538zZKhbgvUfsK4AEX3r0;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f5530lEeR5KfoEr4xU5yHH7.Y43RdunnpKgpbny0lE();
        }

        public final Boolean husNiw3snxdgZPAGJm() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextAcstmh57AKoSEkEFNJ = FirebaseMessaging.this.f5530lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ();
            SharedPreferences sharedPreferences = contextAcstmh57AKoSEkEFNJ.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextAcstmh57AKoSEkEFNJ.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextAcstmh57AKoSEkEFNJ.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public synchronized void s3fjYDxWOUexjjVgyA() {
            try {
                if (this.f5537s3fjYDxWOUexjjVgyA) {
                    return;
                }
                Boolean boolHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm();
                this.f5538zZKhbgvUfsK4AEX3r0 = boolHusNiw3snxdgZPAGJm;
                if (boolHusNiw3snxdgZPAGJm == null) {
                    tGGjvtdOhUewv2twsg.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = new tGGjvtdOhUewv2twsg.s3fjYDxWOUexjjVgyA() { // from class: SF66oTSCsXABfwyWiU.ao3wqKm5CXFuvC0q47
                        @Override // tGGjvtdOhUewv2twsg.s3fjYDxWOUexjjVgyA
                        public final void lEeR5KfoEr4xU5yHH7(tGGjvtdOhUewv2twsg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
                            this.f1440lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(leer5kfoer4xu5yhh7);
                        }
                    };
                    this.f5534HJFh0TGMpafqLE9haL = s3fjydxwouexjjvgya;
                    this.f5536lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(sKw6Jz5uGcQ479KwIW.s3fjYDxWOUexjjVgyA.class, s3fjydxwouexjjvgya);
                }
                this.f5537s3fjYDxWOUexjjVgyA = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        public final /* synthetic */ void zZKhbgvUfsK4AEX3r0(tGGjvtdOhUewv2twsg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            if (HJFh0TGMpafqLE9haL()) {
                FirebaseMessaging.this.KqgKJKIWne3kz1AdHk();
            }
        }
    }

    public FirebaseMessaging(husNiw3snxdgZPAGJm husniw3snxdgzpagjm, wUKf1mNArSjssthGmN.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, DfpieXfdYs58yZAiXY dfpieXfdYs58yZAiXY, XzJ1BS7H9Ilbkv4eVM xzJ1BS7H9Ilbkv4eVM, Executor executor, Executor executor2, Executor executor3) {
        this.f5523Acstmh57AKoSEkEFNJ = false;
        f5522hoXrIDAFrSwfShk8da = s3fjydxwouexjjvgya;
        this.f5530lEeR5KfoEr4xU5yHH7 = husniw3snxdgzpagjm;
        this.f5529husNiw3snxdgZPAGJm = new lEeR5KfoEr4xU5yHH7(zzkhbgvufsk4aex3r0);
        Context contextAcstmh57AKoSEkEFNJ = husniw3snxdgzpagjm.Acstmh57AKoSEkEFNJ();
        this.f5532s3fjYDxWOUexjjVgyA = contextAcstmh57AKoSEkEFNJ;
        zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg = new zaq8hOURtfwbcX17cG();
        this.f5528Z9WdNiOsPR0y54zHW4 = zaq8hourtfwbcx17cg;
        this.f5531pbVGzGjWvY2LDXC8vo = dfpieXfdYs58yZAiXY;
        this.f5524HJFh0TGMpafqLE9haL = xzJ1BS7H9Ilbkv4eVM;
        this.f5533zZKhbgvUfsK4AEX3r0 = new com.google.firebase.messaging.lEeR5KfoEr4xU5yHH7(executor);
        this.f5526KYHag8HRDlnO3X9zmZ = executor2;
        this.f5527TCyPEKSzIyweCN5yp1 = executor3;
        Context contextAcstmh57AKoSEkEFNJ2 = husniw3snxdgzpagjm.Acstmh57AKoSEkEFNJ();
        if (contextAcstmh57AKoSEkEFNJ2 instanceof Application) {
            ((Application) contextAcstmh57AKoSEkEFNJ2).registerActivityLifecycleCallbacks(zaq8hourtfwbcx17cg);
        } else {
            Log.w("FirebaseMessaging", "Context " + contextAcstmh57AKoSEkEFNJ2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7(new lEeR5KfoEr4xU5yHH7.InterfaceC0108lEeR5KfoEr4xU5yHH7() { // from class: SF66oTSCsXABfwyWiU.Y43RdunnpKgpbny0lE
            });
        }
        executor2.execute(new Runnable() { // from class: SF66oTSCsXABfwyWiU.R9SAhYMerGybF9OAjL
            @Override // java.lang.Runnable
            public final void run() {
                this.f1396lEeR5KfoEr4xU5yHH7.jCtUeU2YI1poCxWcjm();
            }
        });
        pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8voKYHag8HRDlnO3X9zmZ = Tu4WCh2gEwj8E4oHbP.KYHag8HRDlnO3X9zmZ(this, dfpieXfdYs58yZAiXY, xzJ1BS7H9Ilbkv4eVM, contextAcstmh57AKoSEkEFNJ, aPyGSIylzVNKPT1Bls.TCyPEKSzIyweCN5yp1());
        this.f5525IPyIQcaNa8aB7drBED = pbvgzgjwvy2ldxc8voKYHag8HRDlnO3X9zmZ;
        pbvgzgjwvy2ldxc8voKYHag8HRDlnO3X9zmZ.TCyPEKSzIyweCN5yp1(executor2, new KYHag8HRDlnO3X9zmZ() { // from class: SF66oTSCsXABfwyWiU.G7AC3DWIx9i9fdanjk
            @Override // JXsqbvi9UKxeF3HXpU.KYHag8HRDlnO3X9zmZ
            public final void zZKhbgvUfsK4AEX3r0(Object obj) {
                this.f1379lEeR5KfoEr4xU5yHH7.XzJ1BS7H9Ilbkv4eVM((Tu4WCh2gEwj8E4oHbP) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: SF66oTSCsXABfwyWiU.xHA29AmDt6y96AnB3t
            @Override // java.lang.Runnable
            public final void run() {
                this.f1522lEeR5KfoEr4xU5yHH7.tXWeW0sqVddf7ZBflq();
            }
        });
    }

    public static synchronized s3fjYDxWOUexjjVgyA OANkd3mP6AYvwbNLJM(Context context) {
        try {
            if (f5519T9PhQIpGRhE4yZDm1C == null) {
                f5519T9PhQIpGRhE4yZDm1C = new s3fjYDxWOUexjjVgyA(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5519T9PhQIpGRhE4yZDm1C;
    }

    public static /* synthetic */ pbVGzGjWvY2LDXC8vo OqIo5QF00RDxUQb4qq(String str, Tu4WCh2gEwj8E4oHbP tu4WCh2gEwj8E4oHbP) {
        return tu4WCh2gEwj8E4oHbP.sTkWmhpZ5b1ArQIw4K(str);
    }

    public static ctWLFN70QQINH1kyYo.pbVGzGjWvY2LDXC8vo R9SAhYMerGybF9OAjL() {
        return (ctWLFN70QQINH1kyYo.pbVGzGjWvY2LDXC8vo) f5522hoXrIDAFrSwfShk8da.get();
    }

    public static /* synthetic */ ctWLFN70QQINH1kyYo.pbVGzGjWvY2LDXC8vo W3RZ2dTDKrKpS5Mxdk() {
        return null;
    }

    public static synchronized FirebaseMessaging aPyGSIylzVNKPT1Bls() {
        return getInstance(husNiw3snxdgZPAGJm.Z9WdNiOsPR0y54zHW4());
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) husniw3snxdgzpagjm.pbVGzGjWvY2LDXC8vo(FirebaseMessaging.class);
        hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public boolean A49QRPHynYLCBN0SqP() {
        return this.f5529husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL();
    }

    public final boolean DfpieXfdYs58yZAiXY() {
        ToH8yzk8U1nKT0PUfY.HJFh0TGMpafqLE9haL(this.f5532s3fjYDxWOUexjjVgyA);
        if (!ToH8yzk8U1nKT0PUfY.zZKhbgvUfsK4AEX3r0(this.f5532s3fjYDxWOUexjjVgyA)) {
            return false;
        }
        if (this.f5530lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(FXtjrf53D5B1cLsLFG.lEeR5KfoEr4xU5yHH7.class) != null) {
            return true;
        }
        return GyWRxpdt1T8mEJXPoD.lEeR5KfoEr4xU5yHH7() && f5522hoXrIDAFrSwfShk8da != null;
    }

    public final void G7AC3DWIx9i9fdanjk() {
        this.f5524HJFh0TGMpafqLE9haL.husNiw3snxdgZPAGJm().TCyPEKSzIyweCN5yp1(this.f5526KYHag8HRDlnO3X9zmZ, new KYHag8HRDlnO3X9zmZ() { // from class: SF66oTSCsXABfwyWiU.A49QRPHynYLCBN0SqP
            @Override // JXsqbvi9UKxeF3HXpU.KYHag8HRDlnO3X9zmZ
            public final void zZKhbgvUfsK4AEX3r0(Object obj) {
                this.f1367lEeR5KfoEr4xU5yHH7.OUd9THiLjZndMj0qdF((Ywqw2A0s86HeuFkDt0.lEeR5KfoEr4xU5yHH7) obj);
            }
        });
    }

    public synchronized void GyWRxpdt1T8mEJXPoD(boolean z) {
        this.f5523Acstmh57AKoSEkEFNJ = z;
    }

    public final void KqgKJKIWne3kz1AdHk() {
        if (lLKzvdU99Iw80uVD5I(Y43RdunnpKgpbny0lE())) {
            e2F9F6h8YJxTHwLCa0();
        }
    }

    public final void LIMtzhnLwQyigzK0KO(String str) {
        if ("[DEFAULT]".equals(this.f5530lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f5530lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new SF66oTSCsXABfwyWiU.hoXrIDAFrSwfShk8da(this.f5532s3fjYDxWOUexjjVgyA).Z9WdNiOsPR0y54zHW4(intent);
        }
    }

    public final /* synthetic */ void OUd9THiLjZndMj0qdF(Ywqw2A0s86HeuFkDt0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        if (leer5kfoer4xu5yhh7 != null) {
            GyWRxpdt1T8mEJXPoD.VItLRw50eXTZeEfGl0(leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL());
            G7AC3DWIx9i9fdanjk();
        }
    }

    public pbVGzGjWvY2LDXC8vo PPkm9uUfOJHHYveeLT(final String str) {
        return this.f5525IPyIQcaNa8aB7drBED.OANkd3mP6AYvwbNLJM(new IPyIQcaNa8aB7drBED() { // from class: SF66oTSCsXABfwyWiU.WWC27LAMFqFFBzfbNw
            @Override // JXsqbvi9UKxeF3HXpU.IPyIQcaNa8aB7drBED
            public final JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo lEeR5KfoEr4xU5yHH7(Object obj) {
                return FirebaseMessaging.OqIo5QF00RDxUQb4qq(str, (Tu4WCh2gEwj8E4oHbP) obj);
            }
        });
    }

    public void T9PhQIpGRhE4yZDm1C(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f5520aPyGSIylzVNKPT1Bls == null) {
                    f5520aPyGSIylzVNKPT1Bls = new ScheduledThreadPoolExecutor(1, new vlBaBOcZ1q1ndWVoXn.lEeR5KfoEr4xU5yHH7("TAG"));
                }
                f5520aPyGSIylzVNKPT1Bls.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ pbVGzGjWvY2LDXC8vo THTDvPxsHqMeGb512f(final String str, final s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        return this.f5524HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ().zaq8hOURtfwbcX17cG(this.f5527TCyPEKSzIyweCN5yp1, new IPyIQcaNa8aB7drBED() { // from class: SF66oTSCsXABfwyWiU.THTDvPxsHqMeGb512f
            @Override // JXsqbvi9UKxeF3HXpU.IPyIQcaNa8aB7drBED
            public final JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo lEeR5KfoEr4xU5yHH7(Object obj) {
                return this.f1400lEeR5KfoEr4xU5yHH7.WWC27LAMFqFFBzfbNw(str, leer5kfoer4xu5yhh7, (String) obj);
            }
        });
    }

    public boolean VItLRw50eXTZeEfGl0() {
        return this.f5531pbVGzGjWvY2LDXC8vo.TCyPEKSzIyweCN5yp1();
    }

    public final /* synthetic */ pbVGzGjWvY2LDXC8vo WWC27LAMFqFFBzfbNw(String str, s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, String str2) {
        OANkd3mP6AYvwbNLJM(this.f5532s3fjYDxWOUexjjVgyA).KYHag8HRDlnO3X9zmZ(zaq8hOURtfwbcX17cG(), str, str2, this.f5531pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7());
        if (leer5kfoer4xu5yhh7 == null || !str2.equals(leer5kfoer4xu5yhh7.f5546lEeR5KfoEr4xU5yHH7)) {
            LIMtzhnLwQyigzK0KO(str2);
        }
        return e54J8UWNHWALQNixXM.husNiw3snxdgZPAGJm(str2);
    }

    public final /* synthetic */ void XzJ1BS7H9Ilbkv4eVM(Tu4WCh2gEwj8E4oHbP tu4WCh2gEwj8E4oHbP) {
        if (A49QRPHynYLCBN0SqP()) {
            tu4WCh2gEwj8E4oHbP.zaq8hOURtfwbcX17cG();
        }
    }

    public s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7 Y43RdunnpKgpbny0lE() {
        return OANkd3mP6AYvwbNLJM(this.f5532s3fjYDxWOUexjjVgyA).zZKhbgvUfsK4AEX3r0(zaq8hOURtfwbcX17cG(), DfpieXfdYs58yZAiXY.HJFh0TGMpafqLE9haL(this.f5530lEeR5KfoEr4xU5yHH7));
    }

    public synchronized void aAp6BD79BhftLCnuvf(long j) {
        T9PhQIpGRhE4yZDm1C(new Uj8rPa1EWADtk6Oe0S(this, Math.min(Math.max(30L, 2 * j), f5521e54J8UWNHWALQNixXM)), j);
        this.f5523Acstmh57AKoSEkEFNJ = true;
    }

    public final /* synthetic */ void ao3wqKm5CXFuvC0q47(Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ) {
        try {
            acstmh57AKoSEkEFNJ.HJFh0TGMpafqLE9haL(e54J8UWNHWALQNixXM());
        } catch (Exception e) {
            acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA(e);
        }
    }

    public final synchronized void e2F9F6h8YJxTHwLCa0() {
        if (!this.f5523Acstmh57AKoSEkEFNJ) {
            aAp6BD79BhftLCnuvf(0L);
        }
    }

    public String e54J8UWNHWALQNixXM() throws IOException {
        final s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7Y43RdunnpKgpbny0lE = Y43RdunnpKgpbny0lE();
        if (!lLKzvdU99Iw80uVD5I(leer5kfoer4xu5yhh7Y43RdunnpKgpbny0lE)) {
            return leer5kfoer4xu5yhh7Y43RdunnpKgpbny0lE.f5546lEeR5KfoEr4xU5yHH7;
        }
        final String strHJFh0TGMpafqLE9haL = DfpieXfdYs58yZAiXY.HJFh0TGMpafqLE9haL(this.f5530lEeR5KfoEr4xU5yHH7);
        try {
            return (String) e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7(this.f5533zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA(strHJFh0TGMpafqLE9haL, new lEeR5KfoEr4xU5yHH7.InterfaceC0084lEeR5KfoEr4xU5yHH7() { // from class: SF66oTSCsXABfwyWiU.VItLRw50eXTZeEfGl0
                @Override // com.google.firebase.messaging.lEeR5KfoEr4xU5yHH7.InterfaceC0084lEeR5KfoEr4xU5yHH7
                public final JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo lEeR5KfoEr4xU5yHH7() {
                    return this.f1417lEeR5KfoEr4xU5yHH7.THTDvPxsHqMeGb512f(strHJFh0TGMpafqLE9haL, leer5kfoer4xu5yhh7Y43RdunnpKgpbny0lE);
                }
            }));
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public Context hoXrIDAFrSwfShk8da() {
        return this.f5532s3fjYDxWOUexjjVgyA;
    }

    public final /* synthetic */ void jCtUeU2YI1poCxWcjm() {
        if (A49QRPHynYLCBN0SqP()) {
            KqgKJKIWne3kz1AdHk();
        }
    }

    public boolean lLKzvdU99Iw80uVD5I(s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        return leer5kfoer4xu5yhh7 == null || leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA(this.f5531pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7());
    }

    public pbVGzGjWvY2LDXC8vo sTkWmhpZ5b1ArQIw4K() {
        final Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ = new Acstmh57AKoSEkEFNJ();
        this.f5526KYHag8HRDlnO3X9zmZ.execute(new Runnable() { // from class: SF66oTSCsXABfwyWiU.LIMtzhnLwQyigzK0KO
            @Override // java.lang.Runnable
            public final void run() {
                this.f1388lEeR5KfoEr4xU5yHH7.ao3wqKm5CXFuvC0q47(acstmh57AKoSEkEFNJ);
            }
        });
        return acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7();
    }

    /* renamed from: xHA29AmDt6y96AnB3t, reason: merged with bridge method [inline-methods] */
    public final void tXWeW0sqVddf7ZBflq() {
        ToH8yzk8U1nKT0PUfY.HJFh0TGMpafqLE9haL(this.f5532s3fjYDxWOUexjjVgyA);
        LU0fFDMACqnfIfA1AZ.TCyPEKSzIyweCN5yp1(this.f5532s3fjYDxWOUexjjVgyA, this.f5524HJFh0TGMpafqLE9haL, DfpieXfdYs58yZAiXY());
        if (DfpieXfdYs58yZAiXY()) {
            G7AC3DWIx9i9fdanjk();
        }
    }

    public final String zaq8hOURtfwbcX17cG() {
        return "[DEFAULT]".equals(this.f5530lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM()) ? "" : this.f5530lEeR5KfoEr4xU5yHH7.hoXrIDAFrSwfShk8da();
    }

    public FirebaseMessaging(husNiw3snxdgZPAGJm husniw3snxdgzpagjm, wUKf1mNArSjssthGmN.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2, w859GrF8FXGM1qrYSH.IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED, xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya3, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        this(husniw3snxdgzpagjm, leer5kfoer4xu5yhh7, s3fjydxwouexjjvgya, s3fjydxwouexjjvgya2, iPyIQcaNa8aB7drBED, s3fjydxwouexjjvgya3, zzkhbgvufsk4aex3r0, new DfpieXfdYs58yZAiXY(husniw3snxdgzpagjm.Acstmh57AKoSEkEFNJ()));
    }

    public FirebaseMessaging(husNiw3snxdgZPAGJm husniw3snxdgzpagjm, wUKf1mNArSjssthGmN.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2, w859GrF8FXGM1qrYSH.IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED, xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya3, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, DfpieXfdYs58yZAiXY dfpieXfdYs58yZAiXY) {
        this(husniw3snxdgzpagjm, leer5kfoer4xu5yhh7, s3fjydxwouexjjvgya3, zzkhbgvufsk4aex3r0, dfpieXfdYs58yZAiXY, new XzJ1BS7H9Ilbkv4eVM(husniw3snxdgzpagjm, dfpieXfdYs58yZAiXY, s3fjydxwouexjjvgya, s3fjydxwouexjjvgya2, iPyIQcaNa8aB7drBED), aPyGSIylzVNKPT1Bls.KYHag8HRDlnO3X9zmZ(), aPyGSIylzVNKPT1Bls.HJFh0TGMpafqLE9haL(), aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA());
    }
}
