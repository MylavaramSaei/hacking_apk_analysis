package osrHU7fvDp2EgxZPfM;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final Object f6552husNiw3snxdgZPAGJm = new Object();

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static volatile lEeR5KfoEr4xU5yHH7 f6553zZKhbgvUfsK4AEX3r0;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final Context f6554HJFh0TGMpafqLE9haL;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Set f6556s3fjYDxWOUexjjVgyA = new HashSet();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Map f6555lEeR5KfoEr4xU5yHH7 = new HashMap();

    public lEeR5KfoEr4xU5yHH7(Context context) {
        this.f6554HJFh0TGMpafqLE9haL = context.getApplicationContext();
    }

    public static lEeR5KfoEr4xU5yHH7 husNiw3snxdgZPAGJm(Context context) {
        if (f6553zZKhbgvUfsK4AEX3r0 == null) {
            synchronized (f6552husNiw3snxdgZPAGJm) {
                try {
                    if (f6553zZKhbgvUfsK4AEX3r0 == null) {
                        f6553zZKhbgvUfsK4AEX3r0 = new lEeR5KfoEr4xU5yHH7(context);
                    }
                } finally {
                }
            }
        }
        return f6553zZKhbgvUfsK4AEX3r0;
    }

    public Object HJFh0TGMpafqLE9haL(Class cls) {
        Object objZZKhbgvUfsK4AEX3r0;
        synchronized (f6552husNiw3snxdgZPAGJm) {
            try {
                objZZKhbgvUfsK4AEX3r0 = this.f6555lEeR5KfoEr4xU5yHH7.get(cls);
                if (objZZKhbgvUfsK4AEX3r0 == null) {
                    objZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objZZKhbgvUfsK4AEX3r0;
    }

    public Object KYHag8HRDlnO3X9zmZ(Class cls) {
        return HJFh0TGMpafqLE9haL(cls);
    }

    public boolean TCyPEKSzIyweCN5yp1(Class cls) {
        return this.f6556s3fjYDxWOUexjjVgyA.contains(cls);
    }

    public void lEeR5KfoEr4xU5yHH7() {
        try {
            try {
                ZJNyOIPL0usMs2xSAn.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7("Startup");
                s3fjYDxWOUexjjVgyA(this.f6554HJFh0TGMpafqLE9haL.getPackageManager().getProviderInfo(new ComponentName(this.f6554HJFh0TGMpafqLE9haL.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e) {
                throw new zZKhbgvUfsK4AEX3r0(e);
            }
        } finally {
            ZJNyOIPL0usMs2xSAn.s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA();
        }
    }

    public void s3fjYDxWOUexjjVgyA(Bundle bundle) throws ClassNotFoundException {
        String string = this.f6554HJFh0TGMpafqLE9haL.getString(HJFh0TGMpafqLE9haL.f6551lEeR5KfoEr4xU5yHH7);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (s3fjYDxWOUexjjVgyA.class.isAssignableFrom(cls)) {
                            this.f6556s3fjYDxWOUexjjVgyA.add(cls);
                        }
                    }
                }
                Iterator it = this.f6556s3fjYDxWOUexjjVgyA.iterator();
                while (it.hasNext()) {
                    zZKhbgvUfsK4AEX3r0((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new zZKhbgvUfsK4AEX3r0(e);
            }
        }
    }

    public final Object zZKhbgvUfsK4AEX3r0(Class cls, Set set) {
        Object objS3fjYDxWOUexjjVgyA;
        if (ZJNyOIPL0usMs2xSAn.s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0()) {
            try {
                ZJNyOIPL0usMs2xSAn.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(cls.getSimpleName());
            } catch (Throwable th) {
                ZJNyOIPL0usMs2xSAn.s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f6555lEeR5KfoEr4xU5yHH7.containsKey(cls)) {
            objS3fjYDxWOUexjjVgyA = this.f6555lEeR5KfoEr4xU5yHH7.get(cls);
        } else {
            set.add(cls);
            try {
                s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listLEeR5KfoEr4xU5yHH7 = s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7();
                if (!listLEeR5KfoEr4xU5yHH7.isEmpty()) {
                    for (Class cls2 : listLEeR5KfoEr4xU5yHH7) {
                        if (!this.f6555lEeR5KfoEr4xU5yHH7.containsKey(cls2)) {
                            zZKhbgvUfsK4AEX3r0(cls2, set);
                        }
                    }
                }
                objS3fjYDxWOUexjjVgyA = s3fjydxwouexjjvgya.s3fjYDxWOUexjjVgyA(this.f6554HJFh0TGMpafqLE9haL);
                set.remove(cls);
                this.f6555lEeR5KfoEr4xU5yHH7.put(cls, objS3fjYDxWOUexjjVgyA);
            } catch (Throwable th2) {
                throw new zZKhbgvUfsK4AEX3r0(th2);
            }
        }
        ZJNyOIPL0usMs2xSAn.s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA();
        return objS3fjYDxWOUexjjVgyA;
    }
}
