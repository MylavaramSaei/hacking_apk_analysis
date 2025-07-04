package xHA29AmDt6y96AnB3t;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xHA29AmDt6y96AnB3t.zZKhbgvUfsK4AEX3r0;

/* loaded from: classes.dex */
public class husNiw3snxdgZPAGJm implements xHA29AmDt6y96AnB3t.HJFh0TGMpafqLE9haL {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm f7253HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public int f7254IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final List f7255KYHag8HRDlnO3X9zmZ = new ArrayList();

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final Bundle f7256TCyPEKSzIyweCN5yp1 = new Bundle();

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public RemoteViews f7257husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f7258lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public RemoteViews f7259pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Notification.Builder f7260s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public RemoteViews f7261zZKhbgvUfsK4AEX3r0;

    public static class HJFh0TGMpafqLE9haL {
        public static Notification.Builder HJFh0TGMpafqLE9haL(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }

        public static Notification.Action.Builder lEeR5KfoEr4xU5yHH7(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder s3fjYDxWOUexjjVgyA(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }
    }

    public static class IPyIQcaNa8aB7drBED {
        public static Notification.Action.Builder lEeR5KfoEr4xU5yHH7(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        public static Notification.Builder s3fjYDxWOUexjjVgyA(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    public static class KYHag8HRDlnO3X9zmZ {
        public static Notification.Builder lEeR5KfoEr4xU5yHH7(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder s3fjYDxWOUexjjVgyA(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    public static class TCyPEKSzIyweCN5yp1 {
        public static Notification.Action.Builder HJFh0TGMpafqLE9haL(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        public static Notification.Builder lEeR5KfoEr4xU5yHH7(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        public static Notification.Builder s3fjYDxWOUexjjVgyA(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Builder zZKhbgvUfsK4AEX3r0(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* renamed from: xHA29AmDt6y96AnB3t.husNiw3snxdgZPAGJm$husNiw3snxdgZPAGJm, reason: collision with other inner class name */
    public static class C0109husNiw3snxdgZPAGJm {
        public static Notification.Builder HJFh0TGMpafqLE9haL(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        public static Notification.Builder KYHag8HRDlnO3X9zmZ(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder TCyPEKSzIyweCN5yp1(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }

        public static Notification.Builder husNiw3snxdgZPAGJm(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder lEeR5KfoEr4xU5yHH7(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder s3fjYDxWOUexjjVgyA(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        public static Notification.Builder zZKhbgvUfsK4AEX3r0(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 {
        public static Notification.Builder Acstmh57AKoSEkEFNJ(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }

        public static Notification.Action.Builder HJFh0TGMpafqLE9haL(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Builder IPyIQcaNa8aB7drBED(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        public static String KYHag8HRDlnO3X9zmZ(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder TCyPEKSzIyweCN5yp1(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Action.Builder husNiw3snxdgZPAGJm(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i, charSequence, pendingIntent);
        }

        public static Notification.Builder lEeR5KfoEr4xU5yHH7(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Builder pbVGzGjWvY2LDXC8vo(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        public static Notification.Action.Builder s3fjYDxWOUexjjVgyA(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action zZKhbgvUfsK4AEX3r0(Notification.Action.Builder builder) {
            return builder.build();
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public static Notification.Builder HJFh0TGMpafqLE9haL(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        public static Notification.Builder KYHag8HRDlnO3X9zmZ(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }

        public static Notification.Builder husNiw3snxdgZPAGJm(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder lEeR5KfoEr4xU5yHH7(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder s3fjYDxWOUexjjVgyA(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder zZKhbgvUfsK4AEX3r0(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 {
        public static Notification.Builder HJFh0TGMpafqLE9haL(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder husNiw3snxdgZPAGJm(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }

        public static Notification.Action.Builder lEeR5KfoEr4xU5yHH7(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        public static Notification.Builder s3fjYDxWOUexjjVgyA(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder zZKhbgvUfsK4AEX3r0(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }
    }

    public husNiw3snxdgZPAGJm(zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        int i;
        this.f7253HJFh0TGMpafqLE9haL = husniw3snxdgzpagjm;
        Context context = husniw3snxdgzpagjm.f7303lEeR5KfoEr4xU5yHH7;
        this.f7258lEeR5KfoEr4xU5yHH7 = context;
        this.f7260s3fjYDxWOUexjjVgyA = Build.VERSION.SDK_INT >= 26 ? C0109husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(context, husniw3snxdgzpagjm.f7298e2F9F6h8YJxTHwLCa0) : new Notification.Builder(husniw3snxdgzpagjm.f7303lEeR5KfoEr4xU5yHH7);
        Notification notification = husniw3snxdgzpagjm.f7277LU0fFDMACqnfIfA1AZ;
        this.f7260s3fjYDxWOUexjjVgyA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, husniw3snxdgzpagjm.f7306pbVGzGjWvY2LDXC8vo).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(husniw3snxdgzpagjm.f7301husNiw3snxdgZPAGJm).setContentText(husniw3snxdgzpagjm.f7274KYHag8HRDlnO3X9zmZ).setContentInfo(husniw3snxdgzpagjm.f7294Z9WdNiOsPR0y54zHW4).setContentIntent(husniw3snxdgzpagjm.f7284TCyPEKSzIyweCN5yp1).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(husniw3snxdgzpagjm.f7273IPyIQcaNa8aB7drBED, (notification.flags & 128) != 0).setNumber(husniw3snxdgzpagjm.f7299e54J8UWNHWALQNixXM).setProgress(husniw3snxdgzpagjm.f7282R9SAhYMerGybF9OAjL, husniw3snxdgzpagjm.f7270G7AC3DWIx9i9fdanjk, husniw3snxdgzpagjm.f7310xHA29AmDt6y96AnB3t);
        Notification.Builder builder = this.f7260s3fjYDxWOUexjjVgyA;
        IconCompat iconCompat = husniw3snxdgzpagjm.f7268Acstmh57AKoSEkEFNJ;
        HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(builder, iconCompat == null ? null : iconCompat.T9PhQIpGRhE4yZDm1C(context));
        this.f7260s3fjYDxWOUexjjVgyA.setSubText(husniw3snxdgzpagjm.f7312zaq8hOURtfwbcX17cG).setUsesChronometer(husniw3snxdgzpagjm.f7296aPyGSIylzVNKPT1Bls).setPriority(husniw3snxdgzpagjm.f7283T9PhQIpGRhE4yZDm1C);
        Iterator it = husniw3snxdgzpagjm.f7307s3fjYDxWOUexjjVgyA.iterator();
        while (it.hasNext()) {
            s3fjYDxWOUexjjVgyA((zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7) it.next());
        }
        Bundle bundle = husniw3snxdgzpagjm.f7302jCtUeU2YI1poCxWcjm;
        if (bundle != null) {
            this.f7256TCyPEKSzIyweCN5yp1.putAll(bundle);
        }
        int i2 = Build.VERSION.SDK_INT;
        this.f7261zZKhbgvUfsK4AEX3r0 = husniw3snxdgzpagjm.f7280OqIo5QF00RDxUQb4qq;
        this.f7257husNiw3snxdgZPAGJm = husniw3snxdgzpagjm.f7271GyWRxpdt1T8mEJXPoD;
        this.f7260s3fjYDxWOUexjjVgyA.setShowWhen(husniw3snxdgzpagjm.f7300hoXrIDAFrSwfShk8da);
        lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(this.f7260s3fjYDxWOUexjjVgyA, husniw3snxdgzpagjm.f7289WWC27LAMFqFFBzfbNw);
        lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(this.f7260s3fjYDxWOUexjjVgyA, husniw3snxdgzpagjm.f7276LIMtzhnLwQyigzK0KO);
        lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(this.f7260s3fjYDxWOUexjjVgyA, husniw3snxdgzpagjm.f7287VItLRw50eXTZeEfGl0);
        lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(this.f7260s3fjYDxWOUexjjVgyA, husniw3snxdgzpagjm.f7267A49QRPHynYLCBN0SqP);
        this.f7254IPyIQcaNa8aB7drBED = husniw3snxdgzpagjm.f7304lLKzvdU99Iw80uVD5I;
        s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(this.f7260s3fjYDxWOUexjjVgyA, husniw3snxdgzpagjm.f7279OUd9THiLjZndMj0qdF);
        s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(this.f7260s3fjYDxWOUexjjVgyA, husniw3snxdgzpagjm.f7291XzJ1BS7H9Ilbkv4eVM);
        s3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ(this.f7260s3fjYDxWOUexjjVgyA, husniw3snxdgzpagjm.f7309tXWeW0sqVddf7ZBflq);
        s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(this.f7260s3fjYDxWOUexjjVgyA, husniw3snxdgzpagjm.f7288W3RZ2dTDKrKpS5Mxdk);
        s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm(this.f7260s3fjYDxWOUexjjVgyA, notification.sound, notification.audioAttributes);
        List listHusNiw3snxdgZPAGJm = i2 < 28 ? husNiw3snxdgZPAGJm(TCyPEKSzIyweCN5yp1(husniw3snxdgzpagjm.f7272HJFh0TGMpafqLE9haL), husniw3snxdgzpagjm.f7305oocVJL811qFf0j0XXZ) : husniw3snxdgzpagjm.f7305oocVJL811qFf0j0XXZ;
        if (listHusNiw3snxdgZPAGJm != null && !listHusNiw3snxdgZPAGJm.isEmpty()) {
            Iterator it2 = listHusNiw3snxdgZPAGJm.iterator();
            while (it2.hasNext()) {
                s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this.f7260s3fjYDxWOUexjjVgyA, (String) it2.next());
            }
        }
        this.f7259pbVGzGjWvY2LDXC8vo = husniw3snxdgzpagjm.f7269DfpieXfdYs58yZAiXY;
        if (husniw3snxdgzpagjm.f7311zZKhbgvUfsK4AEX3r0.size() > 0) {
            Bundle bundle2 = husniw3snxdgzpagjm.HJFh0TGMpafqLE9haL().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i3 = 0; i3 < husniw3snxdgzpagjm.f7311zZKhbgvUfsK4AEX3r0.size(); i3++) {
                bundle4.putBundle(Integer.toString(i3), xHA29AmDt6y96AnB3t.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7((zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7) husniw3snxdgzpagjm.f7311zZKhbgvUfsK4AEX3r0.get(i3)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            husniw3snxdgzpagjm.HJFh0TGMpafqLE9haL().putBundle("android.car.EXTENSIONS", bundle2);
            this.f7256TCyPEKSzIyweCN5yp1.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i4 = Build.VERSION.SDK_INT;
        Object obj = husniw3snxdgzpagjm.f7293YlLW4G6OV9TFyuw5ix;
        if (obj != null) {
            HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(this.f7260s3fjYDxWOUexjjVgyA, obj);
        }
        this.f7260s3fjYDxWOUexjjVgyA.setExtras(husniw3snxdgzpagjm.f7302jCtUeU2YI1poCxWcjm);
        zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm(this.f7260s3fjYDxWOUexjjVgyA, husniw3snxdgzpagjm.f7292Y43RdunnpKgpbny0lE);
        RemoteViews remoteViews = husniw3snxdgzpagjm.f7280OqIo5QF00RDxUQb4qq;
        if (remoteViews != null) {
            zZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL(this.f7260s3fjYDxWOUexjjVgyA, remoteViews);
        }
        RemoteViews remoteViews2 = husniw3snxdgzpagjm.f7271GyWRxpdt1T8mEJXPoD;
        if (remoteViews2 != null) {
            zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA(this.f7260s3fjYDxWOUexjjVgyA, remoteViews2);
        }
        RemoteViews remoteViews3 = husniw3snxdgzpagjm.f7269DfpieXfdYs58yZAiXY;
        if (remoteViews3 != null) {
            zZKhbgvUfsK4AEX3r0.zZKhbgvUfsK4AEX3r0(this.f7260s3fjYDxWOUexjjVgyA, remoteViews3);
        }
        if (i4 >= 26) {
            C0109husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA(this.f7260s3fjYDxWOUexjjVgyA, husniw3snxdgzpagjm.f7275KqgKJKIWne3kz1AdHk);
            C0109husNiw3snxdgZPAGJm.husNiw3snxdgZPAGJm(this.f7260s3fjYDxWOUexjjVgyA, husniw3snxdgzpagjm.f7308sTkWmhpZ5b1ArQIw4K);
            C0109husNiw3snxdgZPAGJm.KYHag8HRDlnO3X9zmZ(this.f7260s3fjYDxWOUexjjVgyA, husniw3snxdgzpagjm.f7281PPkm9uUfOJHHYveeLT);
            C0109husNiw3snxdgZPAGJm.TCyPEKSzIyweCN5yp1(this.f7260s3fjYDxWOUexjjVgyA, husniw3snxdgzpagjm.f7295aAp6BD79BhftLCnuvf);
            C0109husNiw3snxdgZPAGJm.zZKhbgvUfsK4AEX3r0(this.f7260s3fjYDxWOUexjjVgyA, husniw3snxdgzpagjm.f7304lLKzvdU99Iw80uVD5I);
            if (husniw3snxdgzpagjm.f7297ao3wqKm5CXFuvC0q47) {
                C0109husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL(this.f7260s3fjYDxWOUexjjVgyA, husniw3snxdgzpagjm.f7285THTDvPxsHqMeGb512f);
            }
            if (!TextUtils.isEmpty(husniw3snxdgzpagjm.f7298e2F9F6h8YJxTHwLCa0)) {
                this.f7260s3fjYDxWOUexjjVgyA.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i4 >= 28) {
            Iterator it3 = husniw3snxdgzpagjm.f7272HJFh0TGMpafqLE9haL.iterator();
            if (it3.hasNext()) {
                androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(it3.next());
                throw null;
            }
        }
        if (i4 >= 29) {
            TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7(this.f7260s3fjYDxWOUexjjVgyA, husniw3snxdgzpagjm.f7290XdzLv4NdAtTYoEzVzB);
            TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA(this.f7260s3fjYDxWOUexjjVgyA, zZKhbgvUfsK4AEX3r0.C0111zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(null));
        }
        if (i4 >= 31 && (i = husniw3snxdgzpagjm.f7286ToH8yzk8U1nKT0PUfY) != 0) {
            IPyIQcaNa8aB7drBED.s3fjYDxWOUexjjVgyA(this.f7260s3fjYDxWOUexjjVgyA, i);
        }
        if (husniw3snxdgzpagjm.f7313zcy2NNbtVXgoGQbfuq) {
            if (this.f7253HJFh0TGMpafqLE9haL.f7267A49QRPHynYLCBN0SqP) {
                this.f7254IPyIQcaNa8aB7drBED = 2;
            } else {
                this.f7254IPyIQcaNa8aB7drBED = 1;
            }
            this.f7260s3fjYDxWOUexjjVgyA.setVibrate(null);
            this.f7260s3fjYDxWOUexjjVgyA.setSound(null);
            int i5 = notification.defaults & (-4);
            notification.defaults = i5;
            this.f7260s3fjYDxWOUexjjVgyA.setDefaults(i5);
            if (i4 >= 26) {
                if (TextUtils.isEmpty(this.f7253HJFh0TGMpafqLE9haL.f7276LIMtzhnLwQyigzK0KO)) {
                    lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(this.f7260s3fjYDxWOUexjjVgyA, "silent");
                }
                C0109husNiw3snxdgZPAGJm.zZKhbgvUfsK4AEX3r0(this.f7260s3fjYDxWOUexjjVgyA, this.f7254IPyIQcaNa8aB7drBED);
            }
        }
    }

    public static List TCyPEKSzIyweCN5yp1(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(it.next());
        throw null;
    }

    public static List husNiw3snxdgZPAGJm(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        Z9WdNiOsPR0y54zHW4.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = new Z9WdNiOsPR0y54zHW4.s3fjYDxWOUexjjVgyA(list.size() + list2.size());
        s3fjydxwouexjjvgya.addAll(list);
        s3fjydxwouexjjvgya.addAll(list2);
        return new ArrayList(s3fjydxwouexjjvgya);
    }

    public Notification HJFh0TGMpafqLE9haL() {
        Bundle bundleLEeR5KfoEr4xU5yHH7;
        RemoteViews remoteViewsKYHag8HRDlnO3X9zmZ;
        RemoteViews remoteViewsZZKhbgvUfsK4AEX3r0;
        zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = this.f7253HJFh0TGMpafqLE9haL.f7278OANkd3mP6AYvwbNLJM;
        if (kYHag8HRDlnO3X9zmZ != null) {
            kYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(this);
        }
        RemoteViews remoteViewsHusNiw3snxdgZPAGJm = kYHag8HRDlnO3X9zmZ != null ? kYHag8HRDlnO3X9zmZ.husNiw3snxdgZPAGJm(this) : null;
        Notification notificationZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0();
        if (remoteViewsHusNiw3snxdgZPAGJm != null || (remoteViewsHusNiw3snxdgZPAGJm = this.f7253HJFh0TGMpafqLE9haL.f7280OqIo5QF00RDxUQb4qq) != null) {
            notificationZZKhbgvUfsK4AEX3r0.contentView = remoteViewsHusNiw3snxdgZPAGJm;
        }
        if (kYHag8HRDlnO3X9zmZ != null && (remoteViewsZZKhbgvUfsK4AEX3r0 = kYHag8HRDlnO3X9zmZ.zZKhbgvUfsK4AEX3r0(this)) != null) {
            notificationZZKhbgvUfsK4AEX3r0.bigContentView = remoteViewsZZKhbgvUfsK4AEX3r0;
        }
        if (kYHag8HRDlnO3X9zmZ != null && (remoteViewsKYHag8HRDlnO3X9zmZ = this.f7253HJFh0TGMpafqLE9haL.f7278OANkd3mP6AYvwbNLJM.KYHag8HRDlnO3X9zmZ(this)) != null) {
            notificationZZKhbgvUfsK4AEX3r0.headsUpContentView = remoteViewsKYHag8HRDlnO3X9zmZ;
        }
        if (kYHag8HRDlnO3X9zmZ != null && (bundleLEeR5KfoEr4xU5yHH7 = xHA29AmDt6y96AnB3t.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(notificationZZKhbgvUfsK4AEX3r0)) != null) {
            kYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(bundleLEeR5KfoEr4xU5yHH7);
        }
        return notificationZZKhbgvUfsK4AEX3r0;
    }

    public final void IPyIQcaNa8aB7drBED(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    public Context KYHag8HRDlnO3X9zmZ() {
        return this.f7258lEeR5KfoEr4xU5yHH7;
    }

    @Override // xHA29AmDt6y96AnB3t.HJFh0TGMpafqLE9haL
    public Notification.Builder lEeR5KfoEr4xU5yHH7() {
        return this.f7260s3fjYDxWOUexjjVgyA;
    }

    public final void s3fjYDxWOUexjjVgyA(zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        IconCompat iconCompatZZKhbgvUfsK4AEX3r0 = leer5kfoer4xu5yhh7.zZKhbgvUfsK4AEX3r0();
        Notification.Action.Builder builderLEeR5KfoEr4xU5yHH7 = HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(iconCompatZZKhbgvUfsK4AEX3r0 != null ? iconCompatZZKhbgvUfsK4AEX3r0.e54J8UWNHWALQNixXM() : null, leer5kfoer4xu5yhh7.IPyIQcaNa8aB7drBED(), leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7());
        if (leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm() != null) {
            for (RemoteInput remoteInput : pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm())) {
                lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(builderLEeR5KfoEr4xU5yHH7, remoteInput);
            }
        }
        Bundle bundle = leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL() != null ? new Bundle(leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA());
        int i = Build.VERSION.SDK_INT;
        zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(builderLEeR5KfoEr4xU5yHH7, leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA());
        bundle.putInt("android.support.action.semanticAction", leer5kfoer4xu5yhh7.KYHag8HRDlnO3X9zmZ());
        if (i >= 28) {
            KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(builderLEeR5KfoEr4xU5yHH7, leer5kfoer4xu5yhh7.KYHag8HRDlnO3X9zmZ());
        }
        if (i >= 29) {
            TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(builderLEeR5KfoEr4xU5yHH7, leer5kfoer4xu5yhh7.Acstmh57AKoSEkEFNJ());
        }
        if (i >= 31) {
            IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7(builderLEeR5KfoEr4xU5yHH7, leer5kfoer4xu5yhh7.pbVGzGjWvY2LDXC8vo());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", leer5kfoer4xu5yhh7.TCyPEKSzIyweCN5yp1());
        lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(builderLEeR5KfoEr4xU5yHH7, bundle);
        lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this.f7260s3fjYDxWOUexjjVgyA, lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(builderLEeR5KfoEr4xU5yHH7));
    }

    public Notification zZKhbgvUfsK4AEX3r0() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f7260s3fjYDxWOUexjjVgyA.build();
        }
        Notification notificationBuild = this.f7260s3fjYDxWOUexjjVgyA.build();
        if (this.f7254IPyIQcaNa8aB7drBED != 0) {
            if (lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && this.f7254IPyIQcaNa8aB7drBED == 2) {
                IPyIQcaNa8aB7drBED(notificationBuild);
            }
            if (lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && this.f7254IPyIQcaNa8aB7drBED == 1) {
                IPyIQcaNa8aB7drBED(notificationBuild);
            }
        }
        return notificationBuild;
    }
}
