package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.WWC27LAMFqFFBzfbNw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class R9SAhYMerGybF9OAjL extends androidx.lifecycle.VItLRw50eXTZeEfGl0 {

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public static final WWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA f3497Z9WdNiOsPR0y54zHW4 = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final boolean f3501TCyPEKSzIyweCN5yp1;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final HashMap f3504zZKhbgvUfsK4AEX3r0 = new HashMap();

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final HashMap f3502husNiw3snxdgZPAGJm = new HashMap();

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final HashMap f3500KYHag8HRDlnO3X9zmZ = new HashMap();

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public boolean f3499IPyIQcaNa8aB7drBED = false;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public boolean f3503pbVGzGjWvY2LDXC8vo = false;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public boolean f3498Acstmh57AKoSEkEFNJ = false;

    public class lEeR5KfoEr4xU5yHH7 implements WWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA {
        @Override // androidx.lifecycle.WWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA
        public androidx.lifecycle.VItLRw50eXTZeEfGl0 s3fjYDxWOUexjjVgyA(Class cls) {
            return new R9SAhYMerGybF9OAjL(true);
        }
    }

    public R9SAhYMerGybF9OAjL(boolean z) {
        this.f3501TCyPEKSzIyweCN5yp1 = z;
    }

    public Collection Acstmh57AKoSEkEFNJ() {
        return new ArrayList(this.f3504zZKhbgvUfsK4AEX3r0.values());
    }

    public Fragment IPyIQcaNa8aB7drBED(String str) {
        return (Fragment) this.f3504zZKhbgvUfsK4AEX3r0.get(str);
    }

    public void KYHag8HRDlnO3X9zmZ(Fragment fragment) {
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        TCyPEKSzIyweCN5yp1(fragment.f3437husNiw3snxdgZPAGJm);
    }

    public void T9PhQIpGRhE4yZDm1C(boolean z) {
        this.f3498Acstmh57AKoSEkEFNJ = z;
    }

    public final void TCyPEKSzIyweCN5yp1(String str) {
        R9SAhYMerGybF9OAjL r9SAhYMerGybF9OAjL = (R9SAhYMerGybF9OAjL) this.f3502husNiw3snxdgZPAGJm.get(str);
        if (r9SAhYMerGybF9OAjL != null) {
            r9SAhYMerGybF9OAjL.zZKhbgvUfsK4AEX3r0();
            this.f3502husNiw3snxdgZPAGJm.remove(str);
        }
        androidx.lifecycle.ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q47 = (androidx.lifecycle.ao3wqKm5CXFuvC0q47) this.f3500KYHag8HRDlnO3X9zmZ.get(str);
        if (ao3wqkm5cxfuvc0q47 != null) {
            ao3wqkm5cxfuvc0q47.lEeR5KfoEr4xU5yHH7();
            this.f3500KYHag8HRDlnO3X9zmZ.remove(str);
        }
    }

    public androidx.lifecycle.ao3wqKm5CXFuvC0q47 Z9WdNiOsPR0y54zHW4(Fragment fragment) {
        androidx.lifecycle.ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q47 = (androidx.lifecycle.ao3wqKm5CXFuvC0q47) this.f3500KYHag8HRDlnO3X9zmZ.get(fragment.f3437husNiw3snxdgZPAGJm);
        if (ao3wqkm5cxfuvc0q47 != null) {
            return ao3wqkm5cxfuvc0q47;
        }
        androidx.lifecycle.ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q472 = new androidx.lifecycle.ao3wqKm5CXFuvC0q47();
        this.f3500KYHag8HRDlnO3X9zmZ.put(fragment.f3437husNiw3snxdgZPAGJm, ao3wqkm5cxfuvc0q472);
        return ao3wqkm5cxfuvc0q472;
    }

    public void e54J8UWNHWALQNixXM(Fragment fragment) {
        if (this.f3498Acstmh57AKoSEkEFNJ) {
            if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f3504zZKhbgvUfsK4AEX3r0.remove(fragment.f3437husNiw3snxdgZPAGJm) == null || !zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || R9SAhYMerGybF9OAjL.class != obj.getClass()) {
            return false;
        }
        R9SAhYMerGybF9OAjL r9SAhYMerGybF9OAjL = (R9SAhYMerGybF9OAjL) obj;
        return this.f3504zZKhbgvUfsK4AEX3r0.equals(r9SAhYMerGybF9OAjL.f3504zZKhbgvUfsK4AEX3r0) && this.f3502husNiw3snxdgZPAGJm.equals(r9SAhYMerGybF9OAjL.f3502husNiw3snxdgZPAGJm) && this.f3500KYHag8HRDlnO3X9zmZ.equals(r9SAhYMerGybF9OAjL.f3500KYHag8HRDlnO3X9zmZ);
    }

    public int hashCode() {
        return (((this.f3504zZKhbgvUfsK4AEX3r0.hashCode() * 31) + this.f3502husNiw3snxdgZPAGJm.hashCode()) * 31) + this.f3500KYHag8HRDlnO3X9zmZ.hashCode();
    }

    public boolean hoXrIDAFrSwfShk8da(Fragment fragment) {
        if (this.f3504zZKhbgvUfsK4AEX3r0.containsKey(fragment.f3437husNiw3snxdgZPAGJm)) {
            return this.f3501TCyPEKSzIyweCN5yp1 ? this.f3499IPyIQcaNa8aB7drBED : !this.f3503pbVGzGjWvY2LDXC8vo;
        }
        return true;
    }

    public void husNiw3snxdgZPAGJm(Fragment fragment) {
        if (this.f3498Acstmh57AKoSEkEFNJ) {
            if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f3504zZKhbgvUfsK4AEX3r0.containsKey(fragment.f3437husNiw3snxdgZPAGJm)) {
                return;
            }
            this.f3504zZKhbgvUfsK4AEX3r0.put(fragment.f3437husNiw3snxdgZPAGJm, fragment);
            if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public R9SAhYMerGybF9OAjL pbVGzGjWvY2LDXC8vo(Fragment fragment) {
        R9SAhYMerGybF9OAjL r9SAhYMerGybF9OAjL = (R9SAhYMerGybF9OAjL) this.f3502husNiw3snxdgZPAGJm.get(fragment.f3437husNiw3snxdgZPAGJm);
        if (r9SAhYMerGybF9OAjL != null) {
            return r9SAhYMerGybF9OAjL;
        }
        R9SAhYMerGybF9OAjL r9SAhYMerGybF9OAjL2 = new R9SAhYMerGybF9OAjL(this.f3501TCyPEKSzIyweCN5yp1);
        this.f3502husNiw3snxdgZPAGJm.put(fragment.f3437husNiw3snxdgZPAGJm, r9SAhYMerGybF9OAjL2);
        return r9SAhYMerGybF9OAjL2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f3504zZKhbgvUfsK4AEX3r0.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f3502husNiw3snxdgZPAGJm.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f3500KYHag8HRDlnO3X9zmZ.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.lifecycle.VItLRw50eXTZeEfGl0
    public void zZKhbgvUfsK4AEX3r0() {
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3499IPyIQcaNa8aB7drBED = true;
    }
}
