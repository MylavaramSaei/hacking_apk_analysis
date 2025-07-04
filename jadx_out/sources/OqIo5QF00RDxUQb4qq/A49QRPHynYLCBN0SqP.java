package OqIo5QF00RDxUQb4qq;

import OqIo5QF00RDxUQb4qq.THTDvPxsHqMeGb512f;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class A49QRPHynYLCBN0SqP {

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static int f1193zZKhbgvUfsK4AEX3r0;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final AccessibilityNodeInfo f1195lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f1196s3fjYDxWOUexjjVgyA = -1;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f1194HJFh0TGMpafqLE9haL = -1;

    public static class HJFh0TGMpafqLE9haL {
        public static void Acstmh57AKoSEkEFNJ(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }

        public static String HJFh0TGMpafqLE9haL(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static boolean IPyIQcaNa8aB7drBED(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static A49QRPHynYLCBN0SqP KYHag8HRDlnO3X9zmZ(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            return A49QRPHynYLCBN0SqP.owCQzRKpGarpL4247z(accessibilityNodeInfo.getParent(i));
        }

        public static String TCyPEKSzIyweCN5yp1(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo husNiw3snxdgZPAGJm(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static KYHag8HRDlnO3X9zmZ lEeR5KfoEr4xU5yHH7(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
            return new KYHag8HRDlnO3X9zmZ(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static void pbVGzGjWvY2LDXC8vo(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setTextSelectable(z);
        }

        public static A49QRPHynYLCBN0SqP s3fjYDxWOUexjjVgyA(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
            return A49QRPHynYLCBN0SqP.owCQzRKpGarpL4247z(accessibilityNodeInfo.getChild(i, i2));
        }

        public static String zZKhbgvUfsK4AEX3r0(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }
    }

    public static class KYHag8HRDlnO3X9zmZ {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Object f1197lEeR5KfoEr4xU5yHH7;

        public KYHag8HRDlnO3X9zmZ(Object obj) {
            this.f1197lEeR5KfoEr4xU5yHH7 = obj;
        }

        public static KYHag8HRDlnO3X9zmZ lEeR5KfoEr4xU5yHH7(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new KYHag8HRDlnO3X9zmZ(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    public static class husNiw3snxdgZPAGJm {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Object f1198lEeR5KfoEr4xU5yHH7;

        public husNiw3snxdgZPAGJm(Object obj) {
            this.f1198lEeR5KfoEr4xU5yHH7 = obj;
        }

        public static husNiw3snxdgZPAGJm lEeR5KfoEr4xU5yHH7(int i, int i2, boolean z, int i3) {
            return new husNiw3snxdgZPAGJm(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: DfpieXfdYs58yZAiXY, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1201DfpieXfdYs58yZAiXY;

        /* renamed from: GyWRxpdt1T8mEJXPoD, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1203GyWRxpdt1T8mEJXPoD;

        /* renamed from: KqgKJKIWne3kz1AdHk, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1206KqgKJKIWne3kz1AdHk;

        /* renamed from: LU0fFDMACqnfIfA1AZ, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1208LU0fFDMACqnfIfA1AZ;

        /* renamed from: OUd9THiLjZndMj0qdF, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1210OUd9THiLjZndMj0qdF;

        /* renamed from: OqIo5QF00RDxUQb4qq, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1211OqIo5QF00RDxUQb4qq;

        /* renamed from: PPkm9uUfOJHHYveeLT, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1212PPkm9uUfOJHHYveeLT;

        /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1216THTDvPxsHqMeGb512f;

        /* renamed from: ToH8yzk8U1nKT0PUfY, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1217ToH8yzk8U1nKT0PUfY;

        /* renamed from: W3RZ2dTDKrKpS5Mxdk, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1219W3RZ2dTDKrKpS5Mxdk;

        /* renamed from: XdzLv4NdAtTYoEzVzB, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1221XdzLv4NdAtTYoEzVzB;

        /* renamed from: XzJ1BS7H9Ilbkv4eVM, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1222XzJ1BS7H9Ilbkv4eVM;

        /* renamed from: YlLW4G6OV9TFyuw5ix, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1224YlLW4G6OV9TFyuw5ix;

        /* renamed from: aAp6BD79BhftLCnuvf, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1226aAp6BD79BhftLCnuvf;

        /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1228ao3wqKm5CXFuvC0q47;

        /* renamed from: e2F9F6h8YJxTHwLCa0, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1229e2F9F6h8YJxTHwLCa0;

        /* renamed from: jCtUeU2YI1poCxWcjm, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1233jCtUeU2YI1poCxWcjm;

        /* renamed from: lLKzvdU99Iw80uVD5I, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1234lLKzvdU99Iw80uVD5I;

        /* renamed from: oocVJL811qFf0j0XXZ, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1235oocVJL811qFf0j0XXZ;

        /* renamed from: tXWeW0sqVddf7ZBflq, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1238tXWeW0sqVddf7ZBflq;

        /* renamed from: udcVtCzLTM1Loe9KrX, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1239udcVtCzLTM1Loe9KrX;

        /* renamed from: zcy2NNbtVXgoGQbfuq, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1242zcy2NNbtVXgoGQbfuq;

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final Class f1243HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Object f1244lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final int f1245s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final THTDvPxsHqMeGb512f f1246zZKhbgvUfsK4AEX3r0;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1232husNiw3snxdgZPAGJm = new lEeR5KfoEr4xU5yHH7(1, null);

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1205KYHag8HRDlnO3X9zmZ = new lEeR5KfoEr4xU5yHH7(2, null);

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1215TCyPEKSzIyweCN5yp1 = new lEeR5KfoEr4xU5yHH7(4, null);

        /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1204IPyIQcaNa8aB7drBED = new lEeR5KfoEr4xU5yHH7(8, null);

        /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1236pbVGzGjWvY2LDXC8vo = new lEeR5KfoEr4xU5yHH7(16, null);

        /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1200Acstmh57AKoSEkEFNJ = new lEeR5KfoEr4xU5yHH7(32, null);

        /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1225Z9WdNiOsPR0y54zHW4 = new lEeR5KfoEr4xU5yHH7(64, null);

        /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1230e54J8UWNHWALQNixXM = new lEeR5KfoEr4xU5yHH7(128, null);

        /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1214T9PhQIpGRhE4yZDm1C = new lEeR5KfoEr4xU5yHH7(256, (CharSequence) null, THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA.class);

        /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1231hoXrIDAFrSwfShk8da = new lEeR5KfoEr4xU5yHH7(512, (CharSequence) null, THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA.class);

        /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1227aPyGSIylzVNKPT1Bls = new lEeR5KfoEr4xU5yHH7(1024, (CharSequence) null, THTDvPxsHqMeGb512f.HJFh0TGMpafqLE9haL.class);

        /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1209OANkd3mP6AYvwbNLJM = new lEeR5KfoEr4xU5yHH7(2048, (CharSequence) null, THTDvPxsHqMeGb512f.HJFh0TGMpafqLE9haL.class);

        /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1241zaq8hOURtfwbcX17cG = new lEeR5KfoEr4xU5yHH7(4096, null);

        /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1237sTkWmhpZ5b1ArQIw4K = new lEeR5KfoEr4xU5yHH7(8192, null);

        /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1223Y43RdunnpKgpbny0lE = new lEeR5KfoEr4xU5yHH7(16384, null);

        /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1213R9SAhYMerGybF9OAjL = new lEeR5KfoEr4xU5yHH7(32768, null);

        /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1202G7AC3DWIx9i9fdanjk = new lEeR5KfoEr4xU5yHH7(65536, null);

        /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1240xHA29AmDt6y96AnB3t = new lEeR5KfoEr4xU5yHH7(131072, (CharSequence) null, THTDvPxsHqMeGb512f.TCyPEKSzIyweCN5yp1.class);

        /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1207LIMtzhnLwQyigzK0KO = new lEeR5KfoEr4xU5yHH7(262144, null);

        /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1199A49QRPHynYLCBN0SqP = new lEeR5KfoEr4xU5yHH7(524288, null);

        /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1218VItLRw50eXTZeEfGl0 = new lEeR5KfoEr4xU5yHH7(1048576, null);

        /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f1220WWC27LAMFqFFBzfbNw = new lEeR5KfoEr4xU5yHH7(2097152, (CharSequence) null, THTDvPxsHqMeGb512f.IPyIQcaNa8aB7drBED.class);

        static {
            int i = Build.VERSION.SDK_INT;
            f1216THTDvPxsHqMeGb512f = new lEeR5KfoEr4xU5yHH7(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f1228ao3wqKm5CXFuvC0q47 = new lEeR5KfoEr4xU5yHH7(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, THTDvPxsHqMeGb512f.husNiw3snxdgZPAGJm.class);
            f1210OUd9THiLjZndMj0qdF = new lEeR5KfoEr4xU5yHH7(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f1233jCtUeU2YI1poCxWcjm = new lEeR5KfoEr4xU5yHH7(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f1222XzJ1BS7H9Ilbkv4eVM = new lEeR5KfoEr4xU5yHH7(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f1238tXWeW0sqVddf7ZBflq = new lEeR5KfoEr4xU5yHH7(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f1219W3RZ2dTDKrKpS5Mxdk = new lEeR5KfoEr4xU5yHH7(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f1211OqIo5QF00RDxUQb4qq = new lEeR5KfoEr4xU5yHH7(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f1203GyWRxpdt1T8mEJXPoD = new lEeR5KfoEr4xU5yHH7(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f1201DfpieXfdYs58yZAiXY = new lEeR5KfoEr4xU5yHH7(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f1229e2F9F6h8YJxTHwLCa0 = new lEeR5KfoEr4xU5yHH7(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f1206KqgKJKIWne3kz1AdHk = new lEeR5KfoEr4xU5yHH7(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, THTDvPxsHqMeGb512f.KYHag8HRDlnO3X9zmZ.class);
            f1212PPkm9uUfOJHHYveeLT = new lEeR5KfoEr4xU5yHH7(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, THTDvPxsHqMeGb512f.zZKhbgvUfsK4AEX3r0.class);
            f1226aAp6BD79BhftLCnuvf = new lEeR5KfoEr4xU5yHH7(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f1234lLKzvdU99Iw80uVD5I = new lEeR5KfoEr4xU5yHH7(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f1217ToH8yzk8U1nKT0PUfY = new lEeR5KfoEr4xU5yHH7(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f1221XdzLv4NdAtTYoEzVzB = new lEeR5KfoEr4xU5yHH7(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f1208LU0fFDMACqnfIfA1AZ = new lEeR5KfoEr4xU5yHH7(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f1242zcy2NNbtVXgoGQbfuq = new lEeR5KfoEr4xU5yHH7(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f1224YlLW4G6OV9TFyuw5ix = new lEeR5KfoEr4xU5yHH7(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f1235oocVJL811qFf0j0XXZ = new lEeR5KfoEr4xU5yHH7(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f1239udcVtCzLTM1Loe9KrX = new lEeR5KfoEr4xU5yHH7(i >= 34 ? zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public lEeR5KfoEr4xU5yHH7(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        public CharSequence HJFh0TGMpafqLE9haL() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f1244lEeR5KfoEr4xU5yHH7).getLabel();
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof lEeR5KfoEr4xU5yHH7)) {
                return false;
            }
            Object obj2 = this.f1244lEeR5KfoEr4xU5yHH7;
            Object obj3 = ((lEeR5KfoEr4xU5yHH7) obj).f1244lEeR5KfoEr4xU5yHH7;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f1244lEeR5KfoEr4xU5yHH7;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH7(CharSequence charSequence, THTDvPxsHqMeGb512f tHTDvPxsHqMeGb512f) {
            return new lEeR5KfoEr4xU5yHH7(null, this.f1245s3fjYDxWOUexjjVgyA, charSequence, tHTDvPxsHqMeGb512f, this.f1243HJFh0TGMpafqLE9haL);
        }

        public int s3fjYDxWOUexjjVgyA() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f1244lEeR5KfoEr4xU5yHH7).getId();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String strPbVGzGjWvY2LDXC8vo = A49QRPHynYLCBN0SqP.pbVGzGjWvY2LDXC8vo(this.f1245s3fjYDxWOUexjjVgyA);
            if (strPbVGzGjWvY2LDXC8vo.equals("ACTION_UNKNOWN") && HJFh0TGMpafqLE9haL() != null) {
                strPbVGzGjWvY2LDXC8vo = HJFh0TGMpafqLE9haL().toString();
            }
            sb.append(strPbVGzGjWvY2LDXC8vo);
            return sb.toString();
        }

        public boolean zZKhbgvUfsK4AEX3r0(View view, Bundle bundle) {
            if (this.f1246zZKhbgvUfsK4AEX3r0 == null) {
                return false;
            }
            Class cls = this.f1243HJFh0TGMpafqLE9haL;
            if (cls != null) {
                try {
                    androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(cls.getDeclaredConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception e) {
                    Class cls2 = this.f1243HJFh0TGMpafqLE9haL;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                }
            }
            return this.f1246zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(view, null);
        }

        public lEeR5KfoEr4xU5yHH7(int i, CharSequence charSequence, THTDvPxsHqMeGb512f tHTDvPxsHqMeGb512f) {
            this(null, i, charSequence, tHTDvPxsHqMeGb512f, null);
        }

        public lEeR5KfoEr4xU5yHH7(int i, CharSequence charSequence, Class cls) {
            this(null, i, charSequence, null, cls);
        }

        public lEeR5KfoEr4xU5yHH7(Object obj) {
            this(obj, 0, null, null, null);
        }

        public lEeR5KfoEr4xU5yHH7(Object obj, int i, CharSequence charSequence, THTDvPxsHqMeGb512f tHTDvPxsHqMeGb512f, Class cls) {
            this.f1245s3fjYDxWOUexjjVgyA = i;
            this.f1246zZKhbgvUfsK4AEX3r0 = tHTDvPxsHqMeGb512f;
            this.f1244lEeR5KfoEr4xU5yHH7 = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : obj;
            this.f1243HJFh0TGMpafqLE9haL = cls;
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public static void HJFh0TGMpafqLE9haL(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }

        public static Object lEeR5KfoEr4xU5yHH7(int i, float f, float f2, float f3) {
            return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
        }

        public static CharSequence s3fjYDxWOUexjjVgyA(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 {
        public static void Acstmh57AKoSEkEFNJ(AccessibilityNodeInfo accessibilityNodeInfo, long j) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j));
        }

        public static CharSequence HJFh0TGMpafqLE9haL(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static void IPyIQcaNa8aB7drBED(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static boolean KYHag8HRDlnO3X9zmZ(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void TCyPEKSzIyweCN5yp1(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z);
        }

        public static void Z9WdNiOsPR0y54zHW4(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z);
        }

        public static void e54J8UWNHWALQNixXM(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z);
        }

        public static boolean husNiw3snxdgZPAGJm(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static AccessibilityNodeInfo.AccessibilityAction lEeR5KfoEr4xU5yHH7() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void pbVGzGjWvY2LDXC8vo(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void s3fjYDxWOUexjjVgyA(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static long zZKhbgvUfsK4AEX3r0(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }
    }

    public A49QRPHynYLCBN0SqP(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1195lEeR5KfoEr4xU5yHH7 = accessibilityNodeInfo;
    }

    public static A49QRPHynYLCBN0SqP Uj8rPa1EWADtk6Oe0S(View view) {
        return i8aHOwH04efS6lZ3Oa(AccessibilityNodeInfo.obtain(view));
    }

    public static A49QRPHynYLCBN0SqP bMSdooljgH14Jgudph(A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
        return i8aHOwH04efS6lZ3Oa(AccessibilityNodeInfo.obtain(a49QRPHynYLCBN0SqP.f1195lEeR5KfoEr4xU5yHH7));
    }

    public static A49QRPHynYLCBN0SqP hUNBy66ZO1wVLJGW3l() {
        return i8aHOwH04efS6lZ3Oa(AccessibilityNodeInfo.obtain());
    }

    public static A49QRPHynYLCBN0SqP i8aHOwH04efS6lZ3Oa(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new A49QRPHynYLCBN0SqP(accessibilityNodeInfo);
    }

    public static A49QRPHynYLCBN0SqP owCQzRKpGarpL4247z(Object obj) {
        if (obj != null) {
            return new A49QRPHynYLCBN0SqP(obj);
        }
        return null;
    }

    public static String pbVGzGjWvY2LDXC8vo(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] zaq8hOURtfwbcX17cG(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public CharSequence A49QRPHynYLCBN0SqP() {
        return this.f1195lEeR5KfoEr4xU5yHH7.getPackageName();
    }

    public int Acstmh57AKoSEkEFNJ() {
        return this.f1195lEeR5KfoEr4xU5yHH7.getActions();
    }

    public void Bc5OTyAfOKVCQb8CEz(CharSequence charSequence) {
        this.f1195lEeR5KfoEr4xU5yHH7.setText(charSequence);
    }

    public boolean CSih7GetOUab1dYQjM(int i, Bundle bundle) {
        return this.f1195lEeR5KfoEr4xU5yHH7.performAction(i, bundle);
    }

    public void DFYiVi7zXozAjRciKa(Object obj) {
        this.f1195lEeR5KfoEr4xU5yHH7.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((KYHag8HRDlnO3X9zmZ) obj).f1197lEeR5KfoEr4xU5yHH7);
    }

    public boolean DfpieXfdYs58yZAiXY() {
        return this.f1195lEeR5KfoEr4xU5yHH7.isClickable();
    }

    public void Er40JrQbOM51vCQI8w(View view) {
        this.f1196s3fjYDxWOUexjjVgyA = -1;
        this.f1195lEeR5KfoEr4xU5yHH7.setParent(view);
    }

    public void Fo9071MN8vwEWamAUX(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1195lEeR5KfoEr4xU5yHH7.setPaneTitle(charSequence);
        } else {
            this.f1195lEeR5KfoEr4xU5yHH7.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void FtYx4GXtxwA8al5hBy(CharSequence charSequence) {
        this.f1195lEeR5KfoEr4xU5yHH7.setContentDescription(charSequence);
    }

    public Bundle G7AC3DWIx9i9fdanjk() {
        return this.f1195lEeR5KfoEr4xU5yHH7.getExtras();
    }

    public boolean GyWRxpdt1T8mEJXPoD() {
        return this.f1195lEeR5KfoEr4xU5yHH7.isChecked();
    }

    public void HJFh0TGMpafqLE9haL(View view, int i) {
        this.f1195lEeR5KfoEr4xU5yHH7.addChild(view, i);
    }

    public void HR5vAalpgOKVm2T0Gq(View view, int i) {
        this.f1194HJFh0TGMpafqLE9haL = i;
        this.f1195lEeR5KfoEr4xU5yHH7.setSource(view, i);
    }

    public void HZ4bptRS9XIcK1CV95(boolean z) {
        this.f1195lEeR5KfoEr4xU5yHH7.setScrollable(z);
    }

    public List IPyIQcaNa8aB7drBED() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f1195lEeR5KfoEr4xU5yHH7.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new lEeR5KfoEr4xU5yHH7(actionList.get(i)));
        }
        return arrayList;
    }

    public void Jsouc4ileb8SxQhxbX(boolean z) {
        this.f1195lEeR5KfoEr4xU5yHH7.setFocusable(z);
    }

    public final void KYHag8HRDlnO3X9zmZ() {
        this.f1195lEeR5KfoEr4xU5yHH7.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f1195lEeR5KfoEr4xU5yHH7.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f1195lEeR5KfoEr4xU5yHH7.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f1195lEeR5KfoEr4xU5yHH7.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public void Kh0uC90qEEhuLdpgB9(Rect rect) {
        this.f1195lEeR5KfoEr4xU5yHH7.setBoundsInParent(rect);
    }

    public boolean KqgKJKIWne3kz1AdHk() {
        return this.f1195lEeR5KfoEr4xU5yHH7.isEnabled();
    }

    public final SparseArray LIMtzhnLwQyigzK0KO(View view) {
        SparseArray sparseArrayVItLRw50eXTZeEfGl0 = VItLRw50eXTZeEfGl0(view);
        if (sparseArrayVItLRw50eXTZeEfGl0 != null) {
            return sparseArrayVItLRw50eXTZeEfGl0;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(G7AC3DWIx9i9fdanjk.HJFh0TGMpafqLE9haL.f192GyWRxpdt1T8mEJXPoD, sparseArray);
        return sparseArray;
    }

    public boolean LU0fFDMACqnfIfA1AZ() {
        return this.f1195lEeR5KfoEr4xU5yHH7.isPassword();
    }

    public void O1furmptfI76BGfN0d(View view) {
        this.f1195lEeR5KfoEr4xU5yHH7.setLabelFor(view);
    }

    public CharSequence OANkd3mP6AYvwbNLJM() {
        return this.f1195lEeR5KfoEr4xU5yHH7.getClassName();
    }

    public String OUd9THiLjZndMj0qdF() {
        return Build.VERSION.SDK_INT >= 33 ? HJFh0TGMpafqLE9haL.TCyPEKSzIyweCN5yp1(this.f1195lEeR5KfoEr4xU5yHH7) : this.f1195lEeR5KfoEr4xU5yHH7.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public boolean OqIo5QF00RDxUQb4qq() {
        return this.f1195lEeR5KfoEr4xU5yHH7.isCheckable();
    }

    public boolean PPkm9uUfOJHHYveeLT() {
        return this.f1195lEeR5KfoEr4xU5yHH7.isFocusable();
    }

    public void Pum9NZyDBKoCnecvlx(Rect rect) {
        this.f1195lEeR5KfoEr4xU5yHH7.setBoundsInScreen(rect);
    }

    public CharSequence R9SAhYMerGybF9OAjL() {
        return this.f1195lEeR5KfoEr4xU5yHH7.getError();
    }

    public void T9PhQIpGRhE4yZDm1C(Rect rect) {
        this.f1195lEeR5KfoEr4xU5yHH7.getBoundsInScreen(rect);
    }

    public final List TCyPEKSzIyweCN5yp1(String str) {
        ArrayList<Integer> integerArrayList = this.f1195lEeR5KfoEr4xU5yHH7.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f1195lEeR5KfoEr4xU5yHH7.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public CharSequence THTDvPxsHqMeGb512f() {
        if (!XzJ1BS7H9Ilbkv4eVM()) {
            return this.f1195lEeR5KfoEr4xU5yHH7.getText();
        }
        List listTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listTCyPEKSzIyweCN5yp12 = TCyPEKSzIyweCN5yp1("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listTCyPEKSzIyweCN5yp13 = TCyPEKSzIyweCN5yp1("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listTCyPEKSzIyweCN5yp14 = TCyPEKSzIyweCN5yp1("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f1195lEeR5KfoEr4xU5yHH7.getText(), 0, this.f1195lEeR5KfoEr4xU5yHH7.getText().length()));
        for (int i = 0; i < listTCyPEKSzIyweCN5yp1.size(); i++) {
            spannableString.setSpan(new OqIo5QF00RDxUQb4qq.lEeR5KfoEr4xU5yHH7(((Integer) listTCyPEKSzIyweCN5yp14.get(i)).intValue(), this, G7AC3DWIx9i9fdanjk().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listTCyPEKSzIyweCN5yp1.get(i)).intValue(), ((Integer) listTCyPEKSzIyweCN5yp12.get(i)).intValue(), ((Integer) listTCyPEKSzIyweCN5yp13.get(i)).intValue());
        }
        return spannableString;
    }

    public boolean ToH8yzk8U1nKT0PUfY() {
        return this.f1195lEeR5KfoEr4xU5yHH7.isImportantForAccessibility();
    }

    public void Tu4WCh2gEwj8E4oHbP(boolean z) {
        this.f1195lEeR5KfoEr4xU5yHH7.setAccessibilityFocused(z);
    }

    public final SparseArray VItLRw50eXTZeEfGl0(View view) {
        return (SparseArray) view.getTag(G7AC3DWIx9i9fdanjk.HJFh0TGMpafqLE9haL.f192GyWRxpdt1T8mEJXPoD);
    }

    public boolean W3RZ2dTDKrKpS5Mxdk() {
        return Build.VERSION.SDK_INT >= 34 ? zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ(this.f1195lEeR5KfoEr4xU5yHH7) : Z9WdNiOsPR0y54zHW4(64);
    }

    public CharSequence WWC27LAMFqFFBzfbNw() {
        return Build.VERSION.SDK_INT >= 30 ? s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(this.f1195lEeR5KfoEr4xU5yHH7) : this.f1195lEeR5KfoEr4xU5yHH7.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public boolean XdzLv4NdAtTYoEzVzB() {
        return this.f1195lEeR5KfoEr4xU5yHH7.isLongClickable();
    }

    public final boolean XzJ1BS7H9Ilbkv4eVM() {
        return !TCyPEKSzIyweCN5yp1("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public CharSequence Y43RdunnpKgpbny0lE() {
        return this.f1195lEeR5KfoEr4xU5yHH7.getContentDescription();
    }

    public boolean YlLW4G6OV9TFyuw5ix() {
        return this.f1195lEeR5KfoEr4xU5yHH7.isSelected();
    }

    public void Ywqw2A0s86HeuFkDt0(View view, int i) {
        this.f1196s3fjYDxWOUexjjVgyA = i;
        this.f1195lEeR5KfoEr4xU5yHH7.setParent(view, i);
    }

    public final boolean Z9WdNiOsPR0y54zHW4(int i) {
        Bundle bundleG7AC3DWIx9i9fdanjk = G7AC3DWIx9i9fdanjk();
        return bundleG7AC3DWIx9i9fdanjk != null && (bundleG7AC3DWIx9i9fdanjk.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public final void ZJNyOIPL0usMs2xSAn(View view) {
        SparseArray sparseArrayVItLRw50eXTZeEfGl0 = VItLRw50eXTZeEfGl0(view);
        if (sparseArrayVItLRw50eXTZeEfGl0 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < sparseArrayVItLRw50eXTZeEfGl0.size(); i++) {
                if (((WeakReference) sparseArrayVItLRw50eXTZeEfGl0.valueAt(i)).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                sparseArrayVItLRw50eXTZeEfGl0.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    public boolean aAp6BD79BhftLCnuvf() {
        return this.f1195lEeR5KfoEr4xU5yHH7.isFocused();
    }

    public int aPyGSIylzVNKPT1Bls() {
        return this.f1195lEeR5KfoEr4xU5yHH7.getChildCount();
    }

    public void aRQ2M7vtRaPDEyvpdv(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1195lEeR5KfoEr4xU5yHH7.setShowingHintText(z);
        } else {
            k0CbjZvfUz23r8IN6W(4, z);
        }
    }

    public void aUn6Hqsqw2PVM8685Z(View view) {
        this.f1195lEeR5KfoEr4xU5yHH7.setTraversalAfter(view);
    }

    public CharSequence ao3wqKm5CXFuvC0q47() {
        return Build.VERSION.SDK_INT >= 28 ? this.f1195lEeR5KfoEr4xU5yHH7.getTooltipText() : this.f1195lEeR5KfoEr4xU5yHH7.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void ayduHasC7VpxsVXE0T(boolean z) {
        this.f1195lEeR5KfoEr4xU5yHH7.setEnabled(z);
    }

    public void bBVlTkqEpHW053CjWL(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1195lEeR5KfoEr4xU5yHH7.setHeading(z);
        } else {
            k0CbjZvfUz23r8IN6W(2, z);
        }
    }

    public boolean cT5Hs3CQpLK8NvlZAw() {
        return this.f1195lEeR5KfoEr4xU5yHH7.isVisibleToUser();
    }

    public void ctWLFN70QQINH1kyYo(boolean z) {
        this.f1195lEeR5KfoEr4xU5yHH7.setCheckable(z);
    }

    public boolean e2F9F6h8YJxTHwLCa0() {
        return this.f1195lEeR5KfoEr4xU5yHH7.isContextClickable();
    }

    public void e54J8UWNHWALQNixXM(Rect rect) {
        this.f1195lEeR5KfoEr4xU5yHH7.getBoundsInParent(rect);
    }

    public void eWK41qw3g36LVd4UnS(boolean z) {
        this.f1195lEeR5KfoEr4xU5yHH7.setClickable(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof A49QRPHynYLCBN0SqP)) {
            return false;
        }
        A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP = (A49QRPHynYLCBN0SqP) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1195lEeR5KfoEr4xU5yHH7;
        if (accessibilityNodeInfo == null) {
            if (a49QRPHynYLCBN0SqP.f1195lEeR5KfoEr4xU5yHH7 != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(a49QRPHynYLCBN0SqP.f1195lEeR5KfoEr4xU5yHH7)) {
            return false;
        }
        return this.f1194HJFh0TGMpafqLE9haL == a49QRPHynYLCBN0SqP.f1194HJFh0TGMpafqLE9haL && this.f1196s3fjYDxWOUexjjVgyA == a49QRPHynYLCBN0SqP.f1196s3fjYDxWOUexjjVgyA;
    }

    public void evSiTWao80SbJUZk9E(Object obj) {
        this.f1195lEeR5KfoEr4xU5yHH7.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((husNiw3snxdgZPAGJm) obj).f1198lEeR5KfoEr4xU5yHH7);
    }

    public void f2zPq7MOnQrtOlZ1Zg(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1195lEeR5KfoEr4xU5yHH7.setScreenReaderFocusable(z);
        } else {
            k0CbjZvfUz23r8IN6W(1, z);
        }
    }

    public void fDXXEWvhMVO3O8mnuS(boolean z) {
        this.f1195lEeR5KfoEr4xU5yHH7.setVisibleToUser(z);
    }

    public void fLSSbwbzFBVpwBH5FM(boolean z) {
        this.f1195lEeR5KfoEr4xU5yHH7.setFocused(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1195lEeR5KfoEr4xU5yHH7;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void hoXrIDAFrSwfShk8da(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA(this.f1195lEeR5KfoEr4xU5yHH7, rect);
            return;
        }
        Rect rect2 = (Rect) this.f1195lEeR5KfoEr4xU5yHH7.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void husNiw3snxdgZPAGJm(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            KYHag8HRDlnO3X9zmZ();
            ZJNyOIPL0usMs2xSAn(view);
            ClickableSpan[] clickableSpanArrZaq8hOURtfwbcX17cG = zaq8hOURtfwbcX17cG(charSequence);
            if (clickableSpanArrZaq8hOURtfwbcX17cG == null || clickableSpanArrZaq8hOURtfwbcX17cG.length <= 0) {
                return;
            }
            G7AC3DWIx9i9fdanjk().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", G7AC3DWIx9i9fdanjk.HJFh0TGMpafqLE9haL.f223lEeR5KfoEr4xU5yHH7);
            SparseArray sparseArrayLIMtzhnLwQyigzK0KO = LIMtzhnLwQyigzK0KO(view);
            for (int i = 0; i < clickableSpanArrZaq8hOURtfwbcX17cG.length; i++) {
                int iTXWeW0sqVddf7ZBflq = tXWeW0sqVddf7ZBflq(clickableSpanArrZaq8hOURtfwbcX17cG[i], sparseArrayLIMtzhnLwQyigzK0KO);
                sparseArrayLIMtzhnLwQyigzK0KO.put(iTXWeW0sqVddf7ZBflq, new WeakReference(clickableSpanArrZaq8hOURtfwbcX17cG[i]));
                zZKhbgvUfsK4AEX3r0(clickableSpanArrZaq8hOURtfwbcX17cG[i], (Spanned) charSequence, iTXWeW0sqVddf7ZBflq);
            }
        }
    }

    public void iQCvttGuB7nx4r7kMP(int i) {
        this.f1195lEeR5KfoEr4xU5yHH7.setMaxTextLength(i);
    }

    public String jCtUeU2YI1poCxWcjm() {
        return this.f1195lEeR5KfoEr4xU5yHH7.getViewIdResourceName();
    }

    public void jocVUfxESVhVJU8LoH(boolean z) {
        this.f1195lEeR5KfoEr4xU5yHH7.setChecked(z);
    }

    public final void k0CbjZvfUz23r8IN6W(int i, boolean z) {
        Bundle bundleG7AC3DWIx9i9fdanjk = G7AC3DWIx9i9fdanjk();
        if (bundleG7AC3DWIx9i9fdanjk != null) {
            int i2 = bundleG7AC3DWIx9i9fdanjk.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            bundleG7AC3DWIx9i9fdanjk.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public void lEeR5KfoEr4xU5yHH7(int i) {
        this.f1195lEeR5KfoEr4xU5yHH7.addAction(i);
    }

    public boolean lLKzvdU99Iw80uVD5I() {
        return Z9WdNiOsPR0y54zHW4(67108864);
    }

    public boolean oocVJL811qFf0j0XXZ() {
        return Build.VERSION.SDK_INT >= 26 ? this.f1195lEeR5KfoEr4xU5yHH7.isShowingHintText() : Z9WdNiOsPR0y54zHW4(4);
    }

    public void pgB7Gmjz55y9NQYnAD(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(this.f1195lEeR5KfoEr4xU5yHH7, charSequence);
        } else {
            this.f1195lEeR5KfoEr4xU5yHH7.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void s3fjYDxWOUexjjVgyA(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f1195lEeR5KfoEr4xU5yHH7.addAction((AccessibilityNodeInfo.AccessibilityAction) leer5kfoer4xu5yhh7.f1244lEeR5KfoEr4xU5yHH7);
    }

    public CharSequence sTkWmhpZ5b1ArQIw4K() {
        return Build.VERSION.SDK_INT >= 34 ? zZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL(this.f1195lEeR5KfoEr4xU5yHH7) : this.f1195lEeR5KfoEr4xU5yHH7.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public final int tXWeW0sqVddf7ZBflq(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i)).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f1193zZKhbgvUfsK4AEX3r0;
        f1193zZKhbgvUfsK4AEX3r0 = i2 + 1;
        return i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        e54J8UWNHWALQNixXM(rect);
        sb.append("; boundsInParent: " + rect);
        T9PhQIpGRhE4yZDm1C(rect);
        sb.append("; boundsInScreen: " + rect);
        hoXrIDAFrSwfShk8da(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(A49QRPHynYLCBN0SqP());
        sb.append("; className: ");
        sb.append(OANkd3mP6AYvwbNLJM());
        sb.append("; text: ");
        sb.append(THTDvPxsHqMeGb512f());
        sb.append("; error: ");
        sb.append(R9SAhYMerGybF9OAjL());
        sb.append("; maxTextLength: ");
        sb.append(xHA29AmDt6y96AnB3t());
        sb.append("; stateDescription: ");
        sb.append(WWC27LAMFqFFBzfbNw());
        sb.append("; contentDescription: ");
        sb.append(Y43RdunnpKgpbny0lE());
        sb.append("; tooltipText: ");
        sb.append(ao3wqKm5CXFuvC0q47());
        sb.append("; viewIdResName: ");
        sb.append(jCtUeU2YI1poCxWcjm());
        sb.append("; uniqueId: ");
        sb.append(OUd9THiLjZndMj0qdF());
        sb.append("; checkable: ");
        sb.append(OqIo5QF00RDxUQb4qq());
        sb.append("; checked: ");
        sb.append(GyWRxpdt1T8mEJXPoD());
        sb.append("; focusable: ");
        sb.append(PPkm9uUfOJHHYveeLT());
        sb.append("; focused: ");
        sb.append(aAp6BD79BhftLCnuvf());
        sb.append("; selected: ");
        sb.append(YlLW4G6OV9TFyuw5ix());
        sb.append("; clickable: ");
        sb.append(DfpieXfdYs58yZAiXY());
        sb.append("; longClickable: ");
        sb.append(XdzLv4NdAtTYoEzVzB());
        sb.append("; contextClickable: ");
        sb.append(e2F9F6h8YJxTHwLCa0());
        sb.append("; enabled: ");
        sb.append(KqgKJKIWne3kz1AdHk());
        sb.append("; password: ");
        sb.append(LU0fFDMACqnfIfA1AZ());
        sb.append("; scrollable: " + zcy2NNbtVXgoGQbfuq());
        sb.append("; containerTitle: ");
        sb.append(sTkWmhpZ5b1ArQIw4K());
        sb.append("; granularScrollingSupported: ");
        sb.append(lLKzvdU99Iw80uVD5I());
        sb.append("; importantForAccessibility: ");
        sb.append(ToH8yzk8U1nKT0PUfY());
        sb.append("; visible: ");
        sb.append(cT5Hs3CQpLK8NvlZAw());
        sb.append("; isTextSelectable: ");
        sb.append(udcVtCzLTM1Loe9KrX());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(W3RZ2dTDKrKpS5Mxdk());
        sb.append("; [");
        List listIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED();
        for (int i = 0; i < listIPyIQcaNa8aB7drBED.size(); i++) {
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (lEeR5KfoEr4xU5yHH7) listIPyIQcaNa8aB7drBED.get(i);
            String strPbVGzGjWvY2LDXC8vo = pbVGzGjWvY2LDXC8vo(leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA());
            if (strPbVGzGjWvY2LDXC8vo.equals("ACTION_UNKNOWN") && leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL() != null) {
                strPbVGzGjWvY2LDXC8vo = leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL().toString();
            }
            sb.append(strPbVGzGjWvY2LDXC8vo);
            if (i != listIPyIQcaNa8aB7drBED.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean udcVtCzLTM1Loe9KrX() {
        return Build.VERSION.SDK_INT >= 33 ? HJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED(this.f1195lEeR5KfoEr4xU5yHH7) : Z9WdNiOsPR0y54zHW4(8388608);
    }

    public AccessibilityNodeInfo vlBaBOcZ1q1ndWVoXn() {
        return this.f1195lEeR5KfoEr4xU5yHH7;
    }

    public int xHA29AmDt6y96AnB3t() {
        return this.f1195lEeR5KfoEr4xU5yHH7.getMaxTextLength();
    }

    public void xMfAHy6F7qK0zhxhKG(CharSequence charSequence) {
        this.f1195lEeR5KfoEr4xU5yHH7.setError(charSequence);
    }

    public void yL2E9nlEZpg8ZZx8XE(CharSequence charSequence) {
        this.f1195lEeR5KfoEr4xU5yHH7.setPackageName(charSequence);
    }

    public void yvdWWG9COQQotjfedH(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1195lEeR5KfoEr4xU5yHH7.setHintText(charSequence);
        } else {
            this.f1195lEeR5KfoEr4xU5yHH7.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void zXY7dgnTfw9Pd9RXel(CharSequence charSequence) {
        this.f1195lEeR5KfoEr4xU5yHH7.setClassName(charSequence);
    }

    public final void zZKhbgvUfsK4AEX3r0(ClickableSpan clickableSpan, Spanned spanned, int i) {
        TCyPEKSzIyweCN5yp1("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        TCyPEKSzIyweCN5yp1("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        TCyPEKSzIyweCN5yp1("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        TCyPEKSzIyweCN5yp1("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    public boolean zcy2NNbtVXgoGQbfuq() {
        return this.f1195lEeR5KfoEr4xU5yHH7.isScrollable();
    }

    public A49QRPHynYLCBN0SqP(Object obj) {
        this.f1195lEeR5KfoEr4xU5yHH7 = (AccessibilityNodeInfo) obj;
    }

    public void osrHU7fvDp2EgxZPfM() {
    }
}
