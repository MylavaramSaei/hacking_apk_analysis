package zQjb36M22TWHJmh54i;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class zaq8hOURtfwbcX17cG {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final SharedPreferences f7356lEeR5KfoEr4xU5yHH7;

    public zaq8hOURtfwbcX17cG(Context context, String str) {
        this.f7356lEeR5KfoEr4xU5yHH7 = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public synchronized boolean Acstmh57AKoSEkEFNJ(String str, long j) {
        if (!this.f7356lEeR5KfoEr4xU5yHH7.contains(str)) {
            this.f7356lEeR5KfoEr4xU5yHH7.edit().putLong(str, j).commit();
            return true;
        }
        if (KYHag8HRDlnO3X9zmZ(this.f7356lEeR5KfoEr4xU5yHH7.getLong(str, -1L), j)) {
            return false;
        }
        this.f7356lEeR5KfoEr4xU5yHH7.edit().putLong(str, j).commit();
        return true;
    }

    public synchronized List HJFh0TGMpafqLE9haL() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f7356lEeR5KfoEr4xU5yHH7.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(zZKhbgvUfsK4AEX3r0(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(sTkWmhpZ5b1ArQIw4K.lEeR5KfoEr4xU5yHH7(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            e54J8UWNHWALQNixXM(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized void IPyIQcaNa8aB7drBED(String str) {
        try {
            String strHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(str);
            if (strHusNiw3snxdgZPAGJm == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f7356lEeR5KfoEr4xU5yHH7.getStringSet(strHusNiw3snxdgZPAGJm, new HashSet()));
            hashSet.remove(str);
            (hashSet.isEmpty() ? this.f7356lEeR5KfoEr4xU5yHH7.edit().remove(strHusNiw3snxdgZPAGJm) : this.f7356lEeR5KfoEr4xU5yHH7.edit().putStringSet(strHusNiw3snxdgZPAGJm, hashSet)).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean KYHag8HRDlnO3X9zmZ(long j, long j2) {
        return zZKhbgvUfsK4AEX3r0(j).equals(zZKhbgvUfsK4AEX3r0(j2));
    }

    public final synchronized void T9PhQIpGRhE4yZDm1C(String str, String str2) {
        IPyIQcaNa8aB7drBED(str2);
        HashSet hashSet = new HashSet(this.f7356lEeR5KfoEr4xU5yHH7.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f7356lEeR5KfoEr4xU5yHH7.edit().putStringSet(str, hashSet).commit();
    }

    public synchronized void TCyPEKSzIyweCN5yp1() {
        String strZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(System.currentTimeMillis());
        this.f7356lEeR5KfoEr4xU5yHH7.edit().putString("last-used-date", strZZKhbgvUfsK4AEX3r0).commit();
        IPyIQcaNa8aB7drBED(strZZKhbgvUfsK4AEX3r0);
    }

    public synchronized void Z9WdNiOsPR0y54zHW4(long j, String str) {
        String strZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(j);
        if (this.f7356lEeR5KfoEr4xU5yHH7.getString("last-used-date", "").equals(strZZKhbgvUfsK4AEX3r0)) {
            String strHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(strZZKhbgvUfsK4AEX3r0);
            if (strHusNiw3snxdgZPAGJm == null) {
                return;
            }
            if (strHusNiw3snxdgZPAGJm.equals(str)) {
                return;
            }
            T9PhQIpGRhE4yZDm1C(str, strZZKhbgvUfsK4AEX3r0);
            return;
        }
        long j2 = this.f7356lEeR5KfoEr4xU5yHH7.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            lEeR5KfoEr4xU5yHH7();
            j2 = this.f7356lEeR5KfoEr4xU5yHH7.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f7356lEeR5KfoEr4xU5yHH7.getStringSet(str, new HashSet()));
        hashSet.add(strZZKhbgvUfsK4AEX3r0);
        this.f7356lEeR5KfoEr4xU5yHH7.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", strZZKhbgvUfsK4AEX3r0).commit();
    }

    public synchronized void e54J8UWNHWALQNixXM(long j) {
        this.f7356lEeR5KfoEr4xU5yHH7.edit().putLong("fire-global", j).commit();
    }

    public final synchronized String husNiw3snxdgZPAGJm(String str) {
        for (Map.Entry<String, ?> entry : this.f7356lEeR5KfoEr4xU5yHH7.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void lEeR5KfoEr4xU5yHH7() {
        try {
            long j = this.f7356lEeR5KfoEr4xU5yHH7.getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.f7356lEeR5KfoEr4xU5yHH7.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f7356lEeR5KfoEr4xU5yHH7.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.f7356lEeR5KfoEr4xU5yHH7.edit().putStringSet(key, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean pbVGzGjWvY2LDXC8vo(long j) {
        return Acstmh57AKoSEkEFNJ("fire-global", j);
    }

    public synchronized void s3fjYDxWOUexjjVgyA() {
        try {
            SharedPreferences.Editor editorEdit = this.f7356lEeR5KfoEr4xU5yHH7.edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : this.f7356lEeR5KfoEr4xU5yHH7.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strZZKhbgvUfsK4AEX3r0)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strZZKhbgvUfsK4AEX3r0);
                        i++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i);
            }
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized String zZKhbgvUfsK4AEX3r0(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }
}
