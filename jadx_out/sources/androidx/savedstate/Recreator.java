package androidx.savedstate;

import CSih7GetOUab1dYQjM.zZKhbgvUfsK4AEX3r0;
import android.os.Bundle;
import androidx.lifecycle.KYHag8HRDlnO3X9zmZ;
import androidx.lifecycle.Z9WdNiOsPR0y54zHW4;
import androidx.lifecycle.pbVGzGjWvY2LDXC8vo;
import androidx.savedstate.lEeR5KfoEr4xU5yHH7;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import jpEZy3U5wFkT2e9PKQ.husNiw3snxdgZPAGJm;

/* loaded from: classes.dex */
public final class Recreator implements pbVGzGjWvY2LDXC8vo {

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final lEeR5KfoEr4xU5yHH7 f4369s3fjYDxWOUexjjVgyA = new lEeR5KfoEr4xU5yHH7(null);

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final zZKhbgvUfsK4AEX3r0 f4370lEeR5KfoEr4xU5yHH7;

    public static final class lEeR5KfoEr4xU5yHH7 {
        public lEeR5KfoEr4xU5yHH7() {
        }

        public /* synthetic */ lEeR5KfoEr4xU5yHH7(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            this();
        }
    }

    public static final class s3fjYDxWOUexjjVgyA implements lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Set f4371lEeR5KfoEr4xU5yHH7;

        public s3fjYDxWOUexjjVgyA(androidx.savedstate.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh7, "registry");
            this.f4371lEeR5KfoEr4xU5yHH7 = new LinkedHashSet();
            leer5kfoer4xu5yhh7.IPyIQcaNa8aB7drBED("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL
        public Bundle lEeR5KfoEr4xU5yHH7() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f4371lEeR5KfoEr4xU5yHH7));
            return bundle;
        }

        public final void s3fjYDxWOUexjjVgyA(String str) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str, "className");
            this.f4371lEeR5KfoEr4xU5yHH7.add(str);
        }
    }

    public Recreator(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(zzkhbgvufsk4aex3r0, "owner");
        this.f4370lEeR5KfoEr4xU5yHH7 = zzkhbgvufsk4aex3r0;
    }

    public final void IPyIQcaNa8aB7drBED(String str) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(lEeR5KfoEr4xU5yHH7.InterfaceC0055lEeR5KfoEr4xU5yHH7.class);
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((lEeR5KfoEr4xU5yHH7.InterfaceC0055lEeR5KfoEr4xU5yHH7) objNewInstance).lEeR5KfoEr4xU5yHH7(this.f4370lEeR5KfoEr4xU5yHH7);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    @Override // androidx.lifecycle.pbVGzGjWvY2LDXC8vo
    public void zZKhbgvUfsK4AEX3r0(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(z9WdNiOsPR0y54zHW4, "source");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh7, "event");
        if (leer5kfoer4xu5yhh7 != KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1().HJFh0TGMpafqLE9haL(this);
        Bundle bundleS3fjYDxWOUexjjVgyA = this.f4370lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA().s3fjYDxWOUexjjVgyA("androidx.savedstate.Restarter");
        if (bundleS3fjYDxWOUexjjVgyA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleS3fjYDxWOUexjjVgyA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            IPyIQcaNa8aB7drBED(it.next());
        }
    }
}
