package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class A49QRPHynYLCBN0SqP {

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public R9SAhYMerGybF9OAjL f3398zZKhbgvUfsK4AEX3r0;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final ArrayList f3396lEeR5KfoEr4xU5yHH7 = new ArrayList();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final HashMap f3397s3fjYDxWOUexjjVgyA = new HashMap();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final HashMap f3395HJFh0TGMpafqLE9haL = new HashMap();

    public ArrayList A49QRPHynYLCBN0SqP() {
        synchronized (this.f3396lEeR5KfoEr4xU5yHH7) {
            try {
                if (this.f3396lEeR5KfoEr4xU5yHH7.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f3396lEeR5KfoEr4xU5yHH7.size());
                Iterator it = this.f3396lEeR5KfoEr4xU5yHH7.iterator();
                while (it.hasNext()) {
                    Fragment fragment = (Fragment) it.next();
                    arrayList.add(fragment.f3437husNiw3snxdgZPAGJm);
                    if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.f3437husNiw3snxdgZPAGJm + "): " + fragment);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List Acstmh57AKoSEkEFNJ() {
        ArrayList arrayList = new ArrayList();
        for (LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO : this.f3397s3fjYDxWOUexjjVgyA.values()) {
            arrayList.add(lIMtzhnLwQyigzK0KO != null ? lIMtzhnLwQyigzK0KO.Z9WdNiOsPR0y54zHW4() : null);
        }
        return arrayList;
    }

    public void G7AC3DWIx9i9fdanjk(List list) {
        this.f3396lEeR5KfoEr4xU5yHH7.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment fragmentHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(str);
                if (fragmentHusNiw3snxdgZPAGJm == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentHusNiw3snxdgZPAGJm);
                }
                lEeR5KfoEr4xU5yHH7(fragmentHusNiw3snxdgZPAGJm);
            }
        }
    }

    public boolean HJFh0TGMpafqLE9haL(String str) {
        return this.f3397s3fjYDxWOUexjjVgyA.get(str) != null;
    }

    public int IPyIQcaNa8aB7drBED(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.f3445tXWeW0sqVddf7ZBflq;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f3396lEeR5KfoEr4xU5yHH7.indexOf(fragment);
        for (int i = iIndexOf - 1; i >= 0; i--) {
            Fragment fragment2 = (Fragment) this.f3396lEeR5KfoEr4xU5yHH7.get(i);
            if (fragment2.f3445tXWeW0sqVddf7ZBflq == viewGroup && (view2 = fragment2.f3421W3RZ2dTDKrKpS5Mxdk) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f3396lEeR5KfoEr4xU5yHH7.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f3396lEeR5KfoEr4xU5yHH7.get(iIndexOf);
            if (fragment3.f3445tXWeW0sqVddf7ZBflq == viewGroup && (view = fragment3.f3421W3RZ2dTDKrKpS5Mxdk) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public Fragment KYHag8HRDlnO3X9zmZ(int i) {
        for (int size = this.f3396lEeR5KfoEr4xU5yHH7.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f3396lEeR5KfoEr4xU5yHH7.get(size);
            if (fragment != null && fragment.f3447xHA29AmDt6y96AnB3t == i) {
                return fragment;
            }
        }
        for (LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO : this.f3397s3fjYDxWOUexjjVgyA.values()) {
            if (lIMtzhnLwQyigzK0KO != null) {
                Fragment fragmentZ9WdNiOsPR0y54zHW4 = lIMtzhnLwQyigzK0KO.Z9WdNiOsPR0y54zHW4();
                if (fragmentZ9WdNiOsPR0y54zHW4.f3447xHA29AmDt6y96AnB3t == i) {
                    return fragmentZ9WdNiOsPR0y54zHW4;
                }
            }
        }
        return null;
    }

    public ArrayList LIMtzhnLwQyigzK0KO() {
        ArrayList arrayList = new ArrayList(this.f3397s3fjYDxWOUexjjVgyA.size());
        for (LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO : this.f3397s3fjYDxWOUexjjVgyA.values()) {
            if (lIMtzhnLwQyigzK0KO != null) {
                Fragment fragmentZ9WdNiOsPR0y54zHW4 = lIMtzhnLwQyigzK0KO.Z9WdNiOsPR0y54zHW4();
                lIMtzhnLwQyigzK0KO.zaq8hOURtfwbcX17cG();
                arrayList.add(fragmentZ9WdNiOsPR0y54zHW4.f3437husNiw3snxdgZPAGJm);
                if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentZ9WdNiOsPR0y54zHW4 + ": " + fragmentZ9WdNiOsPR0y54zHW4.f3443s3fjYDxWOUexjjVgyA);
                }
            }
        }
        return arrayList;
    }

    public void OANkd3mP6AYvwbNLJM(LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO) {
        Fragment fragmentZ9WdNiOsPR0y54zHW4 = lIMtzhnLwQyigzK0KO.Z9WdNiOsPR0y54zHW4();
        if (HJFh0TGMpafqLE9haL(fragmentZ9WdNiOsPR0y54zHW4.f3437husNiw3snxdgZPAGJm)) {
            return;
        }
        this.f3397s3fjYDxWOUexjjVgyA.put(fragmentZ9WdNiOsPR0y54zHW4.f3437husNiw3snxdgZPAGJm, lIMtzhnLwQyigzK0KO);
        if (fragmentZ9WdNiOsPR0y54zHW4.f3430ao3wqKm5CXFuvC0q47) {
            if (fragmentZ9WdNiOsPR0y54zHW4.f3418THTDvPxsHqMeGb512f) {
                this.f3398zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm(fragmentZ9WdNiOsPR0y54zHW4);
            } else {
                this.f3398zZKhbgvUfsK4AEX3r0.e54J8UWNHWALQNixXM(fragmentZ9WdNiOsPR0y54zHW4);
            }
            fragmentZ9WdNiOsPR0y54zHW4.f3430ao3wqKm5CXFuvC0q47 = false;
        }
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentZ9WdNiOsPR0y54zHW4);
        }
    }

    public void R9SAhYMerGybF9OAjL() {
        this.f3397s3fjYDxWOUexjjVgyA.clear();
    }

    public List T9PhQIpGRhE4yZDm1C() {
        ArrayList arrayList;
        if (this.f3396lEeR5KfoEr4xU5yHH7.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3396lEeR5KfoEr4xU5yHH7) {
            arrayList = new ArrayList(this.f3396lEeR5KfoEr4xU5yHH7);
        }
        return arrayList;
    }

    public Fragment TCyPEKSzIyweCN5yp1(String str) {
        if (str != null) {
            for (int size = this.f3396lEeR5KfoEr4xU5yHH7.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f3396lEeR5KfoEr4xU5yHH7.get(size);
                if (fragment != null && str.equals(fragment.f3400A49QRPHynYLCBN0SqP)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO : this.f3397s3fjYDxWOUexjjVgyA.values()) {
            if (lIMtzhnLwQyigzK0KO != null) {
                Fragment fragmentZ9WdNiOsPR0y54zHW4 = lIMtzhnLwQyigzK0KO.Z9WdNiOsPR0y54zHW4();
                if (str.equals(fragmentZ9WdNiOsPR0y54zHW4.f3400A49QRPHynYLCBN0SqP)) {
                    return fragmentZ9WdNiOsPR0y54zHW4;
                }
            }
        }
        return null;
    }

    public void VItLRw50eXTZeEfGl0(R9SAhYMerGybF9OAjL r9SAhYMerGybF9OAjL) {
        this.f3398zZKhbgvUfsK4AEX3r0 = r9SAhYMerGybF9OAjL;
    }

    public xHA29AmDt6y96AnB3t WWC27LAMFqFFBzfbNw(String str, xHA29AmDt6y96AnB3t xha29amdt6y96anb3t) {
        return (xHA29AmDt6y96AnB3t) (xha29amdt6y96anb3t != null ? this.f3395HJFh0TGMpafqLE9haL.put(str, xha29amdt6y96anb3t) : this.f3395HJFh0TGMpafqLE9haL.remove(str));
    }

    public void Y43RdunnpKgpbny0lE(Fragment fragment) {
        synchronized (this.f3396lEeR5KfoEr4xU5yHH7) {
            this.f3396lEeR5KfoEr4xU5yHH7.remove(fragment);
        }
        fragment.f3427Z9WdNiOsPR0y54zHW4 = false;
    }

    public ArrayList Z9WdNiOsPR0y54zHW4() {
        return new ArrayList(this.f3395HJFh0TGMpafqLE9haL.values());
    }

    public xHA29AmDt6y96AnB3t aPyGSIylzVNKPT1Bls(String str) {
        return (xHA29AmDt6y96AnB3t) this.f3395HJFh0TGMpafqLE9haL.get(str);
    }

    public LIMtzhnLwQyigzK0KO e54J8UWNHWALQNixXM(String str) {
        return (LIMtzhnLwQyigzK0KO) this.f3397s3fjYDxWOUexjjVgyA.get(str);
    }

    public R9SAhYMerGybF9OAjL hoXrIDAFrSwfShk8da() {
        return this.f3398zZKhbgvUfsK4AEX3r0;
    }

    public Fragment husNiw3snxdgZPAGJm(String str) {
        LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO = (LIMtzhnLwQyigzK0KO) this.f3397s3fjYDxWOUexjjVgyA.get(str);
        if (lIMtzhnLwQyigzK0KO != null) {
            return lIMtzhnLwQyigzK0KO.Z9WdNiOsPR0y54zHW4();
        }
        return null;
    }

    public void lEeR5KfoEr4xU5yHH7(Fragment fragment) {
        if (this.f3396lEeR5KfoEr4xU5yHH7.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f3396lEeR5KfoEr4xU5yHH7) {
            this.f3396lEeR5KfoEr4xU5yHH7.add(fragment);
        }
        fragment.f3427Z9WdNiOsPR0y54zHW4 = true;
    }

    public List pbVGzGjWvY2LDXC8vo() {
        ArrayList arrayList = new ArrayList();
        for (LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO : this.f3397s3fjYDxWOUexjjVgyA.values()) {
            if (lIMtzhnLwQyigzK0KO != null) {
                arrayList.add(lIMtzhnLwQyigzK0KO);
            }
        }
        return arrayList;
    }

    public void s3fjYDxWOUexjjVgyA() {
        this.f3397s3fjYDxWOUexjjVgyA.values().removeAll(Collections.singleton(null));
    }

    public void sTkWmhpZ5b1ArQIw4K() {
        Iterator it = this.f3396lEeR5KfoEr4xU5yHH7.iterator();
        while (it.hasNext()) {
            LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO = (LIMtzhnLwQyigzK0KO) this.f3397s3fjYDxWOUexjjVgyA.get(((Fragment) it.next()).f3437husNiw3snxdgZPAGJm);
            if (lIMtzhnLwQyigzK0KO != null) {
                lIMtzhnLwQyigzK0KO.T9PhQIpGRhE4yZDm1C();
            }
        }
        for (LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO2 : this.f3397s3fjYDxWOUexjjVgyA.values()) {
            if (lIMtzhnLwQyigzK0KO2 != null) {
                lIMtzhnLwQyigzK0KO2.T9PhQIpGRhE4yZDm1C();
                Fragment fragmentZ9WdNiOsPR0y54zHW4 = lIMtzhnLwQyigzK0KO2.Z9WdNiOsPR0y54zHW4();
                if (fragmentZ9WdNiOsPR0y54zHW4.f3434e54J8UWNHWALQNixXM && !fragmentZ9WdNiOsPR0y54zHW4.YlLW4G6OV9TFyuw5ix()) {
                    if (fragmentZ9WdNiOsPR0y54zHW4.f3416T9PhQIpGRhE4yZDm1C && !this.f3395HJFh0TGMpafqLE9haL.containsKey(fragmentZ9WdNiOsPR0y54zHW4.f3437husNiw3snxdgZPAGJm)) {
                        lIMtzhnLwQyigzK0KO2.zaq8hOURtfwbcX17cG();
                    }
                    zaq8hOURtfwbcX17cG(lIMtzhnLwQyigzK0KO2);
                }
            }
        }
    }

    public void xHA29AmDt6y96AnB3t(ArrayList arrayList) {
        this.f3395HJFh0TGMpafqLE9haL.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xHA29AmDt6y96AnB3t xha29amdt6y96anb3t = (xHA29AmDt6y96AnB3t) it.next();
            this.f3395HJFh0TGMpafqLE9haL.put(xha29amdt6y96anb3t.f3661s3fjYDxWOUexjjVgyA, xha29amdt6y96anb3t);
        }
    }

    public void zZKhbgvUfsK4AEX3r0(int i) {
        for (LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO : this.f3397s3fjYDxWOUexjjVgyA.values()) {
            if (lIMtzhnLwQyigzK0KO != null) {
                lIMtzhnLwQyigzK0KO.Y43RdunnpKgpbny0lE(i);
            }
        }
    }

    public void zaq8hOURtfwbcX17cG(LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO) {
        Fragment fragmentZ9WdNiOsPR0y54zHW4 = lIMtzhnLwQyigzK0KO.Z9WdNiOsPR0y54zHW4();
        if (fragmentZ9WdNiOsPR0y54zHW4.f3418THTDvPxsHqMeGb512f) {
            this.f3398zZKhbgvUfsK4AEX3r0.e54J8UWNHWALQNixXM(fragmentZ9WdNiOsPR0y54zHW4);
        }
        if (((LIMtzhnLwQyigzK0KO) this.f3397s3fjYDxWOUexjjVgyA.put(fragmentZ9WdNiOsPR0y54zHW4.f3437husNiw3snxdgZPAGJm, null)) != null && zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentZ9WdNiOsPR0y54zHW4);
        }
    }
}
