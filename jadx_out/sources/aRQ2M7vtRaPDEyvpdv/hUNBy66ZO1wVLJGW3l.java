package aRQ2M7vtRaPDEyvpdv;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class hUNBy66ZO1wVLJGW3l extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final AtomicReference f2484HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final f2zPq7MOnQrtOlZ1Zg.TCyPEKSzIyweCN5yp1 f2485husNiw3snxdgZPAGJm;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public volatile boolean f2486s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final Handler f2487zZKhbgvUfsK4AEX3r0;

    public hUNBy66ZO1wVLJGW3l(TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1, f2zPq7MOnQrtOlZ1Zg.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp12) {
        super(tCyPEKSzIyweCN5yp1);
        this.f2484HJFh0TGMpafqLE9haL = new AtomicReference(null);
        this.f2487zZKhbgvUfsK4AEX3r0 = new uAIIhSQWhOmxUb3Bqo.KYHag8HRDlnO3X9zmZ(Looper.getMainLooper());
        this.f2485husNiw3snxdgZPAGJm = tCyPEKSzIyweCN5yp12;
    }

    public static final int OANkd3mP6AYvwbNLJM(YlLW4G6OV9TFyuw5ix ylLW4G6OV9TFyuw5ix) {
        if (ylLW4G6OV9TFyuw5ix == null) {
            return -1;
        }
        return ylLW4G6OV9TFyuw5ix.lEeR5KfoEr4xU5yHH7();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void Acstmh57AKoSEkEFNJ() {
        super.Acstmh57AKoSEkEFNJ();
        this.f2486s3fjYDxWOUexjjVgyA = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void KYHag8HRDlnO3X9zmZ(Bundle bundle) {
        super.KYHag8HRDlnO3X9zmZ(bundle);
        if (bundle != null) {
            this.f2484HJFh0TGMpafqLE9haL.set(bundle.getBoolean("resolving_error", false) ? new YlLW4G6OV9TFyuw5ix(new f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public abstract void T9PhQIpGRhE4yZDm1C(f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, int i);

    public final void Y43RdunnpKgpbny0lE(f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, int i) {
        YlLW4G6OV9TFyuw5ix ylLW4G6OV9TFyuw5ix = new YlLW4G6OV9TFyuw5ix(leer5kfoer4xu5yhh7, i);
        if (cT5Hs3CQpLK8NvlZAw.lEeR5KfoEr4xU5yHH7(this.f2484HJFh0TGMpafqLE9haL, null, ylLW4G6OV9TFyuw5ix)) {
            this.f2487zZKhbgvUfsK4AEX3r0.post(new udcVtCzLTM1Loe9KrX(this, ylLW4G6OV9TFyuw5ix));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void Z9WdNiOsPR0y54zHW4() {
        super.Z9WdNiOsPR0y54zHW4();
        this.f2486s3fjYDxWOUexjjVgyA = false;
    }

    public final void aPyGSIylzVNKPT1Bls() {
        this.f2484HJFh0TGMpafqLE9haL.set(null);
        hoXrIDAFrSwfShk8da();
    }

    public final void e54J8UWNHWALQNixXM(f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, int i) {
        this.f2484HJFh0TGMpafqLE9haL.set(null);
        T9PhQIpGRhE4yZDm1C(leer5kfoer4xu5yhh7, i);
    }

    public abstract void hoXrIDAFrSwfShk8da();

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void husNiw3snxdgZPAGJm(int i, int i2, Intent intent) {
        YlLW4G6OV9TFyuw5ix ylLW4G6OV9TFyuw5ix = (YlLW4G6OV9TFyuw5ix) this.f2484HJFh0TGMpafqLE9haL.get();
        if (i != 1) {
            if (i == 2) {
                int iKYHag8HRDlnO3X9zmZ = this.f2485husNiw3snxdgZPAGJm.KYHag8HRDlnO3X9zmZ(s3fjYDxWOUexjjVgyA());
                if (iKYHag8HRDlnO3X9zmZ == 0) {
                    aPyGSIylzVNKPT1Bls();
                    return;
                } else {
                    if (ylLW4G6OV9TFyuw5ix == null) {
                        return;
                    }
                    if (ylLW4G6OV9TFyuw5ix.s3fjYDxWOUexjjVgyA().HJFh0TGMpafqLE9haL() == 18 && iKYHag8HRDlnO3X9zmZ == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            aPyGSIylzVNKPT1Bls();
            return;
        } else if (i2 == 0) {
            if (ylLW4G6OV9TFyuw5ix == null) {
                return;
            }
            e54J8UWNHWALQNixXM(new f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, ylLW4G6OV9TFyuw5ix.s3fjYDxWOUexjjVgyA().toString()), OANkd3mP6AYvwbNLJM(ylLW4G6OV9TFyuw5ix));
            return;
        }
        if (ylLW4G6OV9TFyuw5ix != null) {
            e54J8UWNHWALQNixXM(ylLW4G6OV9TFyuw5ix.s3fjYDxWOUexjjVgyA(), ylLW4G6OV9TFyuw5ix.lEeR5KfoEr4xU5yHH7());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        e54J8UWNHWALQNixXM(new f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7(13, null), OANkd3mP6AYvwbNLJM((YlLW4G6OV9TFyuw5ix) this.f2484HJFh0TGMpafqLE9haL.get()));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void pbVGzGjWvY2LDXC8vo(Bundle bundle) {
        super.pbVGzGjWvY2LDXC8vo(bundle);
        YlLW4G6OV9TFyuw5ix ylLW4G6OV9TFyuw5ix = (YlLW4G6OV9TFyuw5ix) this.f2484HJFh0TGMpafqLE9haL.get();
        if (ylLW4G6OV9TFyuw5ix == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", ylLW4G6OV9TFyuw5ix.lEeR5KfoEr4xU5yHH7());
        bundle.putInt("failed_status", ylLW4G6OV9TFyuw5ix.s3fjYDxWOUexjjVgyA().HJFh0TGMpafqLE9haL());
        bundle.putParcelable("failed_resolution", ylLW4G6OV9TFyuw5ix.s3fjYDxWOUexjjVgyA().husNiw3snxdgZPAGJm());
    }
}
