package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.KYHag8HRDlnO3X9zmZ;
import androidx.lifecycle.WWC27LAMFqFFBzfbNw;

/* loaded from: classes.dex */
public class OUd9THiLjZndMj0qdF implements androidx.lifecycle.husNiw3snxdgZPAGJm, CSih7GetOUab1dYQjM.zZKhbgvUfsK4AEX3r0, androidx.lifecycle.OUd9THiLjZndMj0qdF {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Fragment f3494lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final androidx.lifecycle.ao3wqKm5CXFuvC0q47 f3495s3fjYDxWOUexjjVgyA;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public androidx.lifecycle.e54J8UWNHWALQNixXM f3493HJFh0TGMpafqLE9haL = null;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public CSih7GetOUab1dYQjM.HJFh0TGMpafqLE9haL f3496zZKhbgvUfsK4AEX3r0 = null;

    public OUd9THiLjZndMj0qdF(Fragment fragment, androidx.lifecycle.ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q47) {
        this.f3494lEeR5KfoEr4xU5yHH7 = fragment;
        this.f3495s3fjYDxWOUexjjVgyA = ao3wqkm5cxfuvc0q47;
    }

    public void HJFh0TGMpafqLE9haL(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f3493HJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED(leer5kfoer4xu5yhh7);
    }

    public void IPyIQcaNa8aB7drBED(Bundle bundle) {
        this.f3496zZKhbgvUfsK4AEX3r0.zZKhbgvUfsK4AEX3r0(bundle);
    }

    public boolean KYHag8HRDlnO3X9zmZ() {
        return this.f3493HJFh0TGMpafqLE9haL != null;
    }

    @Override // androidx.lifecycle.Z9WdNiOsPR0y54zHW4
    public androidx.lifecycle.KYHag8HRDlnO3X9zmZ TCyPEKSzIyweCN5yp1() {
        husNiw3snxdgZPAGJm();
        return this.f3493HJFh0TGMpafqLE9haL;
    }

    public void husNiw3snxdgZPAGJm() {
        if (this.f3493HJFh0TGMpafqLE9haL == null) {
            this.f3493HJFh0TGMpafqLE9haL = new androidx.lifecycle.e54J8UWNHWALQNixXM(this);
            CSih7GetOUab1dYQjM.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haLLEeR5KfoEr4xU5yHH7 = CSih7GetOUab1dYQjM.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(this);
            this.f3496zZKhbgvUfsK4AEX3r0 = hJFh0TGMpafqLE9haLLEeR5KfoEr4xU5yHH7;
            hJFh0TGMpafqLE9haLLEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL();
            androidx.lifecycle.xHA29AmDt6y96AnB3t.lEeR5KfoEr4xU5yHH7(this);
        }
    }

    @Override // androidx.lifecycle.husNiw3snxdgZPAGJm
    public udcVtCzLTM1Loe9KrX.lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH7() {
        Application application;
        Context applicationContext = this.f3494lEeR5KfoEr4xU5yHH7.OWyIJu8lIXxQlvLhaC().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        udcVtCzLTM1Loe9KrX.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = new udcVtCzLTM1Loe9KrX.zZKhbgvUfsK4AEX3r0();
        if (application != null) {
            zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA(WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.f3825husNiw3snxdgZPAGJm, application);
        }
        zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA(androidx.lifecycle.xHA29AmDt6y96AnB3t.f3864lEeR5KfoEr4xU5yHH7, this);
        zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA(androidx.lifecycle.xHA29AmDt6y96AnB3t.f3865s3fjYDxWOUexjjVgyA, this);
        if (this.f3494lEeR5KfoEr4xU5yHH7.T9PhQIpGRhE4yZDm1C() != null) {
            zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA(androidx.lifecycle.xHA29AmDt6y96AnB3t.f3863HJFh0TGMpafqLE9haL, this.f3494lEeR5KfoEr4xU5yHH7.T9PhQIpGRhE4yZDm1C());
        }
        return zzkhbgvufsk4aex3r0;
    }

    public void pbVGzGjWvY2LDXC8vo(Bundle bundle) {
        this.f3496zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm(bundle);
    }

    @Override // CSih7GetOUab1dYQjM.zZKhbgvUfsK4AEX3r0
    public androidx.savedstate.lEeR5KfoEr4xU5yHH7 s3fjYDxWOUexjjVgyA() {
        husNiw3snxdgZPAGJm();
        return this.f3496zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA();
    }

    @Override // androidx.lifecycle.OUd9THiLjZndMj0qdF
    public androidx.lifecycle.ao3wqKm5CXFuvC0q47 zZKhbgvUfsK4AEX3r0() {
        husNiw3snxdgZPAGJm();
        return this.f3495s3fjYDxWOUexjjVgyA;
    }
}
