package Tu4WCh2gEwj8E4oHbP;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e54J8UWNHWALQNixXM implements Cloneable {

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public ArrayList f1723G7AC3DWIx9i9fdanjk;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public ArrayList f1730R9SAhYMerGybF9OAjL;

    /* renamed from: XzJ1BS7H9Ilbkv4eVM, reason: collision with root package name */
    public Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 f1736XzJ1BS7H9Ilbkv4eVM;

    /* renamed from: jCtUeU2YI1poCxWcjm, reason: collision with root package name */
    public husNiw3snxdgZPAGJm f1744jCtUeU2YI1poCxWcjm;

    /* renamed from: W3RZ2dTDKrKpS5Mxdk, reason: collision with root package name */
    public static final int[] f1720W3RZ2dTDKrKpS5Mxdk = {2, 1, 3, 4};

    /* renamed from: OqIo5QF00RDxUQb4qq, reason: collision with root package name */
    public static final TCyPEKSzIyweCN5yp1 f1719OqIo5QF00RDxUQb4qq = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: GyWRxpdt1T8mEJXPoD, reason: collision with root package name */
    public static ThreadLocal f1718GyWRxpdt1T8mEJXPoD = new ThreadLocal();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public String f1745lEeR5KfoEr4xU5yHH7 = getClass().getName();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public long f1747s3fjYDxWOUexjjVgyA = -1;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public long f1724HJFh0TGMpafqLE9haL = -1;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public TimeInterpolator f1751zZKhbgvUfsK4AEX3r0 = null;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public ArrayList f1743husNiw3snxdgZPAGJm = new ArrayList();

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public ArrayList f1726KYHag8HRDlnO3X9zmZ = new ArrayList();

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public ArrayList f1732TCyPEKSzIyweCN5yp1 = null;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public ArrayList f1725IPyIQcaNa8aB7drBED = null;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public ArrayList f1746pbVGzGjWvY2LDXC8vo = null;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public ArrayList f1722Acstmh57AKoSEkEFNJ = null;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public ArrayList f1738Z9WdNiOsPR0y54zHW4 = null;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public ArrayList f1741e54J8UWNHWALQNixXM = null;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public ArrayList f1731T9PhQIpGRhE4yZDm1C = null;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public ArrayList f1742hoXrIDAFrSwfShk8da = null;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public ArrayList f1739aPyGSIylzVNKPT1Bls = null;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public R9SAhYMerGybF9OAjL f1728OANkd3mP6AYvwbNLJM = new R9SAhYMerGybF9OAjL();

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public R9SAhYMerGybF9OAjL f1752zaq8hOURtfwbcX17cG = new R9SAhYMerGybF9OAjL();

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public OANkd3mP6AYvwbNLJM f1748sTkWmhpZ5b1ArQIw4K = null;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public int[] f1737Y43RdunnpKgpbny0lE = f1720W3RZ2dTDKrKpS5Mxdk;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public ViewGroup f1750xHA29AmDt6y96AnB3t = null;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public boolean f1727LIMtzhnLwQyigzK0KO = false;

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public ArrayList f1721A49QRPHynYLCBN0SqP = new ArrayList();

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public int f1734VItLRw50eXTZeEfGl0 = 0;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public boolean f1735WWC27LAMFqFFBzfbNw = false;

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public boolean f1733THTDvPxsHqMeGb512f = false;

    /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
    public ArrayList f1740ao3wqKm5CXFuvC0q47 = null;

    /* renamed from: OUd9THiLjZndMj0qdF, reason: collision with root package name */
    public ArrayList f1729OUd9THiLjZndMj0qdF = new ArrayList();

    /* renamed from: tXWeW0sqVddf7ZBflq, reason: collision with root package name */
    public TCyPEKSzIyweCN5yp1 f1749tXWeW0sqVddf7ZBflq = f1719OqIo5QF00RDxUQb4qq;

    public class HJFh0TGMpafqLE9haL extends AnimatorListenerAdapter {
        public HJFh0TGMpafqLE9haL() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e54J8UWNHWALQNixXM.this.OANkd3mP6AYvwbNLJM();
            animator.removeListener(this);
        }
    }

    public interface KYHag8HRDlnO3X9zmZ {
        void HJFh0TGMpafqLE9haL(e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm);

        void husNiw3snxdgZPAGJm(e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm);

        void lEeR5KfoEr4xU5yHH7(e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm);

        void s3fjYDxWOUexjjVgyA(e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm);

        void zZKhbgvUfsK4AEX3r0(e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm);
    }

    public static abstract class husNiw3snxdgZPAGJm {
    }

    public static class lEeR5KfoEr4xU5yHH7 extends TCyPEKSzIyweCN5yp1 {
        @Override // Tu4WCh2gEwj8E4oHbP.TCyPEKSzIyweCN5yp1
        public Path lEeR5KfoEr4xU5yHH7(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    public class s3fjYDxWOUexjjVgyA extends AnimatorListenerAdapter {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 f1754lEeR5KfoEr4xU5yHH7;

        public s3fjYDxWOUexjjVgyA(Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            this.f1754lEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1754lEeR5KfoEr4xU5yHH7.remove(animator);
            e54J8UWNHWALQNixXM.this.f1721A49QRPHynYLCBN0SqP.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e54J8UWNHWALQNixXM.this.f1721A49QRPHynYLCBN0SqP.add(animator);
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public Y43RdunnpKgpbny0lE f1756HJFh0TGMpafqLE9haL;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public e54J8UWNHWALQNixXM f1757husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public View f1758lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public String f1759s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public ToH8yzk8U1nKT0PUfY f1760zZKhbgvUfsK4AEX3r0;

        public zZKhbgvUfsK4AEX3r0(View view, String str, e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm, ToH8yzk8U1nKT0PUfY toH8yzk8U1nKT0PUfY, Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE) {
            this.f1758lEeR5KfoEr4xU5yHH7 = view;
            this.f1759s3fjYDxWOUexjjVgyA = str;
            this.f1756HJFh0TGMpafqLE9haL = y43RdunnpKgpbny0lE;
            this.f1760zZKhbgvUfsK4AEX3r0 = toH8yzk8U1nKT0PUfY;
            this.f1757husNiw3snxdgZPAGJm = e54j8uwnhwalqnixxm;
        }
    }

    public static Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 A49QRPHynYLCBN0SqP() {
        Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7) f1718GyWRxpdt1T8mEJXPoD.get();
        if (leer5kfoer4xu5yhh7 != null) {
            return leer5kfoer4xu5yhh7;
        }
        Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = new Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7();
        f1718GyWRxpdt1T8mEJXPoD.set(leer5kfoer4xu5yhh72);
        return leer5kfoer4xu5yhh72;
    }

    public static boolean OqIo5QF00RDxUQb4qq(Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE, Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE2, String str) {
        Object obj = y43RdunnpKgpbny0lE.f1697lEeR5KfoEr4xU5yHH7.get(str);
        Object obj2 = y43RdunnpKgpbny0lE2.f1697lEeR5KfoEr4xU5yHH7.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void zZKhbgvUfsK4AEX3r0(R9SAhYMerGybF9OAjL r9SAhYMerGybF9OAjL, View view, Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE) {
        r9SAhYMerGybF9OAjL.f1687lEeR5KfoEr4xU5yHH7.put(view, y43RdunnpKgpbny0lE);
        int id = view.getId();
        if (id >= 0) {
            if (r9SAhYMerGybF9OAjL.f1688s3fjYDxWOUexjjVgyA.indexOfKey(id) >= 0) {
                r9SAhYMerGybF9OAjL.f1688s3fjYDxWOUexjjVgyA.put(id, null);
            } else {
                r9SAhYMerGybF9OAjL.f1688s3fjYDxWOUexjjVgyA.put(id, view);
            }
        }
        String strTXWeW0sqVddf7ZBflq = W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.tXWeW0sqVddf7ZBflq(view);
        if (strTXWeW0sqVddf7ZBflq != null) {
            if (r9SAhYMerGybF9OAjL.f1689zZKhbgvUfsK4AEX3r0.containsKey(strTXWeW0sqVddf7ZBflq)) {
                r9SAhYMerGybF9OAjL.f1689zZKhbgvUfsK4AEX3r0.put(strTXWeW0sqVddf7ZBflq, null);
            } else {
                r9SAhYMerGybF9OAjL.f1689zZKhbgvUfsK4AEX3r0.put(strTXWeW0sqVddf7ZBflq, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (r9SAhYMerGybF9OAjL.f1686HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(itemIdAtPosition) < 0) {
                    W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.yvdWWG9COQQotjfedH(view, true);
                    r9SAhYMerGybF9OAjL.f1686HJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) r9SAhYMerGybF9OAjL.f1686HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(itemIdAtPosition);
                if (view2 != null) {
                    W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.yvdWWG9COQQotjfedH(view2, false);
                    r9SAhYMerGybF9OAjL.f1686HJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED(itemIdAtPosition, null);
                }
            }
        }
    }

    public abstract void Acstmh57AKoSEkEFNJ(Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE);

    public void CSih7GetOUab1dYQjM() {
        if (this.f1734VItLRw50eXTZeEfGl0 == 0) {
            ArrayList arrayList = this.f1740ao3wqKm5CXFuvC0q47;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1740ao3wqKm5CXFuvC0q47.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((KYHag8HRDlnO3X9zmZ) arrayList2.get(i)).zZKhbgvUfsK4AEX3r0(this);
                }
            }
            this.f1733THTDvPxsHqMeGb512f = false;
        }
        this.f1734VItLRw50eXTZeEfGl0++;
    }

    public final void DfpieXfdYs58yZAiXY(Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72) {
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE;
        for (int size = leer5kfoer4xu5yhh7.size() - 1; size >= 0; size--) {
            View view = (View) leer5kfoer4xu5yhh7.pbVGzGjWvY2LDXC8vo(size);
            if (view != null && W3RZ2dTDKrKpS5Mxdk(view) && (y43RdunnpKgpbny0lE = (Y43RdunnpKgpbny0lE) leer5kfoer4xu5yhh72.remove(view)) != null && W3RZ2dTDKrKpS5Mxdk(y43RdunnpKgpbny0lE.f1698s3fjYDxWOUexjjVgyA)) {
                this.f1730R9SAhYMerGybF9OAjL.add((Y43RdunnpKgpbny0lE) leer5kfoer4xu5yhh7.Z9WdNiOsPR0y54zHW4(size));
                this.f1723G7AC3DWIx9i9fdanjk.add(y43RdunnpKgpbny0lE);
            }
        }
    }

    public String G7AC3DWIx9i9fdanjk() {
        return this.f1745lEeR5KfoEr4xU5yHH7;
    }

    public final void GyWRxpdt1T8mEJXPoD(Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) sparseArray.valueAt(i);
            if (view2 != null && W3RZ2dTDKrKpS5Mxdk(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i))) != null && W3RZ2dTDKrKpS5Mxdk(view)) {
                Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = (Y43RdunnpKgpbny0lE) leer5kfoer4xu5yhh7.get(view2);
                Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE2 = (Y43RdunnpKgpbny0lE) leer5kfoer4xu5yhh72.get(view);
                if (y43RdunnpKgpbny0lE != null && y43RdunnpKgpbny0lE2 != null) {
                    this.f1730R9SAhYMerGybF9OAjL.add(y43RdunnpKgpbny0lE);
                    this.f1723G7AC3DWIx9i9fdanjk.add(y43RdunnpKgpbny0lE2);
                    leer5kfoer4xu5yhh7.remove(view2);
                    leer5kfoer4xu5yhh72.remove(view);
                }
            }
        }
    }

    public final void HJFh0TGMpafqLE9haL(Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72) {
        for (int i = 0; i < leer5kfoer4xu5yhh7.size(); i++) {
            Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = (Y43RdunnpKgpbny0lE) leer5kfoer4xu5yhh7.T9PhQIpGRhE4yZDm1C(i);
            if (W3RZ2dTDKrKpS5Mxdk(y43RdunnpKgpbny0lE.f1698s3fjYDxWOUexjjVgyA)) {
                this.f1730R9SAhYMerGybF9OAjL.add(y43RdunnpKgpbny0lE);
                this.f1723G7AC3DWIx9i9fdanjk.add(null);
            }
        }
        for (int i2 = 0; i2 < leer5kfoer4xu5yhh72.size(); i2++) {
            Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE2 = (Y43RdunnpKgpbny0lE) leer5kfoer4xu5yhh72.T9PhQIpGRhE4yZDm1C(i2);
            if (W3RZ2dTDKrKpS5Mxdk(y43RdunnpKgpbny0lE2.f1698s3fjYDxWOUexjjVgyA)) {
                this.f1723G7AC3DWIx9i9fdanjk.add(y43RdunnpKgpbny0lE2);
                this.f1730R9SAhYMerGybF9OAjL.add(null);
            }
        }
    }

    public final void IPyIQcaNa8aB7drBED(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f1746pbVGzGjWvY2LDXC8vo;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.f1722Acstmh57AKoSEkEFNJ;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f1738Z9WdNiOsPR0y54zHW4;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (((Class) this.f1738Z9WdNiOsPR0y54zHW4.get(i)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = new Y43RdunnpKgpbny0lE(view);
                    if (z) {
                        Acstmh57AKoSEkEFNJ(y43RdunnpKgpbny0lE);
                    } else {
                        TCyPEKSzIyweCN5yp1(y43RdunnpKgpbny0lE);
                    }
                    y43RdunnpKgpbny0lE.f1696HJFh0TGMpafqLE9haL.add(this);
                    pbVGzGjWvY2LDXC8vo(y43RdunnpKgpbny0lE);
                    zZKhbgvUfsK4AEX3r0(z ? this.f1728OANkd3mP6AYvwbNLJM : this.f1752zaq8hOURtfwbcX17cG, view, y43RdunnpKgpbny0lE);
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f1731T9PhQIpGRhE4yZDm1C;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.f1742hoXrIDAFrSwfShk8da;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f1739aPyGSIylzVNKPT1Bls;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (((Class) this.f1739aPyGSIylzVNKPT1Bls.get(i2)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                IPyIQcaNa8aB7drBED(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public void KYHag8HRDlnO3X9zmZ() {
        for (int size = this.f1721A49QRPHynYLCBN0SqP.size() - 1; size >= 0; size--) {
            ((Animator) this.f1721A49QRPHynYLCBN0SqP.get(size)).cancel();
        }
        ArrayList arrayList = this.f1740ao3wqKm5CXFuvC0q47;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f1740ao3wqKm5CXFuvC0q47.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((KYHag8HRDlnO3X9zmZ) arrayList2.get(i)).husNiw3snxdgZPAGJm(this);
        }
    }

    public final void KqgKJKIWne3kz1AdHk(Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72, Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh73, Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh74) {
        View view;
        int size = leer5kfoer4xu5yhh73.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) leer5kfoer4xu5yhh73.T9PhQIpGRhE4yZDm1C(i);
            if (view2 != null && W3RZ2dTDKrKpS5Mxdk(view2) && (view = (View) leer5kfoer4xu5yhh74.get(leer5kfoer4xu5yhh73.pbVGzGjWvY2LDXC8vo(i))) != null && W3RZ2dTDKrKpS5Mxdk(view)) {
                Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = (Y43RdunnpKgpbny0lE) leer5kfoer4xu5yhh7.get(view2);
                Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE2 = (Y43RdunnpKgpbny0lE) leer5kfoer4xu5yhh72.get(view);
                if (y43RdunnpKgpbny0lE != null && y43RdunnpKgpbny0lE2 != null) {
                    this.f1730R9SAhYMerGybF9OAjL.add(y43RdunnpKgpbny0lE);
                    this.f1723G7AC3DWIx9i9fdanjk.add(y43RdunnpKgpbny0lE2);
                    leer5kfoer4xu5yhh7.remove(view2);
                    leer5kfoer4xu5yhh72.remove(view);
                }
            }
        }
    }

    public aPyGSIylzVNKPT1Bls LIMtzhnLwQyigzK0KO() {
        return null;
    }

    public void LU0fFDMACqnfIfA1AZ(View view) {
        if (this.f1735WWC27LAMFqFFBzfbNw) {
            if (!this.f1733THTDvPxsHqMeGb512f) {
                Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP = A49QRPHynYLCBN0SqP();
                int size = leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP.size();
                ToH8yzk8U1nKT0PUfY toH8yzk8U1nKT0PUfYZZKhbgvUfsK4AEX3r0 = THTDvPxsHqMeGb512f.zZKhbgvUfsK4AEX3r0(view);
                for (int i = size - 1; i >= 0; i--) {
                    zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = (zZKhbgvUfsK4AEX3r0) leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP.T9PhQIpGRhE4yZDm1C(i);
                    if (zzkhbgvufsk4aex3r0.f1758lEeR5KfoEr4xU5yHH7 != null && toH8yzk8U1nKT0PUfYZZKhbgvUfsK4AEX3r0.equals(zzkhbgvufsk4aex3r0.f1760zZKhbgvUfsK4AEX3r0)) {
                        Tu4WCh2gEwj8E4oHbP.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL((Animator) leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP.pbVGzGjWvY2LDXC8vo(i));
                    }
                }
                ArrayList arrayList = this.f1740ao3wqKm5CXFuvC0q47;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f1740ao3wqKm5CXFuvC0q47.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((KYHag8HRDlnO3X9zmZ) arrayList2.get(i2)).s3fjYDxWOUexjjVgyA(this);
                    }
                }
            }
            this.f1735WWC27LAMFqFFBzfbNw = false;
        }
    }

    public void OANkd3mP6AYvwbNLJM() {
        int i = this.f1734VItLRw50eXTZeEfGl0 - 1;
        this.f1734VItLRw50eXTZeEfGl0 = i;
        if (i == 0) {
            ArrayList arrayList = this.f1740ao3wqKm5CXFuvC0q47;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1740ao3wqKm5CXFuvC0q47.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((KYHag8HRDlnO3X9zmZ) arrayList2.get(i2)).lEeR5KfoEr4xU5yHH7(this);
                }
            }
            for (int i3 = 0; i3 < this.f1728OANkd3mP6AYvwbNLJM.f1686HJFh0TGMpafqLE9haL.Z9WdNiOsPR0y54zHW4(); i3++) {
                View view = (View) this.f1728OANkd3mP6AYvwbNLJM.f1686HJFh0TGMpafqLE9haL.e54J8UWNHWALQNixXM(i3);
                if (view != null) {
                    W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.yvdWWG9COQQotjfedH(view, false);
                }
            }
            for (int i4 = 0; i4 < this.f1752zaq8hOURtfwbcX17cG.f1686HJFh0TGMpafqLE9haL.Z9WdNiOsPR0y54zHW4(); i4++) {
                View view2 = (View) this.f1752zaq8hOURtfwbcX17cG.f1686HJFh0TGMpafqLE9haL.e54J8UWNHWALQNixXM(i4);
                if (view2 != null) {
                    W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.yvdWWG9COQQotjfedH(view2, false);
                }
            }
            this.f1733THTDvPxsHqMeGb512f = true;
        }
    }

    public List OUd9THiLjZndMj0qdF() {
        return this.f1726KYHag8HRDlnO3X9zmZ;
    }

    public final void PPkm9uUfOJHHYveeLT(R9SAhYMerGybF9OAjL r9SAhYMerGybF9OAjL, R9SAhYMerGybF9OAjL r9SAhYMerGybF9OAjL2) {
        Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7(r9SAhYMerGybF9OAjL.f1687lEeR5KfoEr4xU5yHH7);
        Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = new Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7(r9SAhYMerGybF9OAjL2.f1687lEeR5KfoEr4xU5yHH7);
        int i = 0;
        while (true) {
            int[] iArr = this.f1737Y43RdunnpKgpbny0lE;
            if (i >= iArr.length) {
                HJFh0TGMpafqLE9haL(leer5kfoer4xu5yhh7, leer5kfoer4xu5yhh72);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                DfpieXfdYs58yZAiXY(leer5kfoer4xu5yhh7, leer5kfoer4xu5yhh72);
            } else if (i2 == 2) {
                KqgKJKIWne3kz1AdHk(leer5kfoer4xu5yhh7, leer5kfoer4xu5yhh72, r9SAhYMerGybF9OAjL.f1689zZKhbgvUfsK4AEX3r0, r9SAhYMerGybF9OAjL2.f1689zZKhbgvUfsK4AEX3r0);
            } else if (i2 == 3) {
                GyWRxpdt1T8mEJXPoD(leer5kfoer4xu5yhh7, leer5kfoer4xu5yhh72, r9SAhYMerGybF9OAjL.f1688s3fjYDxWOUexjjVgyA, r9SAhYMerGybF9OAjL2.f1688s3fjYDxWOUexjjVgyA);
            } else if (i2 == 4) {
                e2F9F6h8YJxTHwLCa0(leer5kfoer4xu5yhh7, leer5kfoer4xu5yhh72, r9SAhYMerGybF9OAjL.f1686HJFh0TGMpafqLE9haL, r9SAhYMerGybF9OAjL2.f1686HJFh0TGMpafqLE9haL);
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f1723G7AC3DWIx9i9fdanjk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f1730R9SAhYMerGybF9OAjL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return (Tu4WCh2gEwj8E4oHbP.Y43RdunnpKgpbny0lE) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Tu4WCh2gEwj8E4oHbP.Y43RdunnpKgpbny0lE R9SAhYMerGybF9OAjL(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            Tu4WCh2gEwj8E4oHbP.OANkd3mP6AYvwbNLJM r0 = r5.f1748sTkWmhpZ5b1ArQIw4K
            if (r0 == 0) goto L9
            Tu4WCh2gEwj8E4oHbP.Y43RdunnpKgpbny0lE r6 = r0.R9SAhYMerGybF9OAjL(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.f1730R9SAhYMerGybF9OAjL
            goto L10
        Le:
            java.util.ArrayList r0 = r5.f1723G7AC3DWIx9i9fdanjk
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            Tu4WCh2gEwj8E4oHbP.Y43RdunnpKgpbny0lE r4 = (Tu4WCh2gEwj8E4oHbP.Y43RdunnpKgpbny0lE) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f1698s3fjYDxWOUexjjVgyA
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r6 = r5.f1723G7AC3DWIx9i9fdanjk
            goto L36
        L34:
            java.util.ArrayList r6 = r5.f1730R9SAhYMerGybF9OAjL
        L36:
            java.lang.Object r6 = r6.get(r3)
            r1 = r6
            Tu4WCh2gEwj8E4oHbP.Y43RdunnpKgpbny0lE r1 = (Tu4WCh2gEwj8E4oHbP.Y43RdunnpKgpbny0lE) r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Tu4WCh2gEwj8E4oHbP.e54J8UWNHWALQNixXM.R9SAhYMerGybF9OAjL(android.view.View, boolean):Tu4WCh2gEwj8E4oHbP.Y43RdunnpKgpbny0lE");
    }

    @Override // 
    /* renamed from: T9PhQIpGRhE4yZDm1C */
    public e54J8UWNHWALQNixXM clone() {
        try {
            e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = (e54J8UWNHWALQNixXM) super.clone();
            e54j8uwnhwalqnixxm.f1729OUd9THiLjZndMj0qdF = new ArrayList();
            e54j8uwnhwalqnixxm.f1728OANkd3mP6AYvwbNLJM = new R9SAhYMerGybF9OAjL();
            e54j8uwnhwalqnixxm.f1752zaq8hOURtfwbcX17cG = new R9SAhYMerGybF9OAjL();
            e54j8uwnhwalqnixxm.f1730R9SAhYMerGybF9OAjL = null;
            e54j8uwnhwalqnixxm.f1723G7AC3DWIx9i9fdanjk = null;
            return e54j8uwnhwalqnixxm;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public abstract void TCyPEKSzIyweCN5yp1(Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE);

    public List THTDvPxsHqMeGb512f() {
        return this.f1732TCyPEKSzIyweCN5yp1;
    }

    public e54J8UWNHWALQNixXM ToH8yzk8U1nKT0PUfY(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        ArrayList arrayList = this.f1740ao3wqKm5CXFuvC0q47;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(kYHag8HRDlnO3X9zmZ);
        if (this.f1740ao3wqKm5CXFuvC0q47.size() == 0) {
            this.f1740ao3wqKm5CXFuvC0q47 = null;
        }
        return this;
    }

    public e54J8UWNHWALQNixXM Uj8rPa1EWADtk6Oe0S(long j) {
        this.f1747s3fjYDxWOUexjjVgyA = j;
        return this;
    }

    public long VItLRw50eXTZeEfGl0() {
        return this.f1747s3fjYDxWOUexjjVgyA;
    }

    public boolean W3RZ2dTDKrKpS5Mxdk(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f1746pbVGzGjWvY2LDXC8vo;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f1722Acstmh57AKoSEkEFNJ;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f1738Z9WdNiOsPR0y54zHW4;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.f1738Z9WdNiOsPR0y54zHW4.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f1741e54J8UWNHWALQNixXM != null && W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.tXWeW0sqVddf7ZBflq(view) != null && this.f1741e54J8UWNHWALQNixXM.contains(W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.tXWeW0sqVddf7ZBflq(view))) {
            return false;
        }
        if ((this.f1743husNiw3snxdgZPAGJm.size() == 0 && this.f1726KYHag8HRDlnO3X9zmZ.size() == 0 && (((arrayList = this.f1725IPyIQcaNa8aB7drBED) == null || arrayList.isEmpty()) && ((arrayList2 = this.f1732TCyPEKSzIyweCN5yp1) == null || arrayList2.isEmpty()))) || this.f1743husNiw3snxdgZPAGJm.contains(Integer.valueOf(id)) || this.f1726KYHag8HRDlnO3X9zmZ.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f1732TCyPEKSzIyweCN5yp1;
        if (arrayList6 != null && arrayList6.contains(W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.tXWeW0sqVddf7ZBflq(view))) {
            return true;
        }
        if (this.f1725IPyIQcaNa8aB7drBED != null) {
            for (int i2 = 0; i2 < this.f1725IPyIQcaNa8aB7drBED.size(); i2++) {
                if (((Class) this.f1725IPyIQcaNa8aB7drBED.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List WWC27LAMFqFFBzfbNw() {
        return this.f1743husNiw3snxdgZPAGJm;
    }

    public e54J8UWNHWALQNixXM XdzLv4NdAtTYoEzVzB(View view) {
        this.f1726KYHag8HRDlnO3X9zmZ.remove(view);
        return this;
    }

    public Y43RdunnpKgpbny0lE XzJ1BS7H9Ilbkv4eVM(View view, boolean z) {
        OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = this.f1748sTkWmhpZ5b1ArQIw4K;
        if (oANkd3mP6AYvwbNLJM != null) {
            return oANkd3mP6AYvwbNLJM.XzJ1BS7H9Ilbkv4eVM(view, z);
        }
        return (Y43RdunnpKgpbny0lE) (z ? this.f1728OANkd3mP6AYvwbNLJM : this.f1752zaq8hOURtfwbcX17cG).f1687lEeR5KfoEr4xU5yHH7.get(view);
    }

    public TimeInterpolator Y43RdunnpKgpbny0lE() {
        return this.f1751zZKhbgvUfsK4AEX3r0;
    }

    public void YlLW4G6OV9TFyuw5ix() {
        CSih7GetOUab1dYQjM();
        Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP = A49QRPHynYLCBN0SqP();
        Iterator it = this.f1729OUd9THiLjZndMj0qdF.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP.containsKey(animator)) {
                CSih7GetOUab1dYQjM();
                zcy2NNbtVXgoGQbfuq(animator, leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP);
            }
        }
        this.f1729OUd9THiLjZndMj0qdF.clear();
        OANkd3mP6AYvwbNLJM();
    }

    public void Z9WdNiOsPR0y54zHW4(ViewGroup viewGroup, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7;
        e54J8UWNHWALQNixXM(z);
        if ((this.f1743husNiw3snxdgZPAGJm.size() > 0 || this.f1726KYHag8HRDlnO3X9zmZ.size() > 0) && (((arrayList = this.f1732TCyPEKSzIyweCN5yp1) == null || arrayList.isEmpty()) && ((arrayList2 = this.f1725IPyIQcaNa8aB7drBED) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f1743husNiw3snxdgZPAGJm.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f1743husNiw3snxdgZPAGJm.get(i)).intValue());
                if (viewFindViewById != null) {
                    Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = new Y43RdunnpKgpbny0lE(viewFindViewById);
                    if (z) {
                        Acstmh57AKoSEkEFNJ(y43RdunnpKgpbny0lE);
                    } else {
                        TCyPEKSzIyweCN5yp1(y43RdunnpKgpbny0lE);
                    }
                    y43RdunnpKgpbny0lE.f1696HJFh0TGMpafqLE9haL.add(this);
                    pbVGzGjWvY2LDXC8vo(y43RdunnpKgpbny0lE);
                    zZKhbgvUfsK4AEX3r0(z ? this.f1728OANkd3mP6AYvwbNLJM : this.f1752zaq8hOURtfwbcX17cG, viewFindViewById, y43RdunnpKgpbny0lE);
                }
            }
            for (int i2 = 0; i2 < this.f1726KYHag8HRDlnO3X9zmZ.size(); i2++) {
                View view = (View) this.f1726KYHag8HRDlnO3X9zmZ.get(i2);
                Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE2 = new Y43RdunnpKgpbny0lE(view);
                if (z) {
                    Acstmh57AKoSEkEFNJ(y43RdunnpKgpbny0lE2);
                } else {
                    TCyPEKSzIyweCN5yp1(y43RdunnpKgpbny0lE2);
                }
                y43RdunnpKgpbny0lE2.f1696HJFh0TGMpafqLE9haL.add(this);
                pbVGzGjWvY2LDXC8vo(y43RdunnpKgpbny0lE2);
                zZKhbgvUfsK4AEX3r0(z ? this.f1728OANkd3mP6AYvwbNLJM : this.f1752zaq8hOURtfwbcX17cG, view, y43RdunnpKgpbny0lE2);
            }
        } else {
            IPyIQcaNa8aB7drBED(viewGroup, z);
        }
        if (z || (leer5kfoer4xu5yhh7 = this.f1736XzJ1BS7H9Ilbkv4eVM) == null) {
            return;
        }
        int size = leer5kfoer4xu5yhh7.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.f1728OANkd3mP6AYvwbNLJM.f1689zZKhbgvUfsK4AEX3r0.remove((String) this.f1736XzJ1BS7H9Ilbkv4eVM.pbVGzGjWvY2LDXC8vo(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.f1728OANkd3mP6AYvwbNLJM.f1689zZKhbgvUfsK4AEX3r0.put((String) this.f1736XzJ1BS7H9Ilbkv4eVM.T9PhQIpGRhE4yZDm1C(i4), view2);
            }
        }
    }

    public void aAp6BD79BhftLCnuvf(View view) {
        if (this.f1733THTDvPxsHqMeGb512f) {
            return;
        }
        Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP = A49QRPHynYLCBN0SqP();
        int size = leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP.size();
        ToH8yzk8U1nKT0PUfY toH8yzk8U1nKT0PUfYZZKhbgvUfsK4AEX3r0 = THTDvPxsHqMeGb512f.zZKhbgvUfsK4AEX3r0(view);
        for (int i = size - 1; i >= 0; i--) {
            zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = (zZKhbgvUfsK4AEX3r0) leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP.T9PhQIpGRhE4yZDm1C(i);
            if (zzkhbgvufsk4aex3r0.f1758lEeR5KfoEr4xU5yHH7 != null && toH8yzk8U1nKT0PUfYZZKhbgvUfsK4AEX3r0.equals(zzkhbgvufsk4aex3r0.f1760zZKhbgvUfsK4AEX3r0)) {
                Tu4WCh2gEwj8E4oHbP.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA((Animator) leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP.pbVGzGjWvY2LDXC8vo(i));
            }
        }
        ArrayList arrayList = this.f1740ao3wqKm5CXFuvC0q47;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f1740ao3wqKm5CXFuvC0q47.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((KYHag8HRDlnO3X9zmZ) arrayList2.get(i2)).HJFh0TGMpafqLE9haL(this);
            }
        }
        this.f1735WWC27LAMFqFFBzfbNw = true;
    }

    public void aPyGSIylzVNKPT1Bls(ViewGroup viewGroup, R9SAhYMerGybF9OAjL r9SAhYMerGybF9OAjL, R9SAhYMerGybF9OAjL r9SAhYMerGybF9OAjL2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE;
        int i;
        Animator animator2;
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE2;
        Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP = A49QRPHynYLCBN0SqP();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE3 = (Y43RdunnpKgpbny0lE) arrayList.get(i2);
            Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE4 = (Y43RdunnpKgpbny0lE) arrayList2.get(i2);
            if (y43RdunnpKgpbny0lE3 != null && !y43RdunnpKgpbny0lE3.f1696HJFh0TGMpafqLE9haL.contains(this)) {
                y43RdunnpKgpbny0lE3 = null;
            }
            if (y43RdunnpKgpbny0lE4 != null && !y43RdunnpKgpbny0lE4.f1696HJFh0TGMpafqLE9haL.contains(this)) {
                y43RdunnpKgpbny0lE4 = null;
            }
            if ((y43RdunnpKgpbny0lE3 != null || y43RdunnpKgpbny0lE4 != null) && (y43RdunnpKgpbny0lE3 == null || y43RdunnpKgpbny0lE4 == null || tXWeW0sqVddf7ZBflq(y43RdunnpKgpbny0lE3, y43RdunnpKgpbny0lE4))) {
                Animator animatorHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(viewGroup, y43RdunnpKgpbny0lE3, y43RdunnpKgpbny0lE4);
                if (animatorHoXrIDAFrSwfShk8da != null) {
                    if (y43RdunnpKgpbny0lE4 != null) {
                        View view2 = y43RdunnpKgpbny0lE4.f1698s3fjYDxWOUexjjVgyA;
                        String[] strArrJCtUeU2YI1poCxWcjm = jCtUeU2YI1poCxWcjm();
                        if (strArrJCtUeU2YI1poCxWcjm != null && strArrJCtUeU2YI1poCxWcjm.length > 0) {
                            y43RdunnpKgpbny0lE2 = new Y43RdunnpKgpbny0lE(view2);
                            Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE5 = (Y43RdunnpKgpbny0lE) r9SAhYMerGybF9OAjL2.f1687lEeR5KfoEr4xU5yHH7.get(view2);
                            if (y43RdunnpKgpbny0lE5 != null) {
                                int i3 = 0;
                                while (i3 < strArrJCtUeU2YI1poCxWcjm.length) {
                                    Map map = y43RdunnpKgpbny0lE2.f1697lEeR5KfoEr4xU5yHH7;
                                    Animator animator3 = animatorHoXrIDAFrSwfShk8da;
                                    String str = strArrJCtUeU2YI1poCxWcjm[i3];
                                    map.put(str, y43RdunnpKgpbny0lE5.f1697lEeR5KfoEr4xU5yHH7.get(str));
                                    i3++;
                                    animatorHoXrIDAFrSwfShk8da = animator3;
                                    strArrJCtUeU2YI1poCxWcjm = strArrJCtUeU2YI1poCxWcjm;
                                }
                            }
                            Animator animator4 = animatorHoXrIDAFrSwfShk8da;
                            int size2 = leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    animator2 = animator4;
                                    break;
                                }
                                zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = (zZKhbgvUfsK4AEX3r0) leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP.get((Animator) leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP.pbVGzGjWvY2LDXC8vo(i4));
                                if (zzkhbgvufsk4aex3r0.f1756HJFh0TGMpafqLE9haL != null && zzkhbgvufsk4aex3r0.f1758lEeR5KfoEr4xU5yHH7 == view2 && zzkhbgvufsk4aex3r0.f1759s3fjYDxWOUexjjVgyA.equals(G7AC3DWIx9i9fdanjk()) && zzkhbgvufsk4aex3r0.f1756HJFh0TGMpafqLE9haL.equals(y43RdunnpKgpbny0lE2)) {
                                    animator2 = null;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            animator2 = animatorHoXrIDAFrSwfShk8da;
                            y43RdunnpKgpbny0lE2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        y43RdunnpKgpbny0lE = y43RdunnpKgpbny0lE2;
                    } else {
                        view = y43RdunnpKgpbny0lE3.f1698s3fjYDxWOUexjjVgyA;
                        animator = animatorHoXrIDAFrSwfShk8da;
                        y43RdunnpKgpbny0lE = null;
                    }
                    if (animator != null) {
                        i = size;
                        leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP.put(animator, new zZKhbgvUfsK4AEX3r0(view, G7AC3DWIx9i9fdanjk(), this, THTDvPxsHqMeGb512f.zZKhbgvUfsK4AEX3r0(viewGroup), y43RdunnpKgpbny0lE));
                        this.f1729OUd9THiLjZndMj0qdF.add(animator);
                    }
                    i2++;
                    size = i;
                }
                i = size;
                i2++;
                size = i;
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator5 = (Animator) this.f1729OUd9THiLjZndMj0qdF.get(sparseIntArray.keyAt(i5));
                animator5.setStartDelay((sparseIntArray.valueAt(i5) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    public List ao3wqKm5CXFuvC0q47() {
        return this.f1725IPyIQcaNa8aB7drBED;
    }

    public e54J8UWNHWALQNixXM cT5Hs3CQpLK8NvlZAw(TimeInterpolator timeInterpolator) {
        this.f1751zZKhbgvUfsK4AEX3r0 = timeInterpolator;
        return this;
    }

    public final void e2F9F6h8YJxTHwLCa0(Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72, Z9WdNiOsPR0y54zHW4.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, Z9WdNiOsPR0y54zHW4.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r02) {
        View view;
        int iZ9WdNiOsPR0y54zHW4 = zzkhbgvufsk4aex3r0.Z9WdNiOsPR0y54zHW4();
        for (int i = 0; i < iZ9WdNiOsPR0y54zHW4; i++) {
            View view2 = (View) zzkhbgvufsk4aex3r0.e54J8UWNHWALQNixXM(i);
            if (view2 != null && W3RZ2dTDKrKpS5Mxdk(view2) && (view = (View) zzkhbgvufsk4aex3r02.zZKhbgvUfsK4AEX3r0(zzkhbgvufsk4aex3r0.TCyPEKSzIyweCN5yp1(i))) != null && W3RZ2dTDKrKpS5Mxdk(view)) {
                Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = (Y43RdunnpKgpbny0lE) leer5kfoer4xu5yhh7.get(view2);
                Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE2 = (Y43RdunnpKgpbny0lE) leer5kfoer4xu5yhh72.get(view);
                if (y43RdunnpKgpbny0lE != null && y43RdunnpKgpbny0lE2 != null) {
                    this.f1730R9SAhYMerGybF9OAjL.add(y43RdunnpKgpbny0lE);
                    this.f1723G7AC3DWIx9i9fdanjk.add(y43RdunnpKgpbny0lE2);
                    leer5kfoer4xu5yhh7.remove(view2);
                    leer5kfoer4xu5yhh72.remove(view);
                }
            }
        }
    }

    public void e54J8UWNHWALQNixXM(boolean z) {
        R9SAhYMerGybF9OAjL r9SAhYMerGybF9OAjL;
        if (z) {
            this.f1728OANkd3mP6AYvwbNLJM.f1687lEeR5KfoEr4xU5yHH7.clear();
            this.f1728OANkd3mP6AYvwbNLJM.f1688s3fjYDxWOUexjjVgyA.clear();
            r9SAhYMerGybF9OAjL = this.f1728OANkd3mP6AYvwbNLJM;
        } else {
            this.f1752zaq8hOURtfwbcX17cG.f1687lEeR5KfoEr4xU5yHH7.clear();
            this.f1752zaq8hOURtfwbcX17cG.f1688s3fjYDxWOUexjjVgyA.clear();
            r9SAhYMerGybF9OAjL = this.f1752zaq8hOURtfwbcX17cG;
        }
        r9SAhYMerGybF9OAjL.f1686HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7();
    }

    public void hUNBy66ZO1wVLJGW3l(TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1) {
        if (tCyPEKSzIyweCN5yp1 == null) {
            tCyPEKSzIyweCN5yp1 = f1719OqIo5QF00RDxUQb4qq;
        }
        this.f1749tXWeW0sqVddf7ZBflq = tCyPEKSzIyweCN5yp1;
    }

    public Animator hoXrIDAFrSwfShk8da(ViewGroup viewGroup, Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE, Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE2) {
        return null;
    }

    public void husNiw3snxdgZPAGJm(Animator animator) {
        if (animator == null) {
            OANkd3mP6AYvwbNLJM();
            return;
        }
        if (zaq8hOURtfwbcX17cG() >= 0) {
            animator.setDuration(zaq8hOURtfwbcX17cG());
        }
        if (VItLRw50eXTZeEfGl0() >= 0) {
            animator.setStartDelay(VItLRw50eXTZeEfGl0() + animator.getStartDelay());
        }
        if (Y43RdunnpKgpbny0lE() != null) {
            animator.setInterpolator(Y43RdunnpKgpbny0lE());
        }
        animator.addListener(new HJFh0TGMpafqLE9haL());
        animator.start();
    }

    public String[] jCtUeU2YI1poCxWcjm() {
        return null;
    }

    public e54J8UWNHWALQNixXM lEeR5KfoEr4xU5yHH7(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        if (this.f1740ao3wqKm5CXFuvC0q47 == null) {
            this.f1740ao3wqKm5CXFuvC0q47 = new ArrayList();
        }
        this.f1740ao3wqKm5CXFuvC0q47.add(kYHag8HRDlnO3X9zmZ);
        return this;
    }

    public void lLKzvdU99Iw80uVD5I(ViewGroup viewGroup) {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0;
        this.f1730R9SAhYMerGybF9OAjL = new ArrayList();
        this.f1723G7AC3DWIx9i9fdanjk = new ArrayList();
        PPkm9uUfOJHHYveeLT(this.f1728OANkd3mP6AYvwbNLJM, this.f1752zaq8hOURtfwbcX17cG);
        Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP = A49QRPHynYLCBN0SqP();
        int size = leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP.size();
        ToH8yzk8U1nKT0PUfY toH8yzk8U1nKT0PUfYZZKhbgvUfsK4AEX3r0 = THTDvPxsHqMeGb512f.zZKhbgvUfsK4AEX3r0(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP.pbVGzGjWvY2LDXC8vo(i);
            if (animator != null && (zzkhbgvufsk4aex3r0 = (zZKhbgvUfsK4AEX3r0) leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP.get(animator)) != null && zzkhbgvufsk4aex3r0.f1758lEeR5KfoEr4xU5yHH7 != null && toH8yzk8U1nKT0PUfYZZKhbgvUfsK4AEX3r0.equals(zzkhbgvufsk4aex3r0.f1760zZKhbgvUfsK4AEX3r0)) {
                Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = zzkhbgvufsk4aex3r0.f1756HJFh0TGMpafqLE9haL;
                View view = zzkhbgvufsk4aex3r0.f1758lEeR5KfoEr4xU5yHH7;
                Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lEXzJ1BS7H9Ilbkv4eVM = XzJ1BS7H9Ilbkv4eVM(view, true);
                Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lER9SAhYMerGybF9OAjL = R9SAhYMerGybF9OAjL(view, true);
                if (y43RdunnpKgpbny0lEXzJ1BS7H9Ilbkv4eVM == null && y43RdunnpKgpbny0lER9SAhYMerGybF9OAjL == null) {
                    y43RdunnpKgpbny0lER9SAhYMerGybF9OAjL = (Y43RdunnpKgpbny0lE) this.f1752zaq8hOURtfwbcX17cG.f1687lEeR5KfoEr4xU5yHH7.get(view);
                }
                if ((y43RdunnpKgpbny0lEXzJ1BS7H9Ilbkv4eVM != null || y43RdunnpKgpbny0lER9SAhYMerGybF9OAjL != null) && zzkhbgvufsk4aex3r0.f1757husNiw3snxdgZPAGJm.tXWeW0sqVddf7ZBflq(y43RdunnpKgpbny0lE, y43RdunnpKgpbny0lER9SAhYMerGybF9OAjL)) {
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        leer5kfoer4xu5yhh7A49QRPHynYLCBN0SqP.remove(animator);
                    }
                }
            }
        }
        aPyGSIylzVNKPT1Bls(viewGroup, this.f1728OANkd3mP6AYvwbNLJM, this.f1752zaq8hOURtfwbcX17cG, this.f1730R9SAhYMerGybF9OAjL, this.f1723G7AC3DWIx9i9fdanjk);
        YlLW4G6OV9TFyuw5ix();
    }

    public e54J8UWNHWALQNixXM oocVJL811qFf0j0XXZ(long j) {
        this.f1724HJFh0TGMpafqLE9haL = j;
        return this;
    }

    public String osrHU7fvDp2EgxZPfM(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f1724HJFh0TGMpafqLE9haL != -1) {
            str2 = str2 + "dur(" + this.f1724HJFh0TGMpafqLE9haL + ") ";
        }
        if (this.f1747s3fjYDxWOUexjjVgyA != -1) {
            str2 = str2 + "dly(" + this.f1747s3fjYDxWOUexjjVgyA + ") ";
        }
        if (this.f1751zZKhbgvUfsK4AEX3r0 != null) {
            str2 = str2 + "interp(" + this.f1751zZKhbgvUfsK4AEX3r0 + ") ";
        }
        if (this.f1743husNiw3snxdgZPAGJm.size() <= 0 && this.f1726KYHag8HRDlnO3X9zmZ.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f1743husNiw3snxdgZPAGJm.size() > 0) {
            for (int i = 0; i < this.f1743husNiw3snxdgZPAGJm.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f1743husNiw3snxdgZPAGJm.get(i);
            }
        }
        if (this.f1726KYHag8HRDlnO3X9zmZ.size() > 0) {
            for (int i2 = 0; i2 < this.f1726KYHag8HRDlnO3X9zmZ.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f1726KYHag8HRDlnO3X9zmZ.get(i2);
            }
        }
        return str3 + ")";
    }

    public e54J8UWNHWALQNixXM s3fjYDxWOUexjjVgyA(View view) {
        this.f1726KYHag8HRDlnO3X9zmZ.add(view);
        return this;
    }

    public husNiw3snxdgZPAGJm sTkWmhpZ5b1ArQIw4K() {
        return this.f1744jCtUeU2YI1poCxWcjm;
    }

    public boolean tXWeW0sqVddf7ZBflq(Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE, Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE2) {
        if (y43RdunnpKgpbny0lE == null || y43RdunnpKgpbny0lE2 == null) {
            return false;
        }
        String[] strArrJCtUeU2YI1poCxWcjm = jCtUeU2YI1poCxWcjm();
        if (strArrJCtUeU2YI1poCxWcjm == null) {
            Iterator it = y43RdunnpKgpbny0lE.f1697lEeR5KfoEr4xU5yHH7.keySet().iterator();
            while (it.hasNext()) {
                if (OqIo5QF00RDxUQb4qq(y43RdunnpKgpbny0lE, y43RdunnpKgpbny0lE2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrJCtUeU2YI1poCxWcjm) {
            if (!OqIo5QF00RDxUQb4qq(y43RdunnpKgpbny0lE, y43RdunnpKgpbny0lE2, str)) {
            }
        }
        return false;
        return true;
    }

    public String toString() {
        return osrHU7fvDp2EgxZPfM("");
    }

    public void udcVtCzLTM1Loe9KrX(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        this.f1744jCtUeU2YI1poCxWcjm = husniw3snxdgzpagjm;
    }

    public TCyPEKSzIyweCN5yp1 xHA29AmDt6y96AnB3t() {
        return this.f1749tXWeW0sqVddf7ZBflq;
    }

    public long zaq8hOURtfwbcX17cG() {
        return this.f1724HJFh0TGMpafqLE9haL;
    }

    public final void zcy2NNbtVXgoGQbfuq(Animator animator, Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        if (animator != null) {
            animator.addListener(new s3fjYDxWOUexjjVgyA(leer5kfoer4xu5yhh7));
            husNiw3snxdgZPAGJm(animator);
        }
    }

    public void bMSdooljgH14Jgudph(aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
    }

    public void pbVGzGjWvY2LDXC8vo(Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE) {
    }
}
