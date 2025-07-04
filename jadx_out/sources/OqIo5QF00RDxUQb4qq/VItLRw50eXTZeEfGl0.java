package OqIo5QF00RDxUQb4qq;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class VItLRw50eXTZeEfGl0 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Object f1248lEeR5KfoEr4xU5yHH7;

    public static class lEeR5KfoEr4xU5yHH7 extends AccessibilityNodeProvider {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final VItLRw50eXTZeEfGl0 f1249lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7(VItLRw50eXTZeEfGl0 vItLRw50eXTZeEfGl0) {
            this.f1249lEeR5KfoEr4xU5yHH7 = vItLRw50eXTZeEfGl0;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqPS3fjYDxWOUexjjVgyA = this.f1249lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(i);
            if (a49QRPHynYLCBN0SqPS3fjYDxWOUexjjVgyA == null) {
                return null;
            }
            return a49QRPHynYLCBN0SqPS3fjYDxWOUexjjVgyA.vlBaBOcZ1q1ndWVoXn();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i) {
            List listHJFh0TGMpafqLE9haL = this.f1249lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(str, i);
            if (listHJFh0TGMpafqLE9haL == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listHJFh0TGMpafqLE9haL.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((A49QRPHynYLCBN0SqP) listHJFh0TGMpafqLE9haL.get(i2)).vlBaBOcZ1q1ndWVoXn());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqPZZKhbgvUfsK4AEX3r0 = this.f1249lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(i);
            if (a49QRPHynYLCBN0SqPZZKhbgvUfsK4AEX3r0 == null) {
                return null;
            }
            return a49QRPHynYLCBN0SqPZZKhbgvUfsK4AEX3r0.vlBaBOcZ1q1ndWVoXn();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f1249lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(i, i2, bundle);
        }
    }

    public static class s3fjYDxWOUexjjVgyA extends lEeR5KfoEr4xU5yHH7 {
        public s3fjYDxWOUexjjVgyA(VItLRw50eXTZeEfGl0 vItLRw50eXTZeEfGl0) {
            super(vItLRw50eXTZeEfGl0);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f1249lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(i, A49QRPHynYLCBN0SqP.i8aHOwH04efS6lZ3Oa(accessibilityNodeInfo), str, bundle);
        }
    }

    public VItLRw50eXTZeEfGl0() {
        this.f1248lEeR5KfoEr4xU5yHH7 = Build.VERSION.SDK_INT >= 26 ? new s3fjYDxWOUexjjVgyA(this) : new lEeR5KfoEr4xU5yHH7(this);
    }

    public List HJFh0TGMpafqLE9haL(String str, int i) {
        return null;
    }

    public boolean KYHag8HRDlnO3X9zmZ(int i, int i2, Bundle bundle) {
        return false;
    }

    public Object husNiw3snxdgZPAGJm() {
        return this.f1248lEeR5KfoEr4xU5yHH7;
    }

    public A49QRPHynYLCBN0SqP s3fjYDxWOUexjjVgyA(int i) {
        return null;
    }

    public A49QRPHynYLCBN0SqP zZKhbgvUfsK4AEX3r0(int i) {
        return null;
    }

    public VItLRw50eXTZeEfGl0(Object obj) {
        this.f1248lEeR5KfoEr4xU5yHH7 = obj;
    }

    public void lEeR5KfoEr4xU5yHH7(int i, A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP, String str, Bundle bundle) {
    }
}
