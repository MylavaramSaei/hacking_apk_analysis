package aRQ2M7vtRaPDEyvpdv;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Uj8rPa1EWADtk6Oe0S extends Fragment implements TCyPEKSzIyweCN5yp1 {

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final WeakHashMap f2451zZKhbgvUfsK4AEX3r0 = new WeakHashMap();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public Bundle f2452HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Map f2453lEeR5KfoEr4xU5yHH7 = Collections.synchronizedMap(new Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7());

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f2454s3fjYDxWOUexjjVgyA = 0;

    public static Uj8rPa1EWADtk6Oe0S zZKhbgvUfsK4AEX3r0(Activity activity) {
        Uj8rPa1EWADtk6Oe0S uj8rPa1EWADtk6Oe0S;
        WeakHashMap weakHashMap = f2451zZKhbgvUfsK4AEX3r0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (uj8rPa1EWADtk6Oe0S = (Uj8rPa1EWADtk6Oe0S) weakReference.get()) != null) {
            return uj8rPa1EWADtk6Oe0S;
        }
        try {
            Uj8rPa1EWADtk6Oe0S uj8rPa1EWADtk6Oe0S2 = (Uj8rPa1EWADtk6Oe0S) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (uj8rPa1EWADtk6Oe0S2 == null || uj8rPa1EWADtk6Oe0S2.isRemoving()) {
                uj8rPa1EWADtk6Oe0S2 = new Uj8rPa1EWADtk6Oe0S();
                activity.getFragmentManager().beginTransaction().add(uj8rPa1EWADtk6Oe0S2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(uj8rPa1EWADtk6Oe0S2));
            return uj8rPa1EWADtk6Oe0S2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    @Override // aRQ2M7vtRaPDEyvpdv.TCyPEKSzIyweCN5yp1
    public final void HJFh0TGMpafqLE9haL(String str, LifecycleCallback lifecycleCallback) {
        if (this.f2453lEeR5KfoEr4xU5yHH7.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f2453lEeR5KfoEr4xU5yHH7.put(str, lifecycleCallback);
        if (this.f2454s3fjYDxWOUexjjVgyA > 0) {
            new yXUWiIShOcfJRNCmU8.husNiw3snxdgZPAGJm(Looper.getMainLooper()).post(new bMSdooljgH14Jgudph(this, lifecycleCallback, str));
        }
    }

    @Override // aRQ2M7vtRaPDEyvpdv.TCyPEKSzIyweCN5yp1
    public final Activity KYHag8HRDlnO3X9zmZ() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f2453lEeR5KfoEr4xU5yHH7.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).lEeR5KfoEr4xU5yHH7(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // aRQ2M7vtRaPDEyvpdv.TCyPEKSzIyweCN5yp1
    public final LifecycleCallback husNiw3snxdgZPAGJm(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f2453lEeR5KfoEr4xU5yHH7.get(str));
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.f2453lEeR5KfoEr4xU5yHH7.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).husNiw3snxdgZPAGJm(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2454s3fjYDxWOUexjjVgyA = 1;
        this.f2452HJFh0TGMpafqLE9haL = bundle;
        for (Map.Entry entry : this.f2453lEeR5KfoEr4xU5yHH7.entrySet()) {
            ((LifecycleCallback) entry.getValue()).KYHag8HRDlnO3X9zmZ(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f2454s3fjYDxWOUexjjVgyA = 5;
        Iterator it = this.f2453lEeR5KfoEr4xU5yHH7.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).TCyPEKSzIyweCN5yp1();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f2454s3fjYDxWOUexjjVgyA = 3;
        Iterator it = this.f2453lEeR5KfoEr4xU5yHH7.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).IPyIQcaNa8aB7drBED();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f2453lEeR5KfoEr4xU5yHH7.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).pbVGzGjWvY2LDXC8vo(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f2454s3fjYDxWOUexjjVgyA = 2;
        Iterator it = this.f2453lEeR5KfoEr4xU5yHH7.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).Acstmh57AKoSEkEFNJ();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f2454s3fjYDxWOUexjjVgyA = 4;
        Iterator it = this.f2453lEeR5KfoEr4xU5yHH7.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).Z9WdNiOsPR0y54zHW4();
        }
    }
}
