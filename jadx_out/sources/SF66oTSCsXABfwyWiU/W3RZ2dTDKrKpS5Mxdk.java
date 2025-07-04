package SF66oTSCsXABfwyWiU;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class W3RZ2dTDKrKpS5Mxdk implements Closeable {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final URL f1419HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo f1420husNiw3snxdgZPAGJm;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public volatile Future f1421zZKhbgvUfsK4AEX3r0;

    public W3RZ2dTDKrKpS5Mxdk(URL url) {
        this.f1419HJFh0TGMpafqLE9haL = url;
    }

    public static W3RZ2dTDKrKpS5Mxdk Acstmh57AKoSEkEFNJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new W3RZ2dTDKrKpS5Mxdk(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    public final byte[] IPyIQcaNa8aB7drBED() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f1419HJFh0TGMpafqLE9haL.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrZZKhbgvUfsK4AEX3r0 = s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrZZKhbgvUfsK4AEX3r0.length + " bytes from " + this.f1419HJFh0TGMpafqLE9haL);
            }
            if (bArrZZKhbgvUfsK4AEX3r0.length <= 1048576) {
                return bArrZZKhbgvUfsK4AEX3r0;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void OANkd3mP6AYvwbNLJM(ExecutorService executorService) {
        final JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ = new JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ();
        this.f1421zZKhbgvUfsK4AEX3r0 = executorService.submit(new Runnable() { // from class: SF66oTSCsXABfwyWiU.tXWeW0sqVddf7ZBflq
            @Override // java.lang.Runnable
            public final void run() {
                this.f1519lEeR5KfoEr4xU5yHH7.aPyGSIylzVNKPT1Bls(acstmh57AKoSEkEFNJ);
            }
        });
        this.f1420husNiw3snxdgZPAGJm = acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7();
    }

    public final /* synthetic */ void aPyGSIylzVNKPT1Bls(JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ) {
        try {
            acstmh57AKoSEkEFNJ.HJFh0TGMpafqLE9haL(husNiw3snxdgZPAGJm());
        } catch (Exception e) {
            acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1421zZKhbgvUfsK4AEX3r0.cancel(true);
    }

    public JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo hoXrIDAFrSwfShk8da() {
        return (JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo) HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(this.f1420husNiw3snxdgZPAGJm);
    }

    public Bitmap husNiw3snxdgZPAGJm() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f1419HJFh0TGMpafqLE9haL);
        }
        byte[] bArrIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrIPyIQcaNa8aB7drBED, 0, bArrIPyIQcaNa8aB7drBED.length);
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f1419HJFh0TGMpafqLE9haL);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f1419HJFh0TGMpafqLE9haL);
        }
        return bitmapDecodeByteArray;
    }
}
