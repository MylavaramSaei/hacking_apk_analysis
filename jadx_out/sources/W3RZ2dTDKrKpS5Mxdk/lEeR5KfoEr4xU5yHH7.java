package W3RZ2dTDKrKpS5Mxdk;

import OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final View.AccessibilityDelegate f1891HJFh0TGMpafqLE9haL = new View.AccessibilityDelegate();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final View.AccessibilityDelegate f1892lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final View.AccessibilityDelegate f1893s3fjYDxWOUexjjVgyA;

    /* renamed from: W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public static final class C0022lEeR5KfoEr4xU5yHH7 extends View.AccessibilityDelegate {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final lEeR5KfoEr4xU5yHH7 f1894lEeR5KfoEr4xU5yHH7;

        public C0022lEeR5KfoEr4xU5yHH7(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            this.f1894lEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f1894lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            OqIo5QF00RDxUQb4qq.VItLRw50eXTZeEfGl0 vItLRw50eXTZeEfGl0S3fjYDxWOUexjjVgyA = this.f1894lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(view);
            if (vItLRw50eXTZeEfGl0S3fjYDxWOUexjjVgyA != null) {
                return (AccessibilityNodeProvider) vItLRw50eXTZeEfGl0S3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1894lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqPI8aHOwH04efS6lZ3Oa = OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP.i8aHOwH04efS6lZ3Oa(accessibilityNodeInfo);
            a49QRPHynYLCBN0SqPI8aHOwH04efS6lZ3Oa.f2zPq7MOnQrtOlZ1Zg(lLKzvdU99Iw80uVD5I.LU0fFDMACqnfIfA1AZ(view));
            a49QRPHynYLCBN0SqPI8aHOwH04efS6lZ3Oa.bBVlTkqEpHW053CjWL(lLKzvdU99Iw80uVD5I.PPkm9uUfOJHHYveeLT(view));
            a49QRPHynYLCBN0SqPI8aHOwH04efS6lZ3Oa.Fo9071MN8vwEWamAUX(lLKzvdU99Iw80uVD5I.e54J8UWNHWALQNixXM(view));
            a49QRPHynYLCBN0SqPI8aHOwH04efS6lZ3Oa.pgB7Gmjz55y9NQYnAD(lLKzvdU99Iw80uVD5I.XzJ1BS7H9Ilbkv4eVM(view));
            this.f1894lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(view, a49QRPHynYLCBN0SqPI8aHOwH04efS6lZ3Oa);
            a49QRPHynYLCBN0SqPI8aHOwH04efS6lZ3Oa.husNiw3snxdgZPAGJm(accessibilityNodeInfo.getText(), view);
            List listHJFh0TGMpafqLE9haL = lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(view);
            for (int i = 0; i < listHJFh0TGMpafqLE9haL.size(); i++) {
                a49QRPHynYLCBN0SqPI8aHOwH04efS6lZ3Oa.s3fjYDxWOUexjjVgyA((A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7) listHJFh0TGMpafqLE9haL.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1894lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f1894lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f1894lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f1894lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f1894lEeR5KfoEr4xU5yHH7.T9PhQIpGRhE4yZDm1C(view, accessibilityEvent);
        }
    }

    public lEeR5KfoEr4xU5yHH7() {
        this(f1891HJFh0TGMpafqLE9haL);
    }

    public static List HJFh0TGMpafqLE9haL(View view) {
        List list = (List) view.getTag(G7AC3DWIx9i9fdanjk.HJFh0TGMpafqLE9haL.f201OqIo5QF00RDxUQb4qq);
        return list == null ? Collections.emptyList() : list;
    }

    public boolean Acstmh57AKoSEkEFNJ(View view, int i, Bundle bundle) {
        List listHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(view);
        boolean zPerformAccessibilityAction = false;
        int i2 = 0;
        while (true) {
            if (i2 >= listHJFh0TGMpafqLE9haL.size()) {
                break;
            }
            A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (A49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7) listHJFh0TGMpafqLE9haL.get(i2);
            if (leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA() == i) {
                zPerformAccessibilityAction = leer5kfoer4xu5yhh7.zZKhbgvUfsK4AEX3r0(view, bundle);
                break;
            }
            i2++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f1892lEeR5KfoEr4xU5yHH7.performAccessibilityAction(view, i, bundle);
        }
        return (zPerformAccessibilityAction || i != G7AC3DWIx9i9fdanjk.HJFh0TGMpafqLE9haL.f223lEeR5KfoEr4xU5yHH7 || bundle == null) ? zPerformAccessibilityAction : Z9WdNiOsPR0y54zHW4(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void IPyIQcaNa8aB7drBED(View view, AccessibilityEvent accessibilityEvent) {
        this.f1892lEeR5KfoEr4xU5yHH7.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void KYHag8HRDlnO3X9zmZ(View view, AccessibilityEvent accessibilityEvent) {
        this.f1892lEeR5KfoEr4xU5yHH7.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void T9PhQIpGRhE4yZDm1C(View view, AccessibilityEvent accessibilityEvent) {
        this.f1892lEeR5KfoEr4xU5yHH7.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public void TCyPEKSzIyweCN5yp1(View view, OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
        this.f1892lEeR5KfoEr4xU5yHH7.onInitializeAccessibilityNodeInfo(view, a49QRPHynYLCBN0SqP.vlBaBOcZ1q1ndWVoXn());
    }

    public final boolean Z9WdNiOsPR0y54zHW4(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(G7AC3DWIx9i9fdanjk.HJFh0TGMpafqLE9haL.f192GyWRxpdt1T8mEJXPoD);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!husNiw3snxdgZPAGJm(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public void e54J8UWNHWALQNixXM(View view, int i) {
        this.f1892lEeR5KfoEr4xU5yHH7.sendAccessibilityEvent(view, i);
    }

    public final boolean husNiw3snxdgZPAGJm(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrZaq8hOURtfwbcX17cG = OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP.zaq8hOURtfwbcX17cG(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; clickableSpanArrZaq8hOURtfwbcX17cG != null && i < clickableSpanArrZaq8hOURtfwbcX17cG.length; i++) {
                if (clickableSpan.equals(clickableSpanArrZaq8hOURtfwbcX17cG[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean lEeR5KfoEr4xU5yHH7(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1892lEeR5KfoEr4xU5yHH7.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean pbVGzGjWvY2LDXC8vo(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1892lEeR5KfoEr4xU5yHH7.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public OqIo5QF00RDxUQb4qq.VItLRw50eXTZeEfGl0 s3fjYDxWOUexjjVgyA(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f1892lEeR5KfoEr4xU5yHH7.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new OqIo5QF00RDxUQb4qq.VItLRw50eXTZeEfGl0(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate zZKhbgvUfsK4AEX3r0() {
        return this.f1893s3fjYDxWOUexjjVgyA;
    }

    public lEeR5KfoEr4xU5yHH7(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1892lEeR5KfoEr4xU5yHH7 = accessibilityDelegate;
        this.f1893s3fjYDxWOUexjjVgyA = new C0022lEeR5KfoEr4xU5yHH7(this);
    }
}
