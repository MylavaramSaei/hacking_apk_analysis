package zWzrlx9vIdLp7FoEMD;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class KYHag8HRDlnO3X9zmZ {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Object f7376lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final HJFh0TGMpafqLE9haL f7377s3fjYDxWOUexjjVgyA;

    public interface HJFh0TGMpafqLE9haL {
        List lEeR5KfoEr4xU5yHH7(Object obj);
    }

    public static class s3fjYDxWOUexjjVgyA implements HJFh0TGMpafqLE9haL {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Class f7378lEeR5KfoEr4xU5yHH7;

        public s3fjYDxWOUexjjVgyA(Class cls) {
            this.f7378lEeR5KfoEr4xU5yHH7 = cls;
        }

        @Override // zWzrlx9vIdLp7FoEMD.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL
        /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
        public List lEeR5KfoEr4xU5yHH7(Context context) throws PackageManager.NameNotFoundException {
            Bundle bundleS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(context);
            if (bundleS3fjYDxWOUexjjVgyA == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleS3fjYDxWOUexjjVgyA.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleS3fjYDxWOUexjjVgyA.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        public final Bundle s3fjYDxWOUexjjVgyA(Context context) throws PackageManager.NameNotFoundException {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f7378lEeR5KfoEr4xU5yHH7), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f7378lEeR5KfoEr4xU5yHH7 + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }
    }

    public KYHag8HRDlnO3X9zmZ(Object obj, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        this.f7376lEeR5KfoEr4xU5yHH7 = obj;
        this.f7377s3fjYDxWOUexjjVgyA = hJFh0TGMpafqLE9haL;
    }

    public static KYHag8HRDlnO3X9zmZ HJFh0TGMpafqLE9haL(Context context, Class cls) {
        return new KYHag8HRDlnO3X9zmZ(context, new s3fjYDxWOUexjjVgyA(cls));
    }

    public static ComponentRegistrar zZKhbgvUfsK4AEX3r0(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new xHA29AmDt6y96AnB3t(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new xHA29AmDt6y96AnB3t(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new xHA29AmDt6y96AnB3t(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new xHA29AmDt6y96AnB3t(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new xHA29AmDt6y96AnB3t(String.format("Could not instantiate %s", str), e4);
        }
    }

    public List s3fjYDxWOUexjjVgyA() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f7377s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this.f7376lEeR5KfoEr4xU5yHH7)) {
            arrayList.add(new xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA() { // from class: zWzrlx9vIdLp7FoEMD.husNiw3snxdgZPAGJm
                @Override // xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA
                public final Object get() {
                    return KYHag8HRDlnO3X9zmZ.zZKhbgvUfsK4AEX3r0(str);
                }
            });
        }
        return arrayList;
    }
}
