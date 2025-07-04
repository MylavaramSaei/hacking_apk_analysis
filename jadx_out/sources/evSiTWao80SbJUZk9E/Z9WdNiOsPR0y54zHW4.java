package evSiTWao80SbJUZk9E;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Z9WdNiOsPR0y54zHW4 implements husNiw3snxdgZPAGJm {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final Map f5772HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final lEeR5KfoEr4xU5yHH7 f5773lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final pbVGzGjWvY2LDXC8vo f5774s3fjYDxWOUexjjVgyA;

    public static class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Context f5775lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public Map f5776s3fjYDxWOUexjjVgyA = null;

        public lEeR5KfoEr4xU5yHH7(Context context) {
            this.f5775lEeR5KfoEr4xU5yHH7 = context;
        }

        public static Bundle zZKhbgvUfsK4AEX3r0(Context context) throws PackageManager.NameNotFoundException {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        public final Map HJFh0TGMpafqLE9haL() {
            if (this.f5776s3fjYDxWOUexjjVgyA == null) {
                this.f5776s3fjYDxWOUexjjVgyA = lEeR5KfoEr4xU5yHH7(this.f5775lEeR5KfoEr4xU5yHH7);
            }
            return this.f5776s3fjYDxWOUexjjVgyA;
        }

        public final Map lEeR5KfoEr4xU5yHH7(Context context) throws PackageManager.NameNotFoundException {
            Bundle bundleZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(context);
            if (bundleZZKhbgvUfsK4AEX3r0 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            for (String str : bundleZZKhbgvUfsK4AEX3r0.keySet()) {
                Object obj = bundleZZKhbgvUfsK4AEX3r0.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        public zZKhbgvUfsK4AEX3r0 s3fjYDxWOUexjjVgyA(String str) {
            String str2;
            String str3;
            String str4 = (String) HJFh0TGMpafqLE9haL().get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (zZKhbgvUfsK4AEX3r0) Class.forName(str4).asSubclass(zZKhbgvUfsK4AEX3r0.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e) {
                e = e;
                str2 = String.format("Class %s is not found.", str4);
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (IllegalAccessException e2) {
                e = e2;
                str3 = String.format("Could not instantiate %s.", str4);
                Log.w("BackendRegistry", str3, e);
                return null;
            } catch (InstantiationException e3) {
                e = e3;
                str3 = String.format("Could not instantiate %s.", str4);
                Log.w("BackendRegistry", str3, e);
                return null;
            } catch (NoSuchMethodException e4) {
                e = e4;
                str2 = String.format("Could not instantiate %s", str4);
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (InvocationTargetException e5) {
                e = e5;
                str2 = String.format("Could not instantiate %s", str4);
                Log.w("BackendRegistry", str2, e);
                return null;
            }
        }
    }

    public Z9WdNiOsPR0y54zHW4(Context context, pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        this(new lEeR5KfoEr4xU5yHH7(context), pbvgzgjwvy2ldxc8vo);
    }

    @Override // evSiTWao80SbJUZk9E.husNiw3snxdgZPAGJm
    public synchronized T9PhQIpGRhE4yZDm1C lEeR5KfoEr4xU5yHH7(String str) {
        if (this.f5772HJFh0TGMpafqLE9haL.containsKey(str)) {
            return (T9PhQIpGRhE4yZDm1C) this.f5772HJFh0TGMpafqLE9haL.get(str);
        }
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0S3fjYDxWOUexjjVgyA = this.f5773lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(str);
        if (zzkhbgvufsk4aex3r0S3fjYDxWOUexjjVgyA == null) {
            return null;
        }
        T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1CCreate = zzkhbgvufsk4aex3r0S3fjYDxWOUexjjVgyA.create(this.f5774s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(str));
        this.f5772HJFh0TGMpafqLE9haL.put(str, t9PhQIpGRhE4yZDm1CCreate);
        return t9PhQIpGRhE4yZDm1CCreate;
    }

    public Z9WdNiOsPR0y54zHW4(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        this.f5772HJFh0TGMpafqLE9haL = new HashMap();
        this.f5773lEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7;
        this.f5774s3fjYDxWOUexjjVgyA = pbvgzgjwvy2ldxc8vo;
    }
}
