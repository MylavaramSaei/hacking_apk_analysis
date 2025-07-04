package zWzrlx9vIdLp7FoEMD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class OANkd3mP6AYvwbNLJM {

    public static class HJFh0TGMpafqLE9haL {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final jCtUeU2YI1poCxWcjm f7382lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final boolean f7383s3fjYDxWOUexjjVgyA;

        public HJFh0TGMpafqLE9haL(jCtUeU2YI1poCxWcjm jctueu2yi1pocxwcjm, boolean z) {
            this.f7382lEeR5KfoEr4xU5yHH7 = jctueu2yi1pocxwcjm;
            this.f7383s3fjYDxWOUexjjVgyA = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof HJFh0TGMpafqLE9haL)) {
                return false;
            }
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = (HJFh0TGMpafqLE9haL) obj;
            return hJFh0TGMpafqLE9haL.f7382lEeR5KfoEr4xU5yHH7.equals(this.f7382lEeR5KfoEr4xU5yHH7) && hJFh0TGMpafqLE9haL.f7383s3fjYDxWOUexjjVgyA == this.f7383s3fjYDxWOUexjjVgyA;
        }

        public int hashCode() {
            return ((this.f7382lEeR5KfoEr4xU5yHH7.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f7383s3fjYDxWOUexjjVgyA).hashCode();
        }
    }

    public static class s3fjYDxWOUexjjVgyA {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final zWzrlx9vIdLp7FoEMD.HJFh0TGMpafqLE9haL f7385lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final Set f7386s3fjYDxWOUexjjVgyA = new HashSet();

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final Set f7384HJFh0TGMpafqLE9haL = new HashSet();

        public s3fjYDxWOUexjjVgyA(zWzrlx9vIdLp7FoEMD.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            this.f7385lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL;
        }

        public zWzrlx9vIdLp7FoEMD.HJFh0TGMpafqLE9haL HJFh0TGMpafqLE9haL() {
            return this.f7385lEeR5KfoEr4xU5yHH7;
        }

        public boolean KYHag8HRDlnO3X9zmZ() {
            return this.f7384HJFh0TGMpafqLE9haL.isEmpty();
        }

        public void TCyPEKSzIyweCN5yp1(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            this.f7384HJFh0TGMpafqLE9haL.remove(s3fjydxwouexjjvgya);
        }

        public boolean husNiw3snxdgZPAGJm() {
            return this.f7386s3fjYDxWOUexjjVgyA.isEmpty();
        }

        public void lEeR5KfoEr4xU5yHH7(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            this.f7386s3fjYDxWOUexjjVgyA.add(s3fjydxwouexjjvgya);
        }

        public void s3fjYDxWOUexjjVgyA(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            this.f7384HJFh0TGMpafqLE9haL.add(s3fjydxwouexjjvgya);
        }

        public Set zZKhbgvUfsK4AEX3r0() {
            return this.f7386s3fjYDxWOUexjjVgyA;
        }
    }

    public static Set HJFh0TGMpafqLE9haL(List list) {
        Set<s3fjYDxWOUexjjVgyA> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya : (Set) it2.next()) {
                        for (zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg : s3fjydxwouexjjvgya.HJFh0TGMpafqLE9haL().TCyPEKSzIyweCN5yp1()) {
                            if (zaq8hourtfwbcx17cg.zZKhbgvUfsK4AEX3r0() && (set = (Set) map.get(new HJFh0TGMpafqLE9haL(zaq8hourtfwbcx17cg.s3fjYDxWOUexjjVgyA(), zaq8hourtfwbcx17cg.KYHag8HRDlnO3X9zmZ()))) != null) {
                                for (s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2 : set) {
                                    s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7(s3fjydxwouexjjvgya2);
                                    s3fjydxwouexjjvgya2.s3fjYDxWOUexjjVgyA(s3fjydxwouexjjvgya);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            zWzrlx9vIdLp7FoEMD.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = (zWzrlx9vIdLp7FoEMD.HJFh0TGMpafqLE9haL) it.next();
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya3 = new s3fjYDxWOUexjjVgyA(hJFh0TGMpafqLE9haL);
            for (jCtUeU2YI1poCxWcjm jctueu2yi1pocxwcjm : hJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ()) {
                HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = new HJFh0TGMpafqLE9haL(jctueu2yi1pocxwcjm, !hJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM());
                if (!map.containsKey(hJFh0TGMpafqLE9haL2)) {
                    map.put(hJFh0TGMpafqLE9haL2, new HashSet());
                }
                Set set2 = (Set) map.get(hJFh0TGMpafqLE9haL2);
                if (!set2.isEmpty() && !hJFh0TGMpafqLE9haL2.f7383s3fjYDxWOUexjjVgyA) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", jctueu2yi1pocxwcjm));
                }
                set2.add(s3fjydxwouexjjvgya3);
            }
        }
    }

    public static void lEeR5KfoEr4xU5yHH7(List list) {
        Set<s3fjYDxWOUexjjVgyA> setHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(list);
        Set setS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(setHJFh0TGMpafqLE9haL);
        int i = 0;
        while (!setS3fjYDxWOUexjjVgyA.isEmpty()) {
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) setS3fjYDxWOUexjjVgyA.iterator().next();
            setS3fjYDxWOUexjjVgyA.remove(s3fjydxwouexjjvgya);
            i++;
            for (s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2 : s3fjydxwouexjjvgya.zZKhbgvUfsK4AEX3r0()) {
                s3fjydxwouexjjvgya2.TCyPEKSzIyweCN5yp1(s3fjydxwouexjjvgya);
                if (s3fjydxwouexjjvgya2.KYHag8HRDlnO3X9zmZ()) {
                    setS3fjYDxWOUexjjVgyA.add(s3fjydxwouexjjvgya2);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya3 : setHJFh0TGMpafqLE9haL) {
            if (!s3fjydxwouexjjvgya3.KYHag8HRDlnO3X9zmZ() && !s3fjydxwouexjjvgya3.husNiw3snxdgZPAGJm()) {
                arrayList.add(s3fjydxwouexjjvgya3.HJFh0TGMpafqLE9haL());
            }
        }
        throw new sTkWmhpZ5b1ArQIw4K(arrayList);
    }

    public static Set s3fjYDxWOUexjjVgyA(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) it.next();
            if (s3fjydxwouexjjvgya.KYHag8HRDlnO3X9zmZ()) {
                hashSet.add(s3fjydxwouexjjvgya);
            }
        }
        return hashSet;
    }
}
