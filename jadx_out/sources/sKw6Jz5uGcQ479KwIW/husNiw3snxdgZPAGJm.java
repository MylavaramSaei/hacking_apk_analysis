package sKw6Jz5uGcQ479KwIW;

import HR5vAalpgOKVm2T0Gq.T9PhQIpGRhE4yZDm1C;
import TZ2u8Z18RnXun7OSW0.ao3wqKm5CXFuvC0q47;
import aRQ2M7vtRaPDEyvpdv.HJFh0TGMpafqLE9haL;
import aRQ2M7vtRaPDEyvpdv.cT5Hs3CQpLK8NvlZAw;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import zWzrlx9vIdLp7FoEMD.LIMtzhnLwQyigzK0KO;
import zWzrlx9vIdLp7FoEMD.hoXrIDAFrSwfShk8da;

/* loaded from: classes.dex */
public class husNiw3snxdgZPAGJm {

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public static final Object f6630Z9WdNiOsPR0y54zHW4 = new Object();

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public static final Map f6631e54J8UWNHWALQNixXM = new Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final Z9WdNiOsPR0y54zHW4 f6633HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA f6634IPyIQcaNa8aB7drBED;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final LIMtzhnLwQyigzK0KO f6636TCyPEKSzIyweCN5yp1;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f6638lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final String f6640s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final hoXrIDAFrSwfShk8da f6641zZKhbgvUfsK4AEX3r0;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final AtomicBoolean f6637husNiw3snxdgZPAGJm = new AtomicBoolean(false);

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final AtomicBoolean f6635KYHag8HRDlnO3X9zmZ = new AtomicBoolean();

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final List f6639pbVGzGjWvY2LDXC8vo = new CopyOnWriteArrayList();

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final List f6632Acstmh57AKoSEkEFNJ = new CopyOnWriteArrayList();

    public static class HJFh0TGMpafqLE9haL extends BroadcastReceiver {

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public static AtomicReference f6642s3fjYDxWOUexjjVgyA = new AtomicReference();

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Context f6643lEeR5KfoEr4xU5yHH7;

        public HJFh0TGMpafqLE9haL(Context context) {
            this.f6643lEeR5KfoEr4xU5yHH7 = context;
        }

