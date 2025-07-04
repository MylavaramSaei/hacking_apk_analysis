package R9SAhYMerGybF9OAjL;

import Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import tXWeW0sqVddf7ZBflq.husNiw3snxdgZPAGJm;
import tXWeW0sqVddf7ZBflq.zZKhbgvUfsK4AEX3r0;

/* loaded from: classes.dex */
public final class s3fjYDxWOUexjjVgyA {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final zZKhbgvUfsK4AEX3r0 f1364lEeR5KfoEr4xU5yHH7 = new husNiw3snxdgZPAGJm(10);

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final TCyPEKSzIyweCN5yp1 f1365s3fjYDxWOUexjjVgyA = new TCyPEKSzIyweCN5yp1();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final ArrayList f1363HJFh0TGMpafqLE9haL = new ArrayList();

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final HashSet f1366zZKhbgvUfsK4AEX3r0 = new HashSet();

    public final void Acstmh57AKoSEkEFNJ(ArrayList arrayList) {
        arrayList.clear();
        this.f1364lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(arrayList);
    }

    public void HJFh0TGMpafqLE9haL() {
        int size = this.f1365s3fjYDxWOUexjjVgyA.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f1365s3fjYDxWOUexjjVgyA.T9PhQIpGRhE4yZDm1C(i);
            if (arrayList != null) {
                Acstmh57AKoSEkEFNJ(arrayList);
            }
        }
        this.f1365s3fjYDxWOUexjjVgyA.clear();
    }

    public ArrayList IPyIQcaNa8aB7drBED() {
        this.f1363HJFh0TGMpafqLE9haL.clear();
        this.f1366zZKhbgvUfsK4AEX3r0.clear();
        int size = this.f1365s3fjYDxWOUexjjVgyA.size();
        for (int i = 0; i < size; i++) {
            husNiw3snxdgZPAGJm(this.f1365s3fjYDxWOUexjjVgyA.pbVGzGjWvY2LDXC8vo(i), this.f1363HJFh0TGMpafqLE9haL, this.f1366zZKhbgvUfsK4AEX3r0);
        }
        return this.f1363HJFh0TGMpafqLE9haL;
    }

    public final ArrayList KYHag8HRDlnO3X9zmZ() {
        ArrayList arrayList = (ArrayList) this.f1364lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    public List TCyPEKSzIyweCN5yp1(Object obj) {
        int size = this.f1365s3fjYDxWOUexjjVgyA.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) this.f1365s3fjYDxWOUexjjVgyA.T9PhQIpGRhE4yZDm1C(i);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f1365s3fjYDxWOUexjjVgyA.pbVGzGjWvY2LDXC8vo(i));
            }
        }
        return arrayList;
    }

    public final void husNiw3snxdgZPAGJm(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f1365s3fjYDxWOUexjjVgyA.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                husNiw3snxdgZPAGJm(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void lEeR5KfoEr4xU5yHH7(Object obj, Object obj2) {
        if (!this.f1365s3fjYDxWOUexjjVgyA.containsKey(obj) || !this.f1365s3fjYDxWOUexjjVgyA.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListKYHag8HRDlnO3X9zmZ = (ArrayList) this.f1365s3fjYDxWOUexjjVgyA.get(obj);
        if (arrayListKYHag8HRDlnO3X9zmZ == null) {
            arrayListKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ();
            this.f1365s3fjYDxWOUexjjVgyA.put(obj, arrayListKYHag8HRDlnO3X9zmZ);
        }
        arrayListKYHag8HRDlnO3X9zmZ.add(obj2);
    }

    public boolean pbVGzGjWvY2LDXC8vo(Object obj) {
        int size = this.f1365s3fjYDxWOUexjjVgyA.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f1365s3fjYDxWOUexjjVgyA.T9PhQIpGRhE4yZDm1C(i);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public void s3fjYDxWOUexjjVgyA(Object obj) {
        if (this.f1365s3fjYDxWOUexjjVgyA.containsKey(obj)) {
            return;
        }
        this.f1365s3fjYDxWOUexjjVgyA.put(obj, null);
    }

    public boolean zZKhbgvUfsK4AEX3r0(Object obj) {
        return this.f1365s3fjYDxWOUexjjVgyA.containsKey(obj);
    }
}
