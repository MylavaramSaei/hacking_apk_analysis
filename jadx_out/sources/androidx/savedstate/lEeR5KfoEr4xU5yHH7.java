package androidx.savedstate;

import Acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA;
import CSih7GetOUab1dYQjM.zZKhbgvUfsK4AEX3r0;
import android.os.Bundle;
import androidx.lifecycle.KYHag8HRDlnO3X9zmZ;
import androidx.lifecycle.Z9WdNiOsPR0y54zHW4;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import jpEZy3U5wFkT2e9PKQ.husNiw3snxdgZPAGJm;
import jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public final class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public static final s3fjYDxWOUexjjVgyA f4372TCyPEKSzIyweCN5yp1 = new s3fjYDxWOUexjjVgyA(null);

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public Bundle f4373HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public Recreator.s3fjYDxWOUexjjVgyA f4375husNiw3snxdgZPAGJm;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public boolean f4377s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public boolean f4378zZKhbgvUfsK4AEX3r0;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA f4376lEeR5KfoEr4xU5yHH7 = new Acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA();

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public boolean f4374KYHag8HRDlnO3X9zmZ = true;

    public interface HJFh0TGMpafqLE9haL {
        Bundle lEeR5KfoEr4xU5yHH7();
    }

    /* renamed from: androidx.savedstate.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public interface InterfaceC0055lEeR5KfoEr4xU5yHH7 {
        void lEeR5KfoEr4xU5yHH7(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0);
    }

    public static final class s3fjYDxWOUexjjVgyA {
        public s3fjYDxWOUexjjVgyA() {
        }

        public /* synthetic */ s3fjYDxWOUexjjVgyA(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            this();
        }
    }

    public static final void zZKhbgvUfsK4AEX3r0(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72) {
        boolean z;
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh7, "this$0");
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(z9WdNiOsPR0y54zHW4, "<anonymous parameter 0>");
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh72, "event");
        if (leer5kfoer4xu5yhh72 == KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_START) {
            z = true;
        } else if (leer5kfoer4xu5yhh72 != KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_STOP) {
            return;
        } else {
            z = false;
        }
        leer5kfoer4xu5yhh7.f4374KYHag8HRDlnO3X9zmZ = z;
    }

    public final HJFh0TGMpafqLE9haL HJFh0TGMpafqLE9haL(String str) {
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str, "key");
        Iterator it = this.f4376lEeR5KfoEr4xU5yHH7.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(entry, "components");
            String str2 = (String) entry.getKey();
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = (HJFh0TGMpafqLE9haL) entry.getValue();
            if (pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(str2, str)) {
                return hJFh0TGMpafqLE9haL;
            }
        }
        return null;
    }

    public final void IPyIQcaNa8aB7drBED(String str, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str, "key");
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(hJFh0TGMpafqLE9haL, "provider");
        if (((HJFh0TGMpafqLE9haL) this.f4376lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(str, hJFh0TGMpafqLE9haL)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void KYHag8HRDlnO3X9zmZ(Bundle bundle) {
        if (!this.f4377s3fjYDxWOUexjjVgyA) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f4378zZKhbgvUfsK4AEX3r0)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f4373HJFh0TGMpafqLE9haL = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f4378zZKhbgvUfsK4AEX3r0 = true;
    }

    public final void TCyPEKSzIyweCN5yp1(Bundle bundle) {
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f4373HJFh0TGMpafqLE9haL;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0 zZKhbgvUfsK4AEX3r02 = this.f4376lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0();
        pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(zZKhbgvUfsK4AEX3r02, "this.components.iteratorWithAdditions()");
        while (zZKhbgvUfsK4AEX3r02.hasNext()) {
            Map.Entry entry = (Map.Entry) zZKhbgvUfsK4AEX3r02.next();
            bundle2.putBundle((String) entry.getKey(), ((HJFh0TGMpafqLE9haL) entry.getValue()).lEeR5KfoEr4xU5yHH7());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public final void husNiw3snxdgZPAGJm(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(kYHag8HRDlnO3X9zmZ, "lifecycle");
        if (!(!this.f4377s3fjYDxWOUexjjVgyA)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        kYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(new androidx.lifecycle.pbVGzGjWvY2LDXC8vo() { // from class: CSih7GetOUab1dYQjM.s3fjYDxWOUexjjVgyA
            @Override // androidx.lifecycle.pbVGzGjWvY2LDXC8vo
            public final void zZKhbgvUfsK4AEX3r0(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
                androidx.savedstate.lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(this.f79lEeR5KfoEr4xU5yHH7, z9WdNiOsPR0y54zHW4, leer5kfoer4xu5yhh7);
            }
        });
        this.f4377s3fjYDxWOUexjjVgyA = true;
    }

    public final void pbVGzGjWvY2LDXC8vo(Class cls) throws NoSuchMethodException, SecurityException {
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(cls, "clazz");
        if (!this.f4374KYHag8HRDlnO3X9zmZ) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = this.f4375husNiw3snxdgZPAGJm;
        if (s3fjydxwouexjjvgya == null) {
            s3fjydxwouexjjvgya = new Recreator.s3fjYDxWOUexjjVgyA(this);
        }
        this.f4375husNiw3snxdgZPAGJm = s3fjydxwouexjjvgya;
        try {
            cls.getDeclaredConstructor(null);
            Recreator.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2 = this.f4375husNiw3snxdgZPAGJm;
            if (s3fjydxwouexjjvgya2 != null) {
                String name = cls.getName();
                pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(name, "clazz.name");
                s3fjydxwouexjjvgya2.s3fjYDxWOUexjjVgyA(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public final Bundle s3fjYDxWOUexjjVgyA(String str) {
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str, "key");
        if (!this.f4378zZKhbgvUfsK4AEX3r0) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f4373HJFh0TGMpafqLE9haL;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f4373HJFh0TGMpafqLE9haL;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f4373HJFh0TGMpafqLE9haL;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f4373HJFh0TGMpafqLE9haL = null;
        }
        return bundle2;
    }
}