        public static void s3fjYDxWOUexjjVgyA(Context context) {
            if (f6642s3fjYDxWOUexjjVgyA.get() == null) {
                HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = new HJFh0TGMpafqLE9haL(context);
                if (cT5Hs3CQpLK8NvlZAw.lEeR5KfoEr4xU5yHH7(f6642s3fjYDxWOUexjjVgyA, null, hJFh0TGMpafqLE9haL)) {
                    context.registerReceiver(hJFh0TGMpafqLE9haL, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void HJFh0TGMpafqLE9haL() {
            this.f6643lEeR5KfoEr4xU5yHH7.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (husNiw3snxdgZPAGJm.f6630Z9WdNiOsPR0y54zHW4) {
                try {
                    Iterator it = husNiw3snxdgZPAGJm.f6631e54J8UWNHWALQNixXM.values().iterator();
                    while (it.hasNext()) {
                        ((husNiw3snxdgZPAGJm) it.next()).aPyGSIylzVNKPT1Bls();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            HJFh0TGMpafqLE9haL();
        }
    }

    public interface lEeR5KfoEr4xU5yHH7 {
        void lEeR5KfoEr4xU5yHH7(boolean z);
    }

    public static class s3fjYDxWOUexjjVgyA implements HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public static AtomicReference f6644lEeR5KfoEr4xU5yHH7 = new AtomicReference();

        public static void HJFh0TGMpafqLE9haL(Context context) {
            if (fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f6644lEeR5KfoEr4xU5yHH7.get() == null) {
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = new s3fjYDxWOUexjjVgyA();
                    if (cT5Hs3CQpLK8NvlZAw.lEeR5KfoEr4xU5yHH7(f6644lEeR5KfoEr4xU5yHH7, null, s3fjydxwouexjjvgya)) {
                        aRQ2M7vtRaPDEyvpdv.HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(application);
                        aRQ2M7vtRaPDEyvpdv.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA().lEeR5KfoEr4xU5yHH7(s3fjydxwouexjjvgya);
                    }
                }
            }
        }

        @Override // aRQ2M7vtRaPDEyvpdv.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7
        public void lEeR5KfoEr4xU5yHH7(boolean z) {
            synchronized (husNiw3snxdgZPAGJm.f6630Z9WdNiOsPR0y54zHW4) {
                try {
                    Iterator it = new ArrayList(husNiw3snxdgZPAGJm.f6631e54J8UWNHWALQNixXM.values()).iterator();
                    while (it.hasNext()) {
                        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) it.next();
                        if (husniw3snxdgzpagjm.f6637husNiw3snxdgZPAGJm.get()) {
                            husniw3snxdgzpagjm.A49QRPHynYLCBN0SqP(z);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public husNiw3snxdgZPAGJm(final Context context, String str, Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
        this.f6638lEeR5KfoEr4xU5yHH7 = (Context) HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(context);
        this.f6640s3fjYDxWOUexjjVgyA = HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.zZKhbgvUfsK4AEX3r0(str);
        this.f6633HJFh0TGMpafqLE9haL = (Z9WdNiOsPR0y54zHW4) HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(z9WdNiOsPR0y54zHW4);
        e54J8UWNHWALQNixXM e54j8uwnhwalqnixxmS3fjYDxWOUexjjVgyA = FirebaseInitProvider.s3fjYDxWOUexjjVgyA();
        yuvys90eVmNOCmVGXw.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA("Firebase");
        yuvys90eVmNOCmVGXw.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA("ComponentDiscovery");
        List listS3fjYDxWOUexjjVgyA = zWzrlx9vIdLp7FoEMD.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL(context, ComponentDiscoveryService.class).s3fjYDxWOUexjjVgyA();
        yuvys90eVmNOCmVGXw.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7();
        yuvys90eVmNOCmVGXw.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA("Runtime");
        hoXrIDAFrSwfShk8da.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaTCyPEKSzIyweCN5yp1 = hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(ao3wqKm5CXFuvC0q47.INSTANCE).zZKhbgvUfsK4AEX3r0(listS3fjYDxWOUexjjVgyA).HJFh0TGMpafqLE9haL(new FirebaseCommonRegistrar()).HJFh0TGMpafqLE9haL(new ExecutorsRegistrar()).s3fjYDxWOUexjjVgyA(zWzrlx9vIdLp7FoEMD.HJFh0TGMpafqLE9haL.Y43RdunnpKgpbny0lE(context, Context.class, new Class[0])).s3fjYDxWOUexjjVgyA(zWzrlx9vIdLp7FoEMD.HJFh0TGMpafqLE9haL.Y43RdunnpKgpbny0lE(this, husNiw3snxdgZPAGJm.class, new Class[0])).s3fjYDxWOUexjjVgyA(zWzrlx9vIdLp7FoEMD.HJFh0TGMpafqLE9haL.Y43RdunnpKgpbny0lE(z9WdNiOsPR0y54zHW4, Z9WdNiOsPR0y54zHW4.class, new Class[0])).TCyPEKSzIyweCN5yp1(new yuvys90eVmNOCmVGXw.s3fjYDxWOUexjjVgyA());
        if (OUd9THiLjZndMj0qdF.TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7(context) && FirebaseInitProvider.HJFh0TGMpafqLE9haL()) {
            s3fjydxwouexjjvgyaTCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA(zWzrlx9vIdLp7FoEMD.HJFh0TGMpafqLE9haL.Y43RdunnpKgpbny0lE(e54j8uwnhwalqnixxmS3fjYDxWOUexjjVgyA, e54J8UWNHWALQNixXM.class, new Class[0]));
        }
        hoXrIDAFrSwfShk8da hoxridafrswfshk8daHusNiw3snxdgZPAGJm = s3fjydxwouexjjvgyaTCyPEKSzIyweCN5yp1.husNiw3snxdgZPAGJm();
        this.f6641zZKhbgvUfsK4AEX3r0 = hoxridafrswfshk8daHusNiw3snxdgZPAGJm;
        yuvys90eVmNOCmVGXw.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7();
        this.f6636TCyPEKSzIyweCN5yp1 = new LIMtzhnLwQyigzK0KO(new xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA() { // from class: sKw6Jz5uGcQ479KwIW.HJFh0TGMpafqLE9haL
            @Override // xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA
            public final Object get() {
                return this.f6614lEeR5KfoEr4xU5yHH7.G7AC3DWIx9i9fdanjk(context);
            }
        });
        this.f6634IPyIQcaNa8aB7drBED = hoxridafrswfshk8daHusNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL(zQjb36M22TWHJmh54i.KYHag8HRDlnO3X9zmZ.class);
        TCyPEKSzIyweCN5yp1(new lEeR5KfoEr4xU5yHH7() { // from class: sKw6Jz5uGcQ479KwIW.zZKhbgvUfsK4AEX3r0
            @Override // sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7
            public final void lEeR5KfoEr4xU5yHH7(boolean z) {
                this.f6648lEeR5KfoEr4xU5yHH7.xHA29AmDt6y96AnB3t(z);
            }
        });
        yuvys90eVmNOCmVGXw.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7();
    }

    public static String LIMtzhnLwQyigzK0KO(String str) {
        return str.trim();
    }

    public static husNiw3snxdgZPAGJm OANkd3mP6AYvwbNLJM(Context context) {
        synchronized (f6630Z9WdNiOsPR0y54zHW4) {
            try {
                if (f6631e54J8UWNHWALQNixXM.containsKey("[DEFAULT]")) {
                    return Z9WdNiOsPR0y54zHW4();
                }
                Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4LEeR5KfoEr4xU5yHH7 = Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7(context);
                if (z9WdNiOsPR0y54zHW4LEeR5KfoEr4xU5yHH7 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return zaq8hOURtfwbcX17cG(context, z9WdNiOsPR0y54zHW4LEeR5KfoEr4xU5yHH7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static husNiw3snxdgZPAGJm Z9WdNiOsPR0y54zHW4() {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm;
        synchronized (f6630Z9WdNiOsPR0y54zHW4) {
            try {
                husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) f6631e54J8UWNHWALQNixXM.get("[DEFAULT]");
                if (husniw3snxdgzpagjm == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + fDXXEWvhMVO3O8mnuS.Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((zQjb36M22TWHJmh54i.KYHag8HRDlnO3X9zmZ) husniw3snxdgzpagjm.f6634IPyIQcaNa8aB7drBED.get()).e54J8UWNHWALQNixXM();
            } catch (Throwable th) {
                throw th;
            }
        }
        return husniw3snxdgzpagjm;
    }

    public static husNiw3snxdgZPAGJm sTkWmhpZ5b1ArQIw4K(Context context, Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, String str) {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm;
        s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(context);
        String strLIMtzhnLwQyigzK0KO = LIMtzhnLwQyigzK0KO(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f6630Z9WdNiOsPR0y54zHW4) {
            Map map = f6631e54J8UWNHWALQNixXM;
            HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.T9PhQIpGRhE4yZDm1C(!map.containsKey(strLIMtzhnLwQyigzK0KO), "FirebaseApp name " + strLIMtzhnLwQyigzK0KO + " already exists!");
            HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(context, "Application context cannot be null.");
            husniw3snxdgzpagjm = new husNiw3snxdgZPAGJm(context, strLIMtzhnLwQyigzK0KO, z9WdNiOsPR0y54zHW4);
            map.put(strLIMtzhnLwQyigzK0KO, husniw3snxdgzpagjm);
        }
        husniw3snxdgzpagjm.aPyGSIylzVNKPT1Bls();
        return husniw3snxdgzpagjm;
    }

    public static husNiw3snxdgZPAGJm zaq8hOURtfwbcX17cG(Context context, Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
        return sTkWmhpZ5b1ArQIw4K(context, z9WdNiOsPR0y54zHW4, "[DEFAULT]");
    }

    public final void A49QRPHynYLCBN0SqP(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f6639pbVGzGjWvY2LDXC8vo.iterator();
        while (it.hasNext()) {
            ((lEeR5KfoEr4xU5yHH7) it.next()).lEeR5KfoEr4xU5yHH7(z);
        }
    }

    public Context Acstmh57AKoSEkEFNJ() {
        IPyIQcaNa8aB7drBED();
        return this.f6638lEeR5KfoEr4xU5yHH7;
    }

    public final /* synthetic */ D3qEI0j1Bvj6FYKAih.lEeR5KfoEr4xU5yHH7 G7AC3DWIx9i9fdanjk(Context context) {
        return new D3qEI0j1Bvj6FYKAih.lEeR5KfoEr4xU5yHH7(context, hoXrIDAFrSwfShk8da(), (tGGjvtdOhUewv2twsg.HJFh0TGMpafqLE9haL) this.f6641zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(tGGjvtdOhUewv2twsg.HJFh0TGMpafqLE9haL.class));
    }

    public final void IPyIQcaNa8aB7drBED() {
        HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.T9PhQIpGRhE4yZDm1C(!this.f6635KYHag8HRDlnO3X9zmZ.get(), "FirebaseApp was deleted");
    }

    public boolean R9SAhYMerGybF9OAjL() {
        return "[DEFAULT]".equals(e54J8UWNHWALQNixXM());
    }

    public Z9WdNiOsPR0y54zHW4 T9PhQIpGRhE4yZDm1C() {
        IPyIQcaNa8aB7drBED();
        return this.f6633HJFh0TGMpafqLE9haL;
    }

    public void TCyPEKSzIyweCN5yp1(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        IPyIQcaNa8aB7drBED();
        if (this.f6637husNiw3snxdgZPAGJm.get() && aRQ2M7vtRaPDEyvpdv.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA().zZKhbgvUfsK4AEX3r0()) {
            leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7(true);
        }
        this.f6639pbVGzGjWvY2LDXC8vo.add(leer5kfoer4xu5yhh7);
    }

    public boolean Y43RdunnpKgpbny0lE() {
        IPyIQcaNa8aB7drBED();
        return ((D3qEI0j1Bvj6FYKAih.lEeR5KfoEr4xU5yHH7) this.f6636TCyPEKSzIyweCN5yp1.get()).s3fjYDxWOUexjjVgyA();
    }

    public final void aPyGSIylzVNKPT1Bls() {
        if (!OUd9THiLjZndMj0qdF.TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7(this.f6638lEeR5KfoEr4xU5yHH7)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + e54J8UWNHWALQNixXM());
            HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this.f6638lEeR5KfoEr4xU5yHH7);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + e54J8UWNHWALQNixXM());
        this.f6641zZKhbgvUfsK4AEX3r0.hoXrIDAFrSwfShk8da(R9SAhYMerGybF9OAjL());
        ((zQjb36M22TWHJmh54i.KYHag8HRDlnO3X9zmZ) this.f6634IPyIQcaNa8aB7drBED.get()).e54J8UWNHWALQNixXM();
    }

    public String e54J8UWNHWALQNixXM() {
        IPyIQcaNa8aB7drBED();
        return this.f6640s3fjYDxWOUexjjVgyA;
    }

    public boolean equals(Object obj) {
        if (obj instanceof husNiw3snxdgZPAGJm) {
            return this.f6640s3fjYDxWOUexjjVgyA.equals(((husNiw3snxdgZPAGJm) obj).e54J8UWNHWALQNixXM());
        }
        return false;
    }

    public int hashCode() {
        return this.f6640s3fjYDxWOUexjjVgyA.hashCode();
    }

    public String hoXrIDAFrSwfShk8da() {
        return fDXXEWvhMVO3O8mnuS.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(e54J8UWNHWALQNixXM().getBytes(Charset.defaultCharset())) + "+" + fDXXEWvhMVO3O8mnuS.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(T9PhQIpGRhE4yZDm1C().HJFh0TGMpafqLE9haL().getBytes(Charset.defaultCharset()));
    }

    public Object pbVGzGjWvY2LDXC8vo(Class cls) {
        IPyIQcaNa8aB7drBED();
        return this.f6641zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(cls);
    }

    public String toString() {
        return T9PhQIpGRhE4yZDm1C.HJFh0TGMpafqLE9haL(this).lEeR5KfoEr4xU5yHH7("name", this.f6640s3fjYDxWOUexjjVgyA).lEeR5KfoEr4xU5yHH7("options", this.f6633HJFh0TGMpafqLE9haL).toString();
    }

    public final /* synthetic */ void xHA29AmDt6y96AnB3t(boolean z) {
        if (z) {
            return;
        }
        ((zQjb36M22TWHJmh54i.KYHag8HRDlnO3X9zmZ) this.f6634IPyIQcaNa8aB7drBED.get()).e54J8UWNHWALQNixXM();
    }
}
