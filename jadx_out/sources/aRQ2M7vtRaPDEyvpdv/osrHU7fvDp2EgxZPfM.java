package aRQ2M7vtRaPDEyvpdv;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class osrHU7fvDp2EgxZPfM extends Fragment implements TCyPEKSzIyweCN5yp1 {

    /* renamed from: Tu4WCh2gEwj8E4oHbP, reason: collision with root package name */
    public static final WeakHashMap f2513Tu4WCh2gEwj8E4oHbP = new WeakHashMap();

    /* renamed from: ZJNyOIPL0usMs2xSAn, reason: collision with root package name */
    public Bundle f2515ZJNyOIPL0usMs2xSAn;

    /* renamed from: CSih7GetOUab1dYQjM, reason: collision with root package name */
    public final Map f2514CSih7GetOUab1dYQjM = Collections.synchronizedMap(new Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7());

    /* renamed from: osrHU7fvDp2EgxZPfM, reason: collision with root package name */
    public int f2516osrHU7fvDp2EgxZPfM = 0;

    public static osrHU7fvDp2EgxZPfM h6NrAcYSuIyiU1qV6F(androidx.fragment.app.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        osrHU7fvDp2EgxZPfM osrhu7fvdp2egxzpfm;
        WeakReference weakReference = (WeakReference) f2513Tu4WCh2gEwj8E4oHbP.get(kYHag8HRDlnO3X9zmZ);
        if (weakReference == null || (osrhu7fvdp2egxzpfm = (osrHU7fvDp2EgxZPfM) weakReference.get()) == null) {
            throw null;
        }
        return osrhu7fvdp2egxzpfm;
    }

    @Override // androidx.fragment.app.Fragment
    public final void FtYx4GXtxwA8al5hBy() {
        super.FtYx4GXtxwA8al5hBy();
        this.f2516osrHU7fvDp2EgxZPfM = 3;
        Iterator it = this.f2514CSih7GetOUab1dYQjM.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).IPyIQcaNa8aB7drBED();
        }
    }

    @Override // aRQ2M7vtRaPDEyvpdv.TCyPEKSzIyweCN5yp1
    public final void HJFh0TGMpafqLE9haL(String str, LifecycleCallback lifecycleCallback) {
        if (this.f2514CSih7GetOUab1dYQjM.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f2514CSih7GetOUab1dYQjM.put(str, lifecycleCallback);
        if (this.f2516osrHU7fvDp2EgxZPfM > 0) {
            new yXUWiIShOcfJRNCmU8.husNiw3snxdgZPAGJm(Looper.getMainLooper()).post(new CSih7GetOUab1dYQjM(this, lifecycleCallback, str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void Jsouc4ileb8SxQhxbX() {
        super.Jsouc4ileb8SxQhxbX();
        this.f2516osrHU7fvDp2EgxZPfM = 4;
        Iterator it = this.f2514CSih7GetOUab1dYQjM.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).Z9WdNiOsPR0y54zHW4();
        }
    }

    @Override // aRQ2M7vtRaPDEyvpdv.TCyPEKSzIyweCN5yp1
    public final /* synthetic */ Activity KYHag8HRDlnO3X9zmZ() {
        Acstmh57AKoSEkEFNJ();
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void ayduHasC7VpxsVXE0T(Bundle bundle) {
        super.ayduHasC7VpxsVXE0T(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f2514CSih7GetOUab1dYQjM.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).pbVGzGjWvY2LDXC8vo(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void bMSdooljgH14Jgudph(Bundle bundle) {
        super.bMSdooljgH14Jgudph(bundle);
        this.f2516osrHU7fvDp2EgxZPfM = 1;
        this.f2515ZJNyOIPL0usMs2xSAn = bundle;
        for (Map.Entry entry : this.f2514CSih7GetOUab1dYQjM.entrySet()) {
            ((LifecycleCallback) entry.getValue()).KYHag8HRDlnO3X9zmZ(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // aRQ2M7vtRaPDEyvpdv.TCyPEKSzIyweCN5yp1
    public final LifecycleCallback husNiw3snxdgZPAGJm(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f2514CSih7GetOUab1dYQjM.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    public final void xMfAHy6F7qK0zhxhKG() {
        super.xMfAHy6F7qK0zhxhKG();
        this.f2516osrHU7fvDp2EgxZPfM = 2;
        Iterator it = this.f2514CSih7GetOUab1dYQjM.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).Acstmh57AKoSEkEFNJ();
        }
    }
}
