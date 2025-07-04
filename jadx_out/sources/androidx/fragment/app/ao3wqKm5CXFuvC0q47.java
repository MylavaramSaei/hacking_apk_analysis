package androidx.fragment.app;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ao3wqKm5CXFuvC0q47 {

    public class lEeR5KfoEr4xU5yHH7 implements Runnable {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3598HJFh0TGMpafqLE9haL;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3600husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ int f3601lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3602s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3603zZKhbgvUfsK4AEX3r0;

        public lEeR5KfoEr4xU5yHH7(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f3601lEeR5KfoEr4xU5yHH7 = i;
            this.f3602s3fjYDxWOUexjjVgyA = arrayList;
            this.f3598HJFh0TGMpafqLE9haL = arrayList2;
            this.f3603zZKhbgvUfsK4AEX3r0 = arrayList3;
            this.f3600husNiw3snxdgZPAGJm = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f3601lEeR5KfoEr4xU5yHH7; i++) {
                lLKzvdU99Iw80uVD5I.f2zPq7MOnQrtOlZ1Zg((View) this.f3602s3fjYDxWOUexjjVgyA.get(i), (String) this.f3598HJFh0TGMpafqLE9haL.get(i));
                lLKzvdU99Iw80uVD5I.f2zPq7MOnQrtOlZ1Zg((View) this.f3603zZKhbgvUfsK4AEX3r0.get(i), (String) this.f3600husNiw3snxdgZPAGJm.get(i));
            }
        }
    }

    public static boolean TCyPEKSzIyweCN5yp1(List list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean pbVGzGjWvY2LDXC8vo(List list) {
        return list == null || list.isEmpty();
    }

    public static void zZKhbgvUfsK4AEX3r0(List list, View view) {
        int size = list.size();
        if (TCyPEKSzIyweCN5yp1(list, view, size)) {
            return;
        }
        if (lLKzvdU99Iw80uVD5I.tXWeW0sqVddf7ZBflq(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = (View) list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!TCyPEKSzIyweCN5yp1(list, childAt, size) && lLKzvdU99Iw80uVD5I.tXWeW0sqVddf7ZBflq(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public abstract Object Acstmh57AKoSEkEFNJ(Object obj, Object obj2, Object obj3);

    public abstract Object G7AC3DWIx9i9fdanjk(Object obj);

    public abstract void HJFh0TGMpafqLE9haL(ViewGroup viewGroup, Object obj);

    public void IPyIQcaNa8aB7drBED(View view, Rect rect) {
        if (lLKzvdU99Iw80uVD5I.aAp6BD79BhftLCnuvf(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object KYHag8HRDlnO3X9zmZ(Object obj);

    public abstract void OANkd3mP6AYvwbNLJM(Object obj, View view);

    public abstract void R9SAhYMerGybF9OAjL(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract void T9PhQIpGRhE4yZDm1C(Object obj, View view, ArrayList arrayList);

    public abstract void Y43RdunnpKgpbny0lE(Object obj, View view, ArrayList arrayList);

    public abstract Object Z9WdNiOsPR0y54zHW4(Object obj, Object obj2, Object obj3);

    public abstract void aPyGSIylzVNKPT1Bls(Object obj, Rect rect);

    public ArrayList e54J8UWNHWALQNixXM(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(lLKzvdU99Iw80uVD5I.tXWeW0sqVddf7ZBflq(view));
            lLKzvdU99Iw80uVD5I.f2zPq7MOnQrtOlZ1Zg(view, null);
        }
        return arrayList2;
    }

    public abstract void hoXrIDAFrSwfShk8da(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract boolean husNiw3snxdgZPAGJm(Object obj);

    public abstract void lEeR5KfoEr4xU5yHH7(Object obj, View view);

    public abstract void s3fjYDxWOUexjjVgyA(Object obj, ArrayList arrayList);

    public void sTkWmhpZ5b1ArQIw4K(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String strTXWeW0sqVddf7ZBflq = lLKzvdU99Iw80uVD5I.tXWeW0sqVddf7ZBflq(view2);
            arrayList4.add(strTXWeW0sqVddf7ZBflq);
            if (strTXWeW0sqVddf7ZBflq != null) {
                lLKzvdU99Iw80uVD5I.f2zPq7MOnQrtOlZ1Zg(view2, null);
                String str = (String) map.get(strTXWeW0sqVddf7ZBflq);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i2))) {
                        lLKzvdU99Iw80uVD5I.f2zPq7MOnQrtOlZ1Zg((View) arrayList2.get(i2), strTXWeW0sqVddf7ZBflq);
                        break;
                    }
                    i2++;
                }
            }
        }
        W3RZ2dTDKrKpS5Mxdk.tXWeW0sqVddf7ZBflq.lEeR5KfoEr4xU5yHH7(view, new lEeR5KfoEr4xU5yHH7(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public void zaq8hOURtfwbcX17cG(Fragment fragment, Object obj, OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Runnable runnable) {
        runnable.run();
    }
}
